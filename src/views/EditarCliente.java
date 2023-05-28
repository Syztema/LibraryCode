/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.formdev.flatlaf.FlatLightLaf;
<<<<<<< HEAD
import controllers.ClienteController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ClienteModel;
=======
import java.awt.Color;
>>>>>>> master

/**
 *
 * @author crist
 */
public class EditarCliente extends javax.swing.JFrame {

<<<<<<< HEAD
    ClienteController clienteController;
    ClienteModel cliente;
    JTable clientesTabla;
    
    /**
     * Creates new form AgregarCliente
     */
    public EditarCliente(ClienteModel c, JTable clientesTbl) {
        initComponents();
        FlatLightLaf.install();
        InitStyles();
        LoadCliente(c);
        this.clientesTabla = clientesTbl;
        this.clienteController = new ClienteController();
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
=======
    /**
     * Creates new form AgregarCliente
     */
    public EditarCliente() {
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
>>>>>>> master
        lbl5.setForeground(Color.black);
        titleLbl.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        titleLbl.setForeground(Color.black);
    }
    
<<<<<<< HEAD
    private void LoadCliente(ClienteModel c){
        cedulaClienteLbl.setText(c.getCedula());
        nombreClienteTxt.setText(c.getNombre());
        int selectedIndex = membresiaClienteCbx.getItemCount() - 1;
        for(int i=0; i < membresiaClienteCbx.getItemCount(); i++){
            String item = membresiaClienteCbx.getItemAt(i);
            if(item.equals(c.getMembresia())){
                selectedIndex = i;
                break;
            }
        }
        membresiaClienteCbx.setSelectedIndex(selectedIndex);
        correoClienteTxt.setText(c.getCorreo());
        celularClienteTxt.setText(c.getCelular());
    }
    
    private void LoadClientes(JTable clientesTbl){                       
        DefaultTableModel tabla =  (DefaultTableModel) clientesTbl.getModel();       
        tabla.setRowCount(0);
        clienteController.findAll().forEach((u) -> tabla.addRow(new Object[] {u.getId(), u.getCedula(), u.getNombre(), u.getMembresia(), u.getCorreo(), u.getCelular()}));        
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
        cedulaClienteLbl = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        nombreClienteTxt = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        membresiaClienteCbx = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        correoClienteTxt = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        celularClienteTxt = new javax.swing.JTextField();
        editarEmpleadoBtn = new javax.swing.JButton();
=======
        jLabel3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
>>>>>>> master

        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl.setForeground(new java.awt.Color(0, 0, 0));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Edición de Clientes");

        lbl1.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
        lbl1.setText("Cedula Cliente:");

        cedulaClienteLbl.setForeground(new java.awt.Color(0, 0, 0));
=======
        lbl1.setText("Identificación Cliente:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("jLabel3");
>>>>>>> master

        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Nombre Cliente:");

<<<<<<< HEAD
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("Membresía:");

        membresiaClienteCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Frecuente", "General" }));
=======
        jTextField1.setText("jTextField1");

        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("Membresía:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
>>>>>>> master

        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setText("Correo Cliente:");

<<<<<<< HEAD
        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("Celular Cliente:");

        editarEmpleadoBtn.setBackground(new java.awt.Color(18, 90, 163));
        editarEmpleadoBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarEmpleadoBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarEmpleadoBtn.setText("Editar");
        editarEmpleadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmpleadoBtnActionPerformed(evt);
=======
        jTextField2.setText("jTextField1");

        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("Celular Cliente:");

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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addComponent(cedulaClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                        .addGroup(bgLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addComponent(nombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                        .addGroup(bgLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addComponent(membresiaClienteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                        .addGroup(bgLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addComponent(correoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> master
                        .addGroup(bgLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                            .addComponent(celularClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(editarEmpleadoBtn))))
                .addContainerGap(134, Short.MAX_VALUE))
=======
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jButton1))))
                .addContainerGap(115, Short.MAX_VALUE))
>>>>>>> master
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
                    .addComponent(cedulaClienteLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(nombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(membresiaClienteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(correoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(celularClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editarEmpleadoBtn)
=======
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
>>>>>>> master
                .addContainerGap(44, Short.MAX_VALUE))
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
    private void editarEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmpleadoBtnActionPerformed
        if(nombreClienteTxt.getText().equals("") || membresiaClienteCbx.getSelectedItem().toString().equals("") || correoClienteTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete Los Campos Necesarios");
        }else{
            cliente = new ClienteModel(cedulaClienteLbl.getText(), nombreClienteTxt.getText(), membresiaClienteCbx.getSelectedItem().toString(), correoClienteTxt.getText(), celularClienteTxt.getText());
            if(clienteController.update(cliente)){
                JOptionPane.showMessageDialog(null, "Cliente Editado Correctamente:\n" + this.cliente.getNombre());
                LoadClientes(this.clientesTabla);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El Cliente No Pudo Ser Editado");
                this.dispose();
            }
        }        
    }//GEN-LAST:event_editarEmpleadoBtnActionPerformed
=======
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
>>>>>>> master

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
<<<<<<< HEAD
    private javax.swing.JLabel cedulaClienteLbl;
    private javax.swing.JTextField celularClienteTxt;
    private javax.swing.JTextField correoClienteTxt;
    private javax.swing.JButton editarEmpleadoBtn;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
>>>>>>> master
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> membresiaClienteCbx;
    private javax.swing.JTextField nombreClienteTxt;
=======
>>>>>>> master
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
