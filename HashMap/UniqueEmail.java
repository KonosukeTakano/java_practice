package java_practice;

import java.util.HashMap;
import java.util.Map;

public class UniqueEmail {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		System.out.println(Solution(emails));
	}
	
	public static int Solution(String[] emails) {
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] str = new String [emails.length];
		
		for(int i = 0; i < emails.length; i++) {
			
			
			int flg1 = 0;
			int flg2 = 0;
			
			String[] strArray = emails[i].split("");
			
			for(String s : strArray) {
				
				if(s.equals("+")) flg1 = 1;
				if(s.equals("@")) flg2 = 1;
				
				if(s.equals(".") && flg2 == 0) s = "";
				if (flg1 == 1 && flg2 == 0) s = "";
					
				str[i] += s;
				
			}
			
			map.put(str[i], i);
			
		}
		
		return map.size();
	}

}
