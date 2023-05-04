/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloPersonas;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class PersonasController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    ModeloPersonas PersonasModelo;

    public PersonasController(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, ModeloPersonas PersonasModelo) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.PersonasModelo = PersonasModelo;
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        this.VistaPrincipal.btnListar.addActionListener(this);
        
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VistaPrincipal.btnAgregar)
        {

            this.PersonasModelo.IngresarDatos(this.VistaPrincipal.txtApellidos.getText(),
            this.VistaPrincipal.txtNombre.getText(), this.VistaPrincipal.txtTelefono.getText());
            this.VistaPrincipal.txtApellidos.setText("");
            this.VistaPrincipal.txtNombre.setText("");
            this.VistaPrincipal.txtTelefono.setText(""); 
            
        }
        if(e.getSource() == VistaPrincipal.btnListar)
        {

           
            this.VistaPersonas.tablaPersonas.setModel(this.PersonasModelo.ListarPacientes());
             
            this.VistaPersonas.setLocationRelativeTo(VistaPrincipal);
            this.VistaPersonas.setVisible(true);
        }
    }
    
    
    
    
}
