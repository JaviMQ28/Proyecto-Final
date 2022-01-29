/**
 * Clase Tablero que representa un tablero de ajedrex siendo de 6x6.
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Tablero{

    /* 
       --- Atributos de la clase ---
       x representa al valor que tiene en el eje horizontal
       y representa al valor que tiene en el eje vertical
       tablero representa el arreglo de la clase Piezas
     */
    
    protected int x;
    protected int y;
    protected Piezas [] [] tablero = new Piezas [7] [7];

    /**
     * Constructor sin parametros que establece con valores iniciales a cada valor del arreglo.  
     */
    public Tablero(){
	this.x = 0;
	this.y = 0;

	for(x = 2; x < 3; x++){
	    for(y = 1; y < tablero.length; y++){
		tablero[x][y]= new Peon(x,y); 
	    }
	}
	
	for(x = 5; x < 6; x++){
	    for(y = 1; y < tablero.length; y++){
		tablero[x][y]= new Peon(x,y);  
	    }
	}
	
	tablero[1][1]= new Torre(1,1);
	tablero[6][1]= new Torre(6,1);
	
	tablero[1][6]= new Torre(1,6);
	tablero[6][6]= new Torre(6,6);
	
	tablero[1][2]= new Caballo(1,2);
	tablero[1][5]= new Caballo(1,5);
	
	tablero[6][2]= new Caballo(6,2);
	tablero[6][5]= new Caballo(6,5);
	
	tablero[1][4]= new Dama(1,4);
	tablero[6][4]= new Dama(6,4);
	
	tablero[1][3]= new Rey(1,3);
	tablero[6][3]= new Rey(6,3);

    }

    /**
     * Metodo que devuelve el valor de x.
     * @return x 
     */
    public int getX(){
	return x;
    }

    /**
     * Metodo que cambia el valor de x.
     * @param x 
     */
    public void setX(int x){
	this.x = x;
    }

    /**
     * Metodo que devuelve el valor de y.
     * @return y 
     */
    public int getY(){
	return y;
    }

    /**
     * Metodo que cambia el valor de y.
     * @param y 
     */
    public void setY(int y){
	this.y = y;
    }

    /**
     * Metodo que devuelve un objeto de la clase Piezas y recibe dos numeros enteros.
     * @param x y
     * @return Objeto de la clase Piezas 
     */
    public Piezas getPieza(int x, int y){
	return tablero[y][x];
    }

    /**
     * Metodo que recibe dos numeros enteros y un objeto de la clase Piezas en la cual se muestra el tablero actualizado.
     * @param x y e 
     */
    public void moverPieza(int x, int y, Piezas e){
	tablero[e.getXs()][e.getYs()] = null;
	tablero[y][x] = new Caballo(x,y);
	this.CrearTablero();
    }

    /**
     * Metodo que crea el tablero.
     */
    public void CrearTablero(){

	int m = 6;

	System.out.println();
	
        for(int i = 6; i > 0; i--){
	    System.out.print(m);
	    for(int j = 1; j < tablero.length; j++){
		if (tablero[i][j] == null){
		    System.out.print(" " + "__" + " ");
		} else {
		    System.out.print(" " + tablero[i][j] + " ");   
		}
	    }
	    m--;
	    System.out.println();
	}
	
	System.out.print(" ");
	
	for(int n = 1; n <= 6; n++){	    
	    System.out.print(" " + n + "  ");
	}
	
	System.out.println();
	System.out.println();
    }
}
    
