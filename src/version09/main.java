package version09;
import processing.core.*;


public class main extends PApplet{
	
	//-----------------------------------------------------------------------------------------------------
	int id_ataques = 100, id_stats = 200;
	String[] sAtk = {"A", "B", "C", "D"};
	String[] sStats = {"vida: 20/20", "mana: 10/10"};
	String n_fondo = "fondo.jpg";
	static String n_botones="botones.png";
	//-----------------------------------------------------------------------------------------------------
	
	public static void main(String []args) {
		PApplet.main("version09.main");
	}
	
	int estado = 0, estado_mouse = 0;
	
	
	
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
		int at_selec, stats_selec;
		textura fondo = new textura(n_fondo, 0, 0, width, height*3/4, this);
		menu ataques = new menu(0, height*3/4, width/4, height/4, id_ataques, sAtk.length, sAtk, this);
		menu stats = new menu(width/4, height*3/4, width*3/4, height/4, id_stats, sStats.length, sStats, this);
		ataques.genselecs();
		stats.genselecs();
		fondo.dibujar();
		if(estado_mouse == 37) {
			at_selec = ataques.menu_selec();
			if(at_selec > 0) {
				System.out.print(at_selec);
			}
			stats_selec = stats.menu_selec();
			if(stats_selec > 0) {
				System.out.print(stats_selec);
			}
			estado_mouse = 0;
		}
	}
	
	public void mouseClicked() {
		estado_mouse = mouseButton;
	}
	/*
	@Override
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
