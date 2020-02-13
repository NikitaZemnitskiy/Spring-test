package com.example.demo;

import com.example.demo.boardRep.*;
import com.example.demo.*;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
@Slf4j
public class Application {

    public static void startChess() {
        Game game = new Game(StandartBoard.getStandartBoard());
        Scanner scanner = new Scanner(System.in);
        Position position1;
        Position position2;
        while (true) {
            game.getBoard().drow();
            try {
                String lastPosition = scanner.nextLine();
                position1 = new Position(lastPosition.charAt(0),Integer.parseInt(String.valueOf(lastPosition.charAt(1))));
                String newPosition = scanner.nextLine();
               position2 = new Position(newPosition.charAt(0),Integer.parseInt(String.valueOf(newPosition.charAt(1))));
            }
            catch (IllegalStateException e){
                System.out.println("Incorrect input");
                continue;
            }
                if (!game.makeTurn(position1, position2)){
                    System.out.println("Wrong turn");
                    continue;
                }

        }
    }

}
