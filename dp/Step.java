public class Step{
  public static void main(String[] args){
    System.out.println("階段の段数を入力してください");
    int n = new java.util.Scanner(System.in).nextInt();

    System.out.println(n + "段目まで行く方法は" + stepCase(n) + "通りです");
  }

  //階段のn段目まで行く方法が何通りあるかリターンするメソッド
  public static int stepCase(int n){

    int[] dp = new int [n + 1];

    for(int i = 0; i < n + 1; i++){
      if(i == 0) dp[i] = 1;
      if(i == 1) dp[i] = 1;
      if(i >= 2){
        dp[i] = dp[i - 1] + dp[i - 2];
      }
    }

    return dp[n];
  }
}