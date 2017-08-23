import static java.lang.System.out;
import java.util.Scanner;

public class MailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name = "";
        String donation = "";
        boolean keepGoing = true;
        
        System.out.println("Thank You Letters");
        System.out.println("");
        
        while (keepGoing)
        {
            System.out.print("Please enter the donor's name. ");
            name = keyboard.nextLine();
            if (name.equals("quit")){
                keepGoing = false;
            } else {     
            
            System.out.print("Please enter the donation. ");
            donation = keyboard.nextLine();
                
                System.out.println("Dear " + name + ",");
                System.out.println("");
                System.out.println("Thank your for your donation!  We rely on donors like you to keep our");
                System.out.println("organization effective, and you came through for us.  Your donation of $" 
                + donation);
                System.out.println("will help our efforts to make a difference in the world.");
                System.out.println("");
                System.out.println("As you may know, we are a registered non-profit organization, so your");
                System.out.println("donation is tax deductible.  You may use this letter as a receipt for tax");
                System.out.println("purposes.");
                System.out.println("");
                System.out.println("Thanks you again for your support!");
                System.out.println("");
                System.out.println("Sincerely,");
                System.out.println("");
                System.out.println("Paula Jones");
                System.out.println("YourCharity.org");
            }    
        }    
    }
}
    
        
