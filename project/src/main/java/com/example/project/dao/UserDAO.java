package com.example.project.dao;

import com.example.project.dto.page.PageDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.project.dto.SchoolInfo;
import com.example.project.dto.UserDTO;

import java.util.List;

@Mapper
@Repository
public interface UserDAO {
	
	// 로그인 / 내정보
	public UserDTO getUserById(String id);
	
	// 아이디 중복체크
	public int getId(UserDTO userDTO);
	
	// 비밀번호 중복체크
	public int getpwd(UserDTO userDTO);
	
	// 회원가입
	public int insertUser(UserDTO userdto);
	
	// 회원정보 수정
	public int updateUser(UserDTO userDTO);
	
	//회원 탈퇴
	public void deleteUser(String id);
	
	// 이메일로 아이디값 받아오기
	public UserDTO findUserByUserId(String email);

	// 매칭된 아이디의 비밀번호 변경
	public void updateUserPassword(String id, String pwd);
	
	// 회원 인원수 반환
	public int memberTotalCnt();

	// 회원 목록 페이징 반환
	public List<UserDTO> selectMemberListPage(PageDto pageDto);

	//회원 학교 정보 얻기
	public SchoolInfo userInfo(String id);

	// 암호화된 비밀번호 가져옴
	public UserDTO getEncordpwd(String id);

	// 회원 리스트 삭제
	public int deleteMemberList(List<UserDTO> userDTOList);
}