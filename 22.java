class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll= new ArrayList<>();
        Parentheses(n,0,0,"",ll);
        //System.out.println(ll);
        return ll;
    }
    public static void Parentheses(int n, int open, int close, String ans, List <String>ll){
        if(open== n && close==n){
          //  System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open > n || close> open){
            return;
        }
        Parentheses(n, open+1, close, ans+"(",ll);
        Parentheses(n, open, close+1, ans+")",ll);
    }
        
    }
