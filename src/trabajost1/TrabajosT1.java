/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajost1;

/**
 *
 * @author mange
 */
public class TrabajosT1 {

    /**
     * @param args the command line arguments
     */
    public static String nombre ="Diseñador";
    public static String descripcion= "Desarrollador de aplicaciones";
    public static String habilidades="Programacion de todo tipo";
    public static int experiencia=2;
    public static String nivel="Jefe";
    public static int sueldo(){
        int salario=0;
        if(nivel.equalsIgnoreCase("jr")){
            salario=1000*(1+(experiencia/10));
        }else if(nivel.equalsIgnoreCase("sr")){
            salario=1500*(1+(experiencia/10));
        }else if(nivel.equalsIgnoreCase("Lider")){
            salario=2000*(1+(experiencia/10));  
        }else if(nivel.equalsIgnoreCase("Jefe")){
            salario=2500*(1+(experiencia/10));
        }
        return salario;
       
    }
    public static void main(String[] args) {
        System.out.println(nombre+"\n"+descripcion+"\n"+habilidades+"\n"+experiencia+"\n"+nivel);
        System.out.println("TU salario es $" +sueldo());
        
    }
    
}
