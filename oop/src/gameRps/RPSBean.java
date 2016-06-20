package gameRps;

/**
 * @date   : 2016. 6. 20.
 * @author : hb2009
 * @file   : GameRpsBean.java
 * @story  : Iv paper rock sc result
 *     메뉴:  play result
 *    
  */
public class RPSBean {
private String play,comp;

public void setPlay(String play){
	this.play = play;
}
public void setComp(String Comp){
	this.comp = Comp;
}
public String getPlay(){
	return this.play;
}
public String getComp(){
	return this.comp;
}


@Override
public String toString() {
	return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
}
	
	
}
