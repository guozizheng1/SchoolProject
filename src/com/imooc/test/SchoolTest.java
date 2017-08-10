package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试subject
		Subject sub1 = new Subject("计算机科学与应用","J0001", 4);
		System.out.println(sub1.info());
		System.out.println("===========================");
		//测试student
		Student stu1 = new Student("S01", "张三", "女", 18, sub1);
		System.out.println(stu1.introduction());
		System.out.println("===========================");
		Student stu2 = new Student("S02", "李四", "男", 20);
		System.out.println(stu2.introduction("计算机科学与应用", 4));
		System.out.println("===========================");
		Student stu3 = new Student("S03","王五","男", 19);
		System.out.println(stu3.introduction(sub1));
		
	}

}
