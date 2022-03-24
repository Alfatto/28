import java.util.*;

public class Level1{

   public static String Keymaker(int k) {
        StringBuilder stringBuilder = new StringBuilder(k);
        stringBuilder.append("0".repeat(Math.max(0, k)));

        int amountWithOdd = 0;
        for (int odd = 1; odd + amountWithOdd <= k; odd += 2) {
            amountWithOdd += odd;
            stringBuilder.setCharAt(amountWithOdd - 1, '1');
        }
        return new String(stringBuilder);
    }

}