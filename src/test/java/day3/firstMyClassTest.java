package day3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class firstMyClassTest {
    @Test
    public void test(){
        firstMyClass firstMyClass = new firstMyClass();
        Assertions.assertThat(firstMyClass);
    }
}
