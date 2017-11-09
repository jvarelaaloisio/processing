package version09;
import processing.core.*;

public class menu {
	PApplet parent;
	int x, y, ancho, alto, filas;
	String[] opciones;
	float CENTROY(int y, int i, int alto) {
		return(y + alto * i + alto*4/6);
	}
	float CENTROX(int x, int ancho, String info) {
		return(x+ (ancho - parent.textWidth(info))/2);
	}
	public menu(int temp_x, int temp_y, int temp_ancho, int temp_alto, int temp_filas, String[] temp_opciones, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto/temp_filas;
		filas = temp_filas;
		opciones = temp_opciones;
		BuscarErrores();
	}
	
	public void genPos() {
		for(int i=0; i<filas; i++) {
			dibujar(i,opciones[i]);
		}
	}
	
	public void dibujar(int i, String info) {
		parent.fill(100,0,100);
		parent.rect(x, y+alto*i, ancho, alto);
		parent.fill(255);
		parent.textSize(20);
		parent.text(info, CENTROX(x, ancho, info), CENTROY(y, i, alto));
	}
	
	public void BuscarErrores() {

		if(opciones.length > filas) {
			System.out.println("Error: Hay mas Opciones que Filas");
		}
	}
}
