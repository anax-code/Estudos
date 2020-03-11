package manipulacao.matriz.java;

import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {
    
    //Criando um objeto
    private MatrizDeInteiros matriz;
    

    public Interface() {
        initComponents();
       
        
        //Atributos da janela principal
        
        setSize(new Dimension(430, 630));
        setResizable(false);
        setLocationRelativeTo(null);
        
        getRootPane().setDefaultButton(jBGerar);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFColuna = new javax.swing.JTextField();
        jTFLinha = new javax.swing.JTextField();
        jBGerar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSaida = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jBRandom = new javax.swing.JButton();
        jBSomaAll = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();
        jBSomaX = new javax.swing.JButton();
        jBSomaY = new javax.swing.JButton();
        jBTransposta = new javax.swing.JButton();
        jBDiagonalP = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBDiagonalS = new javax.swing.JButton();
        jBTrocaValores = new javax.swing.JButton();
        jBPares = new javax.swing.JButton();
        jBMaiorValor = new javax.swing.JButton();
        jBSubstituir = new javax.swing.JButton();
        jBSimetria = new javax.swing.JButton();
        jBTSomaDiagPrin = new javax.swing.JButton();
        jBMedia = new javax.swing.JButton();
        jBMultiplicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTSaidaDois = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matriz de Inteiros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada:"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Linhas(x):");

        jLabel2.setText("Colunas(y):");

        jTFColuna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFColuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaCampo(evt);
            }
        });

        jTFLinha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLinhaActionPerformed(evt);
            }
        });
        jTFLinha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaCampo(evt);
            }
        });

        jBGerar.setText("Gerar");
        jBGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBGerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jBGerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLimpar)
                .addGap(26, 26, 26))
        );

        jTSaida.setColumns(20);
        jTSaida.setRows(5);
        jTSaida.setTabSize(3);
        jTSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz:"));
        jScrollPane1.setViewportView(jTSaida);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Funções:"));

        jBRandom.setText("Random");
        jBRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRandomActionPerformed(evt);
            }
        });

        jBSomaAll.setText("Soma All");
        jBSomaAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaAllActionPerformed(evt);
            }
        });

        jBSearch.setText("Search");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        jBSomaX.setText("Soma(x)");
        jBSomaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaXActionPerformed(evt);
            }
        });

        jBSomaY.setText("Soma(y)");
        jBSomaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaYActionPerformed(evt);
            }
        });

        jBTransposta.setText("Matriz^-1");
        jBTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTranspostaActionPerformed(evt);
            }
        });

        jBDiagonalP.setText("Diagonal P");
        jBDiagonalP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiagonalPActionPerformed(evt);
            }
        });

        jBSair.setText("Exit");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBDiagonalS.setText("Diagonal S");
        jBDiagonalS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiagonalSActionPerformed(evt);
            }
        });

        jBTrocaValores.setText("Troca Linhas");
        jBTrocaValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrocaValoresActionPerformed(evt);
            }
        });

        jBPares.setText("Pares");
        jBPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParesActionPerformed(evt);
            }
        });

        jBMaiorValor.setText("Maior Valor");
        jBMaiorValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaiorValorActionPerformed(evt);
            }
        });

        jBSubstituir.setText("Substituir");
        jBSubstituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubstituirActionPerformed(evt);
            }
        });

        jBSimetria.setText("Simetria");
        jBSimetria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSimetriaActionPerformed(evt);
            }
        });

        jBTSomaDiagPrin.setText("SomaDiagP");
        jBTSomaDiagPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSomaDiagPrinActionPerformed(evt);
            }
        });

        jBMedia.setText("Media");
        jBMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMediaActionPerformed(evt);
            }
        });

        jBMultiplicar.setText("Multiplicar");
        jBMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSomaAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSomaX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSomaY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTransposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDiagonalP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDiagonalS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTrocaValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBMaiorValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSubstituir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSimetria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTSomaDiagPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jBRandom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomaAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomaX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomaY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTransposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDiagonalP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDiagonalS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTrocaValores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMaiorValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSubstituir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSimetria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTSomaDiagPrin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMultiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jBSair))
        );

        jTSaidaDois.setColumns(20);
        jTSaidaDois.setRows(5);
        jTSaidaDois.setTabSize(3);
        jTSaidaDois.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída:"));
        jScrollPane2.setViewportView(jTSaidaDois);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRandomActionPerformed
        matriz.gerarMatrizAleatorios();
        jTSaida.setText(matriz.exibirMatriz());
        
        jBGerar.setEnabled(false);
        jBRandom.setEnabled(true);
        jBDiagonalP.setEnabled(matriz.matrizQuadratica());
        jBSearch.setEnabled(true);
        jBSomaAll.setEnabled(true);
        jBSomaX.setEnabled(true);
        jBSomaY.setEnabled(true);
        jBTransposta.setEnabled(true);
        jBDiagonalS.setEnabled(matriz.matrizQuadratica());
        jBLimpar.setEnabled(true);
        jBMaiorValor.setEnabled(true);
        jBPares.setEnabled(true);
        jBSimetria.setEnabled(true);
        jBSubstituir.setEnabled(true);
        jBTrocaValores.setEnabled(true);
        jBTSomaDiagPrin.setEnabled(matriz.matrizQuadratica());
        jBMedia.setEnabled(true);
        
    }//GEN-LAST:event_jBRandomActionPerformed

    private void jBSomaAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaAllActionPerformed
        jTSaidaDois.setText(Integer.toString(matriz.somaAll()));
    }//GEN-LAST:event_jBSomaAllActionPerformed

    private void jBTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTranspostaActionPerformed
         jTSaidaDois.setText(matriz.exibirTransposta(matriz.matrizTransposta()));
    }//GEN-LAST:event_jBTranspostaActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        jTSaidaDois.setText(matriz.exibirMatriz2(matriz.procuraValor()));
        
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBSomaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaXActionPerformed
        jTSaidaDois.setText(Arrays.toString(matriz.somaLinhas()));   
        
    }//GEN-LAST:event_jBSomaXActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFLinha.requestFocusInWindow();
        jBGerar.setEnabled(true);
        jBRandom.setEnabled(false);
        jBDiagonalP.setEnabled(false);
        jBSearch.setEnabled(false);
        jBSomaAll.setEnabled(false);
        jBSomaX.setEnabled(false);
        jBSomaY.setEnabled(false);
        jBTransposta.setEnabled(false);
        jBDiagonalS.setEnabled(false);
        jBLimpar.setEnabled(false);
        jBMaiorValor.setEnabled(false);
        jBPares.setEnabled(false);
        jBSimetria.setEnabled(false);
        jBSubstituir.setEnabled(false);
        jBTrocaValores.setEnabled(false);
        jBTSomaDiagPrin.setEnabled(false);
        jBMedia.setEnabled(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jBSomaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaYActionPerformed
        jTSaidaDois.setText(Arrays.toString(matriz.somaColuna()));  
        
    }//GEN-LAST:event_jBSomaYActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFLinha.requestFocusInWindow();
        jTSaida.setText("");
        jTSaidaDois.setText("");
        jTFColuna.setText("");
        jTFLinha.setText("");
        
        jBGerar.setEnabled(true);
        jBRandom.setEnabled(false);
        jBDiagonalP.setEnabled(false);
        jBSearch.setEnabled(false);
        jBSomaAll.setEnabled(false);
        jBSomaX.setEnabled(false);
        jBSomaY.setEnabled(false);
        jBTransposta.setEnabled(false);
        jBDiagonalS.setEnabled(false);
        jBLimpar.setEnabled(false);
        jBMaiorValor.setEnabled(false);
        jBPares.setEnabled(false);
        jBSimetria.setEnabled(false);
        jBSubstituir.setEnabled(false);
        jBTrocaValores.setEnabled(false);
        jBMedia.setEnabled(false);
        jBTSomaDiagPrin.setEnabled(false);
        
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarActionPerformed
        String simNao[] = {"Sim", "Não"};
        if (jTFLinha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Linhas", "Aviso", 0);
            //jTFLinha.setText("");
            jTFLinha.requestFocusInWindow();

            return;
        }

        if (jTFColuna.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Colunas", "Aviso", 0);
            //jTFColuna.setText("");
            jTFColuna.requestFocusInWindow();

            return;
        }
        //Instanciando um novo objeto
        matriz = new MatrizDeInteiros(Integer.parseInt(jTFLinha.getText()),Integer.parseInt(jTFColuna.getText()) );

        jTSaida.setText(matriz.exibirMatriz());

        //Status dos botões
        jBGerar.setEnabled(false);
        jBRandom.setEnabled(true);
        jBDiagonalP.setEnabled(false);
        jBSearch.setEnabled(false);
        jBSomaAll.setEnabled(false);
        jBSomaX.setEnabled(false);
        jBSomaY.setEnabled(false);
        jBTransposta.setEnabled(false);
        jBDiagonalS.setEnabled(false);
        jBLimpar.setEnabled(true);
        jBMaiorValor.setEnabled(false);
        jBPares.setEnabled(false);
        jBSimetria.setEnabled(false);
        jBSubstituir.setEnabled(false);
        jBTrocaValores.setEnabled(false);
        jBTSomaDiagPrin.setEnabled(false);
        jBMedia.setEnabled(false);
        
    }//GEN-LAST:event_jBGerarActionPerformed

    private void validaCampo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validaCampo
        char tecla = evt.getKeyChar();

        if (!Character.isDigit(tecla)){
            evt.consume();
        }
    }//GEN-LAST:event_validaCampo

    private void jTFLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLinhaActionPerformed

    }//GEN-LAST:event_jTFLinhaActionPerformed

    private void jBDiagonalPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiagonalPActionPerformed
        jTSaidaDois.setText(matriz.exibirMatriz2(matriz.diagonalPrincipal()));
        //jTSaidaDois.setText(Arrays.toString(matriz.diagonalPrincipal()));
    }//GEN-LAST:event_jBDiagonalPActionPerformed

    private void jBDiagonalSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiagonalSActionPerformed
        jTSaidaDois.setText(matriz.exibirMatriz2(matriz.diagonalSecundaria()));
    }//GEN-LAST:event_jBDiagonalSActionPerformed

    private void jBTrocaValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrocaValoresActionPerformed
        
        jTSaidaDois.setText(matriz.exibirMatriz2(matriz.trocaLinhas()));
    }//GEN-LAST:event_jBTrocaValoresActionPerformed

    private void jBParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBParesActionPerformed
        jTSaidaDois.setText(matriz.exibirPares());
        
    }//GEN-LAST:event_jBParesActionPerformed

    private void jBMaiorValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaiorValorActionPerformed
       jTSaidaDois.setText(Arrays.toString(matriz.maiorValor()));
    }//GEN-LAST:event_jBMaiorValorActionPerformed

    private void jBSubstituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubstituirActionPerformed
        jTSaidaDois.setText(matriz.exibirMatriz2(matriz.substituirValores()));
    }//GEN-LAST:event_jBSubstituirActionPerformed

    private void jBSimetriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSimetriaActionPerformed
        if(matriz.matrizSimetrica()==true){
            jTSaidaDois.setText("É Simétrica");
        }else{
            jTSaidaDois.setText("Não é Simétrica");
        }
    }//GEN-LAST:event_jBSimetriaActionPerformed

    private void jBTSomaDiagPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSomaDiagPrinActionPerformed
        jTSaidaDois.setText(Arrays.toString(matriz.somaDiagonalPrincipal()));
    }//GEN-LAST:event_jBTSomaDiagPrinActionPerformed

    private void jBMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMediaActionPerformed
        jTSaidaDois.setText(Arrays.toString(matriz.mediaMatriz()));
        //jTSaidaDois.setText(matriz.exibirMatriz2(matriz.matrizNegativa()));
    }//GEN-LAST:event_jBMediaActionPerformed

    private void jBMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMultiplicarActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDiagonalP;
    private javax.swing.JButton jBDiagonalS;
    private javax.swing.JButton jBGerar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBMaiorValor;
    private javax.swing.JButton jBMedia;
    private javax.swing.JButton jBMultiplicar;
    private javax.swing.JButton jBPares;
    private javax.swing.JButton jBRandom;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSimetria;
    private javax.swing.JButton jBSomaAll;
    private javax.swing.JButton jBSomaX;
    private javax.swing.JButton jBSomaY;
    private javax.swing.JButton jBSubstituir;
    private javax.swing.JButton jBTSomaDiagPrin;
    private javax.swing.JButton jBTransposta;
    private javax.swing.JButton jBTrocaValores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFColuna;
    private javax.swing.JTextField jTFLinha;
    private javax.swing.JTextArea jTSaida;
    private javax.swing.JTextArea jTSaidaDois;
    // End of variables declaration//GEN-END:variables
}
