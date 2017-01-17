/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;


/**
 *
 * @author Rasmus Edin Thomasen
 */
public class GameResult {
 /* Klassens formål er at kunne gemme resultatet, vinder og taber, for hvert spil 
    i et objekt for efterfølgende at kunne gemme disse til evt. data i en 
    statistisk analyse af playGame1, 2 & 3. Disse kunne eventuelt gemmes i en 
    ArrayLister af gameresult.getWinner for henholdsvis house og player for 
    derefter sammenligneArrayList.size().
    
    Kunne også indeholde en metode som public countPlayerWins(){}, hvis 
    formål var at tælle antallet af vundene spil hos player objektet.
    Kunne også indeholde en metode som public countHouseWins(){}, hvis 
    formål var at tælle antallet af vundene spil hos house objektet.
    
    Klassen indeholder default konstruktor, konstructer med String parametrene 
    winner loser samt getter, setter og toString metode. Klassen bør ikke 
    indeholde flere metoder.*/
    String winner;
    String loser;
    

    public GameResult() { //default constructor
        winner = "";
        loser = "";
    }

    public GameResult(String winner, String loser) { //contructor til GameResult objekter
        this.winner = winner; //getter og setter hvis værdier bestemmes ud fra spillets udfald
        this.loser = loser;
    }

    public String getWinner() { //bruges i oprettelse af GameResult objektet.
        return winner;
    }

    public void setWinner(String winner) { //sætter winner String til navnet på vinderen af spil runden
        this.winner = winner;
    }

    public String getLoser() {
        return loser;
    }

    public void setLoser(String loser) {
        this.loser = loser;
    }

    @Override
    public String toString() { //Ved dannelse af GameResult objekt gemmes udfaldet som en string til print i konsollen.
        return "Game result\n----------------\n" + "The winner is " + getWinner()+ " \nThe loser is " + getLoser()+"\n\n";
    }

}
