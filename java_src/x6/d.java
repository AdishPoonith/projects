package x6;

import android.net.Uri;
import android.text.TextUtils;
import c4.s;
/* loaded from: classes.dex */
public class d {
    public static String a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("/") || str.endsWith("/") || str.contains("//")) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : str.split("/", -1)) {
                if (!TextUtils.isEmpty(str2)) {
                    if (sb.length() > 0) {
                        sb.append("/");
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }
        return str;
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : c(Uri.encode(str));
    }

    public static String c(String str) {
        s.j(str);
        return str.replace("%2F", "/");
    }
}
