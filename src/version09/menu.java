package version09;
import processing.core.*;

public class menu {
	PApplet parent;
	int x, y, ancho, alto, filas;
	
	public menu(int temp_x, int temp_y, int temp_ancho, int temp_alto, int temp_filas, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto/temp_filas;
		filas = temp_filas;
	}
	
	public void genPos() {
		for(int i=0; i<filas; i++) {
			parent.fill(200,50,200);
			parent.rect(x, y+alto*i, ancho, alto);
		}
	}
}
