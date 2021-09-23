package day9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MbitClassTest {

    @Test
    public void test(){
        //given
        MbtiClass mbitClass = new MbtiClass();

        //when
        String mbti = mbitClass.SelectMbit("INFJ");

        //then
        Assertions.assertThat(mbti).isEqualTo("풀스택형");

    }
}