/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.formdev.flatlaf.FlatLightLaf;
<<<<<<< HEAD
import controllers.LibroController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.LibroModel;
=======
import java.awt.Color;
>>>>>>> master

/**
 *
 * @author crist
 */
public class EditarInventario extends javax.swing.JFrame {

<<<<<<< HEAD
    LibroController libroController;
    LibroModel libro;
    JTable librosTabla;
    
    /**
     * Creates new form AgregarCliente
     */
    public EditarInventario(LibroModel l, JTable librosTbl) {
        initComponents();
        FlatLightLaf.install();
        InitStyles();
        LoadLibro(l);
        this.librosTabla = librosTbl;
        this.libroController = new LibroController();
    }
    
    private void InitStyles(){
        lbl1.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
        lbl1.setForeground(Color.black);
        lbl2.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
        lbl2.setForeground(Color.black);
        lbl3.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
        lbl3.setForeground(Color.black);
        lbl4.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
        lbl4.setForeground(Color.black);
        lbl5.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
        lbl5.setForeground(Color.black);
        lbl6.putClientProperty("FlatLaf.style", "font: bold $h4.regular.font");
=======
    /**
     * Creates new form AgregarCliente
     */
    public EditarInventario() {
        initComponents();
        FlatLightLaf.install();
        InitStyles();
    }
    
    private void InitStyles(){
        lbl1.putClientProperty("FlatLaf.styleClass", "large");
        lbl1.setForeground(Color.black);
        lbl2.putClientProperty("FlatLaf.styleClass", "large");
        lbl2.setForeground(Color.black);
        lbl3.putClientProperty("FlatLaf.styleClass", "large");
        lbl3.setForeground(Color.black);
        lbl4.putClientProperty("FlatLaf.styleClass", "large");
        lbl4.setForeground(Color.black);
        lbl5.putClientProperty("FlatLaf.styleClass", "large");
        lbl5.setForeground(Color.black);
        lbl6.putClientProperty("FlatLaf.styleClass", "large");
>>>>>>> master
        lbl6.setForeground(Color.black);
        titleLbl.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        titleLbl.setForeground(Color.black);
    }

<<<<<<< HEAD
    private void LoadLibro(LibroModel l){
        codigoLbl.setText(l.getCodigo());
        nombreLibroTxt.setText(l.getNombre());
        cantidadLibroSpn.setValue(l.getCantidad());
        autorLibroTxt.setText(l.getAutor());
        editorialLibroTxt.setText(l.getEditorial());
        precioLibroTxt.setText(String.valueOf(l.getPrecio()));
    }
    
    private void LoadLibros(JTable librosTbl){
        DefaultTableModel tabla = (DefaultTableModel) librosTbl.getModel();
        tabla.setRowCount(0);
        libroController.findAll().forEach((u) -> tabla.addRow(new Object[] {u.getId(), u.getCodigo(), u.getNombre(), u.getCantidad(), u.getAutor(), u.getEditorial(), u.getPrecio()}));
    }
    
=======
>>>>>>> master
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
<<<<<<< HEAD
        codigoLbl = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        nombreLibroTxt = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        autorLibroTxt = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        editorialLibroTxt = new javax.swing.JTextField();
        editarLibroBtn = new javax.swing.JButton();
        cantidadLibroSpn = new javax.swing.JSpinner();
        lbl6 = new javax.swing.JLabel();
        precioLibroTxt = new javax.swing.JTextField();
=======
        jLabel3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        lbl6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
>>>>>>> master

        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl.setForeground(new java.awt.Color(0, 0, 0));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Edición de Libros");

        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("Código Libro:");

<<<<<<< HEAD
        codigoLbl.setForeground(new java.awt.Color(0, 0, 0));
=======
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("jLabel3");
>>>>>>> master

        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Nombre Libro:");

<<<<<<< HEAD
=======
        jTextField1.setText("jTextField1");

>>>>>>> master
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("Cantidad:");

        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setText("Autor:");

<<<<<<< HEAD
        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("Editorial:");

        editarLibroBtn.setBackground(new java.awt.Color(18, 90, 163));
        editarLibroBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarLibroBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarLibroBtn.setText("Editar");
        editarLibroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLibroBtnActionPerformed(evt);
=======
        jTextField2.setText("jTextField1");

        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("Editorial:");

        jTextField3.setText("jTextField1");

        jButton1.setBackground(new java.awt.Color(18, 90, 163));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
>>>>>>> master
            }
        });

        lbl6.setForeground(new java.awt.Color(0, 0, 0));
        lbl6.setText("Precio:");

<<<<<<< HEAD
=======
        jTextField4.setText("jTextField1");

>>>>>>> master
        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(codigoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(nombreLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(cantidadLibroSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(autorLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(editorialLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(precioLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
<<<<<<< HEAD
                        .addComponent(editarLibroBtn)))
=======
                        .addComponent(jButton1)))
>>>>>>> master
                .addContainerGap(99, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
<<<<<<< HEAD
                    .addComponent(codigoLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(nombreLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(cantidadLibroSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(autorLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(editorialLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(precioLibroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarLibroBtn)
=======
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
>>>>>>> master
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void editarLibroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLibroBtnActionPerformed
        if(nombreLibroTxt.getText().equals("") || cantidadLibroSpn.getValue().equals(0) || autorLibroTxt.getText().equals("") || editorialLibroTxt.getText().equals("") || precioLibroTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete Los Campos Necesarios");
        }else{
            libro = new LibroModel(codigoLbl.getText(), nombreLibroTxt.getText(), (Integer) cantidadLibroSpn.getValue(), autorLibroTxt.getText(), editorialLibroTxt.getText(), Integer.parseInt(precioLibroTxt.getText()));
            if(libroController.update(libro)){
                JOptionPane.showMessageDialog(null, "Libro Editado Correctamente:\n" + this.libro.getNombre());
                LoadLibros(this.librosTabla);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El Libro No Pudo Ser Editado");
                this.dispose();
            }
        }
    }//GEN-LAST:event_editarLibroBtnActionPerformed
=======
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
>>>>>>> master

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JTextField autorLibroTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JSpinner cantidadLibroSpn;
    private javax.swing.JLabel codigoLbl;
    private javax.swing.JButton editarLibroBtn;
    private javax.swing.JTextField editorialLibroTxt;
=======
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
>>>>>>> master
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
<<<<<<< HEAD
    private javax.swing.JTextField nombreLibroTxt;
    private javax.swing.JTextField precioLibroTxt;
=======
>>>>>>> master
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
