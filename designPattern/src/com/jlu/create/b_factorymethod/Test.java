package com.jlu.create.b_factorymethod;

public class Test {

	/**����������������ڳ��󹤳��õľӶࣩ
	 * �Դ������������Ϊ����
	 * Creator ���������Ľӿ�
����         MianBaoCreator��YouTiaoCreator ����Ĳ�Ʒ������,���Լ���
                ��չ��Ʒ�����ߣ�ʵ��Create�ӿ�
����          Product ��Ʒ�Ľӿ�
����         ProductMianTiao��ProductYouTiao����Ĳ�Ʒ
	 * @param args
	 */
	public static void main(String[] args) {
		
		Create c;
		c=new MianBaoCreate();
		c.factory().eating();
		
		
		c=new YouTiaoCreate();
		c.factory().eating();
		

	}

}
