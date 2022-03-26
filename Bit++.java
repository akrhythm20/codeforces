import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int value = 0;
		for(int i=1; i<=n; i++) {
			String statement = sc.next();
			for(int j=0; j<3; j++) {
				if(statement.charAt(j)=='+') {
					value++;
					break;
				}
				if(statement.charAt(i)=='-') {
					value--;
					break;
				}
			}
		}
		
		System.out.println(value);
	}

}
