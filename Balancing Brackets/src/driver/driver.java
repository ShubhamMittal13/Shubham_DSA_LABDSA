package driver;

import java.util.Scanner;

import service.BalancingBrackets;

public class driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		BalancingBrackets bb = new BalancingBrackets();
        if (bb.areBracketsBalanced(expr))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
        sc.close();

	}

}
