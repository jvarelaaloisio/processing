package version09;
import processing.core.*;

public class selector {
	PApplet parent;
	menu menu;
	int posicion = 0;
	
	public selector(menu temp_menu, PApplet P) {
		parent = P;
		menu = temp_menu;
	}
	
	public void moverSelector(){
		if(parent.keyCode == 40) {
			posicion ++;
			System.out.print(posicion);
		}
	}
}
