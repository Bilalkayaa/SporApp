
import static java.awt.GridBagConstraints.BOTH;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import java.net.*;



public class SporApp extends javax.swing.JFrame {

    private String ad,soyad,tc,tel,acilad,acilsoyad,aciltel,yas,kan,cinsiyet,brans,sure,rapor,egitmen,saat,seans;
    Tablo t1=new Tablo();
    
    public SporApp() {
        initComponents();        
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_cinsiyet = new javax.swing.ButtonGroup();
        m_saglik = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Panel = new javax.swing.JPanel();
        Ad = new javax.swing.JLabel();
        Soyad = new javax.swing.JLabel();
        TC = new javax.swing.JLabel();
        Yas = new javax.swing.JLabel();
        Cinsiyet = new javax.swing.JLabel();
        m_erkek = new javax.swing.JRadioButton();
        m_kadın = new javax.swing.JRadioButton();
        m_yas = new javax.swing.JComboBox<>();
        Brans = new javax.swing.JLabel();
        m_brans = new javax.swing.JComboBox<>();
        m_ad = new javax.swing.JTextField();
        m_soyad = new javax.swing.JTextField();
        m_tc = new javax.swing.JTextField();
        Saglik = new javax.swing.JLabel();
        m_var = new javax.swing.JRadioButton();
        m_yok = new javax.swing.JRadioButton();
        Kan = new javax.swing.JLabel();
        m_kan = new javax.swing.JComboBox<>();
        Sure = new javax.swing.JLabel();
        m_sure = new javax.swing.JComboBox<>();
        TelNo = new javax.swing.JLabel();
        m_tel = new javax.swing.JTextField();
        AcilKisi = new javax.swing.JLabel();
        AcilAd = new javax.swing.JLabel();
        m_acilad = new javax.swing.JTextField();
        AcilSoyad = new javax.swing.JLabel();
        m_acilsoyad = new javax.swing.JTextField();
        AcilTel = new javax.swing.JLabel();
        m_aciltel = new javax.swing.JTextField();
        Seans = new javax.swing.JLabel();
        m_seans = new javax.swing.JComboBox<>();
        Saat = new javax.swing.JLabel();
        m_ekle = new javax.swing.JButton();
        Egitmen = new javax.swing.JLabel();
        m_egitmen = new javax.swing.JComboBox<>();
        m_saat = new javax.swing.JLabel();
        m_guncelle = new javax.swing.JButton();
        m_yenile = new javax.swing.JButton();
        m_listele = new javax.swing.JButton();
        m_sil = new javax.swing.JButton();
        m_gif = new javax.swing.JLabel();
        m_back = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(772, 506));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ad.setForeground(new java.awt.Color(51, 255, 153));
        Ad.setText("Ad:");
        Panel.add(Ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        Soyad.setForeground(new java.awt.Color(51, 255, 153));
        Soyad.setText("Soyad:");
        Panel.add(Soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, -1, -1));

