PImage rainbow;
PImage unicorn;
void setup(){
  rainbow = loadImage("rainbow.png");
  size(800,600);
  rainbow.resize(width,height);
  unicorn = loadImage("unicorn.png");
  unicorn.resize(width,height);
}
void draw(){
  background(rainbow);
  image(unicorn, mouseX-400, mouseY-300);
}
