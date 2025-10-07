import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean donePlaying = false;
        boolean doneMoveA = false;
        boolean doneMoveB = false;
        String playerA = "";
        String playerB = "";

        do {
            do {
                System.out.print("Enter your move player A [R P S]: ");
                playerA = in.nextLine();

                if(playerA.equalsIgnoreCase( "R") || playerA.equalsIgnoreCase( "P") || playerA.equalsIgnoreCase( "S") )
                {
                    playerA = playerA.toUpperCase();
                    doneMoveA = true;
                }
                else
                    System.out.println("Must be R P or S");
            }while(!doneMoveA);

            do {
                System.out.print("Enter your move player B [R P S]: ");
                playerB = in.nextLine();

                if(playerB.equalsIgnoreCase( "R") || playerB.equalsIgnoreCase( "P") || playerB.equalsIgnoreCase( "S") )
                {
                    playerB = playerB.toUpperCase();
                    doneMoveB = true;
                }
                else
                    System.out.println("Must be R P or S");
            }while(!doneMoveB);

            if(playerA.equals("R"))
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock: Its a tie!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Paper beats rock: Player B Wins!");
                }
                else //Player B must be S
                {
                    System.out.println("Rock beats scissors: Player A Wins!");
                }
            }else if(playerA.equals("P"))
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Paper beats rock: Player A Wins!!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Paper vs paper: Its a tie!");
                }
                else //Player B must be S
                {
                    System.out.println("Scissors beats paper: Player B Wins!");
                }
            }else //Player A must be S
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Rock beats scissors: Player B Wins!!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Scissors beats paper: Player a wins!");
                }
                else //Player B must be S
                {
                    System.out.println("Scissors vs scissors: Its a tie!");
                }
            }
            System.out.println("Are you done playing? [true false]: ");
            donePlaying = Boolean.parseBoolean(in.nextLine());
        }while(!donePlaying);
    }
}