package Queue;
import java.util.Queue;
import java.util.*;
public class example {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        Queue<Character> q = new LinkedList<>();
        q.add('a');
        s.add('a');
        q.add('b');
        s.add('b');
        q.add('d');
        s.add('d');
        q.add('f');
        s.add('f');
        q.poll();
        s.pop();
        q.poll();
        s.pop();
        System.out.println(q);
        System.out.println(s);
    }
}
