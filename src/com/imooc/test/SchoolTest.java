package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����subject
		Subject sub1 = new Subject("�������ѧ��Ӧ��","J0001", 4);
		System.out.println(sub1.info());
		System.out.println("===========================");
		//����student
		Student stu1 = new Student("S01", "����", "Ů", 18, sub1);
		System.out.println(stu1.introduction());
		System.out.println("===========================");
		Student stu2 = new Student("S02", "����", "��", 20);
		System.out.println(stu2.introduction("�������ѧ��Ӧ��", 4));
		System.out.println("===========================");
		Student stu3 = new Student("S03","����","��", 19);
		System.out.println(stu3.introduction(sub1));
		
	}

}
