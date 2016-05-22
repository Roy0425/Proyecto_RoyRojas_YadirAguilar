/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.FRM_Seleccion;

/**
 *
 * @author yadir
 */
public class Controlador_FRM_Seleccion implements ActionListener{
    
    FRM_Seleccion frm_Seleccion;
    public Controlador_FRM_Seleccion(FRM_Seleccion frm_Seleccion)
    {
        this.frm_Seleccion=frm_Seleccion;
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Selección"))
        {
                if(frm_Seleccion.getSeleccion()=="BD")
                    
                {
                   
                  Runtime run=Runtime.getRuntime();
                    try {
                        run.exec("C:\\Users\\yadir\\Desktop\\Ejecutable BD\\ejecutableBD.exe");
                    } catch (IOException ex) {
                      System.out.print(""+ ex.getMessage());
                    }
                }
                if(frm_Seleccion.getSeleccion()=="Planos")
                {
                     
                     Runtime run=Runtime.getRuntime();
                    try {
                        run.exec("C:\\Users\\yadir\\Desktop\\Ejecutable Planos\\ejecutablePlanos.exe");
                    } catch (IOException ex) {
                      System.out.print(""+ ex.getMessage());
                    }
                }
                if(frm_Seleccion.getSeleccion()=="XML")
                {
                    
                     Runtime run=Runtime.getRuntime();
                    try {
                        run.exec("C:\\Users\\yadir\\Desktop\\Ejecutable XML\\ejecutableXML.exe");
                    } catch (IOException ex) {
                      System.out.print(""+ ex.getMessage());
                    }
                }
        }
    }
    
}
