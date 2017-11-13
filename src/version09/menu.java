package version09;
import processing.core.*;

public class menu {
	PApplet parent;
	float x, y, ancho, alto;
	int filas;
	String[] opciones;
	
	float CENTROY(float y, int i, float alto) {
		return(y + alto * i + alto*4/6);
	}
	float CENTROX(float x, float ancho, String info) {
		return(x+ (ancho - parent.textWidth(info))/2);
	}
	
	public menu(float temp_x, float temp_y, float temp_ancho, float temp_alto, int temp_filas, String[] temp_opciones, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto/temp_filas;
		filas = temp_filas;
		opciones = temp_opciones;
		BuscarErrores();
		genPos();
	}
	
	public void genPos() {
		for(int i=0; i<filas; i++) {
			dibujar(i,opciones[i], filas);
		}
	}
	
	public void dibujar(int i, String info, int filas) {
		float tamañoTexto = 100 /filas;
		if(tamañoTexto > 25) tamañoTexto = 25;
		parent.fill(50, 0, 50);
		parent.rect(x, y+alto*i, ancho, alto);
		parent.fill(255);
		parent.textSize(tamañoTexto);
		parent.text(info, CENTROX(x, ancho, info), CENTROY(y, i, alto));
	}
	
	public void BuscarErrores() {
		
		if(filas <= 0) {
			System.out.println("Error: La variable filas no puede ser <= 0");
		}
		if(opciones.length > filas) {
			System.out.println("Error: Hay mas Opciones que Filas");
		}
	}
}
