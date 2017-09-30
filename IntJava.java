/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjava;

import java.util.*;

/**
 *
 * @author 3a
 */
public class IntJava {
 
     /**
     * Evaluates a Reverse Polish Notation (RPN) expression of integer values 
     * and returns the result.
     *
     * @param expression  An RPN expression
     * @return Result from evaluating given expression
     */
    public int parse(String expression)
    {
        String[] myArray = expression.split(" "); //myArray to get a single element and splitting white space 
        int a,b; //For pop operation 
        Integer c;
        Stack<String> myStack = new Stack<String>(); //Stack 
        for(String nextElement : myArray) //iterates through whole array string myArray
        {/**Check the token for operator and perform operation,add back to stack**/
            try{
                if(nextElement.equals("+")) { //Addition
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a+b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("/")) { //Division
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a/b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("*")) { //Multiplication
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a*b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("-")) { //Subtraction
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a-b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("&")) { //Bitwise AND 
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a&b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("|")) { //Bitwise inclusive OR 
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a|b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("^")) { //Bitwise exclusive OR 
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a^b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("%")) { //Modulus 
                    b = Integer.parseInt(myStack.pop());
                    a = Integer.parseInt(myStack.pop());
                    c = (a%b);
                    myStack.add(c.toString());
                }
                else if(nextElement.equals("~")) { //Bitwise Complement
                    a = Integer.parseInt(myStack.pop());
                    c = ~a;
                    myStack.add(c.toString());
                }
                else {
                        myStack.add(nextElement); //Normal value
                }

            }
       catch(NumberFormatException e)
           {
               System.out.println(e);
       }
   }
    return Integer.parseInt(myStack.pop()); //result - from the top of the stack

}
    
}
