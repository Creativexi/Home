package less14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Heavybox {
    public static void main(String[] args) {
        Heavybox h1 = new Heavybox();
        Heavybox h2 = new Heavybox();
        Heavybox h3 = new Heavybox();

        List<Heavybox> arrayList = new ArrayList<>();
        arrayList.add(h1);
        arrayList.add(h2);
        arrayList.add(h3);
        for (Heavybox x : arrayList) {
            System.out.println(x);
        }
        System.out.println();

        Deque<Heavybox> queue = new ArrayDeque<Heavybox>();
        queue.add(h1);
        queue.add(h2);
        queue.add(h3);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }
}
