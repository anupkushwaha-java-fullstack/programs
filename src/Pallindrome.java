public class Pallindrome {

    public static void main(String[] args) {
        char[] arr = { 'a','b','c','c','b','a'};
        int half = (arr.length-1)/2;

        for (int i=0; i<half; i++){
            if(arr[i] == arr[(arr.length-1)-i ]){
                if(half-1 == i){
                    System.out.println("Palindrome");
                }
               continue;
            }else{
                System.out.println("Not a Palindrome");
                break;
            }
        }

    }

}
