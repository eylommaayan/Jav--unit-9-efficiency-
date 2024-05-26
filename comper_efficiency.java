/**
 * comper_efficiency
 * בגרסה הזו, הפונקציה 
 * efficientSumOfSquares מבצעת את אותו חישוב אך עושה זאת בצורה יעילה יותר
 *  על ידי לולאה אחת בלבד שמבצעת את החישוב בצורה ישירה.
 */
public class comper_efficiency {

    public static void main(String[] args) {
        int n = 10000;
        int result = efficientSumOfSquares(n);
        System.out.println("Result: " + result);
    }

    public static int efficientSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
  
/**
 * לעומת קוב זה שבו יש שני לולאות
 * 
 *public class comper_efficiency {
    public static void main(String[] args) {
        int n = 10000;
        int result = inefficientSumOfSquares(n);
        System.out.println("Result: " + result);
    }

    public static int inefficientSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += i;
            }
        }
        return sum;
    }
}
 */