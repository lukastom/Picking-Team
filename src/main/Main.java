package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*input: X,Y
         • X = pool of people
         • Y = skip this number of people
        */
        String input = "10,3";

        String[] inputPieces = input.split(",");
        int numberOfPlayers = Integer.parseInt(inputPieces[0]);
        int skipPlayers = Integer.parseInt(inputPieces[1]);

        //Let us use Collections, iterate, output and remove.
        //Which Collection to use for reading? We need an index. I choose ArrayList.

        //Create players pool
        ArrayList<Integer> playersPool = new ArrayList<>();
        for (int i = 0; i<numberOfPlayers; i++){
            playersPool.add(i);
        }

        //Remove players, print removed
        int howManyRemoved;
        int offset = 0;
        Integer removed;

        while (playersPool.size() > 1) {
            howManyRemoved = 0;
            int remainingFields = numberOfPlayers - (numberOfPlayers - playersPool.size());

            for (int i = 0; i<remainingFields; i++){
                if ((i+1+offset)%skipPlayers == 0){
                    removed = playersPool.get(i-howManyRemoved);
                    playersPool.remove(i-howManyRemoved);
                    howManyRemoved ++;
                    System.out.print(removed + " ");
                }
            }
            offset = remainingFields-howManyRemoved-(howManyRemoved*(skipPlayers-1)-offset);

        }
        System.out.print(playersPool.get(0));

    }
}