
package Singleton;

/**
 *
 * @author fofo_
 */
public class SingletonID {
    
    private static final SingletonID instancia = new SingletonID();
    private int codigoProducto = 0;
    
    private SingletonID(){}
    
    public static SingletonID getInstancia(){
        return instancia;
    
    }
    
    public int generarID(){
        return codigoProducto++;
    }
}
