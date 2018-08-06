PImage mustache;
PImage friend;
void setup() {
friend = loadImage ("friend.png");
size(800, 800);
friend.resize (width,height);
mustache = loadImage ("mustache.png");
}
void draw() {
background(friend);
image(mustache, 265, 290);
}