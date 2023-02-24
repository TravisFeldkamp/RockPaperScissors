import java.util.Scanner;//import scanner

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//initialize scanner
        String playerA = "";//declare new variable for player A input
        String playerB = "";//declare new variable for player B input
        String YNResp = "";//variable for response to play again
        boolean done = false;//boolean for while part of loop
        String trash = "";//varibale for invalid input

        do {//do this block of code at least once then loop back if player says they want to play again

                System.out.println("Player A make your move R , P , or S");//output to user
                playerA = in.nextLine();//stores user input as playerA
                 while (!playerA.equalsIgnoreCase("r") && !playerA.equalsIgnoreCase("p") && !playerA.equalsIgnoreCase("s")){//if player does not input r,p,s run this block of code
                     System.out.println("That was a invalid input: " + playerA);//output to user for invalid input
                     System.out.println("Try again!");
                     playerA = in.nextLine();//clear the buffer
                 }

                System.out.println("Player B make your move R , P , or S");//output for player B to make a move
                playerB = in.nextLine();//store player B input
                while (!playerB.equalsIgnoreCase("r") && !playerB.equalsIgnoreCase("p") && !playerB.equalsIgnoreCase("s"))//if player does not input r,p,s run this block of code
                {
                    System.out.println("that was a invalid input: " + playerB);//output for invalid input
                    System.out.println("Try again!");
                    playerB = in.nextLine();//clear buffer
                }

                if (playerA.equalsIgnoreCase("R")) {//if player inputs R compare it to these
                    if (playerB.equalsIgnoreCase("R")) {//if both player enter R
                        System.out.println("You have tied");//output for tie
                    } else if (playerB.equalsIgnoreCase("P")) {//if player A inputs R and B inputs P
                        System.out.println("Paper beats rock Player B wins");// output for R vs P
                    } else if (playerB.equalsIgnoreCase("S")) {//if player B inputs S
                        System.out.println("Rock beats scissors, Player A wins");//output for R vs S
                    }
                } else if (playerA.equalsIgnoreCase("P")) {// if Player A inputs P compare it to all other possible inputs from player B
                    if (playerB.equalsIgnoreCase("P")) {//if player B inputs P
                        System.out.println("You have tied");//output for tie
                    } else if (playerB.equalsIgnoreCase("R")) {//if Player b inputs R
                        System.out.println("Paper beats rock Player A wins");//output for P vs R
                    } else if (playerB.equalsIgnoreCase("S")) {//if player B inputs s
                        System.out.println("Scissors beats paper , Player B wins");//output for P vs S
                    }
                } else if (playerA.equalsIgnoreCase("S"))// if player A did not choose r, or p but did s compare it to these
                    if (playerB.equalsIgnoreCase("S")) {//if player B input s
                        System.out.println("You have tied");//output for tie
                    } else if (playerB.equalsIgnoreCase("R")) {//if B input R
                        System.out.println("Rock beats scissors, Player B wins");//output for S vs R
                    } else if (playerB.equalsIgnoreCase("P")) {//if b input P
                        System.out.println("Scissors beats paper , Player A wins");//output for S v P
                    }




            System.out.print("would you like to play again Y or N: ");//output to user to play again
            YNResp = in.nextLine();//store response as string
            if (YNResp.equalsIgnoreCase("N")) {//if their response was N run this block
                done = true;//changes boolean to true, so program stops, if not program runs again
            }

        } while (!done);//loop while done is false


    }
}














