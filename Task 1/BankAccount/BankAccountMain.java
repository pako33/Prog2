import java.util.*;


//Main Program


class BankAccountMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount tili1 = new BankAccount("", "", 0); //Constructor usage
		System.out.println("Input the account owner");
		tili1.set_nm(sc.nextLine());
		System.out.println("Input the account number");
		tili1.set_id(sc.nextLine());
		System.out.println("Input the account balance");
		tili1.set_bal(sc.nextDouble());
		tili1.print();
		System.out.println("Input withdrawal amount");
		tili1.withdraw(sc.nextDouble());
		tili1.print();
	}
}