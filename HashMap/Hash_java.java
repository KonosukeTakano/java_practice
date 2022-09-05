package java_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash_java {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		String[] strs = {"eat","tea","tan","ate","nat","bat","evil","live","race","care","part","trap","heart","earth"};
//		System.out.println(groupAnagrams(strs));
		
		Integer hoge1 = 123;
		String str1 = String.valueOf(hoge1);
		System.out.println(str1 instanceof String);
	}

	
	public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
