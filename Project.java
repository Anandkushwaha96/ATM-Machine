 
 
 import java.util.Scanner;
 class ATM {
    float Balance;
    int PIN=4567;


    public void Checkpin(){
  System.out.println("Enter Your Pin:");
  Scanner sc= new Scanner(System.in);
  int Enteredpin=sc.nextInt();
  if(Enteredpin == PIN){
      menu();
  }else {
    System.out.println("Invaild Pin Try Again");
  }
  Checkpin();
}
   public void menu(){
    System.out.println("Enter Your Choice :");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdraw Money ");
    System.out.println("3. Deposit Money ");
    System.out.println("4. Exit");
    System.out.println("choose your Option :");
    Scanner sc= new Scanner (System.in);
    int opt=sc.nextInt();
    if(opt==1){
        CheckBalance();
   }else if(opt == 2){
      WithdrawMoney();
   }else if(opt == 3){
      DepositMoney();
   }else if(opt == 4){
       return;
   }else{
     System.out.println("Invaild");
   }

    }
    public void CheckBalance(){
     System.out.println("your Balance:"+Balance );
     menu();
    }
 public void WithdrawMoney(){
    System.out.println("Enter Your Amount:");
    Scanner sc= new Scanner(System.in);
    float Amount=sc.nextFloat();
    if(Amount > Balance){
        System.out.println("Insficient Balance");
    }else {
        Balance= Amount - Balance;
       System.out.println("Withdrawn Successfuly"); 
       menu();

    }
    menu();
 }
    public void DepositMoney(){
        System.out.println("Enter the  Amount");
        Scanner sc= new Scanner(System.in);
        float Amount=sc.nextFloat();
        Balance= Balance + Amount;
        System.out.println("Money Deposit Is Sucessfully");
    }
}  
public class Project{
    public static void main(String[] args) {
        
        ATM obj= new ATM ();
        obj.Checkpin();
        obj.CheckBalance();
        obj.DepositMoney();
        obj.WithdrawMoney();
        //obj.Checkpin();
    }
}

