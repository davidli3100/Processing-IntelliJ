/**
Created by David Li, October something
Mousefollow/create ellipse based on mouseX/mouseY
**/

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    //init settings
    public int x = 300;
    public int y = 900;
    public void settings() {
        size(x, y);
    }

    //draw void
    public void draw() {
        fill(255);
        stroke(0);
        ellipse(mouseX, mouseY, 50, 50); //draw ellipses by following mouse Pos
    }


}
