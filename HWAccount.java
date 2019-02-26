import java.util.Date;
public class HWAccount {
   public static void main(String[] args){
   
      Account a1 = new Account(1234, 23.15, 0.4);
      Account a2 = new Account();
      Account a3 = new Account();
      Account a4 = new Account();
   
      a1.getId();
      a2.getBalance();
      a3.getAnnualInterestRate();
      a4.getDateCreated();
      
      System.out.println(a1.getId());
      
      System.out.println(a1.getBalance());
      
      System.out.println(a1.getAnnualInterestRate());
   
   }
}

class Account {
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated = new Date();
   
   Account(){
   }   
   
   Account(int id, double balance, double annualInterestRate){
      this.balance = balance;
      this.id = id;
      this.annualInterestRate = annualInterestRate;
   }
   int getId(){
      return id;
   }
   double getBalance(){
      return balance;
   } 
   double getAnnualInterestRate(){
      return annualInterestRate;
   }
   Date getDateCreated(){
      return dateCreated;
   }
   
  // double setBalance{
    //  return balance;
   //}

   public double getMonthlyInterestRate(){
      return annualInterestRate / 12;
   }

   public double getMonthlyInterest(){
      return balance * (annualInterestRate / 12);
   }

   public double withdraw(){
      return balance - 2500;
   }

   public double deposit(){
      return balance + 3000;
   }
}
