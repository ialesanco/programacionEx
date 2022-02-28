public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorSocio gs = new GestorSocio();

		menu();
		int option = sc.nextInt();
		sc.nextLine();

		while (option != 6) {

			if (option == 1) {
			} else if (option == 2) {
			} else if (option == 3) {
			} else if (option == 4) {
			} else if (option == 5) {
			}
			menu();
			option = sc.nextInt();
			sc.nextLine();
		}
	}
	public static void menu() {
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3.  ");
		System.out.println("4. ");
		System.out.println("5. ");
		System.out.println("6. ");
	}
}
