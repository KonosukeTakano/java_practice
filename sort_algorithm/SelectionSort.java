import java.util.Arrays;

public class SelectionSort{
  public static void main(String[] args){
    int[] newArray = makeArray(10);
    // ソート前配列
    System.out.println(Arrays.toString(newArray));
    // ソート後
    System.out.println(Arrays.toString(selectionSort(newArray)));
  }
  // 要素数nの配列を生成するメソッド
  public static int[] makeArray(int n){
    int[] newArray = new int [n];
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = new java.util.Random().nextInt(100) + 1;
    }
    return newArray;
  }
  // 選択ソート
  public static int[] selectionSort(int[] ary){
    for(int i = 0; i < ary.length - 1; i++){
      int min = 10000;//十分に大きい数.未ソート部分の最小値を代入するため
      int min_index = 0;//未ソート部分の最小値のインデックスを代入するため
      int dummy;
      for(int j = i; j < ary.length; j++){
        if(min > ary[j]){
          min = ary[j];
          min_index = j;
        }
      }
      // 未ソート部分において先頭と最小値を交換
      dummy = ary[i];
      ary[i] = ary[min_index];
      ary[min_index] = dummy;
    }
    return ary;
  }
}