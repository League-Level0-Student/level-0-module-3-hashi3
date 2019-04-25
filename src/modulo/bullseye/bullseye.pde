void setup(){
  size(1000,1000);
  int size = 200;
       for(int i =0; i < 12; i++ ) { 
         //ellipse(400,400,size,size); 
  if(i % 2 == 0) {
    fill(229,71,39);    

  }
 
  else {
    fill(1,0,3);  
    
    
  } 
  ellipse(400, 400, size, size);
   size -= 20;
  
  
       }
    }

    void draw(){


    }
