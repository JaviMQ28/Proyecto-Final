import java.util.Scanner;

public class JuegoM {

    public static void main(String[] args){

	int participantes;
	System.out.println("¿Cuántas personas van a jugar?");
	Scanner esc = new Scanner(System.in);
	participantes = esc.nextInt();

	switch(participantes){
	case 1:
	    System.out.println("Muy bien");
	case 2:
  
	    String jugador1;
	    String jugador2;
	    System.out.println("Dame el nombre del primer jugador:");
	    Scanner j1 = new Scanner(System.in);
	    jugador1 = j1.nextLine();
	    
	    System.out.println("Dame el nombre del segundo jugador:");
	    Scanner j2 = new Scanner(System.in);
	    jugador2 = j2.nextLine();

	    Tablero tablero = new Tablero();
	    tablero.CrearTablero();
	    
	    System.out.print("Turno de jugador(a):");
	    System.out.println(jugador1);

	    System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
	    //System.out.println(tablero[0][2]);
	    int l;
	    int m;
	    
	    System.out.print("Dame el valor de x: ");
	    
	    l = j1.nextInt();
	    
	    System.out.print("Dame el valor de y: ");
	    
	    m = j1.nextInt();
	    
	    System.out.println("Pieza seleccionada = " + tablero.getPieza(l,m));

	    System.out.println();
	    
	    System.out.println("- Selecciona la posición en donde la quieres poner, dependiendo de sus coordenadas (x,y)");

	    int n,o;
	    
	    System.out.print("Dame el valor de x: ");
	    n = j1.nextInt();

	    System.out.print("Dame el valor de y: ");
	    o = j2.nextInt();
	    

	    tablero.moverPieza(n,o,tablero.getPieza(l,m));
	    
	// default = termina programa 
	default:
	    //System.out.println("Muy mal");
	    break;
	}
    }
}
