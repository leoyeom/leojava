package b_eulerquiz;

public class Euler001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for (int i = 0; i < 1000; i++) {
			
			if(i%3==0||i%5==0){
				
				sum+=i;
				
			}
			
		
		}
		System.out.println(sum);

	}

}



/*

10���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� 3, 5, 6, 9 �̰�, �̰��� ��� ���ϸ� 23�Դϴ�.

1000���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?*/