/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crear_interface;

/**
 *
 * @author dell
 */
public interface IPersona {
    
     
    public String getnombre();
    public void setnombre(String nombre); 
    public void llenar_informacion();
    public void Cargar_información(String archivo);
    public void guardar_información(String archivo);
     
}
