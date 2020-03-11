using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MovePlayer : MonoBehaviour
{
    //Atributos Walk and Run 
    private AudioSource PlayerAudioSource;
    private Animator animator;
    private Rigidbody2D rb;
    public Transform groundCheck;
    public float speedWalk, speedRun, jumpForce;

    [SerializeField]
    public bool face = true, isGroundWood = false, isGroundEarth = false, jump = false, run = false, walk, ombradaTest = false,
    evasaoTest = false;

    //Atributos do Ombrada
    public float ombradaSpeed, startOmbradaTime;
    private float ombradaTime;
    private int ombradaDirection;
    private float ombradaRight, ombradaLeft;

    //Atributos da Evasão
    public float evasaoSpeed, startEvasaoTime;
    private float evasaoTime;
    private int evasaoDirection;
    private float evasaoRight, evasaoLeft;

    [SerializeField]
    public float movimentoH;
    public bool evasao;

    //Atributos FootStepWalk
    public AudioClip[] FootstepsWalkWood;
    public float FootRatePlayWalkWood;
    private float TimerWalkWood;

    //Atributos FootStepRun
    public AudioClip[] FootstepsRunWood;
    public float FootRatePlayRunWood;
    private float TimerRunWood;

    //Atributos FootStepWalkEarth
    public AudioClip[] FootstepsWalkEarth;
    public float FootRatePlayWalkEarth;
    private float TimerWalkEarth;

    //Atributos FootStepRunEarth
    public AudioClip[] FootstepsRunEarth;
    public float FootRatePlayRunEarth;
    private float TimerRunEarth;

    //Atributos FootStepParadinha
    public AudioClip[] FootstepsParadinha;

    //Atributos do Som do Jump
    public AudioClip[] PlayJump;

    //Som da queda do Jump na Madeira
    public AudioClip[] JumpGroundPlayW;
    public float RateJumpWood;
    private float TimerJumpWood;

    //Som da queda do Jump na Terra
    public AudioClip[] JumpGroundPlayE;
    public float RateJumpEarth;
    private float TimerJumpEarth;

    //Agaichar
    private float movimentoV;
    public float movimentoVertical;
    public bool agacharTeste;

    //Jump
    private int numberJump=0;
    private int maxJump=1;

    //Métodos Principais
    void Start()
    {
        animator = GetComponent<Animator>();
        rb = GetComponent<Rigidbody2D>();
        PlayerAudioSource = GetComponent<AudioSource>();
    }

    void Update()
    {
        Physics();

        Controllers();

        Jump();
    }

    private void FixedUpdate()
    {
        Walk(movimentoH);

        Run(movimentoH);

        Flip(movimentoH);

        Evasao();

        Agachar();

        //Defense();
    }

    void Physics()
    {
        isGroundWood = Physics2D.Linecast(transform.position, groundCheck.position, 1 << LayerMask.NameToLayer("GroundWood"));
        isGroundEarth = Physics2D.Linecast(transform.position, groundCheck.position, 1 << LayerMask.NameToLayer("GroundEarth"));

        numberJump=0;
    }

    void Controllers()
    {
        movimentoH = Input.GetAxisRaw("Horizontal");
        movimentoV = Input.GetAxisRaw("Vertical");

        while (Input.GetButton("Jump"))
        {
            jump = true;
            run=false;
            numberJump++;
            break;
        }
    }

    //Método do Pulo
    void Jump()
    {
        if (isGroundWood && jump && numberJump == maxJump)
        {
            rb.velocity = Vector2.up * jumpForce;
        }

        else if (isGroundEarth && jump && numberJump==maxJump)
        {
            rb.velocity = Vector2.up * jumpForce;
        }
    
        //Animação enquanto ele fica no ar
        if ((isGroundWood == false && isGroundEarth == false))
        {
            animator.SetBool("isGrounded", false);
        }

        //Som de quando o personagem pousa no chão
        if (jump)
        {
            if (Time.time > TimerJumpWood && (isGroundWood) && movimentoH == 0)
            {
                TimerJumpWood = Time.time + 1 / RateJumpWood;
                JumpGroundPlayWood();
            }

            if (Time.time > TimerJumpEarth && (isGroundEarth) && movimentoH == 0)
            {
                TimerJumpEarth = Time.time + 1 / RateJumpEarth;
                JumpGroundPlayEarth();
            }
        }
    }

    //Métodos de Andar
    void Walk(float movimentoX)
{
    //Walk
    if (((movimentoH == 1 || movimentoH == -1) && Input.GetButton("LB") && (isGroundWood || isGroundEarth)) || ((movimentoH == -1 || movimentoH == 1)
    && (Input.GetKey(KeyCode.LeftControl)) && (isGroundWood || isGroundEarth)))
    {
        rb.velocity = new Vector2(movimentoX * speedWalk, rb.velocity.y);
        walk = true;
        run = false;
        ombradaTest = false;
        evasaoTest = false;

        //Som do Walk na Madeira
        if (walk == true)
        {
            if (Time.time > TimerWalkWood && isGroundWood)
            {
                TimerWalkWood = Time.time + 1 / FootRatePlayWalkWood;
                FootStepRandomizeWalkWood();
                isGroundWood = true;
            }
        }

        //Som do Walk na Terra
        if (walk == true)
        {
            if (Time.time > TimerWalkEarth && isGroundEarth)
            {
                TimerWalkEarth = Time.time + 1 / FootRatePlayWalkWood;
                FootStepRandomizeWalkEarth();
            }
        }
        animator.SetBool("Walk", true);
        animator.SetBool("Run", false);
        animator.SetBool("Idle", false);
        animator.SetBool("isGrounded", true);
    }
    //Idle
    else
    {
        rb.velocity = new Vector2(rb.velocity.x, rb.velocity.y);
        animator.SetBool("Idle", true);
        animator.SetBool("Walk", false);
        animator.SetBool("Run", false);
        animator.SetBool("Paradinha", false);
        animator.SetBool("isGrounded", true);
        animator.SetBool("Agachar", false);
    }
}

//Método de Correr
void Run(float movimentoX)
{
    //Run
    if ((movimentoH == 1 || movimentoH == -1) && (isGroundWood || isGroundEarth) && walk == false && agacharTeste == false)
    {
        rb.velocity = new Vector2(movimentoX * speedRun, rb.velocity.y);
        run = true;
        walk = false;
        ombradaTest = false;
        evasaoTest = false;
        animator.SetBool("Run", true);
        animator.SetBool("Walk", false);
        animator.SetBool("Idle", false);
        animator.SetBool("Paradinha", false);
        animator.SetBool("isGrounded", true);
    }
    //Paradinha que o personagem da ao parar de correr e transide para o Idle

    else if (movimentoH == 0 && run == true && (isGroundWood || isGroundEarth) && agacharTeste == false)
    {
        animator.SetBool("Paradinha", true);
        animator.SetBool("Run", true);
        animator.SetBool("Walk", false);
        animator.SetBool("Idle", false);

        run = false;

        FootStepParadinha();
    }
    else
    {
        walk = false;
    }

    if (run && agacharTeste == false)
    {
        //Som do Run na Madeira
        if (Time.time > TimerRunWood && isGroundWood)
        {
            TimerRunWood = Time.time + 1 / FootRatePlayRunWood;
            FootStepRandomizeRunWood();
        }
        //Som do Run da Terra
        else if (Time.time > TimerRunEarth && isGroundEarth)
        {
            TimerRunEarth = Time.time + 1 / FootRatePlayRunEarth;
            FootStepRandomizeRunEarth();
        }
    }
}

//Método para agachar 
void Agachar()
{
    if (movimentoV == -1)
    {
        agacharTeste = true;
    }
    else
    {
        agacharTeste = false;
    }

    while ((movimentoV == -1) && agacharTeste && isGroundWood)
    {
        animator.SetBool("Agachar", isGroundWood);
        movimentoH = 0f;
        break;
    }
}

//Método de virar a Imagem 
void Flip(float movimentoX)
{
    if (movimentoX < 0 && face || (movimentoX > 0 && !face))
    {
        face = !face;
        transform.localScale = new Vector3(-transform.localScale.x, transform.localScale.y, transform.localScale.z);
    }
}

//Método da Ombrada
void Defense()
{
    if (isGroundWood == true && ombradaTest == false)
    {
        if (ombradaDirection == 0)
        {
            if (Input.GetButtonDown("RB") && face == true && movimentoH >= 0.8)
            {
                ombradaDirection = 1;
                ombradaTest = true;
                Debug.Log("RB");
                animator.SetTrigger("Encontrao");
            }
            else if (Input.GetButtonDown("RB") && face == false && movimentoH <= -0.8)
            {
                ombradaDirection = -1;
                ombradaTest = true;
                animator.SetTrigger("Encontrao");
                Debug.Log("RB");
            }
        }
        else
        {
            if (ombradaTime <= 0)
            {
                ombradaDirection = 0;
                ombradaTime = startOmbradaTime;
                rb.velocity = Vector2.zero;
                ombradaTest = false;
            }
            else
            {
                ombradaTime -= Time.deltaTime;

                if (ombradaDirection == 1)
                {
                    rb.velocity = Vector2.right * ombradaSpeed;
                }
                else if (ombradaDirection == -1)
                {
                    rb.velocity = Vector2.left * ombradaSpeed;
                }
            }
        }
    }
}

//Método do Evasion
void Evasao()
{
    if (isGroundWood || isGroundEarth)
    {
        evasao = false;
        evasaoTest = false;
        jump = false;
    }
    if ((isGroundWood || isGroundEarth) == true && evasaoTest == false)
    {

        if (Input.GetButtonDown("RB") || Input.GetKeyDown(KeyCode.LeftShift))
        {
            evasao = true;
            evasaoTest = true;
            run = false;

            if (movimentoH != 0 && evasao == true)
            {
                //Voice Evasao
                FootStepRandomizeJump();
                TimerRunWood = 0;
            }
        }
        if (evasaoDirection == 0)
        {
            if (evasao && face == true && movimentoH != 0)
            {
                evasaoDirection = 1;
                evasaoTest = true;
                Debug.Log("RB");
                animator.SetTrigger("Evasao");
                run = false;
            }
            else if (evasao && face == false && movimentoH != 0)
            {
                evasaoDirection = -1;
                evasaoTest = true;
                animator.SetTrigger("Evasao");
                Debug.Log("RB");
            }
        }
        else
        {
            if (evasaoTime <= 0)
            {
                evasaoDirection = 0;
                evasaoTime = startEvasaoTime;
                rb.velocity = Vector2.zero;
                evasaoTest = false;
            }
            else
            {
                evasaoTime -= Time.deltaTime;

                if (evasaoDirection == 1)
                {
                    rb.velocity = Vector2.right * evasaoSpeed;
                }
                else if (evasaoDirection == -1)
                {
                    rb.velocity = Vector2.left * evasaoSpeed;
                }
            }
        }
    }
}

//Método dos Sons
public void FootStepRandomizeRunWood()
{
    AudioClip SoundToPlay = FootstepsRunWood[Random.Range(0, FootstepsRunWood.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void FootStepRandomizeWalkWood()
{
    AudioClip SoundToPlay = FootstepsWalkWood[Random.Range(0, FootstepsWalkWood.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void FootStepParadinha()
{
    AudioClip SoundToPlay = FootstepsParadinha[Random.Range(0, FootstepsParadinha.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void FootStepRandomizeRunEarth()
{
    AudioClip SoundToPlay = FootstepsRunEarth[Random.Range(0, FootstepsRunEarth.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void FootStepRandomizeWalkEarth()
{
    AudioClip SoundToPlay = FootstepsWalkEarth[Random.Range(0, FootstepsWalkEarth.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void FootStepRandomizeJump()
{
    AudioClip SoundToPlay = PlayJump[Random.Range(0, PlayJump.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void JumpGroundPlayWood()
{
    AudioClip SoundToPlay = JumpGroundPlayW[Random.Range(0, JumpGroundPlayW.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}

public void JumpGroundPlayEarth()
{
    AudioClip SoundToPlay = JumpGroundPlayE[Random.Range(0, JumpGroundPlayE.Length)];
    PlayerAudioSource.PlayOneShot(SoundToPlay);
}
}

//animator.SetFloat("EixoY", Mathf.Abs(rb.position.y));//Só valores Positivos de Y