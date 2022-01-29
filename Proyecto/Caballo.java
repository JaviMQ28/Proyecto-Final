/**
 * Clase Caballo que representa la pieza de ajedrez (Caballo) y que ocupa la herencia con la clase Piezas.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Caballo extends Piezas{

    /**
     * Constructor con parametros que recibe los valores de 'x' y 'y'.  
     * @param x y
     */
    public Caballo(int x, int y){
	super(x, y);
    }

    /**
     * Metodo que representa en forma de texto al caballo. 
     */
    public String toString(){
	if( 1 == this.getXs()){
	    return "CB";
	} else {
	    return "CN";
	}
    }
}
