package version09;
import processing.core.*;

public class menu {
	PApplet parent;
	float x, y, ancho, alto;
	int filas;
	String[] nombres;
	opcion[] opciones;
	
	
	/*float CENTROY(float y, int i, float alto) {
		return(y + alto * i + alto*4/6);
	}
	float CENTROX(float x, float ancho, String info) {
		return(x+ (ancho - parent.textWidth(info))/2);
	}*/
	
	public menu(float temp_x, float temp_y, float temp_ancho, float temp_alto, int temp_filas, String[] temp_nombres, PApplet P) {
		parent = P;
		x = temp_x;
		y = temp_y;
		ancho = temp_ancho;
		alto = temp_alto/temp_filas;
		filas = temp_filas;
		nombres = temp_nombres;
		BuscarErrores();
		genselecs();
	}
	
	public void genselecs() {
		float tamañoTexto = 100 /filas;
		if(tamañoTexto > 25) tamañoTexto = 25;
		for(int i=0; i<filas; i++) {
			opciones[i] = new opcion(x, y + alto/filas*i, ancho, alto/filas, tamañoTexto, nombres[i], parent);
			opciones[i].dibujar();
		}
	}
	
	public void BuscarErrores() {
		
		if(filas <= 0) {
			System.out.println("Error: La variable filas no puede ser <= 0");
		}
		if(nombres.length > filas) {
			System.out.println("Error: Hay mas Opciones que Filas");
		}
	}
	
	/*public void update_selection() {
		if(posicion_en(x, y, ancho, alto)) {
			for(int i = 0; i < filas; i++) {
				if(posicion_en())
			}
		}
	}
	
	/*public boolean posicion_en(float X, float Y, float an, float al) {
		float m_x = parent.mouseX;
		float m_y = parent.mouseX;
		if(m_x >= X && m_x <= X+an){
			if(m_y >= Y && m_y <= Y+al){
				return true;
			}
		}
		return false;
	}*/
}
