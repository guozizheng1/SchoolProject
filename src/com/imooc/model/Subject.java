package com.imooc.model;

public class Subject {
	//成员属性：专业名称、学科编号、学制年限、报名选修的学生信息、保存报名选修的学生数量
	private String subjectName;
	private String subjectNo;
	private int	subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	//无参的构造方法
	public Subject() {
		
	}
	//带参构造实现对学科名称、学科编号，年限、
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		//this.subjectName = subjectName;
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	//带参构造，实现对全部属性赋值
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return this.subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}
	//设置年限必须大于0
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * 获取选修学生的数据信息，如果保存学生信息的数组未被初始化，则先初始化长度为200
	 * @return 保存学生信息的数组
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null)
			this.myStudents = new Student[200];
		return myStudents;
	}
	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	/**
	 * 获取选修学生的数量
	 * @return
	 */
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下: \n" + "专业名称: " + this.getSubjectName() + 
				"\n专业的编号: " + this.getSubjectNo() + "\n学制年限: " + this.getSubjectLife() + "年";
		return str;
	}
	
	public void addStudent(Student stu) {
		/**
		 * 1.将学生保存找到数组中
		 * 2.将学生个数保存到studentNum中
		 */
		//将学生保存找到数组中
		for(int i =0; i<getMyStudents().length; i++) {
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i] = stu;
				//将学生个数保存到studentNum中
				this.studentNum = i + 1;
				return;
			}
		}
		
		
	}
	
}
