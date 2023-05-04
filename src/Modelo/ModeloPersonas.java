/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author umg
 */
public class ModeloPersonas {
    
     ArrayList MiLista = new ArrayList();
     DefaultTableModel ModeloTabla;
    public void IngresarDatos(String ape ,String nom, String tel)
    {
        Personas nuevoCliente = new Personas(ape, nom, tel);
        this.MiLista.add(nuevoCliente);
    }
  public DefaultTableModel ListarPacientes()
    {
        ArrayList<Personas>listaLocal = MiLista;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        for(Personas MiListaDePacientes: listaLocal)
        {
            this.ModeloTabla.addRow(new Object []{MiListaDePacientes.getApellidos()
                    ,MiListaDePacientes.getNombres(),MiListaDePacientes.getTelefono()});
        }
        return ModeloTabla;
    }

}
    
