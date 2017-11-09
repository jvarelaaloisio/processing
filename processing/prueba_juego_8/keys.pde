void keyPressed(){
  if(key == CODED){
    if(keyCode == RIGHT){
       mover(jugador, 'x', 10);
    }
    if(keyCode == LEFT){
       mover(jugador, 'x', -10);
    }
    if(keyCode == UP){
       mover(jugador, 'y', -10);
    }
    if(keyCode == DOWN){
       mover(jugador, 'y', 10);
    }
  }
}

//void keyReleased(){
//  if(key == CODED){
//    if(keyCode == RIGHT||keyCode == LEFT)vx=0;
//  }
//}