package java_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Java_map {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] ary = {5,3,2,11,13,131,1,100};
		int target = 144;
		
		System.out.println(Arrays.toString(twoSum(ary, target)));
		
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] result = new int [2];
		
		for(int i = 0; i < numbers.length; i++) {
			if(map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i);
		}
		
		return result;
	}
	

}
