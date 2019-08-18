import java.util.Scanner ;
class Calculator 
{
	public static void main(String[] args) 
	{
		double num1,num2;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the numeric expression");
		 String enteredExpression = scan.next();
		 System.out.println("You have entered "+enteredExpression);
boolean firstOperator = false;
boolean secondOperator = false;
		 for(int i=0;i<=enteredExpression.length();i++)

		{
			char cc = enteredExpression.charAt(i);
			String op1;
			String op2;
			String operator;  //12+12+12
			
			if(cc == '*' || cc == '+' || cc=='-' || cc=='%' ) 
			{
				isOperator = true;
				operator = cc;
				if(firstOperator==true) { secondOperator=true; 	op1 = calc(Double.parseString(op1),Double.parseString(op2),operator);					} 
				else { firstOperator=true; }
			}
			else if(cc=='\n') { result = calc(Double.parseString(op1,op2),operator);
			else { 
				if(firstOperator==true) op2+=cc;
				else op1+=cc;
				if(secondOperator==true){
					op1 = calc(Double.parseString(op1),Double.parseString(op2),operator);					
				}
		}

	}
	}

	public double calc(double op1,double op2,char operator){
		 System.out.println("enter first number"+op1);
		//num1=scan.nextDouble();
		System.out.println("enetr second number"+op2);
		//num2=scan.nextDouble();
		System.out.println("enter operators(+,-,*,%):");
		//char operator= (scan.next()).charAt(0);
		//scan.close();
		double output = 0;
		switch(operator)
		{
		case '+':
		output=num1+num2;
		break;
		case '-':
		output=num1-num2;
		break;
		case '*':
		output=num1*num2;
		break;
		case '%':
		output=num1%num2;
		break;
		default:
		System.out.println("you have enter the invalid operator");
		}
		System.out.println(num1+" "+operator+" "+num2+" : "+output);
		return output;
	}
}
		
		

	

