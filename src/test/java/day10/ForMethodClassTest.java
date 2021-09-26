package day10;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForMethodClassTest {

    @Test
    void test(){
        //given
        ForMethodClass forClass = new ForMethodClass();
        //when
        int result = forClass.CalculateSum(5);
        //then
        Assertions.assertThat(result).isEqualTo(15);
    }
}