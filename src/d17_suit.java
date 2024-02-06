//Day 17/366
//https://www.codewars.com/kata/5672a98bdbdd995fad00000f

import java.util.Objects;

public class d17_suit {
    public static String rps(String p1, String p2) {
        if (p1 == p2) {
            return "Draw!";
        } else if ((p1 == "scissors" && p2 == "paper") || (p1 == "paper" && p2 == "rock") || (p1 == "rock" && p2 ==
                "scissors")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}
