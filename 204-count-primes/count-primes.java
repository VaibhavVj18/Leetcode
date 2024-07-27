class Solution {
    public int countPrimes(int n) 
    {
       boolean[] notP = new boolean[n];
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (notP[i] == false) {
                c++;
                for (int j = 2; i*j < n; j++) {
                    notP[i*j] = true;
                }
            }
        }
        return c;
    }
}