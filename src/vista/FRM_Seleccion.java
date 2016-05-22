/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Seleccion;
import java.awt.Component;

/**
 *
 * @author yadir
 */
public class FRM_Seleccion extends javax.swing.JFrame {

  
    String seleccion="";
    Controlador_FRM_Seleccion controlador;
    


    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); //To change body of generated methods, choose Tools | Templates.
    }
    
    public FRM_Seleccion() {
        initComponents();
        setLocationRelativeTo(null);
        controlador=new Controlador_FRM_Seleccion(this);
        cargarEventos(controlador);
    }
    public void cargarEventos(Controlador_FRM_Seleccion controlador)
    {
        this.btn_Seleccion.addActionListener(controlador);
    }
    public String getSeleccion()
    {
        if(this.jrb_BD.isSelected())
        {
            seleccion="BD";
     
        }
        if(this.jrb_Planos.isSelected())
        {
            seleccion="Planos";
        }
        if(this.jrb_XML.isSelected())
        {
            seleccion="XML";
        }
        
        return seleccion;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrb_BD = new javax.swing.JRadioButton();
        jrb_XML = new javax.swing.JRadioButton();
        jrb_Planos = new javax.swing.JRadioButton();
        jl_Mensaje = new javax.swing.JLabel();
        btn_Seleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrb_BD.setText("Base de Datos");

        jrb_XML.setText("Archivos XML");

        jrb_Planos.setText("Archivos Planos");

        jl_Mensaje.setText("Elija en que desea almacenar los datos");

        btn_Seleccion.setText("Selección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jl_Mensaje)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Seleccion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jrb_Planos)
                        .addComponent(jrb_XML, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrb_BD, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jl_Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jrb_BD)
                .addGap(18, 18, 18)
                .addComponent(jrb_XML)
                .addGap(18, 18, 18)
                .addComponent(jrb_Planos)
                .addGap(34, 34, 34)
                .addComponent(btn_Seleccion)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Seleccion;
    private javax.swing.JLabel jl_Mensaje;
    private javax.swing.JRadioButton jrb_BD;
    private javax.swing.JRadioButton jrb_Planos;
    private javax.swing.JRadioButton jrb_XML;
    // End of variables declaration//GEN-END:variables
}
