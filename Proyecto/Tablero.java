import java.util.Scanner;

public class Tablero{

    protected int x;
    protected int y;
    protected Piezas [] [] tablero = new Piezas [7] [7];
    
    public Tablero(){
	this.x = 0;
	this.y = 0;
	//this.tablero[x][y] = new Peon(x,y);

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

    public int getX(){
	return x;
    }

    public void setX(int x){
	this.x = x;
    }

    public int getY(){
	return y;
    }

    public void setY(int y){
	this.y = y;
    }

    public Piezas getPieza(int x, int y){
	return tablero[y][x];
    }

    public void moverPieza(int x, int y, Piezas e){
	tablero[e.getXs()][e.getYs()] = null;
	tablero[y][x] = new Caballo(x,y);
	this.CrearTablero();
    }

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
    
    public static void main(String[] args){

	Tablero tablero = new Tablero();
        tablero.CrearTablero();

	int l;
	int m;
	Scanner j = new Scanner(System.in);
	l = j.nextInt();
	m = j.nextInt();
	
	System.out.println(tablero.getPieza(l,m));

	int x;
	int y;
	
	Scanner j1 = new Scanner(System.in);
	Scanner j2 = new Scanner(System.in);
	x = j1.nextInt();
	y = j2.nextInt();
	

	tablero.moverPieza(x,y,tablero.getPieza(l,m));

	//System.out.println(tablero.getPieza(x,y).getXs());
    }
}
    
