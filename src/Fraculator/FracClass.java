package Fraculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FracClass {

	public static void main(String[] args) throws IOException {
		BufferedReader initReader = new BufferedReader(new InputStreamReader(System.in));
		boolean menuLoopStop = false;
		do {
			System.out.println("Please, select one of the following options");
			System.out.println("1) Reduce Fraction");
			System.out.println("2) Perform Fraction Math");
			System.out.println("3) Exit");
			String options = initReader.readLine();
			int opt = Integer.parseInt(options);
			
			String wholenum;
			String numerator1;
			String denominator1;
			String wholenum2;
			String numerator2;
			String denominator2;
			int whole1=0;
			int num1 = 0;
			int den1 = 0;
			int whole2 = 0;
			int num2 = 0;
			int den2 = 0;
			int improp1;
			int improp2;
			int commonnum1;
			int commonnum2;
			int commonden;
			int improperFinalNum;
			
			if (opt == 1) {

				System.out.println("Reduce Fraction");
				boolean isvalid = false;
				while(!isvalid){
				System.out.println("Please, enter a whole number (Enter 0 if not needed)");

				wholenum = initReader.readLine();					

					whole1 = Integer.parseInt(wholenum);	
					isvalid = true;
				System.out.println("Please, enter your numerator");
				numerator1 = initReader.readLine();
				num1 = Integer.parseInt(numerator1);
				System.out.println("Please, enter your denominator");
				denominator1 = initReader.readLine();
				den1 = Integer.parseInt(denominator1);
				
				double answer = (((((double)whole1 * den1) + num1)/den1));  
				System.out.println("Decimal outputs is: " + answer);
				
				improp1 = ( (whole1 * den1) + num1);
				
				
				improperFinalNum = (improp1) ;

				commonden = (den1);
				
				
				String finalresult  = reducing(improperFinalNum, commonden);
				System.out.println(finalresult);
			
				
				
				System.out.println("What would you like to do next ? ");
				opt = Integer.parseInt(options);
				}
			} else if (opt == 2) {
				System.out.println("Perfrom Fraction Math");
				System.out.println("Please select which operation to perform");
				System.out.println("1) Add");
				System.out.println("2) Subtract");
				System.out.println("3) Multiply");
				System.out.println("4) Divide");
				System.out.println("5) Main Menu");
				System.out.println("6) Exit");
				String operations = initReader.readLine();

		

				int opts = Integer.parseInt(operations);
				switch (opts) {
				case 1:
					boolean valid=false;
					while(!valid){
					System.out.println("Please, enter a whole number (Enter 0 if not needed)");
//					boolean validwhole = false;

					wholenum = initReader.readLine();					

						whole1 = Integer.parseInt(wholenum);	
						valid=true;
//						if(whole1==0||whole1>0){
//						valid = true;

					}
					System.out.println("Please, enter your first numerator");
					numerator1 = initReader.readLine();
					num1 = Integer.parseInt(numerator1);
					System.out.println("Please, enter your first denominator");
					denominator1 = initReader.readLine();
					den1 = Integer.parseInt(denominator1);
					System.out.println("Please enter second whole number(Enter 0 if not needed)");
					wholenum2 = initReader.readLine();
					whole2 = Integer.parseInt(wholenum2);
					System.out.println("Please, enter your second numerator");
					numerator2 = initReader.readLine();
					num2 = Integer.parseInt(numerator2);
					System.out.println("Please, enter your second denominator");
					denominator2 = initReader.readLine();
					den2 = Integer.parseInt(denominator2);
					double answer = (((((double)whole1 * den1) + num1)/den1) + ((((double)whole2 * den2) + num2))/den2);  
					System.out.println("Decimal outputs is: " + answer);
					
					improp1 = (whole1 * den1);
					improp2 = (whole2 * den2);
					
					commonnum1 = ((improp1+num1) * den2) ;
					commonnum2 = ((improp2+num2 )* den1) ;
					commonden = (den1 * den2);
					
					improperFinalNum = (commonnum1 + commonnum2);
					
					
					//System.out.println(Finalmix + " " + Finalnum + "/" + commonden);
					
					String finalresult  = reducing(improperFinalNum, commonden);
					System.out.println(finalresult);
				
					
					
					break;
				case 2:
					System.out.println("Please, enter a whole number (Enter 0 if not needed)");
					wholenum = initReader.readLine();					
					whole1 = Integer.parseInt(wholenum);
					System.out.println("Please, enter your first numerator");
					numerator1 = initReader.readLine();
					num1 = Integer.parseInt(numerator1);
					System.out.println("Please, enter your first denominator");
					denominator1 = initReader.readLine();
					den1 = Integer.parseInt(denominator1);
					System.out.println("Please enter second whole number(Enter 0 if not needed)");
					wholenum2 = initReader.readLine();
					whole2 = Integer.parseInt(wholenum2);
					System.out.println("Please, enter your second numerator");
					numerator2 = initReader.readLine();
					num2 = Integer.parseInt(numerator2);
					System.out.println("Please, enter your second denominator");
					denominator2 = initReader.readLine();
					den2 = Integer.parseInt(denominator2);
					answer = (((((double)whole1 * den1) + num1)/den1) + ((((double)whole2 * den2) + num2))/den2);  
					System.out.println(answer);
					
					improp1 = (whole1 * den1);
					improp2 = (whole2 * den2);
					
					commonnum1 = ((improp1+num1) * den2) ;
					commonnum2 = ((improp2+num2 )* den1) ;
					commonden = (den1 * den2);
					
					improperFinalNum = (commonnum1 - commonnum2);
					
					
					
					finalresult  = reducing(improperFinalNum, commonden);
					System.out.println(finalresult);
					
					break;
				case 3:
					System.out.println("Please, enter a whole number (Enter 0 if not needed)");
					wholenum = initReader.readLine();					
					whole1 = Integer.parseInt(wholenum);
					System.out.println("Please, enter your first numerator");
					numerator1 = initReader.readLine();
					num1 = Integer.parseInt(numerator1);
					System.out.println("Please, enter your first denominator");
					denominator1 = initReader.readLine();
					den1 = Integer.parseInt(denominator1);
					System.out.println("Please enter second whole number(Enter 0 if not needed)");
					wholenum2 = initReader.readLine();
					whole2 = Integer.parseInt(wholenum2);
					System.out.println("Please, enter your second numerator");
					numerator2 = initReader.readLine();
					num2 = Integer.parseInt(numerator2);
					System.out.println("Please, enter your second denominator");
					denominator2 = initReader.readLine();
					den2 = Integer.parseInt(denominator2);
 answer = (((((double)whole1 * den1) + num1)/den1) + ((((double)whole2 * den2) + num2))/den2);  
					System.out.println(answer);
					
					improp1 = (whole1 * den1);
					improp2 = (whole2 * den2);
					
					commonnum1 = ((improp1+num1)) ;
					commonnum2 = ((improp2+num2 )) ;
					commonden = (den1 * den2);
					
					improperFinalNum = (commonnum1 * commonnum2);
					
			
					
					
					finalresult  = reducing(improperFinalNum, commonden);
					System.out.println(finalresult);
					break;
				case 4:
					System.out.println("Please, enter a whole number (Enter 0 if not needed)");
					wholenum = initReader.readLine();					
					whole1 = Integer.parseInt(wholenum);
					System.out.println("Please, enter your first numerator");
					numerator1 = initReader.readLine();
					num1 = Integer.parseInt(numerator1);
					System.out.println("Please, enter your first denominator");
					denominator1 = initReader.readLine();
					den1 = Integer.parseInt(denominator1);
					System.out.println("Please enter second whole number(Enter 0 if not needed)");
					wholenum2 = initReader.readLine();
					whole2 = Integer.parseInt(wholenum2);
					System.out.println("Please, enter your second numerator");
					numerator2 = initReader.readLine();
					num2 = Integer.parseInt(numerator2);
					System.out.println("Please, enter your second denominator");
					denominator2 = initReader.readLine();
					den2 = Integer.parseInt(denominator2);

					answer = (((((double)whole1 * den1) + num1)/den1) + ((((double)whole2 * den2) + num2))/den2);  
					System.out.println(answer);
					
					improp1 = (whole1 * den1);
					improp2 = (whole2 * den2);
					
					commonnum1 = ((improp1+num1) * den2) ;
					commonnum2 = ((improp2+den2)* num2) ;
					commonden = (den1 * num2);
					
					improperFinalNum = (commonnum1);
					
					
					finalresult  = reducing(improperFinalNum, commonden);
					System.out.println(finalresult);
					break;
				case 5:
					System.out.println("Main Menu");
					// }while(!menuLoopStop);
					break;
				case 6:
					System.out.println("Exit");
					menuLoopStop = true;
					break;
				}
			}

			else if (opt == 3)

			{
				System.out.println("Exit");
				menuLoopStop = true;
			} else {
				System.out.println("Please, select a valid number");

			}
		} while (!menuLoopStop);
	}
	public static String reducing(int num, int den){
	int numN = num;
	num = num/ gcd(num, den);
	 den = den/gcd(numN, den);
	 int finalnum = num%den;
	 int wholenum = num/den;
	String reduction = null;
		if(num%den != 0){
		 reduction = wholenum + " " + finalnum + "/" + den;

		}
		else{
			
			reduction = Integer.toString(wholenum) ;
		}
		return reduction;
				 
		
					
		}
			
	public static int gcd( int num , int den )
	{
	    if ( den == 0 )                        
	        return num;
	    else if ( num >= den && den > 0)
	        return gcd ( den , num % den );
	    else return gcd ( den , num );        // if x < y then go ahead and switch them around.
	}
	}

	
			
				
				
	
		
		
	

