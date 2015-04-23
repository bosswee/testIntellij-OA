package com.wee.oa.test;

import com.wee.oa.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestService {
	
	
		@Resource
		private SessionFactory sessionFactory;
		@Transactional
		public void addUsers() {
			
			
			sessionFactory.getCurrentSession().save(new User());
		
	
	
}
}
