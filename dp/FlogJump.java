import java.util.Arrays;

public class FlogJump{
  public static void main(String[] args){
    System.out.println("足場の数を入力してください");
    int n = new java.util.Scanner(System.in).nextInt();
    System.out.println(n + "ですね！");

    int[] h = new int [n];
    System.out.println("次に足場の高さを順に入力してください");
    for(int i = 0; i < n; i++){
      h[i] = new java.util.Scanner(System.in).nextInt();
    }
    System.out.println(Arrays.toString(h));
    System.out.println("ですね！");

    System.out.println("最小消費体力は...");
    System.out.println(flogJump(n, h));
    System.out.println("です！");
  }
  public static int flogJump(int n, int[] h){
    int[] dp = new int [n];
    for(int i = 0; i < n; i++){
      if(i == 0) dp[i] = 0;
      if(i == 1) dp[i] = Math.abs(h[i - 1] - h[i]);
      if(i >= 2){
        // 1個前の足場からジャンプする場合
        int value1 = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
        // 2個前の足場からジャンプする場合
        int value2 = dp[i - 2] + Math.abs(h[i - 2] - h[i]);
        dp[i] = Math.min(value1, value2);
      }
    }
    return dp[n - 1];
  }
}