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
      grav = false;
    }
  }
  

}