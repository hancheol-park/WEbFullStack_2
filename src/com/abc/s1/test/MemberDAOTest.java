package com.abc.s1.test;

import com.abc.s1.member.MemberDAO;
import com.abc.s1.member.MemberDTO;

public class MemberDAOTest {
	public static void main(String[] args) {
		//web에서 메인메서드는 테스트용도로만 쓰임
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		memberDTO.setPw("pw1");
		
		try {
			memberDTO = memberDAO.login(memberDTO);
			
			System.out.println(memberDTO != null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
