import java.util.Scanner;
class R{
	public static void main(String[]args){

		Scanner scan=new Scanner(System.in);

		System.out.println("Please Enter Your name: ");

		String s=scan.nextLine();

		char ch[] =s.toCharArray();



		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
}