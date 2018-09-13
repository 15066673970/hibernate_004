package com.jinan.www.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jinan.www.entity.Employee;
import com.jinan.www.entity.Project;
import com.jinan.www.util.HibernateUtil;

/*
 * ��Զ������ϵ������
 * ͬʱ������Project��Employee֮���˫���Զ������ϵ
 *  ������ϵ��ά����Project����ά��
 *  Ȼ����Project�������м�������
 */
public class Test {

	public static void main(String[] args) {
		
		Project project = new Project(1001,"��Ŀһ");
		Project project2 = new Project(1002,"��Ŀ��");
		Employee employee = new Employee(1,"����");
		Employee employee2 = new Employee(2, "����");
		
		//�μ���Ŀһ��Ա��������������
		project.getEmployees().add(employee);
		project.getEmployees().add(employee2);
		
		//�μ���Ŀ����Ա��������
		project2.getEmployees().add(employee);
		
		
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.save(project);
		session.save(project2);
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		
		
		
		
	}
}
