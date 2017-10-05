import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    protected int fontSize;
    protected String first;
    protected String second;
    protected GreenfootImage text1;
    protected GreenfootImage text2;
    
    public Button( int fs, String message, String firstButton, String secondButton )
    {
        fontSize = fs;
        first = firstButton;
        second = secondButton;
        
        text1 = new GreenfootImage( message, fontSize, Color.WHITE, new Color(0, 0, 0, 0) );
        text2 = new GreenfootImage( message, fontSize, Color.BLACK, new Color(0, 0, 0, 0) );
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
