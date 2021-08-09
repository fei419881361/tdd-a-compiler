package workshop;

import java.util.*;

/**
 * @author zhanglf
 * @Date 2021/7/4 9:08 下午
 */
public class WorkShopHelper {

    public static String generateNumberByLength(int length) {
        if (length >= 10 || length <= 0) {
            System.out.println("generate error number length:" + length);
            throw new RuntimeException("generate error number length:" + length);
        }

        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < length) {
            Random random = new Random();
            numberSet.add(random.nextInt(10));
        }
        StringBuilder sb = new StringBuilder();
        numberSet.forEach(sb::append);
        return sb.toString();
    }

    public static String judgeResult(String targetStr, String guessStr) {
        if (targetStr.length() != guessStr.length()) {
            System.out.println("judgeResult fail targetStr.length() != guessStr.length");
            throw new RuntimeException("judgeResult fail targetStr.length() != guessStr.length");
        }

        int aNumber = 0;
        int bNumber = 0;
        for (int i = 0; i < targetStr.length(); i++) {
            char t = targetStr.charAt(i);
            char g = guessStr.charAt(i);
            if (t == g) {
                aNumber++;
            } else {
                for (int j = 0; j < targetStr.length(); j++) {
                    if (targetStr.charAt(j) == g) {
                        bNumber++;
                    }
                }
            }
        }
       return aNumber + "A" + bNumber + "B";
    }
}
