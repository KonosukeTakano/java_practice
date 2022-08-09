import java.util.Arrays;

public class MergeSort{

  public static void main(String[] args){
    int[] newArray1 = makeArray(5);
    int[] newArray2 = makeArray(5);

    Arrays.sort(newArray1);
    Arrays.sort(newArray2);

    System.out.println(Arrays.toString(newArray1));
    System.out.println(Arrays.toString(newArray2));

    System.out.println(Arrays.toString(mergeArray(newArray1,newArray2)));

  }

// 要素数nのソート済み配列を生成するメソッド
  public static int[] makeArray(int n){
    int[] newArray = new int [n];
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = new java.util.Random().nextInt(100) + 1;
    }
    return newArray;
  }

// 二つのソート済み配列からマージされた新たなソート済み配列を生成するメソッド
  public static int[] mergeArray(int []array1, int []array2){
    int n = array1.length + array2.length;
    int[] mergedArray = new int [n];

    int i = 0;
    int j = 0;
    int k = 0;

// どちらかの配列をマージし終えるまでループ
    while(i < array1.length && j < array2.length){
      if(array1[i] <= array2[j]){
        mergedArray[k] = array1[i];
        i++;
      }
      else{
        mergedArray[k] = array2[j];
        j++;
      }
      k++;
    }

    // 残りをマージする
    if(i == array1.length){
      while(j < array2.length){
        mergedArray[k] = array2[j];
        j++;
        k++;
      }
    }

    if(j == array2.length){
      while(i < array1.length){
        mergedArray[k] = array1[i];
        i++;
        k++;
      }
    }
    return mergedArray;
  }
}