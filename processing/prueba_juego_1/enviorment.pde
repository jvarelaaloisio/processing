class piso{
  float x, y, ancho, alto;
  
  piso(float cx, float cy, float al, float an){
    x = cx;
    y = cy;
    ancho = an;
    alto = al;
  }
  
  void construir(){
    fill(0);
    rect(x, y, ancho, alto);
  }  
}