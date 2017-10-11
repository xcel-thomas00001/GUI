import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String message;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    private static final Color transparent = new Color(0, 0, 0, 0);
    
    public Label( int value, int fs )
    {
        this( Integer.toString(value), fs );
    }
    
    public Label( String value, int fs )
    {
        message = value;
        fontSize = fs;
        updateImage();
    }
    
    private void updateImage()
    {
        setImage( new GreenfootImage( message, fontSize, fillColor, transparent, lineColor ) );
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
