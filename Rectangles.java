import java.awt.*;
import java.applet.*;

import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;


/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/
public class Rectangles extends Applet 
{
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.black);
	}
	  
	public void paint(Graphics g) 
	{
		/*g.drawRect(20, 110, 50, 150);
      g.drawRect(70, 110, 90, 150);

      g.drawRect(90, 70, 110, 100);

      g.drawRect(10, 70, 20, 100);
      
      g.drawRect(30, 70, 40, 100);
	
      g.drawLine(20, 60, 50, 60);*/	
	
	
      g.drawLine(300, 500, 500, 500);
    g.drawLine(300, 620, 500, 620);
g.drawLine(400, 570, 500, 570);
g.drawLine(300, 500, 300, 620);
g.drawLine(400, 500, 400, 620);
g.drawLine(500, 500, 500, 620);



    
      g.drawLine(520, 500, 720, 500);
    g.drawLine(520, 620, 720, 620);
g.drawLine(600, 560, 720, 560);
g.drawLine(600, 500, 600, 620);
//g.drawLine(600, 500, 600, 620);
g.drawLine(720, 500, 720, 620);
g.drawLine(520, 500, 520, 620);




g.drawLine(520, 300, 720, 300);
    g.drawLine(720, 300, 1000, 300);
g.drawLine(720, 450, 1000, 450);
g.drawLine(520, 300, 520, 500);
g.drawLine(720, 300, 720, 500);
g.drawLine(800, 300, 800, 450);
g.drawLine(900, 300, 900, 450);
g.drawLine(1000, 300, 1000, 450);


    g.drawLine(520, 290, 780, 290);
g.drawLine(520, 150, 780, 150);
g.drawLine(800, 150, 1000, 150);

g.drawLine(800, 290, 1000, 290);
g.drawLine(520, 150, 520, 290);
g.drawLine(680, 150, 680, 290);
g.drawLine(780, 150, 780, 290);
g.drawLine(680, 150, 680, 290);
g.drawLine(780, 150, 780, 290);

g.drawLine(800, 150, 800, 290);
g.drawLine(1000, 150, 1000, 290);


g.drawLine(100, 300, 500, 300);
g.drawLine(100, 450, 300, 450);
g.drawLine(500, 300, 500, 500);
g.drawLine(300, 300, 300, 500);
g.drawLine(100, 300, 100, 450);


g.drawString("Administrator", 410, 520);
  
g.drawString("Room", 410, 540);

g.drawString("Open Space ",340, 350);

g.drawString("Garden", 340, 370);
g.drawString("HOD sir Cabin", 820, 200);



// input taking
Scanner in =new Scanner(System.in);
String[] source =new String[20];
System.out.println("Enter The current location");
source[1]=in.nextLine();

String[] destination =new String[20];

System.out.println("Enter The destination");
destination[1]=in.nextLine();

   if(source[1].equals("Administrator_Room") && destination[1].equals("HOD_cabin"))
     {   g.setColor(Color.pink); 

        g.drawLine(505, 500, 510, 295);
        g.drawLine(506, 500, 511, 295);
        g.drawLine(507, 500, 512, 295);
        g.drawLine(508, 500, 513, 295); 
        g.drawLine(510, 295, 800, 295);


	}
}
}