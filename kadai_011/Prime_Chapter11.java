package kadai_011;

public class prime_chapter11 {

	public static void main(String[] args) {

		boolean[] judge = new boolean[101];
		
		for(int i = 0; i < judge.length ; i++) {
			judge[i] = true;
		}
		
		int divisor = 2;

		while(divisor < judge.length) {
			for(int i = divisor + 1; i < judge.length; i++) {
				if(i % divisor == 0) {
					judge[i] = false;
					continue;
				}
			}
			divisor += 1;
		}
		
		for(int i = 2; i < judge.length; i++) {
			if(judge[i]) {
				System.out.println(i);
			}
		}
	}

}
