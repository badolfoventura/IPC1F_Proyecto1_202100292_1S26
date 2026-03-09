
package ipc1.f._1s2026.controllers;

import ipc1.f._1s2026.models.AgregarModel;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fofo_
 */
public class AgregarController {
    
    public static AgregarModel[] datosAgregar = new AgregarModel[100];
    
    public void AgregarProducto(String nombre, String categoria, int precio, int cantidad, int codigo){
        //Se anade datos al arreglo
        
        for (int i = 0; i<datosAgregar.length; i++){
            if (datosAgregar[i]==null){
                AgregarModel agregar = new AgregarModel();
                
                agregar.setNombre(nombre);
                agregar.setCategoria(categoria);
                agregar.setPrecio(precio);
                agregar.setCantidad(cantidad);
                agregar.setCodigo(codigo);
                
                datosAgregar[i] = agregar;
                
                System.out.println("Se agrego "+nombre+" de "+categoria+" con precio Q."+precio+" cantidad "+cantidad+" y codigo "+codigo);
                
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
                System.out.println(agregar.getCodigo());
                System.out.println("-------------------------");
            }
        }
        
    }
    
    public void generarHTML() throws IOException{
        StringBuilder filas = new StringBuilder();
        
        for(AgregarModel m: datosAgregar){
            if(m==null) continue;
            
            filas.append("<tr>")
                    .append("<td>").append(m.getCodigo()).append("</td>")
                    .append("<td>").append(m.getNombre()).append("</td>")
                    .append("<td>").append(m.getCategoria()).append("</td>")
                    .append("<td>").append(m.getCantidad()).append("</td>")
                    .append("<td>").append(m.getPrecio()).append("</td>")
                    .append("</td>");
       
        }
        
        String html = 
                """
                <!doctype html>
                <html lang="es">
                    <head><meta charset="utf-8"><title>Reporte de Stock</title></head>
                    <body>
                        <h1>Reporte de Productos</h1>
                        <p>Generando reporte del Stock actualizado.</p>
                        <table>
                            <thead>
                                <tr><th>Codigo </th><th>Nombre </th><th>Categoria </th><th>Cantidad </th><th>Precio </th></tr>
                            </thead>
                            <tbody>"""+
                filas+
                "</tbody>\n"
                +"</table>\n"
                +"</html>\n"
                ;
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
        String fecha = LocalDateTime.now().format(formato);

        String nombreArchivo = fecha + "_Stock.html";

        
        Files.write(Paths.get(nombreArchivo), html.getBytes(StandardCharsets.UTF_8));
        System.out.println("Se genero el arhivo.");
    
    }
}
