
public class Interview {
	
	public static void main(String args) {
		// str = "1 abc99d4"
		// o/p: 104
		System.out.println(result(""));
		
	}
	
	public static int result(String s) {
		
		String s1="1 abc99d4";
		char c[]=s1.toCharArray();
		int count =0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>0) {
				int subcount=c[i];
				int j=i+1;
				while(c[j]>0) {
					subcount = subcount*10 + c[j];
					j++;
				}
				count = count + subcount;
				i = j;
			}
		}
		return count;
	}

}
