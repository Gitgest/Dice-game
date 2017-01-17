/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import dieandplayer.Die; //needed to acces methods and instanciate die and player objects.
import dieandplayer.Player;

/**
 *
 * @author Rasmus Edin Thomasen
 */
public class Game {

    GameResult gameresult = new GameResult();
    public Player player = new Player();
    private Player house = new Player("The house"); //java asks if it should be final, but that would mean the points value would be unable to change.

    public GameResult playGame1(Player player) {
        /* metode til det første spil */
        int playerPoints = player.getPoints();
        int housePoints = house.getPoints();
        Die die6 = new Die(6);

        /* player's throw*/
        for (int i = 0; i < 10; i++) {
            die6.throwDie();
            playerPoints = playerPoints + die6.getValue();
            
        }
        System.out.println("Your points: "+playerPoints);
        /* house's throw*/
        for (int i = 0; i < 10; i++) {
            die6.throwDie();
            housePoints = housePoints + die6.getValue();
        }
        System.out.println("The house's points: "+housePoints);

        if (playerPoints > housePoints) {
            gameresult.setWinner(player.getName());
            gameresult.setLoser(house.getName());
            System.out.print(gameresult);

        } else {
            gameresult.setWinner(house.getName());
            gameresult.setLoser(player.getName());
            System.out.print(gameresult);
            /* insert counter on win */
        }

        return gameresult;
    }

    /* metode til det andet spil, bruger ( x % 2 == 0) til udregning af lige tal */
    public GameResult playGame2(Player player) {
        int playerPoints = player.getPoints(); 
        int housePoints = house.getPoints();
        Die die12 = new Die(12);
        Die die24 = new Die(24);
        /* for-loop for the player*/
        for (int i = 0; i < 5; i++) {
            die12.throwDie();
            die24.throwDie();
            playerPoints = playerPoints + die12.getValue() + die24.getValue();
        }
        if (playerPoints % 2 == 0) {
            playerPoints = playerPoints * 2;
        }
        System.out.println("Your points: "+playerPoints);
        /*for loop for the house*/
        for (int i = 0; i < 10; i++) {
            die12.throwDie();
            die24.throwDie();
            housePoints = housePoints + die12.getValue() + die24.getValue();
        }
        if (housePoints % 2 == 0) {
            housePoints = housePoints * 2;
        }
        System.out.println("The house's points: "+housePoints);
        if (playerPoints > housePoints) {
            gameresult.setWinner(player.getName());
            gameresult.setLoser(house.getName());
            System.out.print(gameresult);
        } else {
            gameresult.setWinner(house.getName());
            gameresult.setLoser(player.getName());
            System.out.print(gameresult);
            /* insert counter on win */
        }
        return gameresult = new GameResult(gameresult.getWinner(), gameresult.getLoser());
    }

    /* metode til det tredje spil */
    public GameResult playGame3(Player player) {
        int playerPoints = player.getPoints();
        int housePoints = house.getPoints();
        Die die6 = new Die(6);
        Die die12 = new Die(12);
        Die die10 = new Die(10);

        /* for-loop for the player, throw 6 sided die, if die.getvalue <=3, throw D12, else throw D10*/
        for (int i = 0; i < 1; i++) {
            die6.throwDie();
            if (die6.getValue() <= 3) {
                die12.throwDie();
                playerPoints = die6.getValue() + die12.getValue(); //both point values
            } else {
                die10.throwDie();
                die10.getValue();
                playerPoints = die6.getValue() + die10.getValue(); //both point values
            }
        }
        System.out.println("Your points: "+playerPoints);
        /*for loop for the house*/
        for (int i = 0; i < 1; i++) {
            die6.throwDie();
            if (die6.getValue() <= 3) {
                die12.throwDie();
                housePoints = die6.getValue() + die12.getValue(); //both point values
            } else {
                die10.throwDie();
                die10.getValue();
                housePoints = die6.getValue() + die10.getValue(); //both point values
            }
        }
        System.out.println("The house's points: "+housePoints);
        if (playerPoints < housePoints) {
            gameresult.setWinner(player.getName());
            gameresult.setLoser(house.getName());
            System.out.print(gameresult);
        } else {
            gameresult.setWinner(house.getName());
            gameresult.setLoser(player.getName());
            System.out.print(gameresult);
        }
        return gameresult = new GameResult(gameresult.getWinner(), gameresult.getLoser());

    }

}
