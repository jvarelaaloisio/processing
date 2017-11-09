int rects = 9, trash1 = 0;
boolean trash2;
rectangulo jugador = new rectangulo(375, 500);

float[][] lvl1 = new float[rects][4];
rectangulo[] nivel = new rectangulo[rects];



void setup(){
  size(1280, 720);
  noStroke();
  lvl1 = new float[][]{ {0, height-25, width, 25}, {0, 0, 25, height}, {width-25, 0, 25, height}, {0, 350, 100, 250}, {500, 500, 100, 100}, {100, 500, 100, 100}, {600, 380, 100, 230}, {0, 275, 600, 50}, {200, 175, 600, 50} };

}

void draw(){
  background(200);
  jugador.build(50, 50, #000000);
  jugador.mover();
  for(int i=0; i<rects; i++){
    nivel[i] = new rectangulo(lvl1[i][0], lvl1[i][1]);
    nivel[i].build(lvl1[i][2], lvl1[i][3], #101010);
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


void keyPressed(){
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

void keyReleased(){
  if(key == CODED){
    if(keyCode == RIGHT||keyCode == LEFT)jugador.vx=0;
  }
}