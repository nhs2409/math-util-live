
package com.fu.mathutil;

/**
 *
 * @author sonNH
 */
// ta viết cái class để cung cấp tiện ích cho nơi khác xài
// khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta không cần nhớ cái gì
// cho riêng ta, hàm static giúp ta làm điều này
public class MathUtilLive {
    
    public static void main(String[] args) {
        long result = getFactorial(5);
        System.out.println(result);
    }

    //n != 1.2.3.4.5.6 ... n
//Quy ước: 0! = 1! = 1
//Ko tính giai thừa cho số âm
//20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
//21! lố kiểu long
//nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
//một cái ngoại lệ, chữi ćo tính đc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0....20");
        }
//hàm dừng liền ćo cần return
//xuống đây là n = 0 .. 20 òi
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
