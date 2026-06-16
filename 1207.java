class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[]=new int[2001];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int v=Math.abs(arr[i]);
                freq[v+1000]++;
            }
            else freq[arr[i]]++;
        }
        for(int i=0;i<freq.length-1;i++){
            for(int j=i+1;j<freq.length;j++){
                if(freq[i]!=0 && freq[i]==freq[j]) return false;
            }
        }
        return true;
    }
}
