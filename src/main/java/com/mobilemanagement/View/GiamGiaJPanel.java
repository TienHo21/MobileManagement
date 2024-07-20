
package com.mobilemanagement.View;

import com.mobilemanagement.Dao.GiamGiaDAO;
import com.mobilemanagement.Model.GiamGia;
import com.mobilemanagement.Utility.Auth;
import com.mobilemanagement.Utility.MsgBox;
import com.mobilemanagement.Utility.XDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THƯƠNG TÍN
 */
public class GiamGiaJPanel extends javax.swing.JPanel {
     GiamGiaDAO ggDao = new GiamGiaDAO();
    int row = 0;

    /**
     * Creates new form GiamGiaJPanel
     */
    public GiamGiaJPanel() {
        initComponents();
         init();
          // Set giá trị mặc định cho ngày bắt đầu là ngày hiện tại
    txtNgayBatDau.setDate(new java.util.Date());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaGiamGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachGiamGia = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã Giảm Giá :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Giá Trị :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ngày Bắt Đầu :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày Kết Thúc :");

        btnThem.setBackground(new java.awt.Color(28, 35, 65));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(28, 35, 65));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(28, 35, 65));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiMoiActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(28, 35, 65));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ghi Chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnNext.setBackground(new java.awt.Color(28, 35, 65));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(28, 35, 65));
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(28, 35, 65));
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(28, 35, 65));
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        tblDanhSachGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Giảm Giá", "Giá Trị", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Ghi Chú"
            }
        ));
        tblDanhSachGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhSachGiamGiaMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblDanhSachGiamGia);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 381, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        if (!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền sử dụng chức năng này ");
        }else{
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
      if (!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền sử dụng chức năng này ");
        }else{
           update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiMoiActionPerformed
        if (!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền sử dụng chức năng này ");
        }else{
           clearForm();
        }
    }//GEN-LAST:event_btnMoiMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if (!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền sử dụng chức năng này ");
        }else{
            delete();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void tblDanhSachGiamGiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachGiamGiaMousePressed
       if (evt.getClickCount() == 1) {
            this.row = tblDanhSachGiamGia.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachGiamGiaMousePressed

      private void init() {
        this.fillTable();
        updateStatus();

    }

    void fillTable() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDanhSachGiamGia.getModel();
        tblModel.getDataVector().removeAllElements(); // Xóa tất cả các dòng trong bảng
        try {
            List<GiamGia> listGG = ggDao.selectAll();
            for (GiamGia gg : listGG) {
                
            Object[] row = {gg.getMaGG(), gg.getGiatri(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getGhiChu()};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

   void setForm(GiamGia gg) {
    txtMaGiamGia.setText(gg.getMaGG());
    txtGiaTri.setText(String.valueOf(gg.getGiatri()));
    // Thay đổi ở đây để hiển thị giá trị trên JDateChooser
    txtNgayBatDau.setDate(gg.getNgayBatDau());
    txtNgayKetThuc.setDate(gg.getNgayKetThuc());
    txtGhiChu.setText(gg.getGhiChu());
}

    void edit() {
        try {
            String maGG = String.valueOf(tblDanhSachGiamGia.getValueAt(row, 0));
            GiamGia gg = ggDao.selectById(maGG);
            if (gg != null) {
                setForm(gg);
                updateStatus();
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu edit");
        }
    }

 GiamGia getForm() {
    GiamGia gg = new GiamGia();
    gg.setMaGG(txtMaGiamGia.getText());
    gg.setGiatri(Double.valueOf(txtGiaTri.getText()));
    
    // Thay đổi ở đây để lấy giá trị từ JDateChooser
    gg.setNgayBatDau(txtNgayBatDau.getDate());
    gg.setNgayKetThuc(txtNgayKetThuc.getDate());
    gg.setGhiChu(txtGhiChu.getText());
    return gg;
}

    void updateStatus() {
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblDanhSachGiamGia.getRowCount() - 1;
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnMoi.setEnabled(edit);
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

   void clearForm() {
    txtMaGiamGia.setText("");
    txtGiaTri.setText("");
   
    txtNgayKetThuc.setDate(null);  // Xóa ngày
    txtGhiChu.setText("");
    updateStatus();
    row = -1;
}


//    void insert() {
//        GiamGia ggModel = getForm();
//        // Kiểm tra xem đã nhập mã giảm giá chưa không được để trống
//        if (ggModel.getMaGG().isEmpty()) {
//            MsgBox.alert(this, "Vui lòng nhập mã Giảm Giá");
//            return;
//        }
//        
//
//        // Kiểm tra xem mã giảm giá đã tồn tại chưa
//        if (ggDao.isDuplicateMaGG(ggModel.getMaGG())) {
//            MsgBox.alert(this, "Mã Giảm Giá đã tồn tại. Vui lòng chọn mã khác.");
//            return;
//        }
//
//        try {
//            ggDao.insert(ggModel);
//            this.fillTable();
//            this.clearForm();
//            updateStatus();
//            MsgBox.alert(this, "Thêm mới thành công");
//        } catch (Exception e) {
//            e.printStackTrace();
//            MsgBox.alert(this, "Thêm mới thất bại");
//        }
//    }
    void insert() {
    GiamGia ggModel = getForm();

    // Check for empty values for required fields
    if (ggModel.getMaGG().isEmpty()|| ggModel.getNgayBatDau() == null || ggModel.getNgayKetThuc() == null) {
        MsgBox.alert(this, "Vui lòng nhập đầy đủ thông tin.");
        return;
    }

    // Validate start and end dates
    if (ggModel.getNgayKetThuc().before(ggModel.getNgayBatDau())) {
        MsgBox.alert(this, "Ngày kết thúc phải sau ngày bắt đầu.");
        return;
    }

    // Kiểm tra xem ngày bắt đầu có rỗng không
    if (ggModel.getNgayBatDau().toString().isEmpty()) {
        MsgBox.alert(this, "Ngày bắt đầu không được để trống.");
        return;
    }

    // Kiểm tra xem ngày kết thúc có rỗng không
    if (ggModel.getNgayKetThuc().toString().isEmpty()) {
        MsgBox.alert(this, "Ngày kết thúc không được để trống.");
        return;
    }

    // Kiểm tra xem đã nhập mã giảm giá chưa không được để trống
    if (ggModel.getMaGG().isEmpty()) {
        MsgBox.alert(this, "Vui lòng nhập mã Giảm Giá");
        return;
    }

    // Kiểm tra xem mã giảm giá đã tồn tại chưa
    if (ggDao.isDuplicateMaGG(ggModel.getMaGG())) {
        MsgBox.alert(this, "Mã Giảm Giá đã tồn tại. Vui lòng chọn mã khác.");
        return;
    }
  

    try {
        ggDao.insert(ggModel);
        this.fillTable();
        this.clearForm();
        updateStatus();
        MsgBox.alert(this, "Thêm mới thành công");
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Thêm mới thất bại: " + e.getMessage());
    }
}

    void update() {
        GiamGia ggModel = getForm();

        // Kiểm tra xem đã nhập mã giảm giá chưa không được để trống
        if (ggModel.getMaGG().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập mã Giảm Giá");
            return;
        }

        try {
            ggDao.update(ggModel);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhật thất bại");
        }
    }

    void delete() {
        if (Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này")) {
                String maGG = txtMaGiamGia.getText();
                try {
                    ggDao.delete(maGG);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }

    void first() {
        row = 0;
        edit();
    }

    void prev() {
        if (row > 0) {
            row--;
            edit();
        }
    }

    void next() {
        if (row < tblDanhSachGiamGia.getRowCount() - 1) {
            row++;
            edit();
        }
    }

    void last() {
        row = tblDanhSachGiamGia.getRowCount() - 1;
        edit();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDanhSachGiamGia;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaGiamGia;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    // End of variables declaration//GEN-END:variables
}
