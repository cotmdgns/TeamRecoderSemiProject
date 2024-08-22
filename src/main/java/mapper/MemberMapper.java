package mapper;

import java.util.ArrayList;
import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.damoim.model.dto.SearchDTO;

import org.apache.ibatis.annotations.Mapper;

import com.damoim.model.dto.MemberInfoDTO;
import com.damoim.model.dto.MemberListDTO;
import com.damoim.model.vo.Member;
import com.damoim.model.vo.Membership;




@Mapper
public interface MemberMapper {
	
	Member login(String id);
	
	ArrayList<MemberListDTO> loginMemberMembership(Member member);
	
	void signUp(Member member);
	
	Member idCheck(Member member);
	Member nicknameCheck(Member member);
	Member pwdCheck(Member member);	
	Member memberInfo(Member member);
	String grade(Member member);
	
	// 회원정보 업데이트 ===============================
	void updateMember(Member member);
	Member updateCheck(Member vo, Member mem);
	void updateMemberInfo(Member member);
	void addrUpdate(Member member);
	boolean nicknameDupCheck(Member vo);
	void fileDelete(String string);
	Member selectImg(String string);
	
	// 회원탈퇴 ======================================
	boolean memberStatus(Member member);
	void memberActBlock(MemberInfoDTO memberInfoDTO);
	
	
	
	// id 이메일 맞나 체크 =============================
	Member memberEmailIdcheck(Member member);
	
	// 업데이트
	void updatePassword(Member member);
	// 아래 2개 더미 비밀번호 암호화용도
	ArrayList<Member> dummyMember();
	void dummyUpdate(Member member);

}
