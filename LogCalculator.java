/**
* This Program runs a log calculator which the user can input the legnth of a log and it will 
* tell them how many logs it can hold
*
* @author Adam Linco
* @version 1.0
* @since   2020-02-13
*/
//Used to scan user input in this program
import java.util.Scanner;

public class LogCalculator {
  public static void main(String args[]) {
    
    //Creates  scanner object 
    Scanner userInput = new Scanner(System.in);
    
     double singleLog; 
     double numOfLogs;
     double logLength;
     int truckCapacity; 
     int  WeightofLog;
   
    //asks user to input their option ( in this case, log size)
    System.out.print("Enter log size in metres(Valid choices are ->): 0.25, 0.5, OR 1: ");
 
     truckCapacity = 1100;
     WeightofLog = 20;
    //Obtains option user inputed 
    logLength = userInput.nextDouble();
    //
    singleLog = logLength * WeightofLog;
    
    numOfLogs = truckCapacity/singleLog;
    //Gives out answer to user
    System.out.print("This truck can carry " + numOfLogs + " logs of " + logLength + "m.\n");
    
  }

}