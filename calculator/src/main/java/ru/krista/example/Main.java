package ru.krista.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double num1 = 0, num2 = 0, rez = 0;
        char a;
        System.out.print("Vvedite dva chisla, pojalusta.\n");
        String str1 = in.nextLine();
        try{
            num1 =Integer.parseInt(str1);
        } catch (NumberFormatException e){
            System.out.println("Eto ne chislo.");            
            System. exit(0);
        }
        String str2 = in.nextLine();
        try{
            num2 =Integer.parseInt(str2);
        } catch (NumberFormatException e){
            System.out.println("Eto ne chislo.");            
            System. exit(0);
        }
      System.out.print("Vvedite deystvie, pojalusta.\n");
      a = in.next().charAt(0);
      in.close();
      switch(a) 
      {
         case '+': rez = num1 + num2;
            break;
         case '-': rez = num1 - num2;
            break;
         case '*': rez = num1 * num2;
            break;
         case '/': rez = num1 / num2;
         if (num2 == 0)
         {
            System.out.println("Na 0 delit nelza.\n");
            System. exit(0);
         }
            break;
         default:  System.out.printf("Eto ne deystvie.\n");
            return;
      }
      System.out.print("Rezultat:\n");
      System.out.printf(num1 + " " + a + " " + num2 + " = " + rez);
    }
}