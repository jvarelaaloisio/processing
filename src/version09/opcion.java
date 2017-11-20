package version09;

import processing.core.*;

public class opcion {
	PApplet parent;
	float x, y, ancho, alto, tamañoTexto;
	boolean seleccionada = false;
	String texto;
	int id;
	
	public opcion(float temp_x, float temp_y, float temp_ancho, float temp_alto, int temp_id, float temp_tTexto, String temp_texto, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto;
		id = temp_id;
		tamañoTexto = temp_tTexto;
		texto = temp_texto;
	}

	float CENTROY() {
		return(alto*4/6);
	}
	float CENTROX() {
		return((ancho - parent.textWidth(texto))/2);
	}
	
	public int op_selec() {
		float m_x = parent.mouseX;
		float m_y = parent.mouseY;
		if(m_x >= x && m_x <= x+ancho){
			if(m_y >= y && m_y <= y+alto){
				if(parent.mouseButton == 37/*clic izq*/) return 2;
				else if(parent.mouseButton == 39/*clic der*/) return 3;
				else return 1;
			}
		}
		return 0;
	}
	public void dibujar() {
		int selec = op_selec();
		if(selec > 0) {
			if(selec == 2) parent.fill(100, 100, 100);
			else if(selec == 3) parent.fill(200, 50, 200);
		}
		else parent.fill(50, 0, 50);
		parent.rect(x, y, ancho, alto);
		parent.fill(255);
		parent.textSize(tamañoTexto);
		parent.text(texto, x + CENTROX(), y + CENTROY());
	}
}
