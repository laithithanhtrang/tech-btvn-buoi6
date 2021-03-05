import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dev dev1 = new Dev();
		String id, name, email;
		float salary;
		int hour, bug;
	

		System.out.println("Nhap thong tin cua Tester: ");

		System.out.print("Nhap ma nhan vien: ");
		id = scanner.nextLine();
		System.out.print("Nhap ten: ");
		name = (scanner.nextLine());
		System.out.print("Nhap email: ");
		email = scanner.nextLine();
		System.out.print("Nhap luong: ");
		salary = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Nhap gio lam them: ");
		hour = scanner.nextInt();
		scanner.nextLine();

		dev1.setId(id);
		dev1.setName(name);
		dev1.setEmail(email);
		dev1.setSalary(salary);
		dev1.setOverTime(hour);

		dev1.display();
		System.out.println("Gio lam them: " + dev1.getOverTime());
		dev1.salaryDev();

		// tester
		Tester tester = new Tester();
		System.out.println("Nhap thong tin cua Tester: ");

		System.out.print("Nhap ma nhan vien: ");
		id = scanner.nextLine();
		System.out.print("Nhap ten: ");
		name = (scanner.nextLine());
		System.out.print("Nhap email: ");
		email = scanner.nextLine();
		System.out.print("Nhap luong: ");
		salary = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Nhap so luong bug: ");
		bug = scanner.nextInt();
		scanner.nextLine();

		tester.setId(id);
		tester.setName(name);
		tester.setEmail(email);
		tester.setSalary(salary);
		tester.setNumBug(bug);

		dev1.display();
		System.out.println("So luong bug: " + tester.getNumBug());
		tester.salaryTester();
		scanner.close();


	}
}
