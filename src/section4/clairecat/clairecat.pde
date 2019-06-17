int x=323;
int y=183;
int acceleration=5;
PImage catPic;
void setup (){
  size(800,500);
  catPic = loadImage("cat.jpg");
    catPic.resize(width,height);
  background(catPic);
}
void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
noStroke();
ellipse(x,y,50,50);
fill(250,0,0);
}
void keyPressed() {
x+=2*acceleration;
y+=2*acceleration;
}
