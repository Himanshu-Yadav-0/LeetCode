public class P10 {
    public static boolean solve(int i , int j,String text , String pattern){
        if(j==pattern.length()){
            return i==text.length();
        }
        boolean firstCharMatched =i<text.length() && (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');
        if(j+1<pattern.length() && pattern.charAt(j+1)=='*'){
            return (solve(i,j+2,text,pattern)
                    ||
                    (firstCharMatched&&solve(i+1,j,text,pattern)));
        }
        else{
            return firstCharMatched&&solve(i+1,j+1,text,pattern);
        }
    }

    public static boolean isMatch(String s, String p) {
        return solve(0,0,s,p);
    }
    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        System.out.println(isMatch(s,p));
    }
}
