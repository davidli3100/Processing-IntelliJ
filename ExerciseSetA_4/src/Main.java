/**
 * Created by David Li, On Oct 09
 * Utilizes a few variables  to control sizes
 */

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public int x = 400;
    public int y = 900;
    public void settings() {
        size(x, y);
    }
    public void setup(){
            
    }

    //a few variables to control sizing and positioning
    float y_increment_1 = 0;
    float x_increment_1 = 0;
    float y_increment_2 = y;
    float x_increment_2 = x/2;
    float size_1 = 15;
    float size_2 = 105;

    public void draw() {
        //draw the ellipses using the incrementing vars
        ellipse(x_increment_1, y_increment_1, size_1, size_1); 
        ellipse(x_increment_2, y_increment_2, size_2,size_2);

        // a lot of incrementation to turn a draw void into a for loop
        size_1+=0.2;
        y_increment_1+=1.2;
        x_increment_1++;
        x_increment_2+=0.2;
        size_2-=0.5;
        y_increment_2-=6.5;
    }
}
