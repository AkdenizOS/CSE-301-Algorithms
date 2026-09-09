class Solution {

    public int uniquePaths(int m, int n) {
        //1- state ( dp neyi tutuyor)
        //dp [i][j] . 0,0 dan i,j ye , tam o ana gelmek için kullanılan tüm yolların sayısı. #of unique paths
        // int dp[][]= new dp[m][n]
        //dp[state] - state

        //2- decision ( buraya gelirken son hamle ne olabilir?)
        // bu soru için bir kutuya ya yukarıdan geldim ya da soldan geldim.
        //yukarıdan geldiysem, (i-1,j) -> (i,j)
        //soldan geldiysem, (i,j-1)->(i,j)

        //3- recurrence(formul)
        // dp[i][j]= dp[i-1][j]+dp[i][j-1] // çünkü bütün yolları soruyor. en kısa falan dese min yapardık burada.
        //karar 1+ karar 2

        //4- base case(başlangıç- kenarlar- ilk kutuları doldurduk)
        //başlangıç
        // dp[0][0]=1;x
        //ilk satır
        // dp[0][j]=1;
        //ilk sütun
        // dp[i][0]=1;

        //5- order (tabloyu hangi sırayla dolduruyoruz)

        //  dp[i][j] için dp[i-1][j]+dp[i][j-1] hesaplamamız lazım.
        // o yüzden tabloyu i - 0 dan m-1 e,,,,, j - 0 dan n-1 e soldan sağa ve yukarıdan aşağıya dolduracağız.

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
