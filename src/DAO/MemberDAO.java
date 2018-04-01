package DAO;

import java.util.List;

import DAO.Member;

import java.util.Date;
public interface MemberDAO{
	Member load(final Long id) throws Exception;

	public int delete(final Long id) throws Exception;

	public int update(final Member data) throws Exception;

	public long insert(final Member data) throws Exception;


	public List<Member> queryAll()throws Exception;



	public List<Member> queryByID(Long ID)throws Exception;
	public List<Member> queryByUname(String uname)throws Exception;
	public List<Member> queryByPas(String pas)throws Exception;

	}