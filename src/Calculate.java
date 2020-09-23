public class Calculate {
    public int add(int a,int b){
       return a+b;
    }
    public int diff(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public float div(int a,int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }


}
