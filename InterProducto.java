/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import java.sql.Connection;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author Liliana
 */
public class InterProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterProducto
     */
    int obtIdCategoria = 0;

    public InterProducto() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Agregar producto!");

        this.SeleccionarOpCat();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cant = new javax.swing.JTextField();
        txt_pre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jButton_guardar_p = new javax.swing.JButton();
        jLabel_banner = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar producto!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("IVA%:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Categoria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descripcion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, -1));

        txt_cant.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(txt_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        txt_pre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(txt_pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, -1));

        jComboBox_iva.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar IVA:", "Excento", "0%", "8%", "16%" }));
        getContentPane().add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoría:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jButton_guardar_p.setBackground(new java.awt.Color(102, 204, 0));
        jButton_guardar_p.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton_guardar_p.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar_p.setText("Guardar");
        jButton_guardar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_pActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner1.png"))); // NOI18N
        getContentPane().add(jLabel_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_pActionPerformed
        // TODO add your handling code here:
        Producto product = new Producto();
        Ctrl_Producto controlarProducto = new Ctrl_Producto();
        String iva = "";
        String cat = "";
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        cat = jComboBox_categoria.getSelectedItem().toString().trim();

        if (txt_nombre.getText().equals("") || txt_cant.getText().equals("") || txt_pre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Completa los campos faltantes!");
            txt_nombre.setBackground(Color.yellow);
            txt_cant.setBackground(Color.yellow);
            txt_pre.setBackground(Color.yellow);
        } else {
            if (!controlarProducto.existeProducto(txt_nombre.getText().trim())) {
                if (iva.equalsIgnoreCase("Seleccionar IVA:")) {
                    JOptionPane.showMessageDialog(null, "Seleccionar IVA%");
                } else {
                    if (cat.equalsIgnoreCase("Seleccionar categoría:")) {
                        JOptionPane.showMessageDialog(null, "Seleccionar categoría!");
                    } else {
                        try {
                            product.setNombre(txt_nombre.getText().trim());
                            product.setCantidad(Integer.parseInt(txt_cant.getText().trim()));
                            String precioTxt = "";
                            double Precio = 0.0;
                            precioTxt = txt_pre.getText().trim();
                            boolean aux = false;

                            for (int i = 0; i < precioTxt.length(); i++) {
                                if (precioTxt.charAt(i) == ',') {
                                    String precioNuevo = precioTxt.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }
                            if (aux == true) {
                                product.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTxt);
                                product.setPrecio(Precio);
                            }

                            product.setDescripcion(txt_descripcion.getText().trim());

                            if (iva.equalsIgnoreCase("Excento")) {
                                product.setPorcentajeIva(0);

                            } else if (iva.equalsIgnoreCase("0%")) {
                                product.setPorcentajeIva(0);
                            } else if (iva.equalsIgnoreCase("8%")) {
                                product.setPorcentajeIva(8);
                            } else if (iva.equalsIgnoreCase("16%")) {
                                product.setPorcentajeIva(16);
                            }
                            this.IdCat();
                            product.setIdCategoria(obtIdCategoria);
                            product.setEstado(1);

                            if (controlarProducto.guardar(product)) {
                                JOptionPane.showMessageDialog(null, "Producto guardado!");
                                txt_nombre.setBackground(Color.green);
                                txt_cant.setBackground(Color.green);
                                txt_pre.setBackground(Color.green);
                                txt_descripcion.setBackground(Color.green);
                                
                                this.jComboBox_iva.setSelectedItem("Seleccionar IVA:");
                                this.SeleccionarOpCat();
                                this.Blanco();
                            } else {
                                JOptionPane.showMessageDialog(null, "El producto no se guardo!");
                            }
                            
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en productos: "+e);
                        }}}
                    }else{
                    JOptionPane.showMessageDialog(null, "Ya tenemos existencia con ese producto!");
                    }
                }
    }//GEN-LAST:event_jButton_guardar_pActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar_p;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_banner;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pre;
    // End of variables declaration//GEN-END:variables

    private void SeleccionarOpCat() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccionar categoría:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.print("Error en vista categorias.");
        }
    }

    private int IdCat() {
        String sql = "select * from tb_categoria where nombre = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtIdCategoria = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error en categoria.");
        }
        return obtIdCategoria;
    }
    
    private void Blanco(){
        txt_nombre.setText("");
        txt_cant.setText("");
        txt_pre.setText("");
        txt_descripcion.setText("");
    }

}
