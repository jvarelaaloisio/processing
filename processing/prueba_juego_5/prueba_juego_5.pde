int rects = 7, trash1 = 0;
boolean trash2;
rectangulo jugador = new rectangulo(375, 275);

float[][] lvl1 = { {0, 575, 800, 25}, {0, 0, 25, 600}, {775, 0, 25, 600}, {0, 350, 100, 250}, {500, 500, 100, 100}, {100, 500, 100, 100}, {600, 380, 100, 230} };
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
    if(nivel[i].colisionY(jugador)){
      jugador.grav = false;
      jugador.vy = 0;
      jugador.y = nivel[i].y - jugador.al;
    } else jugador.grav = true;
    if(nivel[i].colisionXizq(jugador)){
      jugador.x = nivel[i].x - jugador.an;
      jugador.vx = 0;
    }
    if(nivel[i].colisionXder(jugador)){
      jugador.x = nivel[i].x + nivel[i].an;
      jugador.vx = 0;
    }
  }
}


void keyPressed(){
  if(key == 'R' ||key == 'r'){
    jugador.x = width/2 - 25;
    jugador.y = height/2 - 25;
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

void keyReleased(){
  if(key == CODED){
    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
  }
}