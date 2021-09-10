package day3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class firstMyClassTest {
    @Test
    public void test(){
        //given
        firstMyClass firstMyClass = new firstMyClass();

        //when
        String name = firstMyClass.check("정콩");

        //then
        Assertions.assertThat(name).isEqualTo("정콩");
    }
}
