package day9;

import java.util.Objects;

public class MbitClass {

    public String SelectMbit(String mbti){
        switch (mbti) {
            case "INTP" : mbti ="백엔드형";
                    break;
            case "ENFJ" : mbti ="프론트엔드형";
                    break;
            case "INFJ" : mbti ="풀스택형";
                    break;
            case "ISTJ" : mbti ="퍼블리셔형";
                    break;
            case "ENTJ" : mbti ="아키텍쳐형";
                    break;
            case "ISFJ" : mbti ="보안전문가형";
                    break;
            case "INTJ" : mbti ="데이터분석가형";
                    break;
            case "ENFP" : mbti ="AI형";
                    break;
            case "ENTP" : mbti ="iOS형";
                    break;
            case "ESFJ" : mbti ="안드로이드형";
                    break;
            case "ESFP" : mbti ="게임 개발자형";
                    break;
            case "ESTP" : mbti ="IoT 개발형";
                    break;
            case "ESTJ" : mbti ="QA 형";
                    break;
            case "INFP" : mbti ="블록체인형";
                    break;
            case "ISTP" : mbti ="임베디드 개발자형";
                    break;
            case "ISFP" : mbti ="네트워크 개발자형";
        }
        return mbti;
    }

}
