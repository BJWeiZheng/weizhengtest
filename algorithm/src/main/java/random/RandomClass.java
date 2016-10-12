package random;

import java.util.Random;

/**
 * Created by weizheng on 2016/7/21.
 */
public class RandomClass {
    static void test() {
        Random r = new Random(47);
        System.out.println(r.nextInt(3));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            test();
        }
    }
}
