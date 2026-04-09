package com.grey.app.professor;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorMapper professorMapper;
	
	public List<ProfessorDTO> list() throws Exception {
		return professorMapper.list();
		
	} 
	
	public ProfessorDTO detail(ProfessorDTO dto) throws Exception {
		return professorMapper.detail(dto);
		
	}
	
	public int create(ProfessorDTO dto) throws Exception {
		return professorMapper.create(dto);
		
	}
	
	public int update(ProfessorDTO dto) throws Exception {
		return professorMapper.update(dto);
	}
	
	public int delete(ProfessorDTO dto) throws Exception {
		return professorMapper.delete(dto);
		
	}

}
