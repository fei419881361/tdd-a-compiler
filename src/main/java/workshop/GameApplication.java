package workshop;

import java.util.Scanner;

/**
 * @author zhanglf
 * @Date 2021/7/4 10:46 下午
 */
public class GameApplication {
    private final static int GUESS_LENGTH = 4;

    public static void main(String[] args) {
        while (true) {
            System.out.println("猜数字开始，输入不重复的四个数字");
            Scanner scanner = new Scanner(System.in);
            String guessStr = scanner.nextLine();
            String targetStr = WorkShopHelper.generateNumberByLength(GUESS_LENGTH);
            System.out.println(WorkShopHelper.judgeResult(targetStr, guessStr));
            System.out.println("the current String is " + targetStr);
        }

    }
}
