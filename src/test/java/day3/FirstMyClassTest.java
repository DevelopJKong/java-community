package day3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMyClassTest {
    @Test
    public void test(){
        //given
        FirstMyClass firstMyClass = new FirstMyClass();

        //when
        String name = firstMyClass.check("정콩");

        //then
        Assertions.assertThat(name).isEqualTo("정콩");
    }
}
