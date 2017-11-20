package version09;
import processing.core.*;


public class main extends PApplet{
	
	//-----------------------------------------------------------------------------------------------------
	String[] sAtk = {"A", "B", "C", "D"};
	String[] sStats = {"vida: 20/20", "mana: 10/10"};
	String n_fondo = "fondo.jpg", n_botones="botones.png";
	//-----------------------------------------------------------------------------------------------------
	
	public static void main(String []args) {
		PApplet.main("version09.main");
	}
	
	int estado = 0;
	
	
	public void settings() {
		size(1280,720);
	}
	
	public void setup() {
		fill(100);
		noStroke();
	}
	
	public void draw() {
		switch(estado) {
		case 0:
			menu_Habilidades(sAtk);
		}
		
	}
	
	public void menu_Habilidades(String[] sAtk) {
		stroke(0);
		menu ataques = new menu(0, height*3/4, width/4, height/4, sAtk.length, sAtk, this);
		menu stats = new menu(width/4, height*3/4, width*3/4, height/4, sStats.length, sStats, this);
		textura fondo = new textura(n_fondo, 0, 0, width, height*3/4, this);
	}
	
	
	
	/*@Override
	public void keyReleased(){
		if(key == 'R' ||key == 'r'){
			
		}
		if(key == CODED){
		    if(keyCode == RIGHT){
		    	
		    }
		    if(keyCode == LEFT){
		    	
		    }
		    if(keyCode == UP){
		    	
		    }
		    if(keyCode == DOWN){
		    	
		    }
		}
	}
	
	/*public void keyReleased(){
	  if(key == CODED){
	    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
	  }
	}*/
}
