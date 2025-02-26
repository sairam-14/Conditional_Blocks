import java.util.Scanner;
class Digitornot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char x = sc.next().charAt(0);

		if((x>='0')&&(x<='9')){
			System.out.println("given character is digit");
		}else
		{
			System.out.println("given character is not a digit");
		}
	}
}
