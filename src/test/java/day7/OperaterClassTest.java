package day7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperaterClassTest {

    @Test
    void test(){
        //given
        FunctionMethodClass fm = new FunctionMethodClass();


        //when
        int sum = fm.sum(10,5);
        int sub = fm.sub(10,5);
        double mul = fm.mul(10,5);
        double div = fm.div(10,5);
        double per = fm.per(10,5);

        //then
        assertThat(sum).isEqualTo(15);
        assertThat(sub).isEqualTo(5);
        assertThat(mul).isEqualTo(50);
        assertThat(div).isEqualTo(2);
        assertThat(per).isEqualTo(0);

    }
}