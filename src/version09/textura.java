package version09;
import processing.core.*;

public class textura {
	PApplet parent;
	PImage textura;
	float x, y, ancho, alto;
	public textura(String n_textura, float temp_x, float temp_y, float temp_ancho, float temp_alto, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		alto = temp_alto;
		ancho = temp_ancho;
		textura = parent.loadImage(n_textura);
		dibujar();
	}
	
	public void dibujar() {
		parent.image(textura, x, y, ancho, alto);
	}

}
