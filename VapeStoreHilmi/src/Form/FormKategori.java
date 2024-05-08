/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import java.util.List;
import javax.swing.JOptionPane;
import vape.DAO.DAO_Kategori;
import vape.model.ModelKategori;
import vape.service.ServiceKategori;
import vape.tabelmodel.TabelModelKategori;

/**
 *
 * @author Miaw
 */
public class FormKategori extends javax.swing.JPanel {
    
    private ServiceKategori service = new DAO_Kategori();
    private TabelModelKategori tabel = new TabelModelKategori();

    /**
     * Creates new form FormKategori
     */
    public FormKategori() {
        initComponents();
        
        tabelKategori.setModel(tabel);
        loadData();
        btnBatal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnTabelProduk = new javax.swing.JScrollPane();
        pnUtama = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTambah = new javax.swing.JButton();
        txtPencarian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKategori = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();
        pnTambah = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtIdKategori = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextField();
        btnSimpan4 = new javax.swing.JButton();
        btnBatal4 = new javax.swing.JButton();
        pnHeaderTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Kategori");

        btnTambah.setBackground(new java.awt.Color(72, 63, 139));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah Kategori");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        txtPencarian.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        tabelKategori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKategori.setRowHeight(30);
        tabelKategori.setShowGrid(false);
        tabelKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKategoriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKategori);

        btnBatal.setBackground(new java.awt.Color(72, 63, 139));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnUtamaLayout = new javax.swing.GroupLayout(pnUtama);
        pnUtama.setLayout(pnUtamaLayout);
        pnUtamaLayout.setHorizontalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUtamaLayout.createSequentialGroup()
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnUtamaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnUtamaLayout.createSequentialGroup()
                                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnUtamaLayout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)))))
                .addContainerGap())
        );
        pnUtamaLayout.setVerticalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUtamaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pnTabelProduk.setViewportView(pnUtama);

        mainPanel.add(pnTabelProduk, "card2");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("ID Kategori");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Nama Kategori");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Deskripsi");

        txtIdKategori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtDeskripsi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnSimpan4.setBackground(new java.awt.Color(72, 63, 139));
        btnSimpan4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan4.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan4.setText("Simpan");
        btnSimpan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan4btnSimpanActionPerformed(evt);
            }
        });

        btnBatal4.setBackground(new java.awt.Color(72, 63, 139));
        btnBatal4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal4.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal4.setText("Batal");
        btnBatal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal4btnBatalActionPerformed(evt);
            }
        });

        pnHeaderTambah.setBackground(new java.awt.Color(72, 63, 139));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tambah Kategori");

        javax.swing.GroupLayout pnHeaderTambahLayout = new javax.swing.GroupLayout(pnHeaderTambah);
        pnHeaderTambah.setLayout(pnHeaderTambahLayout);
        pnHeaderTambahLayout.setHorizontalGroup(
            pnHeaderTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHeaderTambahLayout.setVerticalGroup(
            pnHeaderTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderTambahLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeaderTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(txtIdKategori, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDeskripsi)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnHeaderTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(538, 538, 538))
        );

        javax.swing.GroupLayout pnTambahLayout = new javax.swing.GroupLayout(pnTambah);
        pnTambah.setLayout(pnTambahLayout);
        pnTambahLayout.setHorizontalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTambahLayout.setVerticalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTambahLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(pnTambah, "card3");

        add(mainPanel, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      if(btnTambah.getText().equals("Tambah Kategori")){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(pnTambah);
        mainPanel.repaint();
        mainPanel.revalidate();
     }else if(btnTambah.getText().equals("Ubah")){
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            mainPanel.add(pnTambah);
            mainPanel.repaint();
            mainPanel.revalidate();
            dataTabel();
     }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        List<ModelKategori> search = service.search(txtPencarian.getText());
        tabel.setData(search);       
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnSimpan4btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan4btnSimpanActionPerformed
        if(btnSimpan4.getText().equals("Perbarui")){
            perbaruiData();
            mainPanel.removeAll();
            mainPanel.add(pnUtama);
            mainPanel.repaint();
            mainPanel.revalidate();
        }else if(btnSimpan4.getText().equals("Simpan")){
            SimpanData(); 
        }
    }//GEN-LAST:event_btnSimpan4btnSimpanActionPerformed

    private void btnBatal4btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal4btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(pnUtama);
        mainPanel.repaint();
        mainPanel.revalidate();
        loadData();
        resetForm();
    }//GEN-LAST:event_btnBatal4btnBatalActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        loadData();
        btnBatal.setVisible(false);
        btnTambah.setText("Tambah Kategori");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tabelKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKategoriMouseClicked
        if(btnTambah.getText().equals("Tambah Kategori"))
    {
        btnTambah.setText("Ubah");
    }   
      
    btnBatal.setVisible(true); 
    }//GEN-LAST:event_tabelKategoriMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal4;
    private javax.swing.JButton btnSimpan4;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnHeaderTambah;
    private javax.swing.JScrollPane pnTabelProduk;
    private javax.swing.JPanel pnTambah;
    private javax.swing.JPanel pnUtama;
    private javax.swing.JTable tabelKategori;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtIdKategori;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables
