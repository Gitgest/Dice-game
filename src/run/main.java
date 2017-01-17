/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import games.Game;
import java.util.*;

/**
 *
 * @author Rasmus Edin Thomasen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int choice = 0;
        String name;
        Game games = new Game();

        System.out.print("Write thine name: ");
        name = sc.next();
        games.player.setName(name);
        while (running != false) { // ! reverses the logical statement, so here running = true;
            
            //runs a loop as long as running is true, if true becomes false the program ends.
            //contains try catch method to tell the player if they have given an invalid input.
            //contains switch with the 3 possible games. (switch 1)
            //case 4 terminates the program.
            //default tells the user it needs to input a value between 1 to 3 to play a game or 4 in case the user wants to terminate the program.1
            //each case of switch1 contains a game.playGame() method call and a while loop.
            //each case of switch1 contains a while loop, looping as long as loop1...3 is true.
            //loop1...3 each contains a switch which either calls on the same playGame1...3 or ends the loop.

            System.out.print("Hello " + games.player.getName() + " \nwrite a value from 1 to 3 to choose game\nTo end the program write 4: ");

            try { //try to catch if choice is anything other than a integer, if it is give a message.
                String input = sc.next();
                choice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Input has to be an integer");
            }

            switch (choice) {
                case 1:
                    boolean loop1 = true;
                    games.playGame1(games.player);
                    int inswitch = 0;
                    while (loop1 != false) {
                        System.out.println("Play again? 1=y, 2=n");
                        System.out.println("--------------------");
                        try { //try to catch if inswitch is anything other than a integer, if it is give a message.
                            String input2 = sc.next();
                            inswitch = Integer.parseInt(input2);
                        } catch (NumberFormatException ex) {
                            System.out.println("Input has to be an integer");
                        }
                        switch (inswitch) {
                            case 1:
                                games.playGame1(games.player);
                                break;
                            case 2:
                                loop1 = false;
                                break;
                            default:
                                System.out.println("Only values of 1 or 2");
                                break;
                        }
                    }
                    break;

                case 2:
                    games.playGame2(games.player);
                    inswitch = 0;
                    boolean loop2 = true;
                    while (loop2 != false) {
                        System.out.println("Play again? 1=y, 2=n");
                        System.out.println("---------------------");
                        try { //try to catch if inswitch is anything other than a integer, if it is give a message.
                            String input2 = sc.next();
                            inswitch = Integer.parseInt(input2);
                        } catch (NumberFormatException ex) {
                            System.out.println("Input has to be an integer");
                        }
                        switch (inswitch) {
                            case 1:
                                games.playGame2(games.player);
                                break;
                            case 2:
                                loop2 = false;
                                break;
                            default:
                                System.out.println("Only values of 1 or 2");
                                break;
                        }
                    }
                    break;

                case 3:
                    games.playGame3(games.player);
                    inswitch = 0;
                    boolean loop3 = true;
                    while (loop3 != false) {
                        System.out.println("Play again? 1=y, 2=n");
                        System.out.println("---------------------");
                        try { //try to catch if inswitch is anything other than a integer, if it is give a message.
                            String input3 = sc.next();
                            inswitch = Integer.parseInt(input3);
                        } catch (NumberFormatException ex) {
                            System.out.println("Input has to be an integer");
                        }
                        switch (inswitch) {
                            case 1:
                                games.playGame3(games.player);
                                break;
                            case 2:
                                loop3 = false;
                                break;
                            default:
                                System.out.println("Only values of 1 or 2");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Closing the program");
                    running = false;
                    break;

                default:
                    System.out.println("Only values between 1 and 4");
                    break;
            }
        }
    }
}
