package version09;
import processing.core.*;


public class main extends PApplet{
	menu ataques;
	public static void main(String []args) {
		PApplet.main("version09.main");
	}
	
	public void settings() {
		size(1280,720);
	}
	
	public void setup() {
		fill(100);
		//noStroke();
		ataques = new menu(0, height-height/4, width/4, height/4, 4, this);
	}
	
	public void draw() {
		ataques.genPos();
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
