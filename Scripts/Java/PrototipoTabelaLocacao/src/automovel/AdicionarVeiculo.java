
package automovel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author leandromiguel e gabriel
 */
public class AdicionarVeiculo extends javax.swing.JFrame {

    Automovel add = new Automovel();
    private TableRowSorter Filtro;
    private DefaultTableModel table;
    TableRowSorter trs;
  
    public AdicionarVeiculo() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        table = (DefaultTableModel) jTabelaLocacao.getModel();

        jPInserirVeiculos.setEnabled(false);
        jTFFabricante.setEnabled(false);
        jTFModelo.setEnabled(false);
        jTFAno.setEnabled(false);
        jTFCor.setEnabled(false);
        jTFPlaca.setEnabled(false);
        jTFKm.setEnabled(false);
        jTFValorDiaria.setEnabled(false);
        jTFValorPorKmRodado.setEnabled(false);
        jTFDiasAlugado.setEnabled(false);
        jTFKmUtilizado.setEnabled(false);
        jTATotalPagar.setEnabled(false);
        jBAdicionar.setEnabled(false);
        jBSair.setEnabled(false);
        jBAlugar.setEnabled(false);
    }

    public void Filtrar() {
        int fabricante = 0;
        int modelo = 1;
        int ano = 2;
        int cor = 3;
        int placa = 4;
        int km = 5;
        int diaria = 6;
        int porKm = 7;

        Filtro.setRowFilter(RowFilter.regexFilter(jTFFiltro.getText(), fabricante, modelo, ano, cor, placa, km, diaria, porKm));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPInserirVeiculos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFFabricante = new javax.swing.JTextField();
        jTFModelo = new javax.swing.JTextField();
        jTFAno = new javax.swing.JTextField();
        jTFCor = new javax.swing.JTextField();
        jTFPlaca = new javax.swing.JTextField();
        jTFKm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFValorDiaria = new javax.swing.JTextField();
        jTFValorPorKmRodado = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPPreço = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTATotalPagar = new javax.swing.JTextArea();
        jPPacoteFechado = new javax.swing.JPanel();
        jCBPacoteFechado = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTFDiasAlugado = new javax.swing.JTextField();
        jPValorKmUtilizado = new javax.swing.JPanel();
        jCBKmUtilizado = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTFKmUtilizado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTFFiltro = new javax.swing.JTextField();
        jBCalcular = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBAdicionarVeículo = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBAlugar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaLocacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locação de Veículos");

        jPInserirVeiculos.setBorder(javax.swing.BorderFactory.createTitledBorder("Características do Veículo"));

        jLabel1.setText("Fabricante");

        jLabel2.setText("Modelo");

        jLabel3.setText("Ano");

        jLabel4.setText("Cor");

        jLabel5.setText("Placa");

        jLabel6.setText("Km");

        jTFFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFabricanteActionPerformed(evt);
            }
        });

        jTFModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFModeloActionPerformed(evt);
            }
        });

        jTFAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnoActionPerformed(evt);
            }
        });

        jTFCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorActionPerformed(evt);
            }
        });

        jTFPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaActionPerformed(evt);
            }
        });

        jTFKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFKmActionPerformed(evt);
            }
        });

        jLabel9.setText("Diária (R$)");

        jLabel10.setText("P/Km (R$)");

        jTFValorDiaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFValorDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorDiariaActionPerformed(evt);
            }
        });

        jTFValorPorKmRodado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFValorPorKmRodado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorPorKmRodadoActionPerformed(evt);
            }
        });

        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });
        jBAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAdicionarKeyPressed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPInserirVeiculosLayout = new javax.swing.GroupLayout(jPInserirVeiculos);
        jPInserirVeiculos.setLayout(jPInserirVeiculosLayout);
        jPInserirVeiculosLayout.setHorizontalGroup(
            jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInserirVeiculosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPInserirVeiculosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jTFValorDiaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFValorPorKmRodado)
                        .addGap(89, 89, 89))
                    .addGroup(jPInserirVeiculosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPInserirVeiculosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGap(92, 92, 92)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFModelo)
                        .addComponent(jTFFabricante)
                        .addComponent(jTFAno)
                        .addComponent(jTFKm, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFPlaca)
                        .addComponent(jTFCor, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addGap(86, 86, 86)))
        );
        jPInserirVeiculosLayout.setVerticalGroup(
            jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInserirVeiculosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTFValorPorKmRodado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdicionar)
                    .addComponent(jBSair))
                .addGap(27, 27, 27))
            .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPInserirVeiculosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTFFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPInserirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        jPPreço.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        jTATotalPagar.setColumns(20);
        jTATotalPagar.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jTATotalPagar.setRows(5);
        jTATotalPagar.setAlignmentY(2.0F);
        jTATotalPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Total a Pagar"));
        jScrollPane2.setViewportView(jTATotalPagar);

        jPPacoteFechado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCBPacoteFechado.setText("Pacote Fechado");
        jCBPacoteFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPacoteFechadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Insira dos dias a ser alugado");

        jTFDiasAlugado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFDiasAlugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasAlugadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPacoteFechadoLayout = new javax.swing.GroupLayout(jPPacoteFechado);
        jPPacoteFechado.setLayout(jPPacoteFechadoLayout);
        jPPacoteFechadoLayout.setHorizontalGroup(
            jPPacoteFechadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPacoteFechadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPacoteFechadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPacoteFechadoLayout.createSequentialGroup()
                        .addComponent(jCBPacoteFechado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFDiasAlugado))
                .addContainerGap())
        );
        jPPacoteFechadoLayout.setVerticalGroup(
            jPPacoteFechadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPacoteFechadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jCBPacoteFechado)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDiasAlugado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPValorKmUtilizado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCBKmUtilizado.setText("Por Km Utilizado");
        jCBKmUtilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBKmUtilizadoActionPerformed(evt);
            }
        });

        jLabel8.setText("Insira os Km que serão percorridos");

        jTFKmUtilizado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFKmUtilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFKmUtilizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPValorKmUtilizadoLayout = new javax.swing.GroupLayout(jPValorKmUtilizado);
        jPValorKmUtilizado.setLayout(jPValorKmUtilizadoLayout);
        jPValorKmUtilizadoLayout.setHorizontalGroup(
            jPValorKmUtilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPValorKmUtilizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPValorKmUtilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPValorKmUtilizadoLayout.createSequentialGroup()
                        .addComponent(jCBKmUtilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(jPValorKmUtilizadoLayout.createSequentialGroup()
                        .addComponent(jTFKmUtilizado)
                        .addContainerGap())
                    .addGroup(jPValorKmUtilizadoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPValorKmUtilizadoLayout.setVerticalGroup(
            jPValorKmUtilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPValorKmUtilizadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jCBKmUtilizado)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFKmUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jTFFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jTFFiltro)
                .addGap(176, 176, 176))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFFiltro)
        );

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBAdicionarVeículo.setText("Inserir Veículo");
        jBAdicionarVeículo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarVeículoActionPerformed(evt);
            }
        });

        jBApagar.setText("Apagar Veículo");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });

        jBAlugar.setText("Alugar");
        jBAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPreçoLayout = new javax.swing.GroupLayout(jPPreço);
        jPPreço.setLayout(jPPreçoLayout);
        jPPreçoLayout.setHorizontalGroup(
            jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPreçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPreçoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPPreçoLayout.createSequentialGroup()
                        .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPPreçoLayout.createSequentialGroup()
                                .addComponent(jPPacoteFechado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(jPValorKmUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAdicionarVeículo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAlugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPPreçoLayout.setVerticalGroup(
            jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPreçoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPPacoteFechado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPValorKmUtilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPPreçoLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jBCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAdicionarVeículo)))
                .addGap(18, 18, 18)
                .addGroup(jPPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPreçoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPreçoLayout.createSequentialGroup()
                        .addComponent(jBApagar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlugar)
                        .addGap(52, 52, 52)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione um Veículo para Locação"));

        jTabelaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ford", "KA", "2001", "Azul", "GHJ-8976", "324567", "150.65", "20.54"},
                {"Fiat", "Uno", "2009", "Prata", "UJK-8567", "567425", "164.32", "36.65"},
                {"Volkswagen", "Gol", "2005", "Branco", "KNV-4751", "215647", "142.32", "30.20"},
                {"Audi", "A1", "2019", "Preto", "IZA-0981", "102589", "350.25", "95.25"},
                {"Peugeot", "206", "2006", "Prata", "VCW-5812", "365178", "130.25", "30.24"},
                {"Volkswagen", "Saveiro", "2010", "Branca", "BMF-4570", "251367", "210.35", "57.65"},
                {"BMW", "X1", "2012", "Vermelha", "KFS-7540", "025987", "450.32", "100.25"}
            },
            new String [] {
                "Fabricante", "Modelo", "Ano", "Cor", "Placa", "Km", "Diária (R$)", "P/Km (R$)"
            }
        ));
        jTabelaLocacao.setToolTipText("");
        jScrollPane1.setViewportView(jTabelaLocacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPInserirVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPPreço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPInserirVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        ((DefaultTableModel) jTabelaLocacao.getModel()).removeRow(jTabelaLocacao.getSelectedRow());
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jBAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAdicionarKeyPressed

    }//GEN-LAST:event_jBAdicionarKeyPressed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed

        String fabricante = jTFFabricante.getText().trim();
        String modelo = jTFModelo.getText().trim();
        String ano = jTFAno.getText().trim();
        String cor = jTFCor.getText().trim();
        String placa = jTFPlaca.getText().trim();
        String km = jTFKm.getText().trim();
        String diaria = jTFValorDiaria.getText();
        String porKm = jTFValorPorKmRodado.getText();

        jTFFabricante.requestFocus();

        if (fabricante.equals("") && modelo.equals("") && ano.equals("") && cor.equals("")
                && placa.equals("") && km.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite os valores");
        } else {

            DefaultTableModel table = (DefaultTableModel) jTabelaLocacao.getModel();

            String diariaS = diaria + "";
            String porKMS = porKm + "";

            table.addRow(new String[]{fabricante, modelo, ano, cor, placa, km, diariaS, porKMS});

            jTFFabricante.setText("");
            jTFModelo.setText("");
            jTFAno.setText("");
            jTFCor.setText("");
            jTFPlaca.setText("");
            jTFKm.setText("");
            jTFValorDiaria.setText("");
            jTFValorPorKmRodado.setText("");

            //add.adiciona(fabricante);
            //System.out.println(add.listaCar);
        }
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jTFValorPorKmRodadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorPorKmRodadoActionPerformed

    }//GEN-LAST:event_jTFValorPorKmRodadoActionPerformed

    private void jTFValorDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorDiariaActionPerformed

    }//GEN-LAST:event_jTFValorDiariaActionPerformed

    private void jTFKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFKmActionPerformed

    }//GEN-LAST:event_jTFKmActionPerformed

    private void jTFPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaActionPerformed

    }//GEN-LAST:event_jTFPlacaActionPerformed

    private void jTFCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorActionPerformed

    }//GEN-LAST:event_jTFCorActionPerformed

    private void jTFAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnoActionPerformed

    }//GEN-LAST:event_jTFAnoActionPerformed

    private void jTFModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFModeloActionPerformed

    }//GEN-LAST:event_jTFModeloActionPerformed

    private void jTFFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFabricanteActionPerformed

    }//GEN-LAST:event_jTFFabricanteActionPerformed

    private void jTFFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFiltroActionPerformed
        jTFFiltro.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent ke){
            trs.setRowFilter(RowFilter.regexFilter("(?i)" + jTFFiltro.getText(),0,1,2,3,4,5,6,7));
             //"(?i)" para deixar a pesquisa sem case sensitive
        }
    });
        
        trs =  new TableRowSorter(jTabelaLocacao.getModel());
        jTabelaLocacao.setRowSorter(trs);
    }//GEN-LAST:event_jTFFiltroActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        if (jTabelaLocacao.getSelectedRow()==jTabelaLocacao.getSelectedRow())
        {   
            jBAlugar.setEnabled(true);
            System.out.println("Carro selecionado");

            if (jCBPacoteFechado.isSelected()) {
                int diaria = jTabelaLocacao.getSelectedRow();
                Object porDiaria = jTabelaLocacao.getValueAt(diaria, 6);
                String precoDiaria = String.valueOf(porDiaria);
                float diariaValor = 0.0f;
                diariaValor = Float.parseFloat(precoDiaria);
                add.setPrecoDiaria(diariaValor);
                int diasAlugado = Integer.parseInt(jTFDiasAlugado.getText());
                add.setDiasUtilizados(diasAlugado);
                jTATotalPagar.setText(add.resultadoDoPacoteFechado());
            }
            
            else if (jCBKmUtilizado.isSelected())
            {
                int porKm = jTabelaLocacao.getSelectedRow();
                Object pKm = jTabelaLocacao.getValueAt(porKm,7);
                String precoKm = String.valueOf(pKm);
                float diariaKm = 0.0f;
                diariaKm= Float.parseFloat(precoKm);               
                add.setPrecoPorKm(diariaKm);       
                float kmPercorrido = Float.parseFloat(jTFKmUtilizado.getText());
                add.setKmPercorridos(kmPercorrido);         
                jTATotalPagar.setText(add.resultadoDoKmPercorrido());
            }
        }
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jCBPacoteFechado.setSelected(false);
        jCBKmUtilizado.setEnabled(true);
        jTFKmUtilizado.setEnabled(false);
        jTFDiasAlugado.setText("");

        jCBKmUtilizado.setSelected(false);
        jCBPacoteFechado.setEnabled(true);
        jTFDiasAlugado.setEnabled(false);
        jTFKmUtilizado.setText("");

        jTATotalPagar.setText("");
        jTATotalPagar.setEnabled(false);
        jBAlugar.setEnabled(false);
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jCBPacoteFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPacoteFechadoActionPerformed
        jCBKmUtilizado.setEnabled(false);
        jTFKmUtilizado.setEnabled(false);
        jTFDiasAlugado.setEnabled(true);
        jTATotalPagar.setEnabled(true);
        
    }//GEN-LAST:event_jCBPacoteFechadoActionPerformed

    private void jCBKmUtilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBKmUtilizadoActionPerformed
        jCBPacoteFechado.setEnabled(false);
        jTFDiasAlugado.setEnabled(false);
        jTFKmUtilizado.setEnabled(true);
        jTATotalPagar.setEnabled(true);
        
    }//GEN-LAST:event_jCBKmUtilizadoActionPerformed

    private void jTFDiasAlugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasAlugadoActionPerformed
 
    }//GEN-LAST:event_jTFDiasAlugadoActionPerformed

    private void jTFKmUtilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFKmUtilizadoActionPerformed

    }//GEN-LAST:event_jTFKmUtilizadoActionPerformed

    private void jBAdicionarVeículoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarVeículoActionPerformed
        jPInserirVeiculos.setEnabled(true);
        jTFFabricante.setEnabled(true);
        jTFModelo.setEnabled(true);
        jTFAno.setEnabled(true);
        jTFCor.setEnabled(true);
        jTFPlaca.setEnabled(true);
        jTFKm.setEnabled(true);
        jTFValorDiaria.setEnabled(true);
        jTFValorPorKmRodado.setEnabled(true);
        jBAdicionar.setEnabled(true);
        jBSair.setEnabled(true);
    }//GEN-LAST:event_jBAdicionarVeículoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        jPInserirVeiculos.setEnabled(false);
        jTFFabricante.setEnabled(false);
        jTFModelo.setEnabled(false);
        jTFAno.setEnabled(false);
        jTFCor.setEnabled(false);
        jTFPlaca.setEnabled(false);
        jTFKm.setEnabled(false);
        jTFValorDiaria.setEnabled(false);
        jTFValorPorKmRodado.setEnabled(false);
        jTFDiasAlugado.setEnabled(false);
        jTFKmUtilizado.setEnabled(false);
        jTATotalPagar.setEnabled(false);
        jBAdicionar.setEnabled(false);
        jBSair.setEnabled(false);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlugarActionPerformed
        if (jTabelaLocacao.getSelectedRow()==jTabelaLocacao.getSelectedRow())
        {
           
        }
    }//GEN-LAST:event_jBAlugarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBAdicionarVeículo;
    private javax.swing.JButton jBAlugar;
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSair;
    private javax.swing.JCheckBox jCBKmUtilizado;
    private javax.swing.JCheckBox jCBPacoteFechado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPInserirVeiculos;
    private javax.swing.JPanel jPPacoteFechado;
    private javax.swing.JPanel jPPreço;
    private javax.swing.JPanel jPValorKmUtilizado;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTATotalPagar;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFDiasAlugado;
    private javax.swing.JTextField jTFFabricante;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTextField jTFKm;
    private javax.swing.JTextField jTFKmUtilizado;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFValorDiaria;
    private javax.swing.JTextField jTFValorPorKmRodado;
    private javax.swing.JTable jTabelaLocacao;
    // End of variables declaration//GEN-END:variables
}
//int row = jTabelaLocacao.getSelectedRow();

//if (jTabelaLocacao.getValueAt(row, 8).equals(true)) { //Peguei o valor boolean do coluna 8 

//jTabelaLocacao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//jTabelaLocacao.setCellSelectionEnabled(false);]


//        jTFFiltro.addKeyListener(new KeyAdapter() {
//            public void keyReleased(final KeyEvent e) {
//                //String cad = (jTFFiltro.getText());
//                jTFFiltro.setText(cad);
//                Filtrar();
//            }
//        }
//        );
//        Filtro = new TableRowSorter(jTabelaLocacao.getModel());
//        jTabelaLocacao.setRowSorter(Filtro);