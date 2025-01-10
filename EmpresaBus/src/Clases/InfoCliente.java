/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USER
 */
public class InfoCliente {
    public String dni;
    public String nombre;
    public String telefono;
    public String origenDestino;
    public String calidad;
    public String dia;
    public String hora;
    
    
    public InfoCliente(){
        this.dni="ND";
        this.nombre="NN";
        this.telefono="NT";
        this.origenDestino="NOD";
        this.calidad="NC";
        this.dia="NF";
        this.hora="NF";
    }
    
    public InfoCliente(String dni, String nombre, String telefono, String origenDestino, String calidad, String dia, String hora){
        this.dni=dni;
        this.nombre=nombre;
        this.telefono=telefono;
        this.origenDestino=origenDestino;
        this.calidad=calidad;
        this.dia=dia;
        this.hora=hora;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getOrigenDestino(){
        return origenDestino;
    }
    
    public void setOrigenDestino(String origenDestino){
        this.origenDestino=origenDestino;
    }
    
    public String getCalidad(){
        return calidad;
    }
    
    public void setCalidad(String calidad){
        this.calidad=calidad;
    }
    
    public String getDia(){
        return dia;
    }
    
    public void setDia(String dia){
        this.dia=dia;
    }
    
    public String getHora(){
        return hora;
    }
    
    public void setHora(String hora){
        this.hora=hora;
    }
    
    public double Precio(){
        double precio=0;
        switch(calidad){
            case "Estandar":
                switch(origenDestino){
                    case "Trujillo/Cajamarca":
                        precio=37;
                        break;
                    case "Trujillo/Chiclayo":
                        precio=26;
                        break;
                    case "Trujillo/Lima":
                        precio=55;
                }
                break;
            case "VIP":
                switch(origenDestino){
                    case "Trujillo/Cajamarca":
                        precio=47;
                        break;
                    case "Trujillo/Chiclayo":
                        precio=40;
                        break;
                    case "Trujillo/Lima":
                        precio=75;
                }
        }
        return precio;
    }
}
