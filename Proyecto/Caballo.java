public class Caballo extends Piezas{

    public Caballo(int x, int y){
	super(x, y);
    }

    /*public void moverPieza(int x, int y, Piezas e){
	tablero[e.getXs()][e.getYs()] = null;
	tablero[y][x] = new Caballo(x,y);
	this.CrearTablero();
	}*/

    public String toString(){
	if( 1 == this.getXs()){
	    return "CB";
	} else {
	    return "CN";
	}
    }
}
