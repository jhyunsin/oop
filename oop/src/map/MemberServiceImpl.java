package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * @date   : 2016. 6. 28.
 * @author : 신재현
 * @file   : MemberServiceImpl.java
 * @story   :
 */

public class MemberServiceImpl implements MemberService{

	Map<String,MemberBean> map; 
	MemberBean session;//로그인은 하나의 액션 메소드 하나 끝나면 죽는다 세션값이 null이냐 아니냐를 판단해서 다시 이어준다
	                  // 필드에 세션을 입력함으로서 로긴중을 유지해준다
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String,MemberBean>();
	}
	@Override
	public String join(MemberBean member) {
		// 1 회원가입
		String result="";
		
		if (map.containsKey(member.getId())) {
			result = "중복된아이디";
		} else {
			map.put(member.getId() ,member );
			result = "가입성공";
		}
	return result;	
	}
		
	
	@Override
	public String login(MemberBean member) {
		//로그인
		String result = "로그인실패";

		if ( map.get(member.getId()).getPw().equals(member.getPw())) {
			
			result = "로그인성공";
		}else {
			result = "ID가 없습니다";
		}
		return result;
	
	
	}

	@Override
	public MemberBean detail() {///session을 쓴다 아이디만 저장
		// TODO Auto-generated method stub
		return session;
	}

	@Override
	public void updatePw(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> findByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
		
	}

	

}
