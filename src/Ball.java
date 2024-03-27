
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Ball {
    private int x;
    private int y;
    private int radius;
    private int red;
    private int green;
    private int blue;
    
    private int Screen_With;
    private int Screen_Height;
    
    private boolean isUp;
    private boolean isRight;
    
    private int step = 3;

    public Ball(int x, int y, int radius, int red, int green, int blue, int Screen_With, int Screen_Height, boolean isUp, boolean isRight) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.Screen_With = Screen_With;
        this.Screen_Height = Screen_Height;
        this.isUp = isUp;
        this.isRight = isRight;
    }

   

    public void move()
    {
        if(isUp)
        {
            this.y-= step;
            if(this.y <= 0)
                isUp = false;
        }
        else
        {
            this.y += step;
            if(this.y >= Screen_Height)
                isUp = true;
        }
        
        if(isRight)
        {
            this.x += step;
            if(this.x >= Screen_With)
                isRight = false;
        }
        else
        {
            this.x -= step;
            if(this.x <=0 )
                isRight = true;
        }
    }
    
    public void draw(Graphics g)
    {
        g.setColor(new Color(red,green,blue));
        g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
        g.setColor(Color.BLACK);
        g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    
}
