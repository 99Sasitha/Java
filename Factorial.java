import java.util.*;
class Factorial{
	public static void main(String[]args){

		Scanner scan=new Scanner(System.in);
		System.out.printf("Enter value: ");


		int x=scan.nextInt();
		int f=1;

		if(x==0){
			System.out.printf("Factorial Value of %d = 1",x);
		}

		else{

		for(int i=x;i>=1;i--){

			f=f*i;

		}

			System.out.printf("Factorial vlues of %d = "+f,x);
}
	
		}
}