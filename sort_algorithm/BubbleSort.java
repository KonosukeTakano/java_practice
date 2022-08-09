import java.util.Arrays;

public class BubbleSort{
  public static void main(String[] args){
    int[] newArray = makeArray(10);
    // ソート前配列
    System.out.println(Arrays.toString(newArray));
    // ソート後配列
    System.out.println(Arrays.toString(bubbleSort(newArray)));
  }
  // 要素数nの配列を生成するメソッド
  public static int[] makeArray(int n){
    int[] newArray = new int [n];
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = new java.util.Random().nextInt(100) + 1;
    }
    return newArray;
  }
  // バブルソート
  public static int[] bubbleSort(int []ary){

    int dummy;

    for(int j = 0; j < ary.length; j++){
      for(int i = ary.length - 2; i >= 0; i--){
        if(ary[i] > ary[i + 1]){
          dummy = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = dummy;
        }
      }
    }

    return ary;
  }
}