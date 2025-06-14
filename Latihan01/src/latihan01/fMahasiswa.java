package latihan01;

import static latihan01.dbkoneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Antonia Tatarianingsih Abur
 * Sabtu, 24 Mei 2025
 */
public class fMahasiswa extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel(); 
    /**
     * Creates new form fMahasiswa
     * @throws java.sql.SQLException
     */
    public fMahasiswa() throws SQLException {
        initComponents();
        tmhs.setModel(dtm);
        dtm.addColumn("Nama Mahasiswa");
        dtm.addColumn("NIM");
        dtm.addColumn("Jenis Kelamin");
        dtm.addColumn("Prodi");
        
        lsDtMhs();
        fieldEnabled(false);
        tombol(false);
        cBARU.setEnabled(true);
        cTUTUP.setEnabled(true);
        
        
    }
    private void fieldEnabled(boolean opsi){
        txNIM.setEditable(opsi);
        txNAMA.setEditable(opsi);
        txJK.setEditable(opsi);
        txPRODI.setEditable(opsi);
    }
    private void tombol(boolean opsi){
        cBARU.setEnabled(opsi);
        cUBAH.setEnabled(opsi);
        cHAPUS.setEnabled(opsi);
        cTUTUP.setEnabled(opsi);
    }
    
    private void lsDtMhs() throws SQLException{
        Connection cnn = koneksi();
        
        if( !cnn.isClosed() ){
           PreparedStatement ps = cnn.prepareStatement("SELECT * FROM mhs;");
           ResultSet rs = ps.executeQuery();
           while( rs.next() ){
               Object[] dta = new Object[4];
                  dta[0] = rs.getString("NAMA");
                  dta[1] = rs.getString("NIM");
                  dta[2] = rs.getString("JKEL");
                  dta[3] = rs.getString("PRODI");
                  
                  dtm.addRow(dta);  
               
           }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txNAMA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txJK = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txPRODI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmhs = new javax.swing.JTable();
        cUBAH = new javax.swing.JButton();
        cBARU = new javax.swing.JButton();
        cHAPUS = new javax.swing.JButton();
        cTUTUP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setText("NAMA MAHASISWA");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("PROGRAM STUDI");

        tmhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmhs);

        cUBAH.setBackground(new java.awt.Color(204, 255, 255));
        cUBAH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cUBAH.setText("Ubah");

        cBARU.setBackground(new java.awt.Color(0, 153, 255));
        cBARU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cBARU.setText("Baru");

        cHAPUS.setBackground(new java.awt.Color(102, 255, 204));
        cHAPUS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cHAPUS.setText("Hapus");

        cTUTUP.setBackground(new java.awt.Color(204, 0, 0));
        cTUTUP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cTUTUP.setText("Tutup");
        cTUTUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTUTUPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(txNIM)
                                .addComponent(txNAMA)
                                .addComponent(txJK)
                                .addComponent(txPRODI, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cBARU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cTUTUP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txJK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPRODI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cBARU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cTUTUP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTUTUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTUTUPActionPerformed
       int opsi = JOptionPane.showOptionDialog(
               this, 
               "Yakin Akan Menutup Form?",
               "Konfirmasi Tutup form", 
               JOptionPane.YES_NO_OPTION, 
               JOptionPane.QUESTION_MESSAGE, 
               null,null,null);
       if(opsi == JOptionPane.OK_OPTION){
           System.exit(0);
       }
               
        System.exit(0);
    }//GEN-LAST:event_cTUTUPActionPerformed

    private void tmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmhsMouseClicked
       txNAMA.setText(tmhs.getValueAt(tmhs.getSelectedRow(),1).toString());
       txNIM.setText(tmhs.getValueAt(tmhs.getSelectedRow(),0).toString());
       String jkx = (tmhs.getValueAt(tmhs.getSelectedRow() , 2 ).toString().equals("L"))?"Laki-Laki":"Perempuan";
       txJK.setText(jkx);
       txPRODI.setText( tmhs.getValueAt(tmhs.getSelectedRow(),3).toString());
       cUBAH.setEnabled(true);
       cHAPUS.setEnabled(true);
    }//GEN-LAST:event_tmhsMouseClicked

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
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fMahasiswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(fMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cBARU;
    private javax.swing.JButton cHAPUS;
    private javax.swing.JButton cTUTUP;
    private javax.swing.JButton cUBAH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tmhs;
    private javax.swing.JTextField txJK;
    private javax.swing.JTextField txNAMA;
    private javax.swing.JTextField txNIM;
    private javax.swing.JTextField txPRODI;
    // End of variables declaration//GEN-END:variables
}
