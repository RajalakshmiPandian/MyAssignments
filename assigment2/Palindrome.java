package week1.assigment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=343;
  int temp=0;
  for ( ; num!=0; num=num/10);
  {
	  int remainder = num/10;
	  temp = temp*10+remainder;
  }
   if (temp == num)
   {
	   System.out.println("Palindrome");
  }
   else
   {
	   System.out.println("Not a Palindrome");
   }
		  
	}

}
