package Seleniumpackage;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD WELCOME TO JAVA FEATURE");
		
		//ARTHEMATIC OPERATORS IN JAVA
		int a=15;
		int b=10;
		//addition
		
		int add=a+b;
		System.out.println("the addition of " + a + "+" + b + "is:" +add);
		
		//subtraction
		int subtract=a-b;
		System.out.println("the subtraction of " +a+ "-" +b+ "is:" +subtract);
		
		//division
		int division=a/b;
		System.out.println("the division of " +a+ " / " +b+ "is:" +division);
		
		//modulas
		int modulas=a%b;
		System.out.println("the modulas of " +a+ "%" +b+ "is:" +modulas);
		
		//multiply
		int multiply=a*b;
		System.out.println("the multiply of " +a+ "*" +b+ "is:" +multiply);
		
		int increment = a;
        increment++;
        System.out.println("Increment: " + "a++ = " + increment);

        // Decrement
        int decrement = b;
        decrement--;
        System.out.println("Decrement: " + "b-- = " + decrement);
        
        System.out.println("\n---------------------------ASSIGNMENT OPERATORS----------------------------------------");
        int num1=20;
        //assignment operators
        num1+=5;
        System.out.println(num1);
        
        num1-=7;
        System.out.println(num1);

        num1/=5;
        System.out.println(num1);

        num1%=5;
        System.out.println(num1);

        num1*=4;
        System.out.println(num1);

        System.out.println("\n---------------------------COMPARISION  OPERATORS----------------------------------------");
        int n1=20;
        int n2=15;
        System.out.println("n1:"+n1+ "  n2:" +n2);
        if (n1==n2) {
        	System.out.println("n1 and n2 are equel");
        }else {
        	System.out.println("n1 and n2 are not equel");

        }
        System.out.println(n1==n2);
        System.out.println(n1!=n2);
        System.out.println(n1>n2);
        System.out.println(n1>=n2);
        System.out.println(n1<=n2);
        System.out.println(n1<n2);
        
        System.out.println("\n---------------------------LOGICAL OPERATORS----------------------------------------");
        boolean x=true;
        boolean y=false;
        System.out.println("the logical OR is "+ (x||y));
        System.out.println("the logical AND is "+(x&&y));
        System.out.println("the logical NOT is "+(!x));
       int b1=50;
       int b2=20;
        System.out.println("----LOGICAL OR----");
        System.out.println((b1>20)||(b2<20));
		System.out.println((b1==20)||(b2<=20));
		System.out.println(!((b1<=20)||(b2>=20)));
		
		System.out.println("----LOGICAL AND----");
		System.out.println((b1<=20)&&(b2>=20));
		System.out.println(!((b1<=20)||(b2>=20)));
		
		System.out.println("----LOGICAL NOT----");
		System.out.println(!((b1>=b2)&&(b1<=b2)));
		
        System.out.println("\n---------------------------CONDITIONAL OPERATORS----------------------------------------");
        int c1=20;
        int c2=50;
        System.out.println("\n-----IF ELSE CONDITION-----");
        if(c1<c2) {
            System.out.println("c1 is greater than c2"+c1);
            }else
            {
                System.out.println("c1 is lesser than c2"+c2);

            }
        System.out.println("\n----IF CONDITION----");
        int n11=12;
        int	n21=12;
        if(n11==n21) {
            System.out.println("n11 is and n21 are equal");

        }  
        
        System.out.println("\n-----IF ELSE IF LADDER------");
        int grade=85;
        if(grade>=90) {
            System.out.println("A+ grade");
        }else if(grade<=80){
            System.out.println("A grade");
            
        }else if(grade>=60){
        	System.out.println("B grade");
        }else if(grade>=50){
        	System.out.println("C grade");
        }else{
        	System.out.println("FAIL");
        }
        
        System.out.println("-----------------------------------SWITCH CASE---------------------------------------------");
        int s1=6;
        switch(s1) {
        	case 1:System.out.println("MONDAY");
        	break;
        	case 2:System.out.println("TUESDAY");
        	break;
        	case 3:System.out.println("WEDNESDAY");
        	break;
        	case 4:System.out.println("THURSDAY");
        	break;
        	case 5:System.out.println("FRIDAY");
        	break;
        	case 6:System.out.println("SATURDAY");
        	break;
        	case 7:System.out.println("SUNDAY");
        	default:System.out.println("CONDITION NOT MATCHED");
        }

		
	}

}
