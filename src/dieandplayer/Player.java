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
public class Player { /*meant to create player objects which contain points- and  name instance fields */
    private String name;
    private int points;
    
    /* default constructor */
    public Player(){
        name="";
        points=0;
    }
    
    /*constructor for player objects*/
    public Player(String name) {
        this.name = name;
        points=0;
    }
    
    /*methods*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    /*toString method*/
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", points=" + points + '}';
    }
    
    
    
}
