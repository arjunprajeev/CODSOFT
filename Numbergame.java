import java.util.Scanner;
import java.util.Random;
public class Numbergame{
    public static void main(String[] args)
    {
        //System.out.println("hi");
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        boolean ch=true;
        int flag=1;
        //System.out.println("Enter a no"); 
        int chance=0; 
        System.out.println("-----------------------NUMBER GAME---------------------------------");
        System.out.println("Predict the generated number");
        while(ch)
        {
            int no=rand.nextInt(100);
            //System.out.println("Entered no is "+ no);
            while(chance<6)
            {
                System.out.println("Guess the number");
                int num=sc.nextInt();
                if(num==no)
                {
                    System.out.println("YOU WON");
                    flag=0;
                    break;
                }
                else if(num < no)
                {
                    System.out.println("too low");
                    chance++;
                }
                else
                {
                    System.out.println("too high");
                    chance++;   
                }
            }
            if(flag==1)
            {
                System.out.println("YOU LOSE");
            }
            
            System.out.println("Do you want to play again y/n");
            String choice=sc.next();
            if(choice.equals("y"))
            {
                ch=true;
                chance=0;
                flag=1;
            }
            else
            {
                System.out.println("---------------------THANK YOU FOR PLAYING-----------------");
                break;
            }
            

        }
    }
}