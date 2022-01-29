public class Torre extends Piezas{

    public Torre(int x, int y){
	super(x, y);
    }

    public String toString(){
	if( 1 == this.getXs()){
	    return "TB";
	} else {
	    return "TN";
	}
    }
}
