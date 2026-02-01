import java.util.Scanner;

public class input {
	public static void main(String args[]){

		System.out.print("Enter a age: ");
		Scanner sc=new Scanner(System.in);
		int data = sc.nextInt();

		System.out.print("Enter first name: ");
		//Scanner fn = new Scanner(System.in);
		String FirstName = sc.next();      //use of nextInt method 

		System.out.print("Enter last name: ");
		//Scanner sn = new Scanner(System.in);
		String LastName = sc.next();        // use of next method

		String fullname = FirstName +" "+LastName+" and "+" age is: "+data;
		System.out.println(fullname);

		System.out.print("True or False: ");
		//Scanner in =new Scanner(System.in);
		boolean info = sc.nextBoolean();

		String result = info+""+" is correct infornmation";
		System.out.println(result);


	}
} 