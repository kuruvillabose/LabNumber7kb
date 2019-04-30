package co.grandcircus;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
		
		public static void main(String[] srgs) {
			Scanner scan=new Scanner(System.in);
			
			String [] regExArr= {"[A-Z][a-z]*","[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9]+"
					+ "[.]\\w{2,3}","\\d{3}-\\d{3}-\\d{4}","(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}"};
			String [] inputArr= {"Name","email","phone number","date"};
			String prompt="Y";
			
			while(prompt.equalsIgnoreCase("Y"))
			{
			
			for(int i=0;i<4;i++) {
			System.out.println("Please enter a valid "+inputArr[i]);
			String name=scan.next();
			String nameValue=Validator(name,regExArr[i]);
			System.out.println(inputArr[i]+" is "+nameValue);
			}
			
			System.out.println("Validate more...(y/n)");
			prompt=scan.next();
			
			}
			System.out.println("Good Bye!!");
			scan.close();		
			
		   }
		  
			public static String Validator(String word,String RegEx) {
			   String msg="";
			   Pattern p=Pattern.compile(RegEx);
			   Matcher m=p.matcher(word);
			   boolean test=m.matches();
			   	   
			   if(test==true) 
				   msg="valid";
			   else 
				   msg="not valid";
			   return msg;
		    }

		}






		

