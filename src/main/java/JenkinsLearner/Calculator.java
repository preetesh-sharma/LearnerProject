package JenkinsLearner;

public class Calculator {

    Integer a;
    Integer b;

    public Calculator(Integer a, Integer b){
            this.a=a;
            this.b=b;
    }
    public Calculator(){

    }
    public Integer add(){
        return a+b;
    }

    public Integer multiply(){
        return a*b;
    }


    public Integer divide(){
        if(b!=0) {
            return a/b;
        }else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Calculator c =new Calculator();
        c.a=10;
        c.b=2;
        System.out.println("suum of a and b is "+ c.add().toString());
        System.out.println("product of a and b is "+c.multiply().toString());
        System.out.println("division of a and b is "+c.divide().toString());
        System.out.println("a");

    }
}
