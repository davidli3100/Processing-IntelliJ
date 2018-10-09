/** 
* Created By David Li, Octover 9th
* Uses a few variables, if statements to control ellipse generation
*/

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public int x = 350, y = 700;
    float wx = 5, wy = y, wsize = 40, bx = 0, by = 0, bsize = 10;
    public void settings() {
        size(x, y, P2D);
    }
    public void setup(){

    }

    public void draw() {
        fill(255);
        stroke(0);
        strokeWeight(1);
        //spam groups of circles along the bottom
//        if(wy == y/2) {
            //draw last circle
//            ellipse(wx, wy, wsize, wsize);
//        } else if (wy < y/2) {
            //draw circles until the last one is reached
            ellipse(wx, wy, wsize, wsize);
            wx+=0.5;
            wy-=10;
            wsize-=1;
//        }


        // draw green line repeatedly over the circles that come
        strokeWeight(5);
        stroke(91,177,141);
        line(0,y/2,x,y/2);
    }
}
