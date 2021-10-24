package bean;

import java.util.List;


public class OperationExpression {
    List list;//表达式集合
    List<String> stringList;//字符串类型
    Fraction res;//答案

    //实例化方法
    public OperationExpression(List list, List<String> stringList, Fraction res) {
        this.list = list;
        this.stringList = stringList;
        this.res = res;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Fraction getRes() { return res; }

    public void setRes(Fraction res) { this.res = res; }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}