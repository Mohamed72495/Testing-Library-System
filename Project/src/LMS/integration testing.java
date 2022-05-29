package fine;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Zyad
 */
public class Fine {
    private String borrower;      
    private String book;
    
    private String issuer;
    private Date issuedDate;
    
    private Date dateReturned;
    private String receiver;
    
    private boolean finePaid;
       
    public Fine(String borrower, String book, String issuer, String receiver, Date issuedDate, Date rDate, boolean fPaid)  // Para cons.
    {
        borrower = this.borrower;
        book = this.book;
        issuer = this.issuer;
        receiver = this.receiver;
        issuedDate = this.issuedDate;
        dateReturned = rDate;
        
        finePaid = fPaid;
    }
     public double computeFine1()
    {

        //-----------Computing Fine-----------        
        double totalFine = 0;
        Date deadline = new Date(2022,6,5);
        double fine_per_day = 20.00;
        
        if (!finePaid)
        {    
            Date iDate = issuedDate;
            Date rDate = dateReturned;                

            long days = 0-ChronoUnit.DAYS.between(rDate.toInstant(), deadline.toInstant());        
            

            if(days>0)
                totalFine = days * fine_per_day;
            else
                totalFine=0;
        }
        return totalFine;
    }
    public double computeFine1Stub()
    {

        //-----------Computing Fine-----------        
        double totalFine = 0;
        Date deadline = new Date(2022,6,5);
        double fine_per_day = 20.00;
        
        if (!finePaid)
        {    
            Date iDate = new Date(2022,5,5);
            Date rDate = new Date(2022,6,25);                

            /*long days =  ChronoUnit.DAYS.between(rDate.toInstant(), iDate.toInstant());        
            days=0-days;*/

            long days = 0-ChronoUnit.DAYS.between(rDate.toInstant(), deadline.toInstant());

            if(days>0)
                totalFine = days * fine_per_day;
            else
                totalFine=0;
        }
        return totalFine;
    }
    
    public double payFine()
    {
        //-----------Computing Fine-----------//
        
        double totalFine = computeFine1Stub();
                
        if (totalFine >= 0)
        {
            System.out.println("\nTotal Fine generated: Rs " + totalFine);
            finePaid=  true;
        }
        else
        {
            System.out.println("\nNo fine is generated.");
            finePaid = true;
        }
return totalFine;        
    }
    public double payFineDriver()
    {
        //-----------Computing Fine-----------//
        
        double totalFine = computeFine1();                
        return totalFine;        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fine f = new Fine("Ali","100 steps","Zyad","Nada",new Date(2022,5,5),new Date(2022,6,25),false);
        f.payFine();
    }
    
}