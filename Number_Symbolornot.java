import java.util.Scanner;
class Number_Symbolornot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		char number = sc.next().charAt(0);
		if((number>='0'&&number<='9')||(number>='A'&&number<='Z')||(number>='a'&&number<='z')){

			System.out.println("Given number is not a symbol");
		}else{
			System.out.println("Given number is a Sysmbol");
		}
		
	}
}
