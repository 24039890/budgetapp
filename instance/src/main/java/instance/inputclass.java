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


public  class inputclass {

Scanner input= new Scanner(System.in);

  private double mothly_income;
public double getmothly_income()
{
    return mothly_income;
}

private  double income_left_after_tax_ded;
public Double getincome_left_after_tax_ded()
{
     return income_left_after_tax_ded;
}

public void income(){
  System.out.println("****************BUDGET APP*************");

System.out.println("enter your gross monthly income :");
mothly_income=input.nextDouble();

System.out.println("enter your monthly tax deduction(in percetage form) :" );
double tax_deduction =input.nextDouble();
 
income_left_after_tax_ded=mothly_income-mothly_income* (tax_deduction/100);
System.out.println("money left after tax deduction = R"+income_left_after_tax_ded );

}
}

