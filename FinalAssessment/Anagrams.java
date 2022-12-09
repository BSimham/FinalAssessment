package FinalAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Anagrams {
	
	public static List<List<String>> groupAnagrams(List<String> l){
		List res_l=new ArrayList();
		List<String> l2=new ArrayList<String>();
		if (l.isEmpty()) {
			res_l.add(l2);
			return (res_l);
		}
		List<String> s_w=new ArrayList<String>();
		
		for(int i=0;i<l.size();i++) {
			List<String> l1=new ArrayList<String>();
			char[] chars = l.get(i).toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        //System.out.println(sorted);
			
			if(s_w.contains(sorted)) {
				continue;
			}
			else {
				s_w.add(sorted);
				l1.add(sorted);
				for(int j=i+1;j<l.size();j++) {
					char[] chars1 = l.get(j).toCharArray();
			        Arrays.sort(chars1);
			        String sorted1 = new String(chars1);
			        //System.out.println(l.get(j)+j+sorted1+sorted);
			        if(sorted.equals(sorted1)) {
			        	l1.add(l.get(j));
			        	//System.out.println(l.get(j)+1);
			        }
					
				}
				res_l.add(l1);
			}
		}
		return (res_l);
	}

	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		String s;
		List<String> l=new ArrayList<String>();
		System.out.println("Enter number of Strings");
		int n;
		s=br.readLine();
		n=Integer.parseInt(s);
		System.out.println("Enter Strings");
		while(n>0) {
			s=br.readLine();
			l.add(s);
			n-=1;
		}
		List<List<String>> res_l=groupAnagrams(l);
		System.out.println(res_l);
		/*for(List l:res_l) {
			for(String s1:l) {
			System.out.println(s1);
			}
		}*/
	}
}
