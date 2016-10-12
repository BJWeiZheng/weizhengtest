package javabase;

import java.util.HashMap;

/**
 * Created by weizheng on 2016/5/24.
 */
public class StringEquals {

    public static void main(String[] args) {
        String s0="kvill";
        String s1="kvill";
        String s2="kv" + "ill";
        System.out.println( s0==s1 );
        System.out.println( s0==s2 );

        String s3 = new String("hello");
        String s4 = s3.intern();
        System.out.println(s3 == s4);

        HashMap<String , Object> map = new HashMap<String, Object>();
        map.put("1", new Object());
    }
}
