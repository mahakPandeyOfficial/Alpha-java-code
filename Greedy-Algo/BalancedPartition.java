public class BalancedPartition {

    static int balanced(String str, int length){
        //base case
        if(length == 0) return 0;

        //other case
        int r = 0, l = 0;   //tracking r & l
        int ans = 0;        //tracking total ans

        for(int i = 0; i<length; i++){
            if(str.charAt(i) == 'R' ){
                r++;
            }else if(str.charAt(i) == 'L'){
                l++;
            }

            if(r == l) ans++;
        }
        return ans;
    }
    public static void main(String [] args){
        String str = "LLRRRLLRRL";
        int length = str.length();

        System.out.println(balanced(str, length));
    }
}
