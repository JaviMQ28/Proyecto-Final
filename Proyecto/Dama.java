/**
 * Clase Dama que representa la pieza de ajedrez (Reina) y que ocupa la herencia con la clase Piezas.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Dama extends Piezas{

    /**
     * Constructor con parametros que recibe los valores de 'x' y 'y'.  
     * @param x y
     */
    public Dama(int x, int y){
	super(x, y);
    }

    /**
     * Metodo que representa en forma de texto a la reina. 
     */
    public String toString(){
	if( 1 == this.getXs()){
	    return "DB";
	} else {
	    return "DN";
	}
    }
}
