import java.util.Scanner;

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

    @Override
    public boolean movValido(int x, int y, Piezas e){
	boolean m = true;
	
	if(e.getXs() + 2 == x && e.getYs() - 1 == y){
	    return m;
	}
	else if(e.getXs() + 2 == x && e.getYs() + 1 == y){
	    return m;
	}
	else if(e.getYs() + 2 == y && e.getXs() - 1 == x){
	    return m;
	}
	else if(e.getYs() + 2 == y && e.getXs() + 1 == x){
	    return m;
	}
	else if(e.getXs() - 2 == x && e.getYs() + 1 == y){
	    return m;
	}
	else if(e.getXs() - 2 == x && e.getYs() - 1 == y){
	    return m;
	}
	else if(e.getYs() - 2 == y && e.getXs() + 1 == x){
	    return m;
	}
	else if(e.getYs() - 2 == y && e.getXs() - 1 == x){
	    return m;
	}

	m = false;
	return m;
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

    public static void main(String[] args){

	Tablero tablero = new Tablero();
	tablero.CrearTablero();
	
	Scanner j1 = new Scanner(System.in);
	int x = j1.nextInt();
	int y = j1.nextInt();

	System.out.println("-------");
	System.out.println(tablero.getPieza(x,y).getXs());
	System.out.println(tablero.getPieza(x,y).getYs());
	System.out.println(tablero.getPieza(x,y));
	
	int a = j1.nextInt();
	int b = j1.nextInt();
	//tablero.movValido(a,b,tablero.getPieza(x,y));
	if(tablero.getPieza(x,y).movValido(a,b,tablero.getPieza(x,y)) == true){
	    System.out.println(tablero.getPieza(x,y));
	    tablero.moverPieza(a,b,tablero.getPieza(x,y));
	} else {
	    System.out.println("Mal");
	}

	tablero.CrearTablero();

	x = j1.nextInt();
	y = j1.nextInt();

	System.out.println("-------");

	System.out.println(tablero.getPieza(x,y).getXs());
	System.out.println(tablero.getPieza(x,y).getYs());
	System.out.println(tablero.getPieza(x,y));
	
	a = j1.nextInt();
	b = j1.nextInt();
	
	if(tablero.getPieza(x,y).movValido(a,b,tablero.getPieza(x,y)) == true){
	    System.out.println(tablero.getPieza(x,y));
	    tablero.moverPieza(a,b,tablero.getPieza(x,y));
	} else {
	    System.out.println("Mal");
	}

	tablero.CrearTablero();
    }
    
}
