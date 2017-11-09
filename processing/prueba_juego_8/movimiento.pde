void mover(pj obj, char direccion, int pasos){
  if(direccion == 'x'){
    obj.construir( obj.pjx+pasos, obj.pjy);
  }
  else if(direccion == 'y'){
    obj.construir( obj.pjx, obj.pjy+pasos);
  }
}