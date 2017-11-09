int rects = 5;
float x, y, vx=0, vy=0, a=1;
float[] cordx = {width/2, 0, 0, 500, 700};
float[] cordy = {height/2, 575, 400, 500, 400};
float[] ancho = {50, width, 100, 100, 200};
float[] alto = {50, 25, 200, 100, 100};
piso[] nivel = new piso[rects];

void setup(){
  size(800,600);
  noStroke();
  y=height/2-25;
  x=width/2-25;
  

}

void draw(){
  background(200);
  x= x + vx;
  y= y + vy;
  vy= vy + a;
  
  //creo el nivel
  for(int i =0; i<rects; i++){
    nivel[i] = new piso(cordx[i], cordy[i], alto[i], ancho[i]);
    nivel[i].construir();
  }  if (y >= height-75) vy = 0;
  fill(200,0,0);
  rect(x,y,50,50);
}

void keyPressed(){
  if(key == CODED){
    if(keyCode == RIGHT){
      vx = 8;
    }
    if(keyCode == LEFT){
      vx = -8;
    }
    if(keyCode == UP){
      if(vy == 0) vy = -15;
    }
  }
}

void keyReleased(){
  if(key == CODED){
    if(keyCode == RIGHT||keyCode == LEFT)vx=0;
  }
}