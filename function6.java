// public class function6 {
//     public static boolean isprime(int n) {
//         for(int i=2; i<=n-1; i++) {
//             if( n % i  ==  0  ) {
//             return true;
//             }
//         }
//         return false;
//     }
// public static void main(String args[]) {
//     System.out.println(isprime(8));
// }
// }
// optimized code for prime number
public class function6 {
public static boolean isprime(int n) {
    if(n == 2) {
        return true;
    }

    for(int i=2; i<Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}
public static void main(String args[]) {
    System.out.println(isprime(7));
}
}