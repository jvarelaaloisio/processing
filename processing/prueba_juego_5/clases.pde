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

  boolean colisionY(rectangulo otro) {
    boolean c = false;
    if (otro.y + otro.al >= y - otro.vy && otro.y + otro.al <= y + otro.al/2) {
      if ( otro.x + otro.an >= x + 1 && otro.x <= x + an - 1) {
        c = true;
      }
    }
    return c;
  }
  boolean colisionXizq(rectangulo otro) {
    boolean c = false;
    if (otro.y >= y - otro.al/2 && otro.y + otro.al <= y + al) {
      if ( otro.x + otro.an >= x && otro.x + otro.an <= x + otro.an/2) {
        c = true;
      }
    }
    return c;
  }
  boolean colisionXder(rectangulo otro) {
    boolean c = false;
    if (otro.y >= y - otro.al/2 && otro.y + otro.al <= y + al) {
      if ( otro.x <= x + an && otro.x >= x + an + otro.vx) {
        c = true;
      }
    }
    return c;
  }
}