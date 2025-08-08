package jp.co.sss.crud.io;

import java.util.Scanner;

public class EmployeeNameReader {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("名前を入力してください：");
            name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("名前は必須項目です。");
            } else if (name.length() > 20) {
                System.out.println("正しい名前を入力してください。");
            } else {
                break;
            }
        }

        return name;
    }
}

