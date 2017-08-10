package com.imooc.model;

public class Student {
	//成员特征：学号、姓名、性别、年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	//无参的构造方法
	public Student() {
		
	}
	//多参的构造方法, 实现对学号、姓名、性别、年龄的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		
	}
	
	//多参的构造方法, 实现对全部属性的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}
	
	//设置getter和setter方法
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSex() {
		return studentSex;
	}
	//限制性别只能是“男”或“女”，否则赋值为“男”
	public void setStudentSex(String studentSex) {
		if(studentSex.equals("男")||studentSex.equals("女")) {
			this.studentSex = studentSex;
		}else {
			this.studentSex = "男";
		}
		
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	/**
	 * 给年龄赋值，限定在10--100之间，否则赋值为18岁
	 * @param studentAge 传入的年龄
	 */
	public void setStudentAge(int studentAge) {
		if(studentAge<10||studentAge>100) {
			this.studentAge = 18;
		}else {
		this.studentAge = studentAge;
		}
	}
	
	/**
	 * 获取专业对象，如果没有实例化，先实例化再返回
	 * @return 专业对象的信息
	 */
	public Subject getStudentSubject() {
		if(this.studentSubject==null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 学生自我介绍的方法
	 * @return 返回的是学生的姓名、学号、性别和年龄
	 */
//	public String introduction() {
//		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
//				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge();
//		return str;
//	}
	
	public String introduction() {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报的专业名称：" + this.getStudentSubject().getSubjectName() + "\n学制年限："
				+ this.getStudentSubject().getSubjectLife();
		return str;
	}
	/**
	 * 学生自我介绍的方法
	 * @param subjectName 所学专业名称
	 * @param subjectLife 学制年限
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄，以及所学专业的名称和学制年限
	 */
	
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报的专业名称：" + subjectName + "\n学制年限："
				+ subjectLife;
		return str;
		
	}
	/**
	 * 学生自我介绍的方法
	 * @param mySubject 所选专业的对象
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄，以及所学专业的名称和学制年限
	 */
	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报的专业名称：" + mySubject.getSubjectName() + "\n学制年限："
				+ mySubject.getSubjectLife() + "\n学科的编号：" + mySubject.getSubjectNo();
		return str;
	}

}
