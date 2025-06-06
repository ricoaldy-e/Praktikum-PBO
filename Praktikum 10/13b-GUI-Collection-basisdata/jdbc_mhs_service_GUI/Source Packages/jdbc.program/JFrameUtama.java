// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
// Tanggal  : 23 Mei 2025
// File     : JFrameUtama.java
// Deskripsi: Kelas utama GUI berbasis JFrame untuk mengelola data mahasiswa. 
//            Menyediakan fitur tampilan, penambahan, pengeditan, dan penghapusan data mahasiswa 
//            dari database menggunakan struktur dua JList (ID dan Nama) serta tombol-tombol kontrol.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;
import javax.swing.DefaultListModel;
import jdbc.model.Mahasiswa;


/**
 *
 * @author ricoa
 */
public class JFrameUtama extends javax.swing.JFrame {
    // Atribut
    MysqlMahasiswaService service = new MysqlMahasiswaService();
    DefaultListModel<String> modelId = new DefaultListModel<>();
    DefaultListModel<String> modelNama = new DefaultListModel<>();


    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        jList1.setModel(modelId);
        jList2.setModel(modelNama);

        jList1.addListSelectionListener(e -> {
            int index = jList1.getSelectedIndex();
            if (index != -1 && index < modelId.getSize()) {
                IDEdit.setText(modelId.getElementAt(index));
                IDHapus.setText(modelId.getElementAt(index));
                NamaEdit.setText(modelNama.getElementAt(index));
                NamaHapus.setText(modelNama.getElementAt(index));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AmbilData = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        IDEdit = new javax.swing.JTextField();
        NamaEdit = new javax.swing.JTextField();
        IDHapus = new javax.swing.JTextField();
        NamaHapus = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("ID");

        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("KELOLA DATA MAHASISWA");

        AmbilData.setText("Ambil Semua Data");
        AmbilData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbilDataActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama:");

        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        Add.setText("Tambahkan");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        IDEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEditActionPerformed(evt);
            }
        });

        NamaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaEditActionPerformed(evt);
            }
        });

        IDHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDHapusActionPerformed(evt);
            }
        });

        NamaHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaHapusActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Reset.setText("Reset Indeks");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AmbilData)
                                        .addComponent(jLabel4)
                                        .addComponent(Add)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(IDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(NamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(IDHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(NamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Hapus)))
                                    .addComponent(Reset))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(AmbilData)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Add)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hapus))
                        .addGap(18, 18, 18)
                        .addComponent(Reset)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmbilDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbilDataActionPerformed
        modelId.clear();
        modelNama.clear();
        
        List<Mahasiswa> data = service.getAll();
        for (Mahasiswa m : data) {
            modelId.addElement(String.valueOf(m.getId()));
            modelNama.addElement(m.getNama());
        }
    }//GEN-LAST:event_AmbilDataActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        try {
            int selectedIndex = jList1.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedIdStr = modelId.getElementAt(selectedIndex);
                int selectedId = Integer.parseInt(selectedIdStr);

                service.delete(selectedId);

                AmbilDataActionPerformed(null);
            }
        } catch (NumberFormatException e) {
            System.out.println("Gagal hapus: " + e.getMessage());
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String nama = TextField.getText();
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama(nama);

        service.add(mhs);        
        AmbilDataActionPerformed(null);
        TextField.setText("");  
        System.out.println("Tambah: " + nama);

    }//GEN-LAST:event_AddActionPerformed

    private void IDEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEditActionPerformed

    private void NamaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaEditActionPerformed

    private void IDHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDHapusActionPerformed

    private void NamaHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaHapusActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        modelId.clear();
        modelNama.clear();
    }//GEN-LAST:event_ResetActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
            int id = Integer.parseInt(IDEdit.getText());
            String nama = NamaEdit.getText();
            Mahasiswa mhs = new Mahasiswa(id, nama);
            service.update(mhs);
            AmbilDataActionPerformed(null);
            IDEdit.setText("");
            NamaEdit.setText("");
        } catch (NumberFormatException e) {
            System.out.println("ID harus angka");
        }
    }//GEN-LAST:event_EditActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AmbilData;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField IDEdit;
    private javax.swing.JTextField IDHapus;
    private javax.swing.JTextField NamaEdit;
    private javax.swing.JTextField NamaHapus;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
