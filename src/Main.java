public class Main {
public static void main(String [] args){
    int a = 5424;
    int b = 160;
    int x = gcd(a,b);
    System.out.println("The greatest common denominator is " + x);
}
private static int gcd(int a, int b){
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}
