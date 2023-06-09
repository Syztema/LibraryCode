<<<<<<< HEAD
package views;

import com.formdev.flatlaf.FlatLightLaf;
import controllers.CSVWriterThread;
import controllers.ClienteController;
import controllers.LibroController;
import controllers.VentaController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import models.ClienteModel;
import models.LibroModel;
import models.VentaModel;

public class Ventas extends javax.swing.JPanel {
    
    //CREACION DE VARIABLES
    VentaController ventaController;
    ClienteModel cliente;
    ClienteController clienteController;
    LibroModel libro;
    LibroController libroController;
    ArrayList<VentaModel> listaVentas;
    VentaModel venta;
    CSVWriterThread csvWriterThread;
    
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;

/**
 *
 * @author crist
 */
public class Ventas extends javax.swing.JPanel {

>>>>>>> master
    /**
     * Creates new form Principal
     */
    public Ventas() {
<<<<<<< HEAD
        ventaController = new VentaController();
        clienteController = new ClienteController();  
        libroController = new LibroController();
        listaVentas = new ArrayList<>();        
        libro = new LibroModel();    
        csvWriterThread = new CSVWriterThread();
        FlatLightLaf.install();
        initComponents();
        InitStyles();  
        
        //FUNCIONES DE INICIACION
        ventaController.rellenar(this.librosVentasCbx);
        setJTexFieldChanged(this.cedulaClienteTxt);             
=======
        FlatLightLaf.install();
        initComponents();
        InitStyles();  
>>>>>>> master
    }
    
    private void InitStyles(){
        label4.putClientProperty("FlatLaf.styleClass", "large");
        label4.setForeground(Color.black);
        label1.putClientProperty("FlatLaf.styleClass", "large");
        label1.setForeground(Color.black);
        label2.putClientProperty("FlatLaf.styleClass", "large");
        label2.setForeground(Color.black);
        label3.putClientProperty("FlatLaf.styleClass", "large");
        label3.setForeground(Color.black);
        label5.putClientProperty("FlatLaf.styleClass", "large");
        label5.setForeground(Color.black);
        label6.putClientProperty("FlatLaf.styleClass", "large");
        label6.setForeground(Color.black);
        label7.putClientProperty("FlatLaf.styleClass", "large");
        label7.setForeground(Color.black);
        label8.putClientProperty("FlatLaf.styleClass", "large");
        label8.setForeground(Color.black);
        label9.putClientProperty("FlatLaf.styleClass", "large");
        label9.setForeground(Color.black);
<<<<<<< HEAD
    }        
    
=======
    }

>>>>>>> master
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        bg = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        librosVentasCbx = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
<<<<<<< HEAD
        cedulaClienteTxt = new javax.swing.JTextField();
=======
        idClienteVentasTxt = new javax.swing.JTextField();
>>>>>>> master
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        cantidadVentasSpn = new javax.swing.JSpinner();
        label6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        librosVentasTbl = new javax.swing.JTable();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
<<<<<<< HEAD
        nombreClienteLbl = new javax.swing.JLabel();
        ivaVentasLbl = new javax.swing.JLabel();
        totalVentasLbl = new javax.swing.JLabel();
        subtotalVentasLbl = new javax.swing.JLabel();
        membresiaClienteLbl = new javax.swing.JLabel();
=======
        nombreClienteVentasLbl = new javax.swing.JLabel();
        ivaVentasLbl = new javax.swing.JLabel();
        totalVentasLbl = new javax.swing.JLabel();
        subtotalVentasLbl = new javax.swing.JLabel();
        membresiaVentasLbl = new javax.swing.JLabel();
>>>>>>> master
        precioVentasLbl = new javax.swing.JLabel();
        agregarVentasBtn = new javax.swing.JButton();
        facturarVentasBtn = new javax.swing.JButton();
        facturarVentasBtn1 = new javax.swing.JButton();
<<<<<<< HEAD
        consultarClienteBtn = new javax.swing.JButton();
=======
>>>>>>> master

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setPreferredSize(new java.awt.Dimension(715, 482));
<<<<<<< HEAD
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
=======
>>>>>>> master

        bg.setBackground(new java.awt.Color(255, 255, 255));

