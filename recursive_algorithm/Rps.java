//n人で一度だけじゃんけんをするとき、勝敗が決まる確率を求めるプログラム
public class Rps{
  public static void main(String[] args){

    System.out.println("n人で一度だけじゃんけんをします。nを入力してください。");
    int n = new java.util.Scanner(System.in).nextInt();

    double a = 0;
    double b = 0;

    //ΣnCk(1 ≦ k ≦ n - 1)を代入するための変数
    int sum = 0;

    for(int i = 1; i < n; i++){
      sum += combo(n, i);
    }

    a = 3 * sum;//勝敗が決まる場合の数が何通りか
    b = Math.pow(3, n);//n人の手の出し方

    System.out.println("勝敗が決まる確率は");
    System.out.println(a / b);
    System.out.println("です");
  }
  //nの階乗を求めるメソッド
  public static int factorial(int n){
    int ans = 0;
    if(n < 2) return 1;
    if(n >= 2){
      ans = n * factorial(n - 1);
    }
    return ans;
  }
  // 異なるn個のものからr個を選ぶ組み合わせの総数を求めるメソッド
  public static int combo(int n, int r){
    int ans = 0;
    ans = factorial(n) / factorial(n - r) / factorial(r);
    return ans;
  }
}