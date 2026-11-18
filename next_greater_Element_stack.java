package Stack;

import java.util.*;

public class next_greater_Element {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop(); //remove small or equal ele
            }
            if(st.isEmpty()){
                ans[i]=-1; //no small ele
            }
            else{
                ans[i]= st.peek(); // get topmost highest ele
            }
            st.push(arr[i]); // pass all other arr ele
        }
        System.out.println(Arrays.toString(ans));
       // System.out.println(ans);

    }
}
