public class RemoveWhiteSpace {
    public static void main(String[] args) {
        removeWhiteSpace("madhusmita swain");
        System.out.println("Hello world!");
    }

    public static String removeWhiteSpace(String name){
        int n = name.length();
        String temp = "";
        for(int i=0; i<n; i++){
            char c= name.charAt(i);

            if(c!=' '){
                String s = String.valueOf(c);
                temp = temp.concat(s);

            }

        }
        System.out.println(temp);
        return temp;
    }
}