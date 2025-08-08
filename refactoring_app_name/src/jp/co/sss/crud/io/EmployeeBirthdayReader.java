package jp.co.sss.crud.io;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeBirthdayReader {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        String birthday;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.setLenient(false);

        while (true) {
            System.out.print("生年月日を入力してください（yyyy/MM/dd）：");
            birthday = scanner.nextLine();

            try {
                sdf.parse(birthday);
                break;
            } catch (ParseException e) {
                System.out.println("正しい形式で入力してください（例：2001/07/25）");
            }
        }

        return birthday;
    }
}
