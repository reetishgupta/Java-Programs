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
                 double result;
         	 String op1="";
		 String op2="";
		 char operator='a'; 
		 for(int i=0;i<=enteredExpression.length()-1;i++)

		{
			char cc = enteredExpression.charAt(i);
		        //12+12+12
			if(cc == '*' || cc == '+' || cc=='-' || cc=='%' ){
				    prevOperator=operator;
				    operator = cc;
				    if(firstOperator==true) { 
				     op1 = calc(Double.parseDouble(op1),Double.parseDouble(op2),prevOperator) +"";
				     op2="";
				    } 
				    else { firstOperator=true; }
			   }
			     else { 
				   if(firstOperator==true){ op2+=cc;continue;}
				         else{op1+=cc;}					
				         }
		        }
		  }
	            result=cal(Double.parseDouble(op1),Double.parseDouble(op2),operator);
	            System.out.println("Result:"+result);
  }

	public static double calc(double op1,double op2,char operator){
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
		output=op1+op2;
		break;
		case '-':
		output=op1-op2;
		break;
		case '*':
		output=op1*op2;
		break;
		case '%':
		output=op1%op2;
		break;
		default:
		System.out.println("you have enter the invalid operator");
		}
		System.out.println(op1+" "+operator+" "+op2+" : "+output);
		return output;
	}
}
		
		

	
