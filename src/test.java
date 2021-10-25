import bean.Fraction;
import bean.OperationExpression;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test1(){
        Operation.mainGenerate(10,10000);
    }
    @Test
    public void test2(){
        Operation.mainCheck("D:\\developer\\ForCalculate\\Answer1.txt","D:\\developer\\ForCalculate\\Answer.txt");
    }
    @Test
    public void test3(){
        getExpression getExpression = new getExpression();
        List exp = getExpression.getExp(new OperationExpression(null, null, null), 10);
        System.out.println(exp);
    }
    @Test
    public void test4(){
        getExpression getExpression = new getExpression();
        List exp = getExpression.getExp(new OperationExpression(null, null, null), 3);
        System.out.println(exp);
    }
    @Test
    public void test5(){
        Fraction a = new Fraction(true,10);
        Fraction b = new Fraction(true,10);
        System.out.println(a.sub(b));
    }
    @Test
    public void test6(){
        Fraction a = new Fraction(false,20);
        Fraction b = new Fraction(true,10);
        System.out.println(a.div(b));
    }
    @Test
    public void test7(){
        Fraction a = new Fraction(false,10);
        Fraction b = new Fraction(false,10);
        System.out.println(a.add(b));
    }
    @Test
    public void test8(){
        Fraction a = new Fraction(false,10);
        Fraction b = new Fraction(false,10);
        System.out.println(a.sub(b));
    }
    @Test
    public void test9(){
        System.out.println(Calculate.prior("+", "-"));
    }
    @Test
    public void test10(){
        getExpression getExpression = new getExpression();
        List exp = getExpression.getExp(new OperationExpression(null, null, null), 3);
        System.out.println(Calculate.toPostFix(exp));
    }
}