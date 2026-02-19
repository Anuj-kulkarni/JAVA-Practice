public class string_subset {

    public static void stringSubset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            System.out.println(ans);
            return;
        }

        // Kaam 
        // Yes 
        stringSubset(str, ans+str.charAt(i), i+1);


        // No
        stringSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        stringSubset(str, "", 0);
    }
}
