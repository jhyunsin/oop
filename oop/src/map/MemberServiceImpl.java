package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



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
		return (map.containsKey(member.getId())) ? "중복된 아이디" : success(member);
	}

	public String success(MemberBean member) {
		map.put(member.getId(), member);
		return "가입성공";
	}		
	
	@Override
	public String login(MemberBean member) {
		//로그인
		String result = "";

		if (map.containsKey(member.getId())) {
		
			if ( findById(member.getId()).getPw().equals(member.getPw())) {
				
				result = "로그인성공";
			session = findById(member.getId());
			}else {
				result = "ID가 없습니다";
			}
			
		}
		return result;
	}

	@Override
	public MemberBean detail() {///session을 쓴다 아이디만 저장
		// TODO Auto-generated method stub
		return session;
	}

	@Override
	public void updatePw(MemberBean member) {//Id는 세션 Pw는 member
		// 비번 수정
			
	session.setPw(member.getPw());	
		map.put(session.getId(), session);
		
		
		
		
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
//		String result = "";
//		
//		if (session.getId().getPw().equals() ) {
//			map.remove(session.getId());	
//			result = "삭제완료";
//		} else {
//			result = "삭제불가";
//		}
//		
		map.remove(session.getId());
		session = null;
		return "삭제성공";
		
		
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		List<MemberBean> entryList = new ArrayList<MemberBean>();
			for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
								
																
			System.out.println();
			entryList.add((MemberBean) entry.getValue());
		}
	
		return entryList;

	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		List<MemberBean> list = new ArrayList<MemberBean>();
		
		for (String key : map.keySet()) {////foreach
			if (name.equals(map.get(key).getName())) {////////gender 즉 고정값이 앞에 온다
				list.add(map.get(key));
			}
			}
		
		return list;
	}

	@Override
	public int countByGender(String gender) {
		// TODO Auto-generated method stub
		int count = 0;
		for (String key : map.keySet()) {////foreach
		if (gender.equals(map.get(key).getGender())) {////////gender 즉 고정값이 앞에 온다
			count++;      
		}
		}		
		
		return count;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
		
	}

	

}
