 int size=175;
 int x1 = 200;
 int x2 = 800;
int speed = 5;


 void setup(){
   size(1000,1000);
  
noFill();

 
}
void draw(){
  
  background(232,225,225);
   size = 175;
  for (int i=0; i<=10;i++){
    
ellipse(x1,200,size,size);
size-=20;
}
 size = 175;
for (int i=0; i<=10;i++){
    
ellipse(x2,200,size,size);
size-=20;
}
x1 += speed;
x2 -= speed;

if (x1 <= 0|| x1 >= width){
  speed*=- 1;
}
}
