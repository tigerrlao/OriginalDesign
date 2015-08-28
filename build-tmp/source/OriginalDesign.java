import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int time = 0;
int lasers = 0;
int dance = 0;
public void setup()
{
  size(500,500);
  background(0);
}
public void draw()
{
  stage();
  time = time + 1;
}

public void stage()
{
	while(lasers<15)
	{
		strokeWeight(3);
		stroke(255,0,0);
	    line(255,10,random(-2000,2000),random(500,750));
	    stroke(0,255,0);
	    line(255,10,random(-2000,2000),random(500,750));
	    fill(255,255,0);
	    noStroke();
	    ellipse(255,10,50,50);
	    lasers = lasers + 1;
	}
	dance = dance + 1;
	if(dance<30)
	{
		danceMan();
	}
	if(dance>=30)
	{
		danceMan2();
	}
	if(dance==60)
	{
		dance = 0;
	}
	if(time==30)
		{
			lasers = 0;
			background(0);
			noStroke();
			ellipse(255,10,50,50);
			time = 0;
		}
}

public void danceMan()
{
	strokeWeight(5);
	stroke(0,0,255);
	fill(0,190,255);
	//head
	ellipse(255,255,75,75);
	//body
	rect(215,300,75,100);
	//left leg
	rect(215,400,30,100);
	//right leg
	rect(260,400,30,100);
	//left arm
	beginShape();
	vertex(215,300);
	vertex(170,325);
	vertex(220,380);
	vertex(225,360);
	vertex(200,330);
	vertex(220,310);
	endShape(CLOSE);
	//right arm
	beginShape();
	vertex(290,300);
	vertex(225,380);
	vertex(235,390);
	vertex(300,310);
	endShape(CLOSE);

}
public void danceMan2()
{
	strokeWeight(5);
	stroke(0,0,255);
	fill(0,190,255);
	//head
	ellipse(255,275,75,75);
	//body
	rect(215,320,75,100);
	//left leg
	beginShape();
	vertex(215,420);
	vertex(205,460);
	vertex(215,500);
	vertex(235,500);
	vertex(235,460);
	vertex(245,420);
	endShape(CLOSE);
	//right leg
	beginShape();
	vertex(260,420);
	vertex(300,500);
	vertex(330,500);
	vertex(290,420);
	endShape(CLOSE);
	//left arm
	beginShape();
	vertex(215,320);
	vertex(170,345);
	vertex(220,400);
	vertex(225,380);
	vertex(200,350);
	vertex(220,330);
	endShape(CLOSE);
	//right arm
	beginShape();
	vertex(290,320);
	vertex(350,200);
	vertex(360,210);
	vertex(300,330);
	endShape(CLOSE);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
