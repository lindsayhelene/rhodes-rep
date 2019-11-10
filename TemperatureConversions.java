/* LHRHODES 11/10/19 
   This program converts temperature measurements between Celcius and Fahrenheit. Using a scanner, end user will 
   identify the temperature type they need converted. */

import java.util.Scanner; 

public class TemperatureConversions
{
   public static void main(String[] args)
   {
      double celcius;
      double fahrenheit;
      String input;
      char temperatureType;
      
      Scanner keyboard = new Scanner(System.in);
      
      /** identifies the type of temperature */
      System.out.print("Which temperature are you converting? (Use C for Celcius or F for Fahrenheit): ");
      input = keyboard.nextLine();
      temperatureType = input.charAt(0);
      
      /** initiates conversions based on user input */
      switch (temperatureType)
      {
         case 'c':
         case 'C':
            System.out.print("What is the temperature in celcius? ");
            celcius = keyboard.nextDouble();            
            calculateFahrenheit(celcius);
            break;
         case 'f':
         case 'F':
            System.out.print("What is the temperature in fahrenheit? ");
            fahrenheit = keyboard.nextDouble();
            calculateCelcius(fahrenheit);
            break;
         default:
            System.out.print("I'm sorry, that is an invalid temperature type.");
            break;
      }
   }
   
   /** calculate fahreneheit from celcius input */
   public static double calculateFahrenheit(double celcius)
   {
      double fahrenheit;
      
      fahrenheit = ((celcius * 1.8) + 32);
      System.out.printf("The temperature in Fahrenheit is %.0f", fahrenheit);
      System.out.printf(". ");
      return fahrenheit;
   }
   
   /** calculate celcius from fahrenheit input */
   public static double calculateCelcius(double fahrenheit)
   {
      double celcius;
      
      celcius = ((fahrenheit - 32) * .5556);
      System.out.printf("The temperature in Celcius is %.0f", celcius);
      System.out.printf(". ");
      return celcius;
   }
}
