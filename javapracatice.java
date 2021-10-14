
public class javapracatice {

	public static void main(String[] args) {
		byte num1 = 55;
		int num2 = num1; //type casting into integer
		double num3 = 3.3d;
		int num4 = (int)num3; //narrowing  casting
		
		String javastr = "JAVA PRACTICE";
		String name = "Pratap";
		System.out.println("Widening Casting:"+num2);
		System.out.println("Narrowing Casting:"+num4);
		System.out.println("java string:"+javastr.indexOf("P"));
		

	}

}

//java typecasting
/*
 Widening casting: converting smaller data type to larger type size
 byte-> short-> char-> int-> long-> float-> double
 Narrowing casting --> opposite
 
 ///////////string
  * string.length()=to find the length of the string
  * string.toUpperCase() = to convert into upper case
  * string.toLowerCase() = to convert into lower case
  * String.indexOf() = to find the index of each  letters
  * 
  ////co0ncat
   *string1 + str2
   or 
   string1.concat(str2)
   
   \" inserts  single quote to the strings
   example:
    String txt = "It\'s alright";
    
    Six escape sequence :
    \n--> new line
    \r --> Carriage return
    \t--> tab
    \b --> Backspace
    \f--> Form feed
  * 
 
 
 */
