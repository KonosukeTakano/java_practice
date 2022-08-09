import java.util.Arrays;

public class BinarySearch{
  public static void main(String[] args){

    int[] newArray = makeArray(10);
    System.out.println(Arrays.toString(newArray));

    search(newArray, 21);
    // 配列と探索したい数を受け取ってその配列に含まれる場合はtrue,含まれない場合はfalseを返すメソッド

  }

  // 要素数nの配列を生成するメソッド
  public static int[] makeArray(int n){
    int[] newArray = new int [n];
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = new java.util.Random().nextInt(100) + 1;
    }
    return newArray;
  }
  public static void search(int []array, int n){
    Arrays.sort(array);

    // 配列に含まれるか、デフォルトはfalse。含まれる場合trueで上書き
    boolean isIncluded = false;

    int left = 0;
    int right = array.length - 1;

    while(left <= right){
      int mid = (left + right) / 2;
      if(array[mid] == n){
        isIncluded = true;
        break;
      } else if (array[mid] > n){
        right = mid - 1;
      } else{
        left = mid + 1;
      }
    }

    // 最後に結果を出力
    System.out.println(isIncluded);

  }
}