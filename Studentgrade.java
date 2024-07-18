import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int n=sc.nextInt();
        int total=0;
        int[] sub=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the mark of subject "+(i+1));
            sub[i]=sc.nextInt();
            total+=sub[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("mark of subject "+(i+1)+" is "+sub[i]);
            
        }
        System.out.println("Total mark is "+total);
        double avg=(double)total/n;
        System.out.println("Average mark is "+avg);
        if(avg>=90)
            System.out.println("Grade is S");
        else if(avg>=80 && avg<90)
            System.out.println("Grade is A");
        else if(avg>=70 && avg<80)
            System.out.println("Grade is B");
        else if(avg>=60 && avg<70)
            System.out.println("Grade is C");
        else if(avg>=50 && avg<60)
            System.out.println("Grade is D");
        else if(avg>=40 && avg<50)
            System.out.println("Grade is E");
        else
            System.out.println("Grade is F...Failed");
    }
    
}
