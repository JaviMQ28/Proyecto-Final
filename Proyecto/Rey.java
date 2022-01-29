public class Rey extends Piezas{

    public Rey(int x, int y){
	super(x, y);
    }

    public String toString(){
	if( 1 == this.getXs()){
	    return "RB";
	} else {
	    return "RN";
	}
    }
}
