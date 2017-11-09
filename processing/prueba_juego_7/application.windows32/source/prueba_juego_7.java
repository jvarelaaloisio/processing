import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class prueba_juego_7 extends PApplet {

int rects = 9, trash1 = 0;
boolean trash2;
rectangulo jugador = new rectangulo(375, 500);

float[][] lvl1 = new float[rects][4];
rectangulo[] nivel = new rectangulo[rects];



public void setup(){
  
  noStroke();
  lvl1 = new float[][]{ {0, height-25, width, 25}, {0, 0, 25, height}, {width-25, 0, 25, height}, {0, 350, 100, 250}, {500, 500, 100, 100}, {100, 500, 100, 100}, {600, 380, 100, 230}, {0, 275, 600, 50}, {200, 175, 600, 50} };

}

public void draw(){
  background(200);
  jugador.build(50, 50, 0xff000000);
  jugador.mover();
  for(int i=0; i<rects; i++){
    nivel[i] = new rectangulo(lvl1[i][0], lvl1[i][1]);
    nivel[i].build(lvl1[i][2], lvl1[i][3], 0xff101010);
    if(nivel[i].colision(jugador, 0)){        //colision Y desde arriba
      jugador.grav = false;
      jugador.vy = 0;
      jugador.y = nivel[i].y - jugador.al;
    } else jugador.grav = true;
    if(nivel[i].colision(jugador, 1)){        //colision Y desde abajo
      jugador.vy = 0;
      jugador.y = nivel[i].y + nivel[i].al;
    }
    if(nivel[i].colision(jugador, 2)){        //colision X desde izq
        jugador.x = nivel[i].x - jugador.an;
      jugador.vx = 0;
    }
    if(nivel[i].colision(jugador, 3)){        //colision X desde der
      jugador.x = nivel[i].x + nivel[i].an;
      jugador.vx = 0;
    }
  }
}


public void keyPressed(){
  if(key == 'R' ||key == 'r'){
    jugador.x = 375;
    jugador.y = 500;
    jugador.vy = 0;
    jugador.grav = true;
  }
  if(key == CODED){
    if(keyCode == RIGHT){
      jugador.vx = 8;
    }
    if(keyCode == LEFT){
      jugador.vx = -8;
    }
    if(keyCode == UP){
      if(jugador.vy == 0){
        jugador.vy = -15;
        jugador.grav = true;
      }
    }
  }
}

public void keyReleased(){
  if(key == CODED){
    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
  }
}
class rectangulo {
  float x, y, vx, vy, a=1, an, al;
  boolean grav = true;

  rectangulo(float tempX, float tempY) {
    x=tempX;
    y=tempY;
  }
  public void build(float ancho, float alto, int rgb) {
    fill(rgb);
    rect(x, y, ancho, alto);
    al = alto;
    an = ancho;
  }

  public void mover() {
    x= x + vx;
    if (grav) {
      vy= vy + a;
    }
    y= y + vy;
  }

  public boolean colision(rectangulo otro, int tipo) {
    boolean a = false, c = false;
    
    if(tipo <2) a = otro.x + otro.an >= x + 1 && otro.x <= x + an - 1;                        // le doy un valor a "a"
    else a= otro.y >= y - otro.al/2 && otro.y + otro.al <= y + al;
    
    boolean[] b = {otro.y + otro.al >= y - otro.vy && otro.y + otro.al <= y + otro.al/2,
                   otro.y <= y + al && otro.y >= y + al - otro.al/2,
                   otro.x + otro.an >= x && otro.x + otro.an <= x + otro.an/2,
                   otro.x <= x + an && otro.x >= x + an - otro.an/2
                  };            // le doy valores a "b"
    
    if (a && b[tipo]) {
      c = true;
    }
    return c;
  }
}
  public void settings() {  size(1280, 720); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "prueba_juego_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
