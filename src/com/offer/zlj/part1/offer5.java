package com.offer.zlj.part1;

public class offer5 {


    public static void main(String[] args) {

        System.out.println(offer5("we need money  "));
    }

    /**
     * 替换空格
     */
    public static String offer5(String text) {
        if (null==text||text.length()==0){
            return "";
        }
        char[] chars = text.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                count++;
            }
        }
        char[] target = new char[chars.length + 2 * count];
        int i = chars.length - 1; //原始字符串末尾
        int j = chars.length + 2 * count - 1; //新字符串末尾位置
        while (i>=0){
            if (chars[i]==' '){
                target[j] = '0';
                target[j - 1] = '2';
                target[j - 2] = '%';
                j = j - 3;
            }else {
                target[j] = chars[i];
                j--;
            }

            i--;
        }

        return new String(target);
    }

}
