package jp.co.sss.crud.io;

import java.util.Scanner;

public class EmployeeGenderReader {
    public static int read() {
        Scanner scanner = new Scanner(System.in);
        int gender;

        while (true) {
            System.out.print("性別(0:その他, 1:男性, 2:女性, 9:回答なし):");

            try {
                gender = Integer.parseInt(scanner.nextLine());
                if (gender == 1 || gender == 2 || gender == 0 || gender == 9) {
                    break;
                } else {
                    System.out.println("性別(0:その他, 1:男性, 2:女性, 9:回答なし)を選んでください。");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください（性別(0:その他, 1:男性, 2:女性, 9:回答なし)）。");
            }
        }

        return gender;
    }
}

