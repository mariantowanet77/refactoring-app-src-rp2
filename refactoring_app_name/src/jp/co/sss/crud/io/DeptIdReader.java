package jp.co.sss.crud.io;
import java.util.Scanner;

public class DeptIdReader {
    public static int read() {
        Scanner scanner = new Scanner(System.in);
        int deptId;

        while (true) {
            System.out.print("部署IDを入力してください（1: 営業部, 2: 経理部, 3: 総務部）：");

            try {
                deptId = Integer.parseInt(scanner.nextLine());
                if (deptId >= 1 && deptId <= 3) {
                    break;
                } else {
                    System.out.println("部署IDは1〜3の数字で入力してください。");
                }
            } catch (NumberFormatException e) {
                System.out.println("1～3の数字で入力してください。");
            }
        }

        return deptId;
    }
}
