package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Retrieving Player Names
        System.out.print("Player 1 enter your name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Player 2 enter your name: ");
        String player2Name = scanner.nextLine();

        // Game Set Up
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        Deck deck = new Deck();
        deck.shuffle();

        // Dealing Cards
        player1.getHand().deal(deck.deal());
        player1.getHand().deal(deck.deal());
        player2.getHand().deal(deck.deal());
        player2.getHand().deal(deck.deal());

        // Showing Score
        System.out.println("\nPlayer 1: " + player1.getName());
        player1.getHand().print();
        player1.addScore(player1.getHand().getValue());
        System.out.println("Score: " + player1.getScore() );
        System.out.println("\nPlayer 2: " + player2.getName());
        player2.getHand().print();
        player2.addScore(player2.getHand().getValue());
        System.out.println("Score: " + player2.getScore() );

        // Determining Winner
        System.out.println();
        if (player1.getScore() == player2.getScore()) {
            System.out.println("It's a tie!");
        } else if (player1.getScore() > player2.getScore() && player1.getScore() < 21) {
            System.out.println("Player 1 is the winner!");
        } else {
            System.out.println("Player 2 is the winner!");
        }
    }
}