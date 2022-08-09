import java.util.Arrays;

public class InsertionSort{
  public static void main(String[] args){
    int[] ary = makeArray(5);
    // ソート前
    System.out.println(Arrays.toString(ary));
    //ソート後
    System.out.println(Arrays.toString(insertionSort(ary)));
  }
  // 要素数nの配列を生成するメソッド
  public static int[] makeArray(int n){
    int[] newArray = new int [n];
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = new java.util.Random().nextInt(100) + 1;
    }
    return newArray;
  }
  //挿入ソート
  public static int[] insertionSort(int[] ary){
    for(int k = 1; k < ary.length; k++){
      int i = k;
      int dummy = 0;
      for(int j = 0; j < k; j++){
        if(ary[i - 1] > ary[i]){
          dummy = ary[i - 1];
          ary[i - 1] = ary[i];
          ary[i] = dummy;
          i--;
        }else{
          break;
        }
      }
    }
    return ary;
  }
}