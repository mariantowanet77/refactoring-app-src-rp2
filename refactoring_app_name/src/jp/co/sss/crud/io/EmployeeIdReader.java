package jp.co.sss.crud.io;

import java.util.Scanner;

public class EmployeeIdReader {
    public static int read() {
        Scanner scanner = new Scanner(System.in);
        int empId;

        while (true) {
            System.out.print("社員IDを入力してください：");
            try {
                empId = Integer.parseInt(scanner.nextLine());
                if (empId > 0) {
                    break;
                } else {
                    System.out.println("正の整数を入力してください。");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
            }
        }

        return empId;
    }
}
