class rectangulo{
  float x, y, vx, vy, a=1, an, al;
  boolean grav = true;
  
  rectangulo(float tempX, float tempY){
    x=tempX;
    y=tempY;
  }
  void build(float ancho, float alto, int rgb){
    fill(rgb);
    rect(x, y, ancho, alto);
    al = alto;
    an = ancho;
  }
  
  void mover(){
    x= x + vx;
    if(grav){
      vy= vy + a;
    }
    y= y + vy;
    if(y >= height-75){
      vy = 0;
      y = height-75;
    }
  }
  
  void colision(rectangulo otro){
    float dx=0, dy=0;
    if(x >= otro.x){
      dx = x - otro.x - otro.an;
      dy = y - otro.y - otro.al;
    }
    else if( x < otro.x){
      dx = otro.x - x - an;
      dy = otro.y - y - al;
    }
    if (dy <= 0 && dy > -20){
      if (dx <= 0 && dx > -20){
        otro.grav = false;
        otro.vy = 0;
        otro.y = y - otro.al;
      }
    }
  }
}