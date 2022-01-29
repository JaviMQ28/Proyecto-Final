public class Dama extends Piezas{

    public Dama(int x, int y){
	super(x, y);
    }

    public String toString(){
	if( 1 == this.getXs()){
	    return "DB";
	} else {
	    return "DN";
	}
    }
}
