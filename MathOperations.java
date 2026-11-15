public class MathOperations {
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }
    public class Main {
        public static void main(String[] args){
            MathOperations mathOps = new MathOperations();
            System.out.println("Addition of two integers:"+mathOps.add(5,10));
            System.out.println("Addition of three integers:"+mathOps.add(5,10,15));
            System.out.println("Addition of two double values:"+mathOps.add(5.5,10.5));
            System.out.println("Addition of three double values:"+mathOps.add(5.5,10.5,15.5));
        }
    }
}
