package day9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MbitClassTest {

    @Test
    public void test(){
        //given
        MbitClass mbitClass = new MbitClass();

        //when
        String mbti = mbitClass.SelectMbit("INFJ");

        //then
        Assertions.assertThat(mbti).isEqualTo("풀스택형");

    }
}