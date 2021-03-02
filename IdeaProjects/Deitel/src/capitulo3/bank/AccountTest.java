package capitulo3.bank;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("José Bezerra", 50);
        Account account2 = new Account("Patrícia", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter deposit amount for account1: "); // prompt
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);


        System.out.printf("Enter deposit amount for account2: ");
        depositAmount = scanner.nextDouble();
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);
    }

    private static void displayAccount(Account account) {
        System.out.printf("%s,  balance: R$%.2f %n", account.getName(), account.getBalance());
    }
}
