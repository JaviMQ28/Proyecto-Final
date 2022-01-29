import java.util.Scanner;

public class Peon extends Piezas{

    public Peon(int x, int y){
	super(x, y);
    }
    
    public String toString(){
	if( 2 == this.getXs()){
	    return "PB";
	} else {
	    return "PN";
	}
    }

    public static void main(String[] args){
	Tablero tablero = new Tablero();
	tablero.CrearTablero();

        int x;
	int y;
	Scanner j1 = new Scanner(System.in);
	x = j1.nextInt();
	y = j1.nextInt();

	System.out.println(tablero.getPieza(x,y));
	tablero.CrearTablero();
    }
}
