package week1.assigment2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int Range=8, FirstNum=0, SecNum=1, Sum;
       System.out.println(FirstNum);
       
       for (int i=1; i<Range; i++) {
    	   Sum = FirstNum + SecNum;
    	   System.out.println(Sum);
    	   FirstNum  = SecNum;
    	   SecNum = Sum;
    	   System.out.println(FirstNum);
		
	}
	}

}
