package mvcspring.service;


import org.springframework.stereotype.Service;

import mvcspring.dao.ValentineDao;
import mvcspring.model.*;

@Service
public class ValentineService {
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private ValentineDao valentinedao;
	public int createValentine(Valentine valentine)
	{
		System.out.println("servicee here");
		System.out.println(valentine);
		return this.valentinedao.saveValentine(valentine);
	}
}