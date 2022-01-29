/**
 * Clase Torre que representa la pieza de ajedrez (Torre) y que ocupa la herencia con la clase Piezas.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Torre extends Piezas{

    /**
     * Constructor con parametros que recibe los valores de 'x' y 'y'.  
     * @param x y
     */
    public Torre(int x, int y){
	super(x, y);
    }

    /**
     * Metodo que representa en forma de texto a la torre. 
     */
    public String toString(){
	if( 1 == this.getXs()){
	    return "TB";
	} else {
	    return "TN";
	}
    }
}
