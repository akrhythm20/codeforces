import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int value = 0;
		for(int i=1; i<=n; i++) {
			String statement = sc.next();
				if(statement.charAt(1)=='+') 
					value++;
				else 
					value--;	
			
		}
		
		System.out.println(value);
	}

}
