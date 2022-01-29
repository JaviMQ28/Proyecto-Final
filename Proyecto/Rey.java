/**
 * Clase Rey que representa la pieza de ajedrez (Rey) y que ocupa la herencia con la clase Piezas.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Rey extends Piezas{

    /**
     * Constructor con parametros que recibe los valores de 'x' y 'y'.  
     * @param x y
     */
    public Rey(int x, int y){
	super(x, y);
    }

    /**
     * Metodo que representa en forma de texto al rey. 
     */
    public String toString(){
	if( 1 == this.getXs()){
	    return "RB";
	} else {
	    return "RN";
	}
    }
}
