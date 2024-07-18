import java.util.Scanner;
class BankAccount
{
    double balance=1000;
    
    public void deposit(double amt)
    {
        this.balance+=amt;
    }
    public void withdraw(double amt)
    {
        if(amt>this.balance)
        {
            System.out.println("Insufficent Balance");
        }
        else
        {
            this.balance-=amt;
        }
    }
    public void checkbalance()
    {
        System.out.println("Current balance is "+this.balance);
        
    }
}
public class Bankmain {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount obj=new BankAccount();
        while(true)
        {
            System.out.println("Enter choice\n1 for current balance\n2 for deposit\n3 for withraw \n4for exit");
        int n=sc.nextInt();
        
        double amount;
        switch (n) {
           
            case 1: obj.checkbalance();
           
            break;
            case 2:System.out.println("Enter amount to deposit");
            amount=sc.nextDouble();
            obj.deposit(amount);
            break;
            case 3:System.out.println("Enter amount to withdraw");
            amount=sc.nextDouble();
            obj.withdraw(amount);
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("invalid choice");
                break;
        }
    }
    
}
}
