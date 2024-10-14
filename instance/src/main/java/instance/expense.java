/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instance;

/**
 *
 * @author hp
 */
import java.util.*;

  abstract class expense extends inputclass {
    Scanner input1= new Scanner(System.in);

  abstract void buy_or_rent_property();
  
ArrayList<Double> store = new ArrayList<>();


   public void expense(){
    System.out.println();

    System.out.println("enter cash your spend on groceries :");
    Double groceries =input.nextDouble();
    System.out.println("enter the amount your spend  in water and electiricity :");
    double water_n_electricity =input.nextDouble();
     System.out.println("enter the emount  your travelling cost(petrol,trips n ect) :");
     double  travel_cost=input.nextDouble();
     System.out.println("enter amount  your spend  cellphone and telephone :");
     double cellphone_n_telephon=input.nextDouble();


   System.out.println("do your have other expenses beside the enterred above(YES OR NO) :");
     String check =input1.nextLine();

     while (!check.equalsIgnoreCase("yes") && !check.equalsIgnoreCase("no")) {
        System.out.println(" VALUE ENTERED IS INVALID PLEASE 'YES' or 'NO'!!:");
        check = input.nextLine();
    }


     if(check.equalsIgnoreCase("yes")){
        System.out.println(" enter the emount your spend on other expenses:");
       Double other =input.nextDouble();

       store.add(groceries);
       store.add(water_n_electricity);
       store.add(travel_cost);
       store.add(cellphone_n_telephon);
       store.add(other);
       
     }else if(check.equalsIgnoreCase("no")){

        store.add(groceries);
        store.add(water_n_electricity);
        store.add(travel_cost);
        store.add(cellphone_n_telephon);

     }
    
    
 
          
  }
    

 }

