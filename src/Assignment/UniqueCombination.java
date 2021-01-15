package Assignment;

//WAP to print all the possible unique combinations of characters in a given String .

import java.util.Scanner;

public class UniqueCombination {

    public static void main(String[] args) {
        B obj = new B();
        obj.GetStringFromUser();
        String s = B.s;
        int length = B.length;
        System.out.println("All String Unique Combinations are ");
        obj.permutation(s, 0, length);
    }
}

class B {

    static String s = "";
    static int length;

    public void GetStringFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the String ....");
        s = sc.next();
        length = s.length();
    }

    public String swapping(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public void permutation(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swapping(str, start, i);
                permutation(str, start + 1, end);
                str = swapping(str, start, i);
            }
        }
    }
}
