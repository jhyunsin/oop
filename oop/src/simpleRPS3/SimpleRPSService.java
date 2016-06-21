package simpleRPS3;//2버전은 impl 을 나눈다

import java.util.Random;

public interface SimpleRPSService {// 추상화 시키는 것
public abstract String playGame(int player);//바디 없다 자바문법 , 멀 지울지.. 생각의 영역
public abstract String getResult(String result);//내용(결과 " 컴 가위 나 보 이김)만 알려준다 


}
