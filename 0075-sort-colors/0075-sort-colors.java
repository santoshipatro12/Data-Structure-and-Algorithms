class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
        int i=0, j=0, k= arr.length-1;
        while(i<=k){
            if(arr[i]== 0){
                swap(arr,i,j);
                i++; j++;
            }else if(arr[i]==2){
                swap(arr,i,k);
                k--;
            }else i++;
        }
    }
}