        label4.setBackground(new java.awt.Color(0, 0, 0));
        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Nombre Libro:");

        librosVentasCbx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        librosVentasCbx.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
        librosVentasCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
=======
        librosVentasCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz", "Papa", "Carne", "Platano", "Huevos" }));
>>>>>>> master
        librosVentasCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosVentasCbxActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
        label1.setText("Cedula Cliente:");

        cedulaClienteTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cedulaClienteTxt.setForeground(new java.awt.Color(0, 0, 0));
        cedulaClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteTxtActionPerformed(evt);
=======
        label1.setText("Identificación Cliente:");

        idClienteVentasTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idClienteVentasTxt.setForeground(new java.awt.Color(0, 0, 0));
        idClienteVentasTxt.setText("jTextField1");
        idClienteVentasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteVentasTxtActionPerformed(evt);
>>>>>>> master
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Nombre Cliente:");

        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Membresía:");

        label5.setBackground(new java.awt.Color(0, 0, 0));
        label5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Cantidad:");

        cantidadVentasSpn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
<<<<<<< HEAD
        cantidadVentasSpn.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        cantidadVentasSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadVentasSpnStateChanged(evt);
            }
        });
=======
>>>>>>> master

        label6.setBackground(new java.awt.Color(0, 0, 0));
        label6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Precio:");

        librosVentasTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
<<<<<<< HEAD

            },
            new String [] {
                "Nombre", "Cantidad", "Descuento Total", "Precio Total"
=======
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
>>>>>>> master
            }
        ));
        jScrollPane1.setViewportView(librosVentasTbl);

        label7.setBackground(new java.awt.Color(0, 0, 0));
        label7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText("Subtotal:");

        label8.setBackground(new java.awt.Color(0, 0, 0));
        label8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("IVA:");

        label9.setBackground(new java.awt.Color(0, 0, 0));
        label9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("Total:");

<<<<<<< HEAD
        nombreClienteLbl.setBackground(new java.awt.Color(0, 0, 0));
        nombreClienteLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreClienteLbl.setForeground(new java.awt.Color(0, 0, 0));
=======
        nombreClienteVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        nombreClienteVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreClienteVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
        nombreClienteVentasLbl.setText("{Name}");
>>>>>>> master

        ivaVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        ivaVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ivaVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
=======
        ivaVentasLbl.setText("$0.00");
>>>>>>> master

        totalVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        totalVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
=======
        totalVentasLbl.setText("$0.00");
>>>>>>> master

        subtotalVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        subtotalVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subtotalVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD

        membresiaClienteLbl.setBackground(new java.awt.Color(0, 0, 0));
        membresiaClienteLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        membresiaClienteLbl.setForeground(new java.awt.Color(0, 0, 0));
=======
        subtotalVentasLbl.setText("$0.00");

        membresiaVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        membresiaVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        membresiaVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
        membresiaVentasLbl.setText("{Membresia}");
>>>>>>> master

        precioVentasLbl.setBackground(new java.awt.Color(0, 0, 0));
        precioVentasLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        precioVentasLbl.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
=======
        precioVentasLbl.setText("$0.00");
>>>>>>> master

        agregarVentasBtn.setBackground(new java.awt.Color(18, 90, 173));
        agregarVentasBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        agregarVentasBtn.setForeground(new java.awt.Color(255, 255, 255));
        agregarVentasBtn.setText("Agregar");
        agregarVentasBtn.setBorderPainted(false);
        agregarVentasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarVentasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarVentasBtnActionPerformed(evt);
            }
        });

        facturarVentasBtn.setBackground(new java.awt.Color(18, 90, 173));
        facturarVentasBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        facturarVentasBtn.setForeground(new java.awt.Color(255, 255, 255));
        facturarVentasBtn.setText("Facturar");
        facturarVentasBtn.setBorderPainted(false);
        facturarVentasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturarVentasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarVentasBtnActionPerformed(evt);
            }
        });

        facturarVentasBtn1.setBackground(new java.awt.Color(18, 90, 173));
        facturarVentasBtn1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        facturarVentasBtn1.setForeground(new java.awt.Color(255, 255, 255));
        facturarVentasBtn1.setText("Generar Reporte");
        facturarVentasBtn1.setBorderPainted(false);
        facturarVentasBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturarVentasBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarVentasBtn1ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        consultarClienteBtn.setBackground(new java.awt.Color(18, 90, 173));
        consultarClienteBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        consultarClienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        consultarClienteBtn.setText("+");
        consultarClienteBtn.setBorderPainted(false);
        consultarClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteBtnActionPerformed(evt);
            }
        });

