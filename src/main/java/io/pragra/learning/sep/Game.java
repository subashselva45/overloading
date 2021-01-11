package io.pragra.learning.sep;

public class Game {
    public String playGame(String player1){
        boolean win = Math.random()>0.5? true:false;
        return win? "Won": "defeat";
    }
    public String playGame(String player1,String player2){
        return Math.random()>0.5? player1:player2;
    }
    public String playGame(String player1, String player2, String player3){
        String winner = playGame(player1,player2);
        winner = playGame(winner,player3);
        return winner;
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.playGame("Green", "red"));
        

    }
}
