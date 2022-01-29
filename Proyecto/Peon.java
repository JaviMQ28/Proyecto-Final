/**
 * Clase Peon que representa la pieza de ajedrez (Peon) y que ocupa la herencia con la clase Piezas.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Peon extends Piezas{

    /**
     * Constructor con parametros que recibe los valores de 'x' y 'y'.  
     * @param x y
     */
    public Peon(int x, int y){
	super(x, y);
    }

    /**
     * Metodo que representa en forma de texto al peon. 
     */
    public String toString(){
	if( 2 == this.getXs()){
	    return "PB";
	} else {
	    return "PN";
	}
    }
}
