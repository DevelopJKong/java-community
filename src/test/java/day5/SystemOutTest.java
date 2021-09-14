package day5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemOutTest {
    @Test
    void test() {
        //given
        SystemOut systemOut = new SystemOut();

        //when
        int resultAdd = systemOut.add(10,20);
        int resultSub = systemOut.sub(20,10);
        int resultMul = systemOut.mul(10,10);

        //then
        Assertions.assertThat(resultAdd).isEqualTo(30);
        Assertions.assertThat(resultSub).isEqualTo(10);
        Assertions.assertThat(resultMul).isEqualTo(100);

    }
}




