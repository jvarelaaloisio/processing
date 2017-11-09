int rects = 5;
rectangulo jugador = new rectangulo(375, 275);

float[][] lvl1 = { {0, 575, 800, 25}, {0, 400, 100, 200}, {500, 500, 100, 100}, {600, 500, 200, 100}, {700, 400, 100, 200} };
rectangulo[] nivel = new rectangulo[rects];



void setup(){
  size(800, 600);
  noStroke();

}

void draw(){
  background(200);
  jugador.build(50, 50, #000000);
  jugador.mover();
  for(int i=0; i<rects; i++){
    nivel[i] = new rectangulo(lvl1[i][0], lvl1[i][1]);
    nivel[i].build(lvl1[i][2], lvl1[i][3], #101010);
    nivel[i].colision(jugador);
  }

}


void keyPressed(){

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

void keyReleased(){
  if(key == CODED){
    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
  }
}