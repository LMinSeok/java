package ex03;

public class For02 {

	public static void main(String[] args) {
		
		//1 ~ 100까지의 정수 중 3의 배수 총합 구하기
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
			sum +=i;
			}
		}
		
		System.out.println("총합:" +sum);
	}

}
