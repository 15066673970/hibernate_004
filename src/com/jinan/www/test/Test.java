package com.jinan.www.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jinan.www.entity.Employee;
import com.jinan.www.entity.Project;
import com.jinan.www.util.HibernateUtil;

/*
 * 多对多关联关系的配置
 * 同时建立了Project和Employee之间的双向多对多关联关系
 *  关联关系的维护由Project方来维护
 *  然后由Project方来进行级联操作
 */
public class Test {

	public static void main(String[] args) {
		
		Project project = new Project(1001,"项目一");
		Project project2 = new Project(1002,"项目二");
		Employee employee = new Employee(1,"张三");
		Employee employee2 = new Employee(2, "李四");
		
		//参加项目一的员工有张三和李四
		project.getEmployees().add(employee);
		project.getEmployees().add(employee2);
		
		//参加项目二的员工有张三
		project2.getEmployees().add(employee);
		
		
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.save(project);
		session.save(project2);
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		
		
		
		
	}
}
