class rectangulo {
  float x, y, vx, vy, a=1, an, al;
  boolean grav = true;

  rectangulo(float tempX, float tempY) {
    x=tempX;
    y=tempY;
  }
  void build(float ancho, float alto, int rgb) {
    fill(rgb);
    rect(x, y, ancho, alto);
    al = alto;
    an = ancho;
  }

  void mover() {
    x= x + vx;
    if (grav) {
      vy= vy + a;
    }
    y= y + vy;
  }

  boolean colision(rectangulo otro, int tipo) {
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