        TC.setForeground(new java.awt.Color(51, 255, 153));
        TC.setText("TC:");
        Panel.add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, -1, -1));

        Yas.setForeground(new java.awt.Color(51, 255, 153));
        Yas.setText("Yaş:");
        Panel.add(Yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        Cinsiyet.setForeground(new java.awt.Color(51, 255, 153));
        Cinsiyet.setText("Cinsiyet:");
        Panel.add(Cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        m_cinsiyet.add(m_erkek);
        m_erkek.setText("Erkek");
        m_erkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_erkekActionPerformed(evt);
            }
        });
        Panel.add(m_erkek, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        m_cinsiyet.add(m_kadın);
        m_kadın.setText("Kadın");
        m_kadın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_kadınActionPerformed(evt);
            }
        });
        Panel.add(m_kadın, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        m_yas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        m_yas.setMinimumSize(new java.awt.Dimension(79, 22));
        m_yas.setPreferredSize(new java.awt.Dimension(79, 22));
        m_yas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_yasActionPerformed(evt);
            }
        });
        Panel.add(m_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 90, -1));

        Brans.setForeground(new java.awt.Color(51, 255, 153));
        Brans.setText("Branş:");
        Panel.add(Brans, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 16, -1, -1));

        m_brans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Futbol", "Basketbol", "Voleybol", "Yüzme", "Fitness", "Karate" }));
        m_brans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_bransActionPerformed(evt);
            }
        });
        Panel.add(m_brans, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 13, 100, -1));

        m_ad.setMaximumSize(new java.awt.Dimension(7, 22));
        m_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_adActionPerformed(evt);
            }
        });
        Panel.add(m_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, 102, -1));

        m_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_soyadActionPerformed(evt);
            }
        });
        Panel.add(m_soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 52, 102, -1));

        m_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_tcActionPerformed(evt);
            }
        });
        Panel.add(m_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 95, 102, -1));

        Saglik.setForeground(new java.awt.Color(51, 255, 153));
        Saglik.setText("Sağlık Raporu:");
        Panel.add(Saglik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        m_saglik.add(m_var);
        m_var.setText("Var");
        m_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_varActionPerformed(evt);
            }
        });
        Panel.add(m_var, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        m_saglik.add(m_yok);
        m_yok.setText("Yok");
        Panel.add(m_yok, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        Kan.setForeground(new java.awt.Color(51, 255, 153));
        Kan.setText("Kan Grubu:");
        Panel.add(Kan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        m_kan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-" }));
        m_kan.setMinimumSize(new java.awt.Dimension(79, 22));
        m_kan.setPreferredSize(new java.awt.Dimension(79, 22));
        Panel.add(m_kan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));

        Sure.setForeground(new java.awt.Color(51, 255, 153));
        Sure.setText("Süre:");
        Panel.add(Sure, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        m_sure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "1 ay", "2 ay", "3 ay", "4 ay", "5 ay", "6 ay" }));
        m_sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sureActionPerformed(evt);
            }
        });
        Panel.add(m_sure, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 155, 100, -1));

        TelNo.setForeground(new java.awt.Color(51, 255, 153));
        TelNo.setText("Telefon No:");
        Panel.add(TelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 131, -1, -1));
        Panel.add(m_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 102, -1));

        AcilKisi.setForeground(new java.awt.Color(51, 255, 153));
        AcilKisi.setText("ACİL DURUM KİŞİ BİLGİLERİ");
        Panel.add(AcilKisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 13, 170, 19));

        AcilAd.setForeground(new java.awt.Color(51, 255, 153));
        AcilAd.setText("Ad:");
        Panel.add(AcilAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 45, -1, -1));

        m_acilad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_aciladActionPerformed(evt);
            }
        });
        Panel.add(m_acilad, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 42, 102, -1));

        AcilSoyad.setForeground(new java.awt.Color(51, 255, 153));
        AcilSoyad.setText("Soyad:");
        Panel.add(AcilSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 82, -1, -1));

        m_acilsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_acilsoyadActionPerformed(evt);
            }
        });
        Panel.add(m_acilsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 82, 102, -1));

        AcilTel.setForeground(new java.awt.Color(51, 255, 153));
        AcilTel.setText("Telefon NO:");
        Panel.add(AcilTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 125, -1, -1));
        Panel.add(m_aciltel, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 122, 102, -1));

        Seans.setForeground(new java.awt.Color(51, 255, 153));
        Seans.setText("Seans:");
        Panel.add(Seans, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        m_seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Pzt-Çarş-Cum", "Salı-Perş", "Cmt-Pzr" }));
        m_seans.setMinimumSize(new java.awt.Dimension(79, 22));
        m_seans.setPreferredSize(new java.awt.Dimension(79, 22));
        m_seans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_seansActionPerformed(evt);
            }
        });
        Panel.add(m_seans, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 87, 100, -1));

        Saat.setForeground(new java.awt.Color(51, 255, 153));
        Saat.setText("Saat:");
        Panel.add(Saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 125, -1, -1));

        m_ekle.setText("Ekle");
        m_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ekleActionPerformed(evt);
            }
        });
        Panel.add(m_ekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 340, 90, -1));

        Egitmen.setForeground(new java.awt.Color(51, 255, 153));
        Egitmen.setText("Eğitmen:");
        Panel.add(Egitmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 55, -1, -1));

        m_egitmen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Selçuk Yavaş", "Mesut Özil" }));
        m_egitmen.setMinimumSize(new java.awt.Dimension(79, 22));
        m_egitmen.setPreferredSize(new java.awt.Dimension(79, 22));
        m_egitmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_egitmenActionPerformed(evt);
            }
        });
        Panel.add(m_egitmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 52, 100, -1));
        Panel.add(m_saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 169, 20));

        m_guncelle.setText("Güncelle");
        m_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_guncelleActionPerformed(evt);
            }
        });
        Panel.add(m_guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 90, -1));

        m_yenile.setText("Yenile");
        m_yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_yenileActionPerformed(evt);
            }
        });
        Panel.add(m_yenile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 90, -1));

        m_listele.setText("Listele");
        m_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_listeleActionPerformed(evt);
            }
        });
        Panel.add(m_listele, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 50));

        m_sil.setText("Sil");
        m_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_silActionPerformed(evt);
            }
        });
        Panel.add(m_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, -1));
        Panel.add(m_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 460, 250));

        m_back.setIcon(new javax.swing.ImageIcon("C:\\Users\\bll_k\\Desktop\\gif\\izu2.jpg")); // NOI18N
        Panel.add(m_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_ekleActionPerformed
        
        try{            
                DefaultTableModel model = (DefaultTableModel) t1.mainTable.getModel();
                ad = m_ad.getText();
                soyad = m_soyad.getText();
                tc =m_tc.getText();
                tel = m_tel.getText();
                acilad = m_acilad.getText();
                acilsoyad=m_acilsoyad.getText();
                aciltel=m_aciltel.getText();
                yas=m_yas.getSelectedItem().toString();
                kan=m_kan.getSelectedItem().toString();
                brans=m_brans.getSelectedItem().toString();
                sure=m_sure.getSelectedItem().toString();
                egitmen=m_egitmen.getSelectedItem().toString();
                seans=m_seans.getSelectedItem().toString();
                saat=m_saat.getText();
                if(m_erkek.isSelected()==true){
                    cinsiyet="Erkek";
                }
                else if(m_kadın.isSelected()==true){
                    cinsiyet="Kadın";
                }
                else
                    cinsiyet="";
                
                
                if(m_var.isSelected()==true){
                    rapor="Var";
                }
                else if(m_yok.isSelected()==true){
                    throw new IOException();}
                else
                    rapor="";
                
                if(tc.length()<11||tc.length()>11){
                    throw new ArithmeticException();
                }
        
                if(ad.equals("") || soyad.equals("") || tc.equals("") || tel.equals("") || acilad.equals("")|| acilsoyad.equals("")||
                    aciltel.equals("")||yas.equals("Seçiniz...")||kan.equals("Seçiniz...")||
                    cinsiyet.equals("")||brans.equals("Seçiniz...")||sure.equals("Seçiniz...")||
                    rapor.equals("")||egitmen.equals("Seçiniz...")||
                    seans.equals("Seçiniz..."))
                 {
                 throw new NullPointerException();      
                }
                
            
                else
                {               
                model.addRow(new Object[]{ad,soyad,tc,tel,yas,cinsiyet,kan,brans,egitmen,seans,saat,sure,acilad,acilsoyad,aciltel});
            
                }
            }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(this, "Lütfen tüm bilgileri doldurunuz !", "Uyari", JOptionPane.WARNING_MESSAGE);
        }
        catch(ArithmeticException e){
             JOptionPane.showMessageDialog(this,"TC numarası 11 haneli olmalıdır.");
        }
        catch(IOException e){
             JOptionPane.showMessageDialog(null,"Lütfen sağlık raporu alınız.");
        }
  
    }//GEN-LAST:event_m_ekleActionPerformed

    private void m_seansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_seansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_seansActionPerformed

    private void m_acilsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_acilsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_acilsoyadActionPerformed

    private void m_aciladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_aciladActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_aciladActionPerformed

    private void m_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_varActionPerformed

    private void m_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_tcActionPerformed
        
    }//GEN-LAST:event_m_tcActionPerformed

    private void m_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_soyadActionPerformed

    private void m_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_adActionPerformed

    private void m_bransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_bransActionPerformed
        
        if(m_brans.getSelectedItem()=="Futbol"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Selçuk Yavaş");
            m_egitmen.addItem("Mesut Özil");
            m_saat.setText("12.00-14.00");
            ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/futbol.gif");
            m_gif.setIcon(icon);
            
            
        }
        else if(m_brans.getSelectedItem()=="Basketbol"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Hidayet Türkoğlu");
            m_egitmen.addItem("Ersan İlyasova");
            m_saat.setText("14.00-16.00");
            ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/basketbol.gif");
            m_gif.setIcon(icon);
            
            
        }
        else if(m_brans.getSelectedItem()=="Voleybol"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Bilal Kaya");
            m_egitmen.addItem("Eda Erdem");
            m_saat.setText("16.00-18.00");
           ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/voleybol.gif");
            m_gif.setIcon(icon);
            
            
        }
        else if(m_brans.getSelectedItem()=="Karate"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Alparslan Yamanoğlu");
            m_egitmen.addItem("Müşerref Özdemir");
            m_saat.setText("18.00-20.00");
            ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/karate.gif");
            m_gif.setIcon(icon);
            
          
        }
        else if(m_brans.getSelectedItem()=="Fitness"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Alper Karaca");
            m_egitmen.addItem("Abdullah Akkaya");
            m_saat.setText("10.00-12.00");
            ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/fitness.gif");
            m_gif.setIcon(icon);
            
            
        }
        else if(m_brans.getSelectedItem()=="Yüzme"){
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_egitmen.addItem("Emre Sakçı");
            m_egitmen.addItem("Micheal Phelps");
            m_saat.setText("08.00-10.00");
            ImageIcon icon = new ImageIcon("C:/Users/bll_k/Desktop/gif/yuzme.gif");
            m_gif.setIcon(icon);
           
            
        }
        else if(m_brans.getSelectedItem()=="Seçiniz..."){
            m_gif.setIcon(null);
            m_egitmen.removeAllItems();
            m_egitmen.addItem("Seçiniz...");
            m_saat.setText("");
        }
        
        
    }//GEN-LAST:event_m_bransActionPerformed

    private void m_yasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_yasActionPerformed
            
        
    }//GEN-LAST:event_m_yasActionPerformed

    private void m_erkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_erkekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_erkekActionPerformed

    private void m_kadınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_kadınActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_kadınActionPerformed

    private void m_sureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_sureActionPerformed

    private void m_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_guncelleActionPerformed

        int secilenSatir;
        secilenSatir = t1.mainTable.getSelectedRow();
        
        if(secilenSatir == -1)
        {
            JOptionPane.showMessageDialog(this, "Lutfen bir satir secin !", "Uyari", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) t1.mainTable.getModel();
            secilenSatir = t1.mainTable.getSelectedRow();
       
            m_ad.setText(model.getValueAt(secilenSatir,0).toString());
            m_soyad.setText(model.getValueAt(secilenSatir,1).toString());
            m_tc.setText(model.getValueAt(secilenSatir,2).toString());
            m_tel.setText(model.getValueAt(secilenSatir,3).toString());
            m_yas.setSelectedItem(model.getValueAt(secilenSatir,4).toString());
            if(model.getValueAt(secilenSatir,5).toString()=="Erkek")
                m_erkek.setSelected(true);
            else
                m_kadın.setSelected(true);
        
            m_kan.setSelectedItem(model.getValueAt(secilenSatir,6).toString());
            m_brans.setSelectedItem(model.getValueAt(secilenSatir,7).toString());
            m_egitmen.setSelectedItem(model.getValueAt(secilenSatir,8).toString());
            m_seans.setSelectedItem(model.getValueAt(secilenSatir,9).toString());
            m_saat.setText(model.getValueAt(secilenSatir,10).toString());
            m_sure.setSelectedItem(model.getValueAt(secilenSatir,11).toString());
            m_acilad.setText(model.getValueAt(secilenSatir,12).toString());
            m_acilsoyad.setText(model.getValueAt(secilenSatir,13).toString());
            m_aciltel.setText(model.getValueAt(secilenSatir,14).toString());
            m_var.setSelected(true);
            m_silActionPerformed(evt);
            
            secilenSatir = -1;
            t1.mainTable.getSelectionModel().clearSelection();
        }
    }//GEN-LAST:event_m_guncelleActionPerformed

    private void m_yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_yenileActionPerformed
           m_tc.setText("");
           m_ad.setText("");
           m_tel.setText("");
           m_soyad.setText("");
           m_acilad.setText("");
           m_acilsoyad.setText("");
           m_aciltel.setText("");
           m_brans.setSelectedIndex(0);
           m_egitmen.setSelectedIndex(0);
           m_seans.setSelectedIndex(0);
           m_sure.setSelectedIndex(0);
           m_kan.setSelectedIndex(0);
           m_yas.setSelectedIndex(0);
           m_cinsiyet.clearSelection();
           m_saglik.clearSelection();
           
         
    }//GEN-LAST:event_m_yenileActionPerformed

    private void m_egitmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_egitmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_egitmenActionPerformed

    private void m_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_listeleActionPerformed

          t1.setVisible(true);
          
          t1.setAlwaysOnTop(true);
          t1.setAlwaysOnTop(false);
        
    }//GEN-LAST:event_m_listeleActionPerformed

    private void m_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_silActionPerformed
        int secilenSatir;
        DefaultTableModel model = (DefaultTableModel) t1.mainTable.getModel();
        secilenSatir = t1.mainTable.getSelectedRow();
        if(secilenSatir == -1)
        {
            JOptionPane.showMessageDialog(this, "Lutfen bir satir secin !", "Uyari", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            model.removeRow(secilenSatir);
            secilenSatir = -1;
        }
    }//GEN-LAST:event_m_silActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SporApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SporApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SporApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SporApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
       
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                
                new SporApp().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcilAd;
    private javax.swing.JLabel AcilKisi;
    private javax.swing.JLabel AcilSoyad;
    private javax.swing.JLabel AcilTel;
    private javax.swing.JLabel Ad;
    private javax.swing.JLabel Brans;
    private javax.swing.JLabel Cinsiyet;
    private javax.swing.JLabel Egitmen;
    private javax.swing.JLabel Kan;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Saat;
    private javax.swing.JLabel Saglik;
    private javax.swing.JLabel Seans;
    private javax.swing.JLabel Soyad;
    private javax.swing.JLabel Sure;
    private javax.swing.JLabel TC;
    private javax.swing.JLabel TelNo;
    private javax.swing.JLabel Yas;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField m_acilad;
    private javax.swing.JTextField m_acilsoyad;
    private javax.swing.JTextField m_aciltel;
    private javax.swing.JTextField m_ad;
    private javax.swing.JLabel m_back;
    private javax.swing.JComboBox<String> m_brans;
    private javax.swing.ButtonGroup m_cinsiyet;
    private javax.swing.JComboBox<String> m_egitmen;
    private javax.swing.JButton m_ekle;
    private javax.swing.JRadioButton m_erkek;
    private javax.swing.JLabel m_gif;
    private javax.swing.JButton m_guncelle;
    private javax.swing.JRadioButton m_kadın;
    private javax.swing.JComboBox<String> m_kan;
    private javax.swing.JButton m_listele;
    private javax.swing.JLabel m_saat;
    private javax.swing.ButtonGroup m_saglik;
    private javax.swing.JComboBox<String> m_seans;
    private javax.swing.JButton m_sil;
    private javax.swing.JTextField m_soyad;
    private javax.swing.JComboBox<String> m_sure;
    private javax.swing.JTextField m_tc;
    private javax.swing.JTextField m_tel;
    private javax.swing.JRadioButton m_var;
    private javax.swing.JComboBox<String> m_yas;
    private javax.swing.JButton m_yenile;
    private javax.swing.JRadioButton m_yok;
    // End of variables declaration//GEN-END:variables
}
