package m0;

import java.util.Locale;
import java.util.StringTokenizer;
/* loaded from: classes.dex */
public class c {
    public static Locale a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "_", false);
        String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (nextToken == null || nextToken2 == null || nextToken3 == null) {
            if (nextToken == null || nextToken2 == null) {
                if (nextToken != null) {
                    return new Locale(nextToken);
                }
                return null;
            }
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, nextToken3);
    }
}
