import java.util.Scanner;

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

    @Override
    public boolean movValido(int x, int y, Piezas e){
	boolean m = true;

	for(int i = 1; i <= 6; i++){
	    if(e.getYs() + i == y && e.getXs() == x){
		return m;
		//break;
	    }
	    else if (e.getYs() == y && e.getXs() + i == x){
		return m;
	    }
	}

	for(int j = 5; j >= 1; j--){
	    if(e.getYs() - j == y && e.getXs() == x){
		return m;
	    }
	    else if (e.getYs() == y && e.getXs() - j == x){
		return m;
	    }
	}
	
	m = false;
	return m;
	//break;
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

	
