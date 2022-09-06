package java_practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailSolution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(Solution(emails));
	}
	
	public static Integer Solution(String[] emails){
		Set<String> normalized = new HashSet<>();
		for(String email : emails) {
			String[] parts = email.split("@");
			String[] local = parts[0].split("\\+");
			normalized.add(local[0].replace(".","") + "@" + parts[1]);
		}
		return normalized.size();
	}
}
