/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author cedav
 */
public class MensajesService {
    
    public static void crearMensaje(){
       Scanner sc = new Scanner(System.in);           
       System.out.println("Escribe el mensaje");
       String mensaje = sc.nextLine();
       
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);        
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();    
    }
    
    public static void borraMensaje(){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Ingresa el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajesDB(id_mensaje);
        
    }
    
    public static void editarMensaje(){
        
        Scanner sc = new Scanner(System.in);      
        System.out.println("Escribe tu nuevo mensaje");        
        String mensaje = sc.nextLine();
        
        System.out.println("Ingrese el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualización = new Mensajes();
        actualización.setId_mensaje(id_mensaje);
        actualización.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualización);
        
    }
    
}
