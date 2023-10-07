/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Archivo {
     File archivo;
     
     public void CrearArchivo () {
        try{
           archivo = new File ("SunshinelifeUsuarios1.txt"); 
           if(archivo.createNewFile()){
               JOptionPane.showMessageDialog(null, "Archivo creado");
           }
        }catch(IOException e){
            System.out.println(e);  
        }
    }
    public void EscribirArchivo (Usuario usuario) {
        try{

            try (FileWriter escritura = new FileWriter(archivo,true)) {
                escritura.write(usuario.getNombre()+ "/"+usuario.getGenero()+"/"+ usuario.getEdad()+"/"+usuario.getPeso()+"/"+usuario.getAltura()+"/"+usuario.getImc()+"/"+usuario.getPlan()+"\r\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }

    
}
