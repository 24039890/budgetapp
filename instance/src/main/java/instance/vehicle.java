/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instance;

/**
 *
 * @author hp
 */
public class vehicle extends rent_or_buy{

  double deposts;
    public void vehicle(){
       int i=-2;    
      while( i < 0){
      System.out.println();
      i++;
      }
      System.out.println(" do  your want to buy a car( yes -no) :");
      String choice3=input1.nextLine();

      while (!choice3.equalsIgnoreCase("yes") && !choice3.equalsIgnoreCase("no")) {
        System.out.println(" VALUE ENTERED IS INVALID PLEASE 'YES' or 'NO':");
        choice3 = input.nextLine();
       }

    
      if(choice3.equalsIgnoreCase("yes")){

         String [] carmode_n_make={
                "1.Isuzu D-max-  R431 800",
                "2. 2023 Kia Rio - R289 000",
                "3.2023 chevrolet spart - R238000",
                "4.2023 ford fiesta-R204 000  ",
                "5.TOYOTA Vits -R189 9000  " 
                };
        Double [] carprice ={431800.00,289000.00, 238000.00,204000.00,204000.00,1899000.00};

              System.out.println(" CHOOSE WHICH CAR MODEL AND MAKE IS BEST FOR YOUR :");
              System.out.println();
             for(String car:carmode_n_make){
              System.out.println(car);
             }

         
           int choice4=input.nextInt();
           
           while(choice4< 1&& choice4>carprice.length){
               System.out.println("  the value entered  is invalid please choose what is in the menu (1-"+carprice.length+")");
               choice4=input.nextInt();
           }
          
            double purchasePrice =carprice[choice4];
            System.out.println(" your car purchase price = R" +purchasePrice);
           System.out.println("do your want to deposits(yes or no)");
           String deposits =input1.nextLine();
  
            
           if(deposits.equalsIgnoreCase("yes")){//check if the user want to make a deposts
             System.out.println(" how much do your want to deposits");
              deposts=input.nextDouble();
           }else if(deposits.equalsIgnoreCase("no")){
                deposts=0;
           }else{

          System.out.println("the intered input is invalid!!");
           }
            
           System.out.println(" enter the interest rate(percetage) :");
           double interest1=input.nextDouble();

           String [] premumAAmount={"0.lower premium( covers liability and collisions-R250)","1. medium (covers liability,collision and comprehesnsive(theft)  - R350)","2. advanced (covers everything (liability,collision,compreshensie,medical payments,uninsured motorist)-R600)"};
           Double []premiumprice={250.00,350.00,600.00};
           System.out.println("CHOOSE WHICH PREMIUM IS AFFORDABLE FOR YOUR AND YOUR CAR :");
           System.out.println();
           for(String y:premumAAmount){
            System.out.println(y);
           }

            int premiun2=input.nextInt();
            Double premium12=premiumprice[premiun2];
            store.add(premium12);
             final int years=5;

             while( i < 0){
              System.out.println();
              i++;
              }

            Double  principal_amount=purchasePrice-deposts;
            double r=interest1/12;
            double  n=years*12;
            Double  mothly_car_repayments=principal_amount*(r*Math.pow(1+r,n)/(Math.pow(1+r, n)-1));
                System.out.println(" your monthly repayment = R" +mothly_car_repayments);
                System.out.println(" your premium price amount = R" +premium12);
             store.add(mothly_car_repayments);
      
             } 

  }

  public void ADDexpense(){
    int i=-2;
    while( i < 0){
      System.out.println();
      i++;
      }

   double sum =0;
    for(Double x : store){
      sum += x;
    }
    System.out.println("  your  total expense = R"+ sum);
     if( sum>0.75*getmothly_income()){
       System.out.println(" total loan exceeds  75% of your gross monthly income");
       }
    Double money_leftDouble=getincome_left_after_tax_ded()-sum;

    if(money_leftDouble<0){

      System.out.println("  WARINING !!  your expenses  are to high greater than your income !!");
    }else if(money_leftDouble>0){
      System.out.println(" money left after all expenses is = R" +money_leftDouble);
    }
}
public void ascenndingorder(){

  Object [] escend=store.toArray();
for(int i =0 ;i<escend.length;i++){
  for( int j=0;j<escend.length-1;j++){

    if(((Comparable)escend[j]).compareTo( escend[j+1])<0){

      Object temp =escend[j];
      escend[j]=escend[j+1];
      escend[j+1]=temp;

    }

  }
}
 for( Object y : escend){
  System.out.println(y);
 }


}
}
    


