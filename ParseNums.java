// Jose Guzman
// September 17, 2023
// Description: BufferedReader, readLine() Example
// File name: ParseNums.java
// To Compile in terminal type: javac ParseNums.java
// To Run in terminal type: java ParseNums

import java.io.*; // needed to access input stream classes

public class ParseNums
{
  public static void main (String [] args)
  throws java.io.IOException // need this for readLine()
  {
    String s1;
    double num1;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a sentence: ");                 
    //               ^^^^^^^^^^^^^^^^^^ PROMPT 
    // Prompt is a message that tells the user what to enter
    s1 = br.readLine();

    System.out.println("The sentence you entered is: " + s1);

    System.out.print("Now enter a number: ");
    s1 = br.readLine();

    // s1 is a string, we cannot do math such as "s1 = s1*s5;"
    // to convert the string to an actual numeric value, 
    // you have to PARSE it

    num1 = Double.parseDouble(s1);
    System.out.print("Now " + num1 + 
                     " is converted into a double ...\n");

    System.out.println("...and we can do math with it 5* "+
                                         num1+"=" + num1*5);
  }
}

/*
javac ParseNums.java
java ParseNums   
Enter a sentence: five, six, seven, eight
The sentence you entered is: five, six, seven, eight
Now enter a number: 4 
Now 4.0 is converted into a double ...
...and we can do math with it 5* 4.0=20.0
*/