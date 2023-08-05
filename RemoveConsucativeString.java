public class RemoveConsucativeString {
    public static String deleteConsecutiveStrings(String s){

     String newCharcter = "";
     int i=0;int j=1;
     while (j<s.length()){
         if(s.charAt(j)==s.charAt(i)){
             j++;
         }  else if (s.charAt(j) != s.charAt(i)
                 || j == s.length() - 1) {
             newCharcter +=s.charAt(i);
             i=j;
             j++;
             
         }
     }
     newCharcter += s.charAt(j-1);
        return newCharcter;
    }

    public static void main(String[] args) {
        // Input
        String s = "geeks for geeks is best";

        // Printing original string
        System.out.println("Input  : " + s);

        // Printing result
        System.out.println("Output : " + deleteConsecutiveStrings(s));
    }
}
