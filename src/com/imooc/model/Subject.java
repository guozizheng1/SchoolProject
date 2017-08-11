package com.imooc.model;

public class Subject {
	//��Ա���ԣ�רҵ���ơ�ѧ�Ʊ�š�ѧ�����ޡ�����ѡ�޵�ѧ����Ϣ�����汨��ѡ�޵�ѧ������
	private String subjectName;
	private String subjectNo;
	private int	subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	//�޲εĹ��췽��
	public Subject() {
		
	}
	//���ι���ʵ�ֶ�ѧ�����ơ�ѧ�Ʊ�ţ����ޡ�
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		//this.subjectName = subjectName;
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	//���ι��죬ʵ�ֶ�ȫ�����Ը�ֵ
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
	//�������ޱ������0
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * ��ȡѡ��ѧ����������Ϣ���������ѧ����Ϣ������δ����ʼ�������ȳ�ʼ������Ϊ200
	 * @return ����ѧ����Ϣ������
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
	 * ��ȡѡ��ѧ��������
	 * @return
	 */
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	/**
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�����
	 */
	public String info() {
		String str = "רҵ��Ϣ����: \n" + "רҵ����: " + this.getSubjectName() + 
				"\nרҵ�ı��: " + this.getSubjectNo() + "\nѧ������: " + this.getSubjectLife() + "��";
		return str;
	}
	
	public void addStudent(Student stu) {
		/**
		 * 1.��ѧ�������ҵ�������
		 * 2.��ѧ���������浽studentNum��
		 */
		//��ѧ�������ҵ�������
		for(int i =0; i<getMyStudents().length; i++) {
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i] = stu;
				//��ѧ���������浽studentNum��
				this.studentNum = i + 1;
				return;
			}
		}
		
		
	}
	
}
