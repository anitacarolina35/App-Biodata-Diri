import java.sql.*;
/*
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
*/
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_entry_mahasiswa extends javax.swing.JDialog {

    public form_entry_mahasiswa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_tb_mahasiswa();
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_mahasiswa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tempat_lahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_no_bp = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_jurusan = new javax.swing.JTextField();
        bnt_update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        t_tgl_lahir = new javax.swing.JTextField();
        t_tgl_masuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_jenis = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmb_golongan = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmb_agama = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM ENTRY BIODATA");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        tb_mahasiswa.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        tb_mahasiswa.setForeground(new java.awt.Color(204, 0, 51));
        tb_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_mahasiswa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setBackground(new java.awt.Color(204, 0, 102));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("NIM:");

        txt_tempat_lahir.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        txt_tempat_lahir.setForeground(new java.awt.Color(204, 0, 51));

        jLabel3.setBackground(new java.awt.Color(204, 0, 102));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Nama:");

        simpan.setBackground(new java.awt.Color(204, 204, 204));
        simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        simpan.setForeground(new java.awt.Color(204, 0, 51));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 0, 102));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Tempat Lahir:");

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 0, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 0, 102));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Tanggal Lahir:");

        jLabel6.setBackground(new java.awt.Color(204, 0, 102));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Jurusan:");

        jLabel7.setBackground(new java.awt.Color(204, 0, 102));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Tanggal Masuk:");

        txt_no_bp.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        txt_no_bp.setForeground(new java.awt.Color(204, 0, 51));

        txt_nama.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(204, 0, 51));

        txt_jurusan.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        txt_jurusan.setForeground(new java.awt.Color(204, 0, 51));

        bnt_update.setBackground(new java.awt.Color(204, 204, 204));
        bnt_update.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        bnt_update.setForeground(new java.awt.Color(204, 0, 51));
        bnt_update.setText("Update");
        bnt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        delete.setForeground(new java.awt.Color(204, 0, 51));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        t_tgl_lahir.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        t_tgl_lahir.setForeground(new java.awt.Color(204, 0, 51));
        t_tgl_lahir.setToolTipText("");

        t_tgl_masuk.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        t_tgl_masuk.setForeground(new java.awt.Color(204, 0, 51));
        t_tgl_masuk.setToolTipText("YYYY-MM-DD");

        jLabel8.setBackground(new java.awt.Color(204, 0, 102));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 102));
        jLabel8.setText("YYYY-MM-DD");

        jLabel9.setBackground(new java.awt.Color(204, 0, 102));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 102));
        jLabel9.setText("YYYY-MM-DD");

        cmb_jenis.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        cmb_jenis.setForeground(new java.awt.Color(204, 0, 51));
        cmb_jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-laki", "Perempuan" }));

        jLabel10.setBackground(new java.awt.Color(204, 0, 102));
        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Jenis Kelamin:");

        cmb_golongan.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        cmb_golongan.setForeground(new java.awt.Color(204, 0, 51));
        cmb_golongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));

        jLabel11.setBackground(new java.awt.Color(204, 0, 102));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Golongan Darah: ");

        txt_alamat.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(204, 0, 51));

        jLabel12.setBackground(new java.awt.Color(204, 0, 102));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Alamat:");

        jLabel13.setBackground(new java.awt.Color(204, 0, 102));
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Agama:");

        cmb_agama.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        cmb_agama.setForeground(new java.awt.Color(204, 0, 51));
        cmb_agama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buddha", "Kristen", "Hindu", "Islam" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_golongan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_no_bp)
                                    .addComponent(txt_nama)
                                    .addComponent(txt_tempat_lahir)
                                    .addComponent(txt_jurusan)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(t_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(t_tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)))
                                        .addGap(60, 60, 60)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_alamat)
                            .addComponent(cmb_agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(bnt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_no_bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tempat_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_golongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_update)
                    .addComponent(delete)
                    .addComponent(simpan)
                    .addComponent(reset))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String nim="", nama="", tempat_lahir="", tanggal_lahir, jurusan="", tanggal_masuk, jenkel="", golongan="", alamat="", agama="";
        //java.util.Date tanggal_lahir;
        //java.util.Date tanggal_masuk;
        
        nim = txt_no_bp.getText();
        nama = txt_nama.getText();
        tempat_lahir = txt_tempat_lahir.getText();
        jurusan = txt_jurusan.getText();
        //tanggal_masuk = (java.util.Date) this.txt_tanggal_masuk.getDate();
        //tanggal_lahir = (java.util.Date) this.txt_tanggal_lahir.getDate();
        tanggal_masuk = t_tgl_masuk.getText();
        tanggal_lahir = t_tgl_lahir.getText();
        jenkel = cmb_jenis.getSelectedItem().toString();
        golongan = cmb_golongan.getSelectedItem().toString();
        alamat = txt_alamat.getText();
        agama = cmb_agama.getSelectedItem().toString();
        try {
            Connection con = new koneksi_2().getConnection();
            String sql = "insert into tb_mahasiswa values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
            stat.setString(1, nim);
            stat.setString(2, nama);
            stat.setString(3, tempat_lahir);
            //stat.setDate(4, new java.sql.Date(tanggal_lahir.getTime()));
            stat.setString(4, tanggal_lahir);
            stat.setString(5, jurusan);
            //stat.setDate(6, new java.sql.Date(tanggal_masuk.getTime()));
            stat.setString(6, tanggal_masuk);
            stat.setString(7, jenkel);
            stat.setString(8, golongan);
            stat.setString(9, alamat);
            stat.setString(10, agama);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();
            tampil_tb_mahasiswa();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tb_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_mahasiswaMouseClicked
        // TODO add your handling code here:
        kliktable();
    }//GEN-LAST:event_tb_mahasiswaMouseClicked

    //reset 
    public void reset(){
        txt_jurusan.setText("");
        txt_nama.setText("");
        txt_no_bp.setText("");
        //txt_tanggal_lahir.setDate(null);
        //txt_tanggal_masuk.setDate(null);
        t_tgl_lahir.setText(null);
        t_tgl_masuk.setText(null);
        txt_tempat_lahir.setText("");
        cmb_jenis.setSelectedIndex(0);
        cmb_golongan.setSelectedIndex(0);
        txt_alamat.setText("");
        cmb_agama.setSelectedIndex(0);
    }
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void bnt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_updateActionPerformed
        Connection con = new koneksi_2().getConnection();
        String nim="", nama="", tempat_lahir="", jurusan="", tanggal_lahir, tanggal_masuk, jenkel="", golongan="", alamat="", agama="";
        //java.util.Date tanggal_lahir=null;
        //java.util.Date tanggal_masuk=null;
        nim = txt_no_bp.getText();
        nama = txt_nama.getText();
        tempat_lahir = txt_tempat_lahir.getText();
        jurusan = txt_jurusan.getText();
        //tanggal_masuk = (java.util.Date) this.txt_tanggal_masuk.getDate();
        //tanggal_lahir = (java.util.Date) this.txt_tanggal_lahir.getDate();
        tanggal_masuk = t_tgl_masuk.getText();
        tanggal_lahir = t_tgl_lahir.getText();
        jenkel = cmb_jenis.getSelectedItem().toString();
        golongan = cmb_golongan.getSelectedItem().toString();
        alamat = txt_alamat.getText();
        agama = cmb_agama.getSelectedItem().toString();
        if (tanggal_lahir==null){
            JOptionPane.showMessageDialog(null, "Silahkan isi TANGGAL LAHIR","Informasi", JOptionPane.INFORMATION_MESSAGE);
            //txt_tanggal_lahir.requestFocus();
        }
        else if (tanggal_masuk==null){
            JOptionPane.showMessageDialog(null, "Silahkan isi TANGGAL MASUK","Informasi", JOptionPane.INFORMATION_MESSAGE);
            //txt_tanggal_masuk.requestFocus();
        }
        else {
            String sql="update tb_mahasiswa set nama=?, tempat_lahir=?, tanggal_lahir=?, jurusan=?, tanggal_masuk=?, jenkel=?, golongan=?, alamat=?, agama=? where nim='"+nim+"'";
            java.sql.PreparedStatement stat = null;
            try {
                stat = con.prepareStatement(sql);
                stat.setString(1, nama);
                stat.setString(2, tempat_lahir);
                //stat.setDate(3, new java.sql.Date(tanggal_lahir.getTime()));
                stat.setString(3, tanggal_lahir);
                stat.setString(4, jurusan);
                //stat.setDate(5, new java.sql.Date(tanggal_masuk.getTime()));
                stat.setString(5, tanggal_masuk);
                stat.setString(6, jenkel);
                stat.setString(7, golongan);
                stat.setString(8, alamat);
                stat.setString(9, agama);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data BERHASIL di Ubah");
                tampil_tb_mahasiswa();
                reset();
            }catch(SQLException se){
                JOptionPane.showMessageDialog(null,"Data GAGAL di Ubah");
            }
        }
    }//GEN-LAST:event_bnt_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int baris = tb_mahasiswa.getSelectedRow();
        String nim = tabmode.getValueAt(baris, 0).toString();        
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda yakin ingin menghapus data Mahasiswa NIM: "+nim+"?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
            try{
                //panggil method koneksi
                Connection con = new koneksi_2().getConnection();
                String sql="delete from tb_mahasiswa where nim='"+nim+"'";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
                tampil_tb_mahasiswa();
                reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal di hapus");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void kliktable(){
        int baris = tb_mahasiswa.getSelectedRow();
        txt_no_bp.setText((String)tb_mahasiswa.getValueAt(baris, 0));
        txt_nama.setText((String)tb_mahasiswa.getValueAt(baris, 1));
        txt_tempat_lahir.setText((String)tb_mahasiswa.getValueAt(baris, 2));
        //txt_tanggal_lahir.setDate((Date)tb_mahasiswa.getValueAt(baris, 3));
        t_tgl_lahir.setText((String)tb_mahasiswa.getValueAt(baris, 3));
        txt_jurusan.setText((String)tb_mahasiswa.getValueAt(baris, 4));
        //txt_tanggal_masuk.setDate((Date)tb_mahasiswa.getValueAt(baris, 5));
        t_tgl_masuk.setText((String)tb_mahasiswa.getValueAt(baris, 5));
        cmb_jenis.setSelectedItem((String)tb_mahasiswa.getValueAt(baris, 6));
        cmb_golongan.setSelectedItem((String)tb_mahasiswa.getValueAt(baris, 7));
        txt_alamat.setText((String)tb_mahasiswa.getValueAt(baris, 8));
        cmb_agama.setSelectedItem((String)tb_mahasiswa.getValueAt(baris, 9));
    }
    private DefaultTableModel tabmode;
    
    //menampilkan data dari datatabe ke tabel
    public void tampil_tb_mahasiswa(){
        Object []baris = {"NIM","Nama","Tempat Lahir","Tanggal Lahir","Jurusan","Tanggal Masuk","Jenis Kelamin","Golongan Darah","Alamat","Agama"};
        tabmode = new DefaultTableModel(null, baris);
        tb_mahasiswa.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_mahasiswa order by nim asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String jurusan = hasil.getString("jurusan"); 
                String tanggal_masuk = hasil.getString("tanggal_masuk");
                String jenkel = hasil.getString("jenkel");
                String golongan = hasil.getString("golongan");
                String alamat = hasil.getString("alamat");
                String agama = hasil.getString("agama");
                String[] data = {nim, nama, tempat_lahir, tanggal_lahir, jurusan, tanggal_masuk, jenkel, golongan, alamat, agama};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    } 
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
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_entry_mahasiswa dialog = new form_entry_mahasiswa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_update;
    private javax.swing.JComboBox cmb_agama;
    private javax.swing.JComboBox cmb_golongan;
    private javax.swing.JComboBox cmb_jenis;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField t_tgl_lahir;
    private javax.swing.JTextField t_tgl_masuk;
    private javax.swing.JTable tb_mahasiswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_jurusan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no_bp;
    private javax.swing.JTextField txt_tempat_lahir;
    // End of variables declaration//GEN-END:variables
}