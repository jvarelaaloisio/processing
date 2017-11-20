package version09;
import processing.core.*;

public class opcion {
	PApplet parent;
	float x, y, ancho, alto, tamañoTexto;
	boolean seleccionada = false;
	String texto;
	
	public opcion(float temp_x, float temp_y, float temp_ancho, float temp_alto, float temp_tTexto, String temp_texto, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto;
		tamañoTexto = temp_tTexto;
		texto = temp_texto;
	}
	
	public void dibujar() {
		/*int selec = seleccionada();
		if(selec > 0) {
			parent.fill(255, 255, 255);
			if(selec == 2) parent.fill(100, 100, 100);
			else if(selec == 3) parent.fill(200, 50, 200);
		}
		else */parent.fill(50, 0, 50);
		parent.rect(x, y, ancho, alto);
		parent.fill(255);
		parent.textSize(tamañoTexto);
		parent.text(texto, CENTROX(), CENTROY());
	}
	
	float CENTROY() {
		return(alto*4/6);
	}
	float CENTROX() {
		return(x+ (ancho - parent.textWidth(texto))/2);
	}

	/*public int seleccionada() {
		float m_x = parent.mouseX;
		float m_y = parent.mouseX;
		if(m_x >= x && m_x <= x+ancho){
			if(m_y >= y && m_y <= y+alto){
				if(parent.mousePressed) {
					if(parent.mouseButton == main.Mizq()) return 2;
					else return 3;
				}
				else return 1;
			}
		}
		return 0;
	}*/
}
