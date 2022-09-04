/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crear_interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ClsPersona implements IPersona{
     public static List<ClsPersona> lista = new ArrayList();
    public static ClsPersona prs = new ClsPersona(); 
    
  
    
    
    public String nombre;

    @Override
    public String getnombre() {
      return nombre; 
    }

    @Override
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void llenar_informacion() {
     ClsPersona pers = new ClsPersona();
        Scanner t = new Scanner(System.in);
        String archivo;
        

        System.out.println("Ingresa el nombre que desea adjuntar en  la lista: ");
        archivo=t.nextLine();
        
       pers.Cargar_información(archivo);
        System.out.println("Informacion cargada");
        
        for(ClsPersona v : lista){
            
            System.out.println(v.getnombre());
            
            }
        System.out.println("\t");
        
        for(ClsPersona v : lista){
            
            archivo= v.getnombre();
            pers.guardar_información(archivo);
            System.out.println("Sus datos han sido guardados correctamente: "+ v.getnombre());
            }
        
    
    }

    @Override
    public void Cargar_información(String archivo) {
   File archivos = new File("C:\\Users\\dell\\OneDrive\\Documentos\\CUARTO SEMESTRE\\listapersonas.txt");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivos));
            String lectura;
            lectura = entrada.readLine();
            int NoLinea = 1;
            
            prs.setnombre(archivo);
            lista.add(prs);
            prs= new ClsPersona();
            
            while (lectura!= null){                

                prs.setnombre(lectura);
                lista.add(prs);
                lectura=entrada.readLine();
                prs = new ClsPersona();
                
                NoLinea++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
        } 
       
    
        
    }

    @Override
    public void guardar_información(String archivo) {
           File archivos = new File("C:\\Users\\dell\\OneDrive\\Documentos\\CUARTO SEMESTRE\\actualizacion.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivos,true));
            String contenido = archivo;
            salida.println(contenido);
            salida.close();
            
        } catch (IOException e) {
            System.out.println(" Hubo un error al abrir o grabar el archivo");
        }
        
    }
        
   
}    
   
        
    
     
    
    
    
    

