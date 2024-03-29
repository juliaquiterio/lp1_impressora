/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.opencsv.CSVWriter;



/**
 *
 * @author Filhas
 */
public class Form_Impressora extends javax.swing.JFrame {
    private static final String CSV = "arquivo.csv";

    /**
     * Creates new form Form_Impressora
     */
    public Form_Impressora() {
        Impressora c1 = new Impressora();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCopiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnScannear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioTinta = new javax.swing.JRadioButton();
        jRadioLembrar = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioPapel = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tamanho:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 23, -1, -1));

        jLabel2.setText("Material:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 78, -1, -1));

        jLabel3.setText("Modelo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 146, -1, -1));

        jLabel4.setText("Cor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setText("Peso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 267, -1, -1));

        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        txtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });
        getContentPane().add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, -1));

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jLabel6.setText("Para imprimir clique no botão abaixo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel7.setText("Para tirar cópias clique no botão abaixo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        btnCopiar.setText("Copiar");
        btnCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCopiarMouseClicked(evt);
            }
        });
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel8.setText("Para scannear clique no botão abaixo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        btnScannear.setText("Scannear");
        btnScannear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScannearMouseClicked(evt);
            }
        });
        getContentPane().add(btnScannear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel10.setText("Carregar a tinta do seu dispositivo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jRadioTinta.setText("Carregar agora");
        jRadioTinta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioTintaMouseClicked(evt);
            }
        });
        jRadioTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTintaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioTinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jRadioLembrar.setText("Lembrar mais tarde");
        jRadioLembrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioLembrarMouseClicked(evt);
            }
        });
        getContentPane().add(jRadioLembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel11.setText("Carregue papéis no seu dispositivo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jRadioPapel.setText("Carregar agora");
        jRadioPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioPapelMouseClicked(evt);
            }
        });
        getContentPane().add(jRadioPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        setSize(new java.awt.Dimension(642, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Imprimindo.. aguarde");
        
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Copiando.. aguarde");
    }//GEN-LAST:event_btnCopiarMouseClicked

    private void btnScannearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScannearMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Scanneando... aguarde");
    }//GEN-LAST:event_btnScannearMouseClicked

    private void jRadioTintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioTintaActionPerformed

    private void jRadioTintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioTintaMouseClicked
        // TODO add your handling code here:
        if (jRadioTinta.isSelected())
            JOptionPane.showMessageDialog(null, "A impressora esta pausada esperando você colocar a tinta");
    }//GEN-LAST:event_jRadioTintaMouseClicked

    private void jRadioLembrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioLembrarMouseClicked
        // TODO add your handling code here:
        if (jRadioLembrar.isSelected())
            JOptionPane.showMessageDialog(null, "Lembrar mais tarde");
    }//GEN-LAST:event_jRadioLembrarMouseClicked

    private void jRadioPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioPapelMouseClicked
        // TODO add your handling code here:
        if (jRadioPapel.isSelected())
            JOptionPane.showMessageDialog(null, "A impressora está pausada esperando você colocar os papéis");
    }//GEN-LAST:event_jRadioPapelMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try{
            FileWriter fw = new FileWriter(new File(CSV));
            CSVWriter cw = new CSVWriter(fw);
        
            String[] cabecalho = {"TAMANHO", "MATERIAL", "MODELO", "COR", "PESO"};
            ArrayList<String[]> data = new ArrayList<String[]>();
        
            String item1 [] = {c1.getTamanho(), c1.getMaterial(), c1.getModelo(), c1.getCor(), c1.getPeso()};
        
            data.add(cabecalho);
            data.add(item1);
            cw.writeAll(data);
            cw.close();
            fw.close();
         
    }catch(IOException e){
        e.printStackTrace();
    }
     
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
        c1.setTamanho(txtTamanho.getText());
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialActionPerformed
        // TODO add your handling code here:
        c1.setMaterial(txtMaterial.getText());
    }//GEN-LAST:event_txtMaterialActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
        c1.setModelo(txtModelo.getText());
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
        c1.setCor(txtCor.getText());
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
        c1.setPeso(txtPeso.getText());
    }//GEN-LAST:event_txtPesoActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Impressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Impressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Impressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Impressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Impressora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnScannear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioLembrar;
    private javax.swing.JRadioButton jRadioPapel;
    private javax.swing.JRadioButton jRadioTinta;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
Impressora c1;
}
