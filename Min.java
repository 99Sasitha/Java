import java.util.*;
class Min{
	public static void main(String[]args){
		int s[]={5,6,4,7,8};
		
			int min=s[0];
		for(int i=1;i<s.length;i++){
			if(s[i]<min){
				min=s[i];
			}	
			
	}
System.out.println("Min value= "+min);
	
		}
}