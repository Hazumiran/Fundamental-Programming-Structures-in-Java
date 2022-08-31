package Addnum;


/**
*
* @author Diaz
*/

import java.io.*;
	public class AddNum {
		public int addNum(int numA, int numB) {
		return numA + numB;	
		
		}
		
		public static void main(String args[])throws IOException {
			AddNum obj = new AddNum();
			int sum = obj.addNum(10, 20);
			
			System.out.println("Sum Of 10 and 20 is" + sum);
		}
	}
