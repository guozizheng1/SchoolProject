package com.imooc.model;

public class Student {
	//��Ա������ѧ�š��������Ա�����
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	//�޲εĹ��췽��
	public Student() {
		
	}
	//��εĹ��췽��, ʵ�ֶ�ѧ�š��������Ա�����ĸ�ֵ
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		
	}
	
	//��εĹ��췽��, ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}
	
	//����getter��setter����
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
	//�����Ա�ֻ���ǡ��С���Ů��������ֵΪ���С�
	public void setStudentSex(String studentSex) {
		if(studentSex.equals("��")||studentSex.equals("Ů")) {
			this.studentSex = studentSex;
		}else {
			this.studentSex = "��";
		}
		
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	/**
	 * �����丳ֵ���޶���10--100֮�䣬����ֵΪ18��
	 * @param studentAge ���������
	 */
	public void setStudentAge(int studentAge) {
		if(studentAge<10||studentAge>100) {
			this.studentAge = 18;
		}else {
		this.studentAge = studentAge;
		}
	}
	
	/**
	 * ��ȡרҵ�������û��ʵ��������ʵ�����ٷ���
	 * @return רҵ�������Ϣ
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
	 * ѧ�����ҽ��ܵķ���
	 * @return ���ص���ѧ����������ѧ�š��Ա������
	 */
//	public String introduction() {
//		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
//				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge();
//		return str;
//	}
	
	public String introduction() {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\n������רҵ���ƣ�" + this.getStudentSubject().getSubjectName() + "\nѧ�����ޣ�"
				+ this.getStudentSubject().getSubjectLife();
		return str;
	}
	/**
	 * ѧ�����ҽ��ܵķ���
	 * @param subjectName ��ѧרҵ����
	 * @param subjectLife ѧ������
	 * @return ���ҽ��ܵ���Ϣ������������ѧ�š��Ա����䣬�Լ���ѧרҵ�����ƺ�ѧ������
	 */
	
	public String introduction(String subjectName, int subjectLife) {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\n������רҵ���ƣ�" + subjectName + "\nѧ�����ޣ�"
				+ subjectLife;
		return str;
		
	}
	/**
	 * ѧ�����ҽ��ܵķ���
	 * @param mySubject ��ѡרҵ�Ķ���
	 * @return ���ҽ��ܵ���Ϣ������������ѧ�š��Ա����䣬�Լ���ѧרҵ�����ƺ�ѧ������
	 */
	public String introduction(Subject mySubject) {
		String str = "ѧ����Ϣ���£�\n������" + this.getStudentName() + "\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\n������רҵ���ƣ�" + mySubject.getSubjectName() + "\nѧ�����ޣ�"
				+ mySubject.getSubjectLife() + "\nѧ�Ƶı�ţ�" + mySubject.getSubjectNo();
		return str;
	}

}