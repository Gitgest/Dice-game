/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieandplayer;


/**
 *
 * @author Rasmus Edin Thomasen
 */
public class Die {
    private int sides;
    private int value;
    
    /* default constructor */
    public Die(){
        sides=0;
    }
    
    /* constructor for Die objects */
    public Die(int sides){
        this.sides=sides;
    }
    
    public int throwDie(){
      int range = sides; //max possible value (or # of sides) on the die - the minimum value.
      value = (int)(Math.random()*range+1); //casts Math.random from double to integer because Math.random's signature is public static double random(), times the range, +1 to ensure there's no 0 value.
      return value;     
    }
    
    /* getter og setter metoder*/
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getValue() {
        return value;
    }
    
}
