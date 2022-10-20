import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int ans = a.length();
        
        for(int i=0; i<=b.length()-a.length(); i++) {
            int cnt = 0;
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) != b.charAt(i+j))
                    cnt++;
            }
            ans = Math.min(cnt, ans);
        }
        System.out.println(ans);
	}

}
