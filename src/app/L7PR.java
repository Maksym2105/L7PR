package app;

import app.coffee.CoffeeOrderBoard;

public class L7PR {
    public static void main(String[] args) {

       CoffeeOrderBoard board = new CoffeeOrderBoard();

       board.add("Willy Wonka");
       board.add("Donald Duck");
       board.add("Jesse Pinkman");
       board.add("Thanos");

       board.draw();

       board.deliver();

       board.deliverByNum(3);

       board.draw();





    }
}