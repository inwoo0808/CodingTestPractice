import java.io.*;
import java.util.*;
public class B4889 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int no = 1;
		while(true) {
			String str = br.readLine();
			if(str.contains("-")) break; 
			
			int n = str.length();
			int cnt = 0;
			Stack<Character> st = new Stack<>();
			
			for(int i = 0; i < n; i++) {
				char tmp = str.charAt(i);
				if(tmp == '{') {
					st.add(tmp);
				}else {
					if(st.isEmpty()) {
						cnt++;
						st.add('{');
					}
					else
						st.pop();
				}
			}
			bw.write((no++) + ". " + (cnt + st.size()/2) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}