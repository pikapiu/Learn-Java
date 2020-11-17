package algorithm.others;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: zs
 * @Date: 2019/8/16 11:00
 */
public class Long2Zh {
    private static final String CHINESE_NEGATIVE = "负";
    private static final String CHINESE_ZERO = "零";
    private static final String[] CHINESE_DIGITS = new String[]{"", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    private static final String[] CHINESE_UNITS = new String[]{"", "十", "百", "千"};
    private static final String[] CHINESE_GROUP_UNITS = new String[]{"", "万", "亿", "兆"};


    public static void main(String[] args) {
        System.out.println("position:"+enumerateDigits2(465456L));
        BigDecimal b = BigDecimal.valueOf(0002342L);
        System.out.println(b.longValue());
    }




    public static String translate(Long num){
        String result;
        if(num == 0){
            return CHINESE_ZERO;
        }

        if(num < 0){
            result = CHINESE_NEGATIVE;
            num = -num;
        }

        return null;
    }

//     enumerateDigits();


    public static Long[] enumerateDigits(Long num){
        Long[] digits = new Long[String.valueOf(num).length()];
        int posisiotn = 0;
        while (num>0){
            Long digit = num % 10;
            num /= 10;
            digits[posisiotn] = digit;
            System.out.println(digit);
            posisiotn += 1;
        }
        return digits;
    }



    public static List<Long> enumerateDigits2(Long num){
        List<Long> list = new ArrayList<>();
        while (num>0){
            Long digit = num % 10;
            num /= 10;
            list.add(digit);
        }
        Collections.reverse(list);
        return list;
    }

}
