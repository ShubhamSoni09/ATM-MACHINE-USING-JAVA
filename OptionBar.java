import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.io.IOException;
 
 
 
public class OptionBar extends Account {
  Scanner Input= new Scanner(System.in);
  DecimalFormat currencyFormat=new DecimalFormat("'$'###,##0.00");
 
 
  HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();
 
  public void LoginClass() {
    int x=1;
    do{
      try {
         data.put(10101, 30303);
         data.put(01010, 03030);
 
         System.out.println("Welcome to the ATM Project!");
         System.out.println("Enter your customer Number");
         setCustomerNumber(Input.nextInt());
 
         System.out.print("Enter your PIN Number: ");
         setPinNumber(Input.nextInt());
 
         }
         catch (Exception e) {
           System.out.println(e.getMessage()+"\n"+ "Invalid Character(s). Only Numbers."+"\n");
           x=1;
           getAccountType();
         }
      
         int cn=getCustomerNumber();
         int pn=getPinNumber();
         if(data.containsKey(cn) && data.get(cn)==pn){
             getAccountType();
         }else
         System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
 
    }while(x==1);
  }
 
  public void getAccountType(){
    System.out.println("------------------------------");
    System.out.println("Select the Account you Want to Access: ");
    System.out.println(" Type 1 - Checking Account");
    System.out.println(" Type 2 - Saving Account");
    System.out.println(" Type 3 - Exit");
    System.out.println("------------------------------");
 
    int selection= menuInput.nextInt();
 
    switch (selection) {
      case 1:
      getChecking();
      break;
 
      case 2:
      getSaving();
      break;
 
      case 3:
      System.out.println("Thank You for using this ATM, bye.  \n");
      break;
 
      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getAccountType();
    }
  }
 
  public void getChecking(){
    System.out.println("------------------------------");
    System.out.println("Checking Account: ");
    System.out.println(" Type 1 - View Balance");
    System.out.println(" Type 2 - Withdraw Funds");
    System.out.println(" Type 3 - Deposit Funds");
    System.out.println(" Type 4 - Exit");
    System.out.print("Choice: ");
    System.out.println("------------------------------");
 
    int selection = Input.nextInt();
 
    switch (selection) {
      case 1:
      System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
      getAccountType();
      break;
 
      case 2:
      getCheckingWithdrawInput();
      getAccountType();
      break;
 
      case 3:
      getCheckingDepositInput();
      getAccountType();
      break;
 
      case 4:
      System.out.println("Thank You for using this ATM, bye.");
      break;
 
      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getChecking();
    }
  }
 
 
  public void getSaving(){
    System.out.println("------------------------------");
    System.out.println("Saving Account: ");
    System.out.println(" Type 1 - View Balance");
    System.out.println(" Type 2 - Withdraw Funds");
    System.out.println(" Type 3 - Deposit Funds");
    System.out.println(" Type 4 - Exit");
    System.out.print("Choice: ");
    System.out.println("------------------------------");
 
    int selection = Input.nextInt();
 
    switch (selection) {
      case 1:
      System.out.println("Saving Account Balance: " + currencyFormat.format(getSavingBalance()));
      getAccountType();
      break;
 
      case 2:
      getsavingWithdrawInput();
      getAccountType();
      break;
 
      case 3:
      getSavingDepositInput();
      getAccountType();
      break;
 
      case 4:
      System.out.println("Thank You for using this ATM, bye.");
      break;
 
      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getChecking();
    }
  }
 
}
