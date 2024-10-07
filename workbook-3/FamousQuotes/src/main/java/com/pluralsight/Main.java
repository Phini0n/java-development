package com.pluralsight;

import java.util.Scanner;

public class Main {
    static String quotes[] = {
            "A tunnel is a cave with a light at the end. Just because it's dark it doesn't mean were underground. It often means that no one has bothered to turn on the lights. - Seth Godin, 9/10/16 blog post",
            "Time is a created thing. To say 'I don't have time,' is like saying, 'I don't want to.' - Lao Tzu",
            "History is merely a list of surprises. It can only prepare us to be surprised yet again. Please write that down. - Kurt Vonnegut's main character in Slapstick",
            "Things usually happen around us, not to us. - Unknown, found on Reddit",
            "Accept—then act. Whatever the present moment contains, accept it as if you had chosen it. Always work with it, not against it. Make it your friend and ally, not your enemy. This will miraculously transform your whole life. - Eckart Tolle",
            "I prefer to be true to myself, even at the hazard of incurring the ridicule of others, rather than to be false, and to incur my own abhorrence.",
            "Who can say if the thoughts you have in your mind as you read these words are the same thoughts I had in my mind as I typed them? We are different, you and I, and the qualia of our consciousnesses are as divergent as two stars at the ends of the universe.\n" +
                    "\u200B\n" +
                    "And yet, whatever has been lost in translation in the long journey of my thoughts through the maze of civilization to your mind, I think you do understand me, and you think you do understand me. Our minds managed to touch, if but briefly and imperfectly.\n" +
                    "\u200B\n" +
                    "Does the thought not make the universe seem just a bit kinder, a bit brighter, a bit warmer and more human?\n" +
                    "\u200B\n" +
                    "We live for such miracles.",
            "Success generally comes after you start. If you think success comes before you start, the world probably looks confusing to you. - Scott Adams",
            "How much time are you spending deciding what to spend time on? - Seth Godin",
            "If your why isn't big enough ...your excuses will be. "
    };

    public static void main(String[] args) {
        try {
            int numberChoice;
            System.out.print("Please choose a random number 1-10: ");
            Scanner scanner = new Scanner(System.in);
            numberChoice = scanner.nextInt();
            System.out.println(quotes[numberChoice]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
