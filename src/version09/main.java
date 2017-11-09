package version09;
import processing.core.*;


public class main extends PApplet{
	
	String[] sAtk = {"golpe", "frostball", "garrotazo", "tu mami"};
	String[] sStats = {"vida: 20/20", "mana: 10/10"};
	
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
		menu ataques = new menu(0, height-height/4, width/4, height/4, sAtk.length, sAtk, this);
		menu stats = new menu(width/4, height-height/4, width*3/4, height/4, sStats.length, sStats, this);
		ataques.genPos();
		stats.genPos();
	}
	
	/*
	@Override
	public void keyPressed(){
	  if(key == 'R' ||key == 'r'){
		  
	  }
	  if(key == CODED){
	    if(keyCode == RIGHT){
	      
	    }
	    if(keyCode == LEFT){
	    	
	    }
	    if(keyCode == UP){
	    	
	    }
	  }
	}

	public void keyReleased(){
	  if(key == CODED){
	    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
	  }
	}*/
}