=======
>>>>>>> master
        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(librosVentasCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadVentasSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioVentasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarVentasBtn))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultarClienteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(membresiaClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idClienteVentasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(librosVentasCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadVentasSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label6)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(precioVentasLbl)
                                .addGap(47, 47, 47)
                                .addComponent(agregarVentasBtn))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(nombreClienteVentasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(membresiaVentasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
>>>>>>> master
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label7)
                                    .addComponent(label8)
                                    .addComponent(label9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalVentasLbl)
                                    .addComponent(ivaVentasLbl)
                                    .addComponent(subtotalVentasLbl)))
                            .addGroup(bgLayout.createSequentialGroup()
<<<<<<< HEAD
                                .addGap(31, 31, 31)
                                .addComponent(facturarVentasBtn1))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(facturarVentasBtn)))))
                .addContainerGap(79, Short.MAX_VALUE))
=======
                                .addGap(59, 59, 59)
                                .addComponent(facturarVentasBtn))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(facturarVentasBtn1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> master
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(17, 17, 17)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2)
                    .addComponent(nombreClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membresiaClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3)
                    .addComponent(label1)
                    .addComponent(consultarClienteBtn))
                .addGap(24, 24, 24)
=======
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClienteVentasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2)
                    .addComponent(nombreClienteVentasLbl)
                    .addComponent(membresiaVentasLbl)
                    .addComponent(label3)
                    .addComponent(label1))
                .addGap(26, 26, 26)
>>>>>>> master
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(librosVentasCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5)
                    .addComponent(cantidadVentasSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6)
<<<<<<< HEAD
                    .addComponent(precioVentasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                    .addComponent(precioVentasLbl)
>>>>>>> master
                    .addComponent(agregarVentasBtn))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(subtotalVentasLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(ivaVentasLbl))
                        .addGap(12, 12, 12)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(totalVentasLbl))
                        .addGap(37, 37, 37)
                        .addComponent(facturarVentasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(facturarVentasBtn1)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

<<<<<<< HEAD
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void librosVentasCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosVentasCbxActionPerformed
        // TODO add your handling code here:           
        this.venta = ventaController.calcularPrecio(precioVentasLbl, librosVentasCbx.getSelectedItem().toString(), this.libro, libroController, cantidadVentasSpn, this.cliente);        
        if(this.venta == null){
            librosVentasCbx.setSelectedIndex(0);
            cantidadVentasSpn.setValue(1);
            precioVentasLbl.setText("");
        }        
    }//GEN-LAST:event_librosVentasCbxActionPerformed

    private void agregarVentasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVentasBtnActionPerformed
        // TODO add your handling code here:        
        this.venta = ventaController.calcularPrecio(precioVentasLbl, librosVentasCbx.getSelectedItem().toString(), this.libro, libroController, cantidadVentasSpn, this.cliente);        
        if(!ventaController.buscarVenta(this.venta, this.listaVentas)){
            this.listaVentas.add(this.venta);
        }                        
        ventaController.updateCantidad(this.libro, this.librosVentasCbx, this.venta, this.libroController);                        
        ventaController.actualizarTabla(this.librosVentasTbl, this.listaVentas, this.subtotalVentasLbl, this.ivaVentasLbl, this.totalVentasLbl);        
        librosVentasCbx.setSelectedIndex(0);
        cantidadVentasSpn.setValue(1);
        precioVentasLbl.setText("");
    }//GEN-LAST:event_agregarVentasBtnActionPerformed

    private void facturarVentasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarVentasBtnActionPerformed
        // TODO add your handling code here:        
        ventaController.crearCSV(this.csvWriterThread, this.listaVentas);
        
        DefaultTableModel tabla = (DefaultTableModel) librosVentasTbl.getModel(); 
        tabla.setRowCount(0);
        subtotalVentasLbl.setText("");
        ivaVentasLbl.setText("");
        totalVentasLbl.setText("");                        
        this.listaVentas.clear();        
        JOptionPane.showMessageDialog(null, "Factura Realizada");               
    }//GEN-LAST:event_facturarVentasBtnActionPerformed

    private void cedulaClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteTxtActionPerformed
