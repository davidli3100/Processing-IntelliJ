import processing.core.PApplet;
import java.util.*;

/**
 * Created by David Li, Finished on Oct 4th, 2018
 * Created within the IntelliJ IDE, using Processing Core PApplet libraries
 * The code within public class Main (excluding void main) can run in any .PDE file
 */

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    int size = 800, x = 800, y = 600;
    public void settings() {
        size(x, y);
    }

    public void setup() {
        background(119, 176, 245);
        fill(28, 234, 92);
        strokeWeight(0);
        rect(0, y/2, x, y);

        //line in the middle
        strokeWeight(Float.parseFloat("0.2"));  // use Float.parseFloat in order to get decimal values for stroke width
        line(0, y/2, x, y/2);

        fill(252, 245, 0);
        arc(200, y/2, 120, 120, PI, 2*PI, OPEN);

        for(float linePos = PI; linePos < 2*PI; linePos += (PI/11)-0.002) {

            strokeWeight(0);
            arc(200, (float) ((y/2)-3),180, 180 , linePos, linePos+PI/80 );

        }

        //draw  the house rect
        fill(240, 97, 123);
        strokeWeight(1);
        stroke(0);
        rectMode(CENTER);
        rect(600, (y/2), 160, y/6);

        //draw the roof
        fill(0);
        triangle(510, (y/2)-y/12, 600, (y/2)-120, 690, (y/2)-y/12 );

        // drawing the door
        fill(255);
        strokeWeight(1);
        stroke(0);
        rectMode(CENTER);
        rect(600, y/2, 40, y/10);

        //drawing the door handle
        fill(0);
        ellipse(590,y/2, 7, 7);
    }
}
