using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraPlayer : MonoBehaviour
{
    private Transform player;
    public float smoothTimeX;
    public float smoothTimeY;
    private Vector2 velocidade;

    public bool maxMin;
    public float xMin;
    public float xMax;
    public float yMin;
    public float yMax;


    // Start is called before the first frame update
    void Start()
    {
        player = GameObject.Find("Player").GetComponent<Transform>();
    }

    void FixedUpdate()
    {
        float posX = Mathf.SmoothDamp(transform.position.x, player.position.x, ref velocidade.x, smoothTimeX);
        float posY = Mathf.SmoothDamp(transform.position.y, player.position.y, ref velocidade.y, smoothTimeY);
        
        if (player)
        {
            transform.position = new Vector3(posX, transform.position.y, transform.position.z);
            transform.position = new Vector3(transform.position.x, posY, transform.position.z);

            if (maxMin)
            {
                transform.position = new Vector3(Mathf.Clamp(posX, xMin, xMax), Mathf.Clamp(posY, yMin, yMax), -10);//X,Y e Z
            }
        }
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
