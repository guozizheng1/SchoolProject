package com.imooc.model;

public class Subject {
	//��Ա���ԣ�רҵ���ơ�ѧ�Ʊ�š�ѧ������
	private String subjectName;
	private String subjectNo;
	private int	subjectLife;
	
	//�޲εĹ��췽��
	public Subject() {
		
	}
	//���ι���ʵ�ֶ����Ե�ȫ������
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		//this.subjectName = subjectName;
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
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
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�����
	 */
	public String info() {
		String str = "רҵ��Ϣ����: \n" + "רҵ����: " + this.getSubjectName() + 
				"\nרҵ�ı��: " + this.getSubjectNo() + "\nѧ������: " + this.getSubjectLife() + "��";
		return str;
	}
	
	
}
