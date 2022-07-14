import java.util.Scanner;

class Calculate{
	Scanner scn=new Scanner(System.in);
	void calc(){
		System.out.println("enter the limit: ");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(n+" Factorial is: "+fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.calc();
		

	}

}
