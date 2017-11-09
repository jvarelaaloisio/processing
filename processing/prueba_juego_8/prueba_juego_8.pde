float x, y, vx=0, vy=0, a=1;

pj jugador = new pj(50, 50);

void setup() {
  size(800, 600);
  noStroke();
  y=height/2-25;
  x=width/2-25;
}

void draw() {
  background(200);
  fill(200, 0, 0);
  jugador.construir(x, y);
}