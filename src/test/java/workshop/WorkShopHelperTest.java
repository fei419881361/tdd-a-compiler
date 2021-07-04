package workshop;


import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhanglf
 * @Date 2021/7/4 8:57 下午
 */
public class WorkShopHelperTest {

    @Test
    public void should_generate_legal_length() {
        assertThrows(RuntimeException.class, () -> WorkShopHelper.generateNumberByLength(11));
        assertThrows(RuntimeException.class, () -> WorkShopHelper.generateNumberByLength(0));
        assertThrows(RuntimeException.class, () -> WorkShopHelper.generateNumberByLength(-1));
    }

    @Test
    public void should_generate_number_by_length() {
        assertEquals(4, WorkShopHelper.generateNumberByLength(4).length());
    }

    @Test
    public void should_have_not_repeat_number() {
        Set<Character> set = new HashSet<>();
        String number = WorkShopHelper.generateNumberByLength(4);
        for (int i = 0; i < number.length(); i++) {
            set.add(number.charAt(i));
        }
        assertEquals(4, set.size());
    }


    @Test
    public void should_judge_legal_targetStr_and_guessStr() {
        String targetStr = "12345";
        String guessStr = "9876";
        assertThrows(RuntimeException.class, () -> WorkShopHelper.judgeResult(targetStr, guessStr));
    }


    @Test
    public void should_return_correct_number() {
        String targetStr = "1234";
        String guessStr = "9876";
        assertEquals("0A4B", WorkShopHelper.judgeResult(targetStr, guessStr));
    }


}
