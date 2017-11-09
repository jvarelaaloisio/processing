class pj{
  float pjx, pjy, ancho, alto;
  
  pj(float al, float an){
    ancho = an;
    alto = al;
  }
  
  void construir(float pjx, float pjy){
    fill(0);
    rect(pjx, pjy, ancho, alto);
  } }