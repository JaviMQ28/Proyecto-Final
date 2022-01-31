// Importar la biblioteca Scanner para que el usuario pueda introducir los números
import java.util.Scanner;
import java.util.Random;

/**
 * Clase JuegoM que representa el juego de ajedrez (extincion).
 * - Todavia en proceso - 
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz 
 */
public class JuegoM {

    public static void main(String[] args){

	int participantes;
	int turnos;
	Scanner esc = new Scanner(System.in);
	boolean espera1 = true;

	do{
	    System.out.println("¿Cuántas personas van a jugar?");

	    try{
		participantes = esc.nextInt();
		
		if(participantes < 1 || participantes > 2){
		    System.out.println("Unicamente puedes seleccionar 1 o 2 participantes");
		}
		
		switch(participantes){
		case 1:
		    System.out.println("Muy bien");
		    espera1 = false;
		    break;
		    
		case 2:
		    
		    String jugador1;
		    Scanner j1 = new Scanner(System.in);
		    String jugador2;
		    Scanner j2 = new Scanner(System.in);
		    Tablero tablero = new Tablero();
		    Random aleatorio = new Random();
		    int valor;
		    int nivel;
		    int turno;
		    boolean espera = true;
		    
		    System.out.print("Dame el nombre del primer jugador = ");
	       
		    jugador1 = j1.nextLine();
		    
		    System.out.print("Dame el nombre del segundo jugador = ");
		    
		    jugador2 = j2.nextLine();
		    
		    valor = aleatorio.nextInt(2);
		    if(valor == 0){
			System.out.println("Selecciona el nivel jugador(a) -> " + jugador1 + " <- \n - Nivel 1 \n - Nivel 2 \n - Nivel 3");
		    } else {
			System.out.println("Selecciona el nivel jugador(a) - " + jugador2 + " - : \n - Nivel 1 \n - Nivel 2 \n - Nivel 3");
		    }
		    
		    do{
			nivel = j1.nextInt();
			
			if(nivel == 1){
			    turno = 20;
			    
			    valor = aleatorio.nextInt(2);
			    if(valor == 0){
				System.out.println("Jugador(a): " + jugador1 + "\n *** Controlas las piezas blancas ***");
			    } else {
				System.out.println("Jugador(a): " + jugador2 + "\n *** Controlas las piezas blancas ***");
			    }
			    
			    while(turno > 0){
				tablero.CrearTablero();
			
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador1);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
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
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}

				tablero.CrearTablero();
				
				System.out.println();
				
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador2);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				
				l = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				
				m = j2.nextInt();
				
				System.out.println("Pieza seleccionada = " + tablero.getPieza(l,m));
				
				System.out.println();
				
				System.out.println("- Selecciona la posición en donde la quieres poner, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				n = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				o = j2.nextInt();
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}
				
				turno--;
			    }

			    espera = false;
			}
			else if(nivel == 2){
			    turno = 40;

			    valor = aleatorio.nextInt(2);
			    if(valor == 0){
				System.out.println("Jugador(a): " + jugador1 + "\n *** Controlas las piezas blancas ***");
			    } else {
				System.out.println("Jugador(a): " + jugador2 + "\n *** Controlas las piezas blancas ***");
			    }
			    
			    while(turno > 0){
				tablero.CrearTablero();
			
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador1);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
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
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}

				tablero.CrearTablero();
				
				System.out.println();
				
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador2);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				
				l = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				
				m = j2.nextInt();
				
				System.out.println("Pieza seleccionada = " + tablero.getPieza(l,m));
				
				System.out.println();
				
				System.out.println("- Selecciona la posición en donde la quieres poner, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				n = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				o = j2.nextInt();
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}
				
				turno--;
			    }
			    
			    espera = false;
			}
			else if (nivel == 3){
			    turno = 100;

			    valor = aleatorio.nextInt(2);
			    if(valor == 0){
				System.out.println("Jugador(a): " + jugador1 + "\n *** Controlas las piezas blancas ***");
			    } else {
				System.out.println("Jugador(a): " + jugador2 + "\n *** Controlas las piezas blancas ***");
			    }
			    
			    while(turno > 0){
				tablero.CrearTablero();
			
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador1);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
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
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}

				tablero.CrearTablero();
				
				System.out.println();
				
				System.out.print("Turno de jugador(a):");
				System.out.println(jugador2);
				
				System.out.println("- Selecciona una pieza, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				
				l = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				
				m = j2.nextInt();
				
				System.out.println("Pieza seleccionada = " + tablero.getPieza(l,m));
				
				System.out.println();
				
				System.out.println("- Selecciona la posición en donde la quieres poner, dependiendo de sus coordenadas (x,y)");
				
				System.out.print("Dame el valor de x: ");
				n = j2.nextInt();
				
				System.out.print("Dame el valor de y: ");
				o = j2.nextInt();
				
				if(tablero.getPieza(l,m).movValido(n,o,tablero.getPieza(l,m)) == true){
				    tablero.moverPieza(n,o,tablero.getPieza(l,m));
				} else {
				    System.out.println("Mal");
				}
				
				turno--;
			    }
			    
			    espera = false;
			} else {
			    System.out.println("Nivel inválido");
			}

		    } while(espera == true);
		    
		    // default = termina programa 
	        
		}
		
	    } catch (Exception e){
		System.out.println("Unicamente puedes seleccionar valores numéricos");
		esc.next();
	    }
	} while(espera1);    
    }
}
