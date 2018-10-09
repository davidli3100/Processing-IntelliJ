import processing.core.PApplet;

/**
 * Exercise: arcs
 * Created by David Li, Oct 4th, 2018
 * Implementing proccessing.core.PApplet and standard Java libraries
 *
 * Changelog***
 * Oct 4th - init arcs, creating multicolors
 */

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    int x = 640;
    int y = 800;
    public void settings() {
        size(x, y);
    }

    public void setup() {

        //set background to white
        background(255);


        //time to make a lot of arcs
        // first big red arc underneath all the other ones
        strokeWeight(30);
        stroke(250,53,53);
        noFill();
        arc(x/2, y/2, 500, 500, PI, 2*PI);

        //make second green arc that sits ontop of red arc
        strokeWeight(21);
        stroke(53,250,123);
        arc((x/2), (y/2)-3, 500, 500, PI-radians(25), (2*PI)+radians(4));

        //purple arc that's on the 3rd "layer"
        strokeWeight(5);
        stroke(192,53,250);
        arc((x/2)+3, (y/2)-2, 485, 485, PI+radians(10), (2*PI)+radians(18));

        //yellow arc
        strokeWeight(25);
        stroke(215,250,53);
        arc((x/2)+3, (y/2)+25, 400, 400, PI-radians(10), (2*PI)-radians(10));

        //blue arc in the middle of nowhere
        strokeWeight(8);
        stroke(53,146,250);
        arc((x/2)+3, (y/2)-5, 400, 400, PI, (2*PI));

        //draw ellipses
        //yellow ellipse
        fill(215, 250,53);
        stroke(215, 250, 53);
        ellipse(x/2,(y/2)+200, 5, 5 );

        //blue ellipse
        fill(53, 146, 250);
        stroke(53, 146, 250);
        ellipse(x/2, (y/2)+150, 5, 5);

        //purple ellipse
        fill(192,53,250);
        stroke(192,53,250);
        ellipse(x/2, (y/2)+125, 5, 5);

        //red ellipse
        fill(250,53,53);
        stroke(250,53,53);
        ellipse(x/2, (y/2)+100, 5 ,5);

        //green ellipse
        fill(53,250,123);
        stroke(53,250,123);
        ellipse(x/2, (y/2)+96, 5, 5);

    }

    public void draw() {

    }
}
