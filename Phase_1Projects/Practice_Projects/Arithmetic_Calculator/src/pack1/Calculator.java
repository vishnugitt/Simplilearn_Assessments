package pack1;

import java.util.Scanner;

public class Calculator 
{
	
			public static void main(String[] args)
			{
				char operator;
				double number1,number2,result;
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Choose an operator +,-,*,/,%");
				operator=sc.next().charAt(0);
				
				System.out.println("Enter the first number");
				number1=sc.nextDouble();
				
				System.out.println("Enter the second number");
				number2=sc.nextDouble();
				
				switch (operator) {
				
				case '+' : 
				{
					result=number1+number2;
					System.out.println(number1+"+"+number2+"="+result);
				}
				break;
				
				case '-' :
				{
					result=number1-number2;
					System.out.println(number1+"-"+number2+"="+result);
				}
				break;
				
				case '*' :
				{
					result=number1*number2;
					System.out.println(number1+"*"+number2+"="+result);
				}
				break;
				
				case '/' :
				{
					result=number1/number2;
					System.out.println(number1+"/"+number2+"="+result);
				}
				break;
				
				case '%' :
				{
					result=number1%number2;
					System.out.println(number1+"%"+number2+"="+result);
				}
				break;
				
				default :
				{
					System.out.println("Invalid operator");
				}
				break;
				}
				sc.close();
			}
	}
