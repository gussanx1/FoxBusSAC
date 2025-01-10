/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.InfoCliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class ArchivoInfoCliente {
    FileWriter fw = null;
    PrintWriter pw = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    String nombreArchivo = "boletoCliente.txt";
    
     public void agregar (InfoCliente x){
        try {
            fw = new FileWriter (nombreArchivo, true);
            pw = new PrintWriter (fw);
            pw.println(x.getDni());
            pw.println(x.getNombre());
            pw.println(x.getTelefono());
            pw.println(x.getOrigenDestino());
            pw.println(x.getCalidad());
            pw.println(x.getDia());
            pw.println(x.getHora());
            pw.println(x.Precio());
            pw.close();
        }
        
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
   public void mostrar (DefaultTableModel modelo) {
        String titulos [] = {"DNI", "NOMBRE", "TELEFONO", "ORIGEN/DESTINO", "CALIDAD","DIA", "HORA", "PRECIO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            FileReader fr = new FileReader (nombreArchivo);
            BufferedReader br = new BufferedReader (fr);
            String dni;
            dni = br.readLine();
            while (dni != null) {
                String nombre = br.readLine();
                String telefono = br.readLine();
                String origenDestino = br.readLine();
                String calidad = br.readLine();
                String dia = br.readLine();
                String hora = br.readLine();
                String precio = br.readLine();
                String fila [] = {dni, nombre, telefono, origenDestino, calidad, dia, hora, precio};
                modelo.addRow(fila);
                dni = br.readLine();
            }
            br.close();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
