import java.util.Scanner;

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

    @Override
    public boolean movValido(int x, int y, Piezas e){
	boolean m = true;
	
        for(int i = 1; i <= 6; i++){
	    if(e.getYs() + i == y && e.getXs() == x){
		return m;
	    }
	    else if (e.getYs() == y && e.getXs() + i == x){
		return m;
	    }
	    else if (e.getYs() + i == y && e.getXs() + i == x){
		return m;
	    }
	    for(int k = 5; k >= 1; k--){
		if (e.getYs() + i == y && e.getXs() - k == x){
		    return m;
		}
	    }
	}
	
	for(int j = 5; j >= 1; j--){
	    if(e.getYs() - j == y && e.getXs() == x){
		return m;
	    }
	    else if (e.getYs() == y && e.getXs() - j == x){
		return m;
	    }
	    else if (e.getYs() - j == y && e.getXs() - j == x){
		return m;
	    }
	    for(int k = 1; k <= 6; k++){
		if (e.getYs() - j == y && e.getXs() + k == x){
		    return m;
		}
	    }
	}
	
	m = false;
	return m;
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
