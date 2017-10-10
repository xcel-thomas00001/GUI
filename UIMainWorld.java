import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UIMainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class UIMainWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        testActors();
    }
    
    private void testActors()
    {
        Button button1 = new Button( 18, "+1", "button-blue.png", "button-green.png" );
        addObject( button1, 450, 50 );
    }
    
    
    
    
    
    
    
    
    
}
