package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		System.out.println(Arrays.toString(Solution(nums1, nums2)));
	}
	
	public static int[] Solution(int[] nums1, int[] nums2) {
		
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < nums1.length; i++) {
			map1.put(nums1[i], i);
		}
		
		for(int i = 0; i < nums2.length; i++) {
			map2.put(nums2[i], i);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(Integer key : map2.keySet()) {
			if(map1.containsKey(key)) {
				intList.add(key);
			}
		}
		
		int[] numArray = intList.stream().mapToInt(i->i).toArray();
		
		return numArray;
		
	}

}
