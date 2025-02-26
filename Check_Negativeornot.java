import java.util.Scanner;
class Check_Negativeornot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(number<0){
			System.out.println("Given number is Negative");
		}else{
			System.out.println("Given number is Positive");
		}
	}
}
