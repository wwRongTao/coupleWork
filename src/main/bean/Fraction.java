package bean;

import java.util.Random;

/*
 * 构建一个分数类，用来表示分数，封装相关的方法
 */
public class Fraction {

    private int nominator;// 分子
    private int denominator;// 分母

    // 构建一个分数
    public Fraction(int nominator, int denominator) {
        super();
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public Fraction(int nominator) {
        this.nominator = nominator;
        this.denominator = 1;
    }

    public Fraction() {
        super();
    }

    // 判断构建的是一个分数还是一个整数，不超过limit的数值
    public Fraction(boolean l, int limit) {
        Random r = new Random();
        //分数
        if (l == true) {
            int index = r.nextInt(limit-1)+1;

            int index2 = r.nextInt(limit-1)+1;//设定分子,分母其不会为零,取值范围为[1,limit)
            System.out.println("分数"+index2 + " / " + index);
            //Random.nextInt(n) 生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n。
            this.denominator = index;
            this.nominator = index2;
        }
        //整数
        else {
            int index = r.nextInt(limit-1)+1;//[1,limit)
            this.denominator = 1;
            this.nominator = index;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    @Override
    public String toString() {//返回值为字符串
        Appointment();//约分
        if(this.denominator == 0){//分母为零
            System.out.println(this.nominator + "|" + this.denominator);
            System.out.println("分母为0");
        }
        if (this.denominator == 1 || this.nominator == 0) {//分子为零
            return "" + this.nominator;
        }else if (this.nominator > this.denominator) {//分子大于分母
            if(nominator % denominator==0){         //分子等于分母
                return "" + nominator / denominator;
            }
            return "" + nominator / denominator + "'" + nominator % denominator + "/" + denominator;
        }else{      //分子小于分母
            return "" + this.nominator + "/" + this.denominator;//真分数
        }
    }

    // 加法运算
    public Fraction add(Fraction r) {
        int a = r.getNominator();// 获得分子
        int b = r.getDenominator();// 获得分母
        int newNominator = nominator * b + denominator * a;
        int newDenominator = denominator * b;
        Fraction result = new Fraction(newNominator, newDenominator);
        return result;
    }

    // 减法运算
    public Fraction sub(Fraction r) {
        int a = r.getNominator();// 获得分子
        int b = r.getDenominator();// 获得分母
        int newNominator = nominator * b - denominator * a;
        int newDenominator = denominator * b;
        Fraction result = new Fraction(newNominator, newDenominator);
        return result;
    }

    // 分数的乘法运算
    public Fraction muti(Fraction r) { // 乘法运算
        int a = r.getNominator();// 获得分子
        int b = r.getDenominator();// 获得分母
        int newNominator = nominator * a;
        int newDenominator = denominator * b;
        Fraction result = new Fraction(newNominator, newDenominator);
        return result;
    }

    // 分数除法运算
    public Fraction div(Fraction r) {
        int a = r.getNominator();// 获得分子
        int b = r.getDenominator();// 获得分母
        int newNominator = nominator * b;
        int newDenominator = denominator * a;
        Fraction result = new Fraction(newNominator, newDenominator);
        return result;
    }

    // 用辗转相除法求最大公约数
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 对分数进行约分
    public void Appointment() {
        if (nominator == 0 || denominator == 1)
            return;
        // 如果分子是0或分母是1就不用约分了
        long gcd = gcd(nominator, denominator);
        this.nominator /= gcd;
        this.denominator /= gcd;
    }

    public int existZero(){
        if(this.nominator<0||this.denominator<0){//如果分母或分子为负数
            return 0;
        }else {
            return 1;
        }
    }
}