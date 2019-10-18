package day04;

public class UjiStack01 {
    public static void main(String[] args) {
        Stack x = new Stack(3);
        x.push(7);
        x.push(9);
        x.push(6);
        x.push(5);
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
    }
}
