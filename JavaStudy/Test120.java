/*==========================================================
				���� Ŭ���� ���� ����
				     - ��ø Ŭ���� 
==========================================================*/

/*
�� Anonymous Ŭ����(�͸��� Ŭ����, ���� Ŭ����)
   
   - awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����
   
   new ����Ŭ������ ������()
   {
		�������������� �ڷ��� �޼ҵ�()
		{
			//...	
		}
   };	<- �ݵ�� �����ݷ� �ʿ���~!!!

�� �������� ���� ���� ��(Ž���� �󿡼�)
   ��Ŭ������$1.class�� ������ �����Ǹ�
   $ ���� ���ڰ� ���������� �ο��ȴ�.

    
*/

//import java.lang.*;

class Test3	// extends Object
{
	public Object getString()
	{
		//return ___;	<- Object
		
		// ��
		
		//Object ob = new Object();
		//return ob;
		
		// ��

		//return new Object();    
		
		// ��

		//return new Object(){
		//	
		//};

		return new Object()
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};	// <- �����ݷ�(�� �ۼ� �� ���� �߻�)
	}
}


public class Test120 //extends Object
{
	public static void main(String[] args)
	{
		Test3 ob = new Test3();
		Test3 ob2 = new Test3();
		System.out.println(ob.toString());
		//--==>>Test3@15db9742

		System.out.println(ob2.getString()); 
	}
}
//������
/*
Test3@15db9742
�͸��� Ŭ����...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/