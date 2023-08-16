import java.util.Arrays;
import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        str1 = new String(arr1);
        str2= new String(arr2)
        System.out.println(str1);
        System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("done");
        }
    }

}
