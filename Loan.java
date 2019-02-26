import java.util.Scanner;

class LoanTest{
   public static void main(String[]args){
   
      Scanner userInput = new Scanner(System.in);
      Scanner s = new Scanner(System.in);
      
      Loan l = new Loan();
      
      l.setLoanAmount(0);
      l.setAnnualInterestRate(-1);
      l.setNumberOfYears(0);
      
}
}
   

public class Loan {
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private java.util.Date loanDate;

public Loan() {
this (2.5, 1, 1000);
}

public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
this.annualInterestRate = annualInterestRate;
this.numberOfYears = numberOfYears;
this.loanAmount = loanAmount;
}

public double getAnnualInterestRate() {
return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
try{ 
if(annualInterestRate <= 0){
throw new IllegalArgumentException("Annual interest rate cannot be less than 0");
}
}catch(IllegalArgumentException e){
System.out.println("Annual intrest rate cannot be less than 0");
}

this.annualInterestRate = annualInterestRate;
}

public double getNumberOfYears() {
return numberOfYears;
}

public void setNumberOfYears(int numberOfYears) {
try{ 
if(numberOfYears <= 0){
throw new IllegalArgumentException("Number of years cannot be less than 0");
}
}catch(IllegalArgumentException e){
System.out.println("Number of years cannot be less than 0");
}
this.numberOfYears = numberOfYears;
}

public double getLoanAmount() {
return loanAmount;
}

public void setLoanAmount(double loanAmount) {
try{ 
if(loanAmount <= 0){
throw new IllegalArgumentException("Loan amount cannot be less than 0");
}
}catch(IllegalArgumentException e){
System.out.println("Loan amount cannot be less than 0");
}

this.loanAmount = loanAmount;
}

public double getMonthlyPayment(){
double monthlyInterestRate = annualInterestRate / 1200;
double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
return monthlyPayment;
}

public double getTotalPayment() {
double totalPayment = getMonthlyPayment() * numberOfYears * 12;
return totalPayment;
}

public java.util.Date getLoanDate() {
return loanDate;
}
}