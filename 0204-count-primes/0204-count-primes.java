class Solution {
    public int countPrimes(int n) {
        int count =0;
        boolean []isPrime = new boolean[n+1];

        Arrays.fill(isPrime , true);

        if(n>=0) isPrime[0] = false;
        if(n>=1) isPrime[1] = false;

      for(int i=2 ; i< Math.sqrt(n); i++){
        if(isPrime[i] == true){
            for(int j =i*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
      }
      for(int i =0; i<n; i++){
        if(isPrime[i]) count ++;
      }
      return count;
    }
}