=======
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void librosVentasCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosVentasCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librosVentasCbxActionPerformed

    private void agregarVentasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVentasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarVentasBtnActionPerformed

    private void facturarVentasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarVentasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturarVentasBtnActionPerformed

    private void idClienteVentasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteVentasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteVentasTxtActionPerformed
>>>>>>> master

    private void facturarVentasBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarVentasBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturarVentasBtn1ActionPerformed

<<<<<<< HEAD
    private void consultarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteBtnActionPerformed
        // TODO add your handling code here:
        cliente = (ClienteModel) clienteController.findByCedula(cedulaClienteTxt.getText());
        if(cliente != null){
            nombreClienteLbl.setText(cliente.getNombre());
            membresiaClienteLbl.setText(cliente.getMembresia());
            if(this.libro != null){
                this.venta = ventaController.calcularPrecio(precioVentasLbl, librosVentasCbx.getSelectedItem().toString(), this.libro, libroController, cantidadVentasSpn, this.cliente);                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cliente No Existente");
            nombreClienteLbl.setText("");
            membresiaClienteLbl.setText("");
        }                
    }//GEN-LAST:event_consultarClienteBtnActionPerformed

    private void cantidadVentasSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadVentasSpnStateChanged
        // TODO add your handling code here:
        this.venta = ventaController.calcularPrecio(precioVentasLbl, librosVentasCbx.getSelectedItem().toString(), this.libro, libroController, cantidadVentasSpn, this.cliente);
    }//GEN-LAST:event_cantidadVentasSpnStateChanged
    
    //ACCIONES A REALIZAR CON LA CEDULA
    private void setJTexFieldChanged(JTextField txt){
        DocumentListener documentListener = new DocumentListener() {
 
        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            printIt(documentEvent);
        }
 
        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            printIt(documentEvent);
        }
 
        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            printIt(documentEvent);
        }
        };
        txt.getDocument().addDocumentListener(documentListener);
 
    } 
    private void printIt(DocumentEvent documentEvent) {
        DocumentEvent.EventType type = documentEvent.getType();
 
        if (type.equals(DocumentEvent.EventType.CHANGE))
        {
            
        }
        else if (type.equals(DocumentEvent.EventType.INSERT))
        {
           //Método a ejecutar                         
        }
        else if (type.equals(DocumentEvent.EventType.REMOVE))
        {
            //Método a ejecutar              
            nombreClienteLbl.setText("");
            membresiaClienteLbl.setText("");
            this.cliente = null;
            this.venta = ventaController.calcularPrecio(precioVentasLbl, librosVentasCbx.getSelectedItem().toString(), this.libro, libroController, cantidadVentasSpn, this.cliente);
        }
    }
    
    
        
    
=======
>>>>>>> master

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarVentasBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JSpinner cantidadVentasSpn;
<<<<<<< HEAD
    private javax.swing.JTextField cedulaClienteTxt;
    private javax.swing.JButton consultarClienteBtn;
    private javax.swing.JButton facturarVentasBtn;
    private javax.swing.JButton facturarVentasBtn1;
=======
    private javax.swing.JButton facturarVentasBtn;
    private javax.swing.JButton facturarVentasBtn1;
    private javax.swing.JTextField idClienteVentasTxt;
>>>>>>> master
    private javax.swing.JLabel ivaVentasLbl;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JComboBox<String> librosVentasCbx;
    private javax.swing.JTable librosVentasTbl;
<<<<<<< HEAD
    private javax.swing.JLabel membresiaClienteLbl;
    private javax.swing.JLabel nombreClienteLbl;
=======
    private javax.swing.JLabel membresiaVentasLbl;
    private javax.swing.JLabel nombreClienteVentasLbl;
>>>>>>> master
    private javax.swing.JLabel precioVentasLbl;
    private javax.swing.JLabel subtotalVentasLbl;
    private javax.swing.JLabel totalVentasLbl;
    // End of variables declaration//GEN-END:variables
}
