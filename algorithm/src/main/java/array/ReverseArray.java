package array;

/**
 * Created by weizheng on 2016/6/2.
 */
public class ReverseArray {
    public static int [] reverse(int [] a) {
        int [] result;
        if(a!=null && a.length>1) {
            result = new int[a.length];
            for(int i=0; i<a.length; i++) {
                result[i] = a[i];
            }
        } else {
            return a;
        }

        for(int i=0; i < result.length-1; ) {
            result[i] ^= result[i+1];
            result[i+1] ^= result[i];
            result[i] ^= result[i+1];
            i+=2;
        }
        return result;
    }


    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] result = reverse(a);
        for (int num :result) {
            System.out.print(num);
        }
    }

}
