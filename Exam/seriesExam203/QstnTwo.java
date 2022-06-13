package seriesExam203;
import java.util.Scanner;

class ArrOp{
	
	void append() {
		
	}
	void insert() {
		
	}
	void Search() {
		
	}
	void List() {
		
	}
}

public class QstnTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		ArrOp fn=new ArrOp();
		
		System.out.println("enter size of array: ");
		int n=s.nextInt();
		s.nextLine();
		String arr[]=new String[n];
		
		
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLine();
		}
		
		System.out.println("elements of array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}