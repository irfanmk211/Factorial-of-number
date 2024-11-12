class Fact{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
public class Factorial{
    public static void main(String[] args){
        int result=0;
        Fact f1=new Fact();
        result=f1.factorial(5);
        System.out.println(result);
        
    }
}
    