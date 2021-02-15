// Author: Michael Olvera
// Class: Object Oriented Programming
// Note:   Drawing an Oval in purple

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;
import java.awt.Window;


//rectangle class, look I really tried here to have 2 seperate classes for rectangles and ovals but I could not make both shapes show up at the same time, it was either one or the other :/
/* 
class Rect extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }
    Rect() {
        setColor(255,255,0);
    }
    Rect(int red, int green, int blue) {
        setColor(red,green,blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        
        g.setColor(myColor);
        g.fillRect(0,0,panelWidth,panelHeight);
    }
    
} */



//oval class, initializing colors and creating shapes
class Oval extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
        Color DARK_BLUE = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
        
    }

    Color DARK_BLUE = new Color(0,0,150);

    Oval() {
        setColor(255,0,0);
    }

    Oval(int red, int green, int blue) {
        setColor(red,green,blue);       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(DARK_BLUE);
        g.fillRect(0,0,panelWidth,panelHeight);

        g.setColor(myColor);
        g.fillOval(0,0,panelWidth,panelHeight);
       
    }
}

//I have said the word color too many times, it has now become a sound. See: Semantic Setiation
//Oval Frame, creates window size an handles closing. Pulls in shapes.
class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDrawPlus");
        setBounds(250,150,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        Oval myOval = new Oval(128,0,128);
        Container contentPane = getContentPane();
        contentPane.add(myOval);  

        

        

        

        
        
        
        
        

        
    }
}


public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("Starting OvalDrawPlus...");
        OvalFrame myFrame = new OvalFrame();
        
        //I could not get the WindowListener to initialize properly
        /* addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("");
                e.getWindow().dispose();
            }
        }); */


		myFrame.setVisible(true);
		// Note that if setVisible is called from the constructor, the oval will
        // not draw initially on MacOS. 
        
        
    }
}