private void loadData() {
        btnTambah.setText("Tambah Kategori");
        btnSimpan4.setText("Simpan");
        btnBatal.setVisible(false);
        List<ModelKategori> list = service.getData();
        tabel.setData(list);
    }

    private void SimpanData() {
        if(validasiInput()==true){
        String id_kategori      = txtIdKategori.getText();
        String nama_kategori    = txtNama.getText();
        String deskripsi  = txtDeskripsi.getText();
        
        ModelKategori ktg = new ModelKategori();
        
        ktg.setIdkategori(id_kategori);
        ktg.setNama_kategori(nama_kategori);
        ktg.setDeskripsi(deskripsi);


        
        service.tambahData(ktg);
        tabel.tambahData(ktg);
        resetForm();
        loadData();
        
        mainPanel.removeAll();
        mainPanel.add(pnUtama);
        mainPanel.repaint();
        mainPanel.revalidate();
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if(txtIdKategori.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ID Kategori Tidak Boleh Kosong");
        }else if(txtNama.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Kategori Tidak Boleh Kosong");
        }else if(txtDeskripsi.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Deskripsi Tidak Boleh Kosong");
        }else{
                valid=true;
            }
            return valid;
    }
    
//     private boolean validasiInputKode() {
//        boolean valid = false;
//        if(!txtIdDistributor.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Telah Terisi Otomatis");
//        }else{
//                valid=true;
//            }
//            return valid;
//    }
     
//    private boolean validasiKlikTable() {
//        field_kode.setEnabled(false);
//        field_supplier.setEnabled(false);
//        field_nama.setEnabled(false);
//        field_alamat.setEnabled(false);
//        field_link.setEnabled(false);
//        field_tlp.setEnabled(false);
//        return true;
//    }
     

    private void resetForm() {
        txtIdKategori.setText("");
        txtNama.setText("");
        txtDeskripsi.setText("");
    }

    private void dataTabel() {
        
        int row = tabelKategori.getSelectedRow();
        
        txtIdKategori.setText        (tabelKategori.getModel().getValueAt(row,1).toString());
        txtNama.setText              (tabelKategori.getModel().getValueAt(row,2).toString());
        txtDeskripsi.setText         (tabelKategori.getModel().getValueAt(row,3).toString());


//        aktif();
        btnSimpan4.setText("Perbarui");
    }

//    private void aktif() {
//        field_nama.setEnabled(true);
//        field_alamat.setEnabled(true);
//        field_link.setEnabled(true);
//        field_tlp.setEnabled(true);
//    }

    private void perbaruiData() {
        int index = tabelKategori.getSelectedRow();
        if (index!=-1){
//            Model_Supplier mod_supplier = tblModel.getData(tabel_supplier.convertRowIndexToModel(index));
            
            if(validasiInput()==true){
            String id_kategori          = txtIdKategori.getText();
            String nama_kategori        = txtNama.getText();
            String deskripsi            = txtDeskripsi.getText();
                
//                Model_Data_Produk dp = new Model_Data_Produk();
                ModelKategori ktg = new ModelKategori();
        
                ktg.setIdkategori(id_kategori);
                ktg.setNama_kategori(nama_kategori);
                ktg.setDeskripsi(deskripsi);
        
//                dp.setMod_idsupplier(ms);
                
                service.perbaruiData(ktg);
                tabel.perbaruiData(index,ktg);
                loadData();
                resetForm();
                btnSimpan4.setText("Simpan");
            }
        }
    }
}
