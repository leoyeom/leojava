package b_eulerquiz;

public class Euler003 {


	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		long givenNumber = 600851475143l;
		
	 for(long i=2; i<=givenNumber||i!=1; i++) {
			
		 
		 	if (givenNumber==i) {
				
				System.out.println("the largest prime factor is  "+givenNumber);
				
				
			}
			
		 	while (givenNumber%i==0) {
		 		
		 		givenNumber= givenNumber/i;
		 				 		
				
			}
		 	
		 	
			
		}
		
	
		
	}

}


/*� ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.

600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.*/