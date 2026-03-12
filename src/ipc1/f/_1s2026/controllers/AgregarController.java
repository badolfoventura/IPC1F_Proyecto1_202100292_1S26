
package ipc1.f._1s2026.controllers;

import ipc1.f._1s2026.models.AgregarModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fofo_
 */
public class AgregarController {
    
   // Advertencia advertenciaCantidad = new Advertencia();
    
    public static AgregarModel[] datosAgregar = new AgregarModel[100];
    
    public static int contador = 0;
    
    public void AgregarProducto(String nombre, String categoria, int precio, int cantidad, int codigo){
        //Se anade datos al arreglo
        
        //for (int i = 0; i<datosAgregar.length; i++){
           // if (datosAgregar[i]==null){
                AgregarModel agregar = new AgregarModel();
                
                agregar.setNombre(nombre);
                agregar.setCategoria(categoria);
                agregar.setPrecio(precio);
                agregar.setCantidad(cantidad);
                agregar.setCodigo(codigo);
                
                datosAgregar[contador] = agregar; // Este es el vecotr con los datos agregados desde la ventana agregar
                contador++;
                System.out.println("Se agrego "+nombre+" de "+categoria+" con precio Q."+precio+" cantidad "+cantidad+" y codigo "+codigo);
                
                return;
            //}
        //}
    
    }
    
    public AgregarModel[] buscarProducto(String criterio, String valor){

        AgregarModel[] resultados = new AgregarModel[datosAgregar.length];
        int j = 0;

        for(int i = 0; i < datosAgregar.length; i++){

            AgregarModel p = datosAgregar[i];

            if(p != null){

                if(criterio.equals("Codigo") && 
                p.getCodigo() == Integer.parseInt(valor)){

                    resultados[j++] = p;
                }

                if(criterio.equals("Nombre") && 
                p.getNombre().equalsIgnoreCase(valor)){

                    resultados[j++] = p;
                }

                if(criterio.equals("Categoria") && 
                p.getCategoria().equalsIgnoreCase(valor)){

                    resultados[j++] = p;
                }

            }

        }

        return resultados;

    }
    
    /*public void verAgregar(){
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
        
    }*/
    
    public AgregarModel buscarPorCodigo(int codigo){

    for(int i = 0; i < datosAgregar.length; i++){

        if(datosAgregar[i] != null && datosAgregar[i].getCodigo() == codigo){
            return datosAgregar[i];
        }

    }

    return null;
    }
    
    public AgregarModel[] obtenerProductos(){
        return datosAgregar;
    }
    
    /*public void buscarProducto(String criterio, String valor){

        boolean encontrado = false;

        for(int i = 0; i < contador; i++){

            AgregarModel p = datosAgregar[i];

            if(p != null){

                if(criterio.equals("Codigo")){

                    if(p.getCodigo() == Integer.parseInt(valor)){
                        System.out.println(p.getNombre());
                        encontrado = true;
                    }

                }

                if(criterio.equals("Nombre")){

                    if(p.getNombre().equalsIgnoreCase(valor)){
                    System.out.println(p.getNombre());
                    encontrado = true;
                    }

                }

                if(criterio.equals("Categoria")){

                    if(p.getCategoria().equalsIgnoreCase(valor)){
                        System.out.println(p.getNombre());
                        encontrado = true;
                    }

                }

            }

        }

        if(!encontrado){
            System.out.println("Producto no encontrado");
        }
}*/ 
       public boolean eliminarProducto(int codigo){

         for(int i = 0; i < contador; i++){

            if(datosAgregar[i] != null && datosAgregar[i].getCodigo() == codigo){

            for(int j = i; j < contador - 1; j++){
                datosAgregar[j] = datosAgregar[j+1];
            }

            datosAgregar[contador - 1] = null;
            contador--;

            return true;
            }
        }

        return false;
    }
    
    public boolean registrarVenta(int codigo, int cantidad){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm");
        String fechaVenta = LocalDateTime.now().format(formato);

        for(int i = 0; i < contador; i++){

            if(datosAgregar[i] != null && datosAgregar[i].getCodigo() == codigo){

                // validar stock
                if(datosAgregar[i].getCantidad() < cantidad){
                    System.out.println("Stock insuficiente");
                    return false;
                }

                // calcular total
                int precio = datosAgregar[i].getPrecio();
                int total = precio * cantidad;

                // restar stock
                datosAgregar[i].setCantidad(
                datosAgregar[i].getCantidad() - cantidad
                    );

                // fecha y hora
                //LocalDateTime fecha = LocalDateTime.now();

                try{

                    FileWriter archivo = new FileWriter("Reporte de ventas.txt", true);

                    archivo.write(
                        "Codigo: " + codigo +
                        "  |  Cantidad: " + cantidad +
                        "  |  Total: Q." + total +
                        "  |  Fecha: " + fechaVenta +
                        "\n"
                        );

                    archivo.close();

                }catch(IOException e){
                    e.printStackTrace();
                }

                    return true;
            }
        }

        System.out.println("Producto no encontrado");
        return false;
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
                    .append("</tr>");
       
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
    
    public void generarReporteVentas() throws IOException{

        BufferedReader lector = new BufferedReader(new FileReader("Reporte de ventas.txt"));

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");

        String nombreArchivo = formato.format(ahora) + "_Venta.html";

        FileWriter archivo = new FileWriter(nombreArchivo);

        archivo.write("<html>");
        archivo.write("<head><title>Reporte de Ventas</title></head>");
        archivo.write("<body>");

        archivo.write("<h1>Historial de Ventas</h1>");

        archivo.write("<table border='1'>");
        archivo.write("<tr>");
        archivo.write("<th>Codigo</th>");
        archivo.write("<th>Cantidad</th>");
        archivo.write("<th>Total</th>");
        archivo.write("<th>Fecha</th>");
        archivo.write("</tr>");

        String linea;

        while((linea = lector.readLine()) != null){

            String[] datos = linea.split("\\|");

            archivo.write("<tr>");

            archivo.write("<td>" + datos[0] + "</td>");
            archivo.write("<td>" + datos[1] + "</td>");
            archivo.write("<td>" + datos[2] + "</td>");
            archivo.write("<td>" + datos[3] + "</td>");

            archivo.write("</tr>");
            }

        archivo.write("</table>");
        archivo.write("</body>");
        archivo.write("</html>");

        lector.close();
        archivo.close();

        System.out.println("Reporte generado: " + nombreArchivo);
    }
}
