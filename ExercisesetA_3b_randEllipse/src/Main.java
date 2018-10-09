/**
 * Created by David Li, Octover 4th
 * No Java classes/utils used, code within the Main class will run in a PDE environment
 *
 */

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public int x = 900;
    public int y = 900;
    public void settings() {
        size(x, y, P3D);
    }
    public void setup(){
        frameRate(5000); //because why not?
    }

    public void draw() {
        lights(); //makes stuff look better
        stroke(random(255), random(255), random(255)); //random strokes on the edges
        fill(random(255), random(255), random(255)); //fill with random colors
        ellipse(random(x), random(y),20, 20); //draw ellipses randomly

        //middle click on mouse for a surprise :)
        if(mousePressed) {
            translate(random(x), random(y), random(400));
            rotateX(radians(random(300)));
            rotateY(radians(random(300)));
            rotateZ(radians(random(300)));

            box(random(300));
        }
    }
}
