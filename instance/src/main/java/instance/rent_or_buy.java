/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instance;

/**
 *
 * @author hp
 */
import java.util.Scanner;
  abstract  class rent_or_buy extends expense {
  int i=-1;
    
    Scanner input2= new Scanner(System.in);
    @Override
    void buy_or_rent_property() {
      while( i < 0){
        System.out.println();
        i++;
        }

      String choose[]={"1.rent","2.buy property"};
       System.out.println(" do your want to rent or purchase your  own property");
         int choice;
     do { 
        for(String chose:choose){
            System.out.println(chose);
        }
        choice=input.nextInt();
         
     } while (choice!=1 &&choice!=2);
     
    switch(choice){

     case 1:
     System.out.println(" enter the amount of your rent");
     double rent =input.nextDouble();
          store.add(rent);
      break;
     case 2:
      
     double deposit;

     System.out.println(" enter price of property");
      Double purchase_price_for_property=input.nextDouble();
    
      System.out.println(" do your have money for deposits((yes or no))");
      String choice2= input2.nextLine();

      while(choice2.equalsIgnoreCase("yes") && choice2.equalsIgnoreCase("no")){
        System.out.println(" the entered input is invalid please enter yes or no");
        choice2=input2.nextLine();
      }


     if(choice2.equalsIgnoreCase("yes")){
      System.out.println("how much will your like to deposits");
       deposit=input.nextDouble();
      
      }else{
        deposit=0;
      }

    System.out.println("enter the interest rate (percetage form) :");
     double interest_rate=input.nextDouble();
    System.out.println(" enter the number of years to repay the amount:(20-30 years)");
      Double years =input.nextDouble();


     Double  principal_amount=purchase_price_for_property-deposit;
      double r=interest_rate/12;
      double  n=years*12;
      Double  mothly_home_loan_repayments=principal_amount*(r*Math.pow(1+r,n)/(Math.pow(1+r, n)-1));

     System.out.println(" your monthly repayment = R" + mothly_home_loan_repayments);
       store.add(mothly_home_loan_repayments);


       if(mothly_home_loan_repayments>getmothly_income()*1/3){
        System.out.println(" the approval of the home loan is unlikely ! home loan repayments exceeds a third of your gross income!!try purachasing a smaller amount house");
       }

       break;

       default:

       System.out.println(" the value entered is invalid");

    }

   }
  
}
