package jp.co.sss.crud.io;

import java.util.Scanner;

public class MenuNoReader {
    public static int read(int maxOption) {
        Scanner scanner = new Scanner(System.in);
        int menuNo;

        while (true) {
            System.out.print("メニュー番号を入力してください（1〜" + maxOption + "）：");
            try {
                menuNo = Integer.parseInt(scanner.nextLine());
                if (menuNo >= 1 && menuNo <= maxOption) {
                    break;
                } else {
                    System.out.println("1〜" + maxOption + "の数字を入力してください。");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
            }
        }

        return menuNo;
    }
}
