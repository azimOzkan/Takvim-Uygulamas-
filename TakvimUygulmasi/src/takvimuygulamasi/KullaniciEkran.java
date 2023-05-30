
package takvimuygulamasi;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KullaniciEkran extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public KullaniciEkran() {
        initComponents();
         lbl_tarih.setText(String.valueOf(LocalDate.now()));
         ta_olaySorgu.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbl_tarih = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_olayTip = new javax.swing.JTextField();
        txt_olayBitis = new javax.swing.JTextField();
        txt_olayBaslangic = new javax.swing.JTextField();
        btn_olayEkle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_olayAciklama = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_islemTarihi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bildirim = new javax.swing.JTable();
        btn_bildirim = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        calendarCustom1 = new takvimuygulamasi.CalendarCustom();
        jLabel3 = new javax.swing.JLabel();
        txt_tarihSorgu = new javax.swing.JTextField();
        btn_sorgula = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_olaySorgu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("İşlem Tarihi");

        lbl_tarih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Olay Başlangıç Zamanı");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Olay Bitiş Zamanı");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Olay Tipi");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Olayın Açıklaması");

        txt_olayTip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_olayBitis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_olayBaslangic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_olayEkle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_olayEkle.setText("Olayı Ekle");
        btn_olayEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_olayEkleActionPerformed(evt);
            }
        });

        ta_olayAciklama.setColumns(20);
        ta_olayAciklama.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ta_olayAciklama.setRows(5);
        jScrollPane3.setViewportView(ta_olayAciklama);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Olay Ekle");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Tarih");

        txt_islemTarihi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel22))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_olayBaslangic, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(txt_olayBitis)
                            .addComponent(txt_olayTip)
                            .addComponent(jScrollPane3)
                            .addComponent(btn_olayEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_islemTarihi))))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(lbl_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_islemTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_olayBaslangic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_olayBitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_olayTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_olayEkle)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Olay Ekle", jPanel6);

        tbl_bildirim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Olay Tipi", "Olay Açıklması", "Başlangıç", "Bitiş"
            }
        ));
        jScrollPane2.setViewportView(tbl_bildirim);

        btn_bildirim.setText("Bildirimleri Görüntüle");
        btn_bildirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bildirimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btn_bildirim)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btn_bildirim)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bildirimler", jPanel1);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Tarih Belirtiniz");

        btn_sorgula.setText("Sorgula");
        btn_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sorgulaActionPerformed(evt);
            }
        });

        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        ta_olaySorgu.setColumns(20);
        ta_olaySorgu.setRows(5);
        jScrollPane1.setViewportView(ta_olaySorgu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(calendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txt_tarihSorgu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sorgula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_guncelle)
                        .addGap(131, 131, 131)
                        .addComponent(btn_sil)
                        .addGap(21, 21, 21))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(calendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(txt_tarihSorgu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_sorgula)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guncelle)
                            .addComponent(btn_sil))
                        .addGap(82, 82, 82))))
        );

        jTabbedPane1.addTab("Takvim", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //tarih sorgusu yapılır , ilgili tarihteki diğer veriler çekilip kullanıcıya gösterlir.
    private void btn_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sorgulaActionPerformed

  try {
            conn = db.connect_db();
            String sql2 = "SELECT * FROM Olaylar WHERE IslemTarihi='" + txt_tarihSorgu.getText() + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            String sorguBaslangic = rs.getString("OlayBaslangicZamani");
            String sorguBitis = rs.getString("OlayBitisZamani");
            String sorguTipi = rs.getString("OlayTipi");
            String sorguAciklama = rs.getString("OlayAciklamasi");

            ta_olaySorgu.append(
                    "Olay Başlangıç Zamanı: " + sorguBaslangic
                    + "\nOlay Bitiş Zamanı: " + sorguBitis
                    + "\nOlay Tipi: " + sorguTipi
                    + "\nOlay Açıklaması: " + sorguAciklama
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Yanlış formatta ya da geçersiz tarih girdiniz! ");
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_sorgulaActionPerformed

    //text fieldlardan alınan veriler insert lenerek veritabanına kaydedilir.
    private void btn_olayEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_olayEkleActionPerformed

        try {
            Connection conn = null;
            conn = db.connect_db();
            String sql = "INSERT INTO Olaylar (OlayBaslangicZamani,OlayBitisZamani,IslemTarihi,OlayTipi,OlayAciklamasi)"
            + "VALUES (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_olayBaslangic.getText());
            pst.setString(2, txt_olayBitis.getText());
            pst.setString(3, txt_islemTarihi.getText());
            pst.setString(4, txt_olayTip.getText());
            pst.setString(5, ta_olayAciklama.getText());
            pst.executeUpdate();

        } catch (Exception ex) {

        } finally {
            try {
                conn.close();
                pst.close();
            } catch (Exception ex) {

            }
        }
        txt_olayBaslangic.setText("");
        txt_olayBitis.setText("");
        lbl_tarih.setText("");
        txt_olayTip.setText("");
        ta_olayAciklama.setText("");
        txt_islemTarihi.setText("");
        JOptionPane.showMessageDialog(null, "Olay Eklendi");
    }//GEN-LAST:event_btn_olayEkleActionPerformed

    // kullanıcıya yansıtılan olay bilgileri bu butonla yeniden düzenlenir.
    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
      
         ta_olaySorgu.setEnabled(true);
        
    }//GEN-LAST:event_btn_guncelleActionPerformed

    //kullanıcıya yansıtılan olay bilgileri bu butonla silinir.
    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        
            try {
            conn = db.connect_db();
            String sql2 = "DELETE FROM Olaylar WHERE IslemTarihi='" + txt_tarihSorgu.getText() + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Olay Silinmiştir");
        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
        txt_tarihSorgu.setText("");
        ta_olaySorgu.setText("");
    }//GEN-LAST:event_btn_silActionPerformed

    //kullanıcının bu zamana kadar oluşturmuş olduğu olaylar burada görüntülenir.
    private void btn_bildirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bildirimActionPerformed

        
        try {

            conn = db.connect_db();
            String sql2 = "SELECT * FROM Olaylar";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);

            while (rs.next()) {
                String islemTarihi = rs.getString("IslemTarihi");
                String olayTipi = rs.getString("OlayTipi");
                String olayAciklama = rs.getString("OlayAciklamasi");
                String olayBaslangic = rs.getString("OlayBaslangicZamani");
                String olayBitis = rs.getString("OlayBitisZamani");

                String zaman = String.valueOf(LocalDate.now());

                if (zaman.equals(islemTarihi))
                    JOptionPane.showMessageDialog(null, olayAciklama+" Açıklamalı olayın vakti geldi!"  );


                String tbData[] = {olayTipi, olayAciklama, olayBaslangic, olayBitis};
                DefaultTableModel model = (DefaultTableModel) tbl_bildirim.getModel();

                model.addRow(tbData);
            }

        } catch (Exception ex) {

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_bildirimActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bildirim;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_olayEkle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_sorgula;
    private takvimuygulamasi.CalendarCustom calendarCustom1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_tarih;
    private javax.swing.JTextArea ta_olayAciklama;
    private javax.swing.JTextArea ta_olaySorgu;
    private javax.swing.JTable tbl_bildirim;
    private javax.swing.JTextField txt_islemTarihi;
    private javax.swing.JTextField txt_olayBaslangic;
    private javax.swing.JTextField txt_olayBitis;
    private javax.swing.JTextField txt_olayTip;
    private javax.swing.JTextField txt_tarihSorgu;
    // End of variables declaration//GEN-END:variables
}
