import java.util.Scanner;

class Stringsearchingchar {
    public void input() {
        int i;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sr.nextLine();
        System.out.println("Enter the searching characher: ");
        char pt = sr.next().charAt(0);
        char[] a = str.toCharArray();
        for (i = 0; i < a.length; i++) {
            if (a[i] == pt) {
                System.out.print(pt + " is in string");
                break;
            }
        }
        if (i == a.length) {
            System.out.print(pt + " is't in string");
        }
    }

    public static void main(String[] args) {
        Stringcharornot sv = new Stringcharornot();
        sv.input();
    }
}