package b_eulerquiz;

public class Euler002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int a=1;
		int b=2;
		int result=2;
		
		while (sum<=4000000) {
			
			
		
			sum= a+b;
			a=b;
			b=sum;
			
			
			if (sum%2==0) {
				
				result+=sum;
				
			}
			
			
		}

		

		System.out.println("result="+result);
		

	}

}


/*
�Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?*/