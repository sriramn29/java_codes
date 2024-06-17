package stackdatastructure;

public class StackDemo {
    public static void main (String[] args) {
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(8);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        s1.push(9);
        
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        
    }
}