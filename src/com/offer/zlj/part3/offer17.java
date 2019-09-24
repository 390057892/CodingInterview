package com.offer.zlj.part3;


//打印1到最大的n位数
public class offer17 {

    public static void main(String args[]){
//        printNum(10);
        printNum2(3);
    }


    //正常思路。 但如果n比较大 就会溢出
    private static int printNum(int n){
        if (n<=0){
            return 0;
        }
        int i = 0;
        int num = 1;
        while (i<n){
            i++;
            num = num * 10;
        }

        for (int j = 1; j <num ; j++) {
            System.out.println(j);
        }

        return 0;
    }


    //递归实现
    private static void printNum2(int n){
        if (n<=0){
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i <10 ; i++) {
            num[0] = (char) (i + '0');
            digitsRecursively(num,n,0);
        }
    }


    private static void digitsRecursively(char[] num,int n,int index){

        if(index == (n-1)) {
            //123----1为index=0第一个字符
            //       2为index=1第二个字符,
            //       3为index=2第三个字符，最后一个字符
            //若已经检索到最后一个字符,则打印整个数组中的数字
            printNumber(num);
            return;
        }
        //若未检索到最后一个字符,则继续检索下一个字符
        for(int i=0;i<10;i++) {
            num[index+1]=(char) (i+'0'); //将int型的下一个转换为char型
            digitsRecursively(num,n,index+1);
        }

    }


    public static void printNumber(char[] number) {
        //非零字符标志位
        boolean zeroflag = true;
        //从低位到高位进行判断,遇到非零就先将非零标志位设置为false
        //然后开始输出即可
        for (char aNumber : number) {
            if (aNumber != '0' && zeroflag) {
                zeroflag = false;
            }
            if (!zeroflag)
                System.out.print(aNumber);

        }
        //输出一个就换行
        System.out.println();

    }


}
