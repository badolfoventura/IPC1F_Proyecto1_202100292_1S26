/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.f._1s2026.controllers;

import ipc1.f._1s2026.models.AgregarModel;

/**
 *
 * @author fofo_
 */
public class AgregarController {
    
    public static AgregarModel[] datosAgregar = new AgregarModel[100];
    
    public void AgregarProducto(String nombre, String categoria, int precio, int cantidad, int codigoU){
        //Se anade datos al arreglo
        
        for (int i = 0; i<datosAgregar.length; i++){
            if (datosAgregar[i]==null){
                AgregarModel agregar = new AgregarModel();
                
                agregar.setNombre(nombre);
                agregar.setCategoria(categoria);
                agregar.setPrecio(precio);
                agregar.setCantidad(cantidad);
                agregar.setCodigoU(codigoU);
                
                datosAgregar[i] = agregar;
                
                System.out.println("Se agrego "+nombre+" de "+categoria+" con precio Q."+precio+" cantidad "+cantidad+" y codigo "+codigoU);
                
                return;
            }
        }
    
    }
    
    public void verAgregar(){
        for(AgregarModel agregar: datosAgregar){
            
            if (agregar!= null){
                System.out.println("-------------------------");
                System.out.println(agregar.getNombre());
                System.out.println(agregar.getCategoria());
                System.out.println(agregar.getPrecio());
                System.out.println(agregar.getCantidad());
                System.out.println(agregar.getCodigoU());
                System.out.println("-------------------------");
            }
        }
        
    }
    
    
    
}
