package l9;

import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public final class c {
    public static String a(String str, String str2) {
        try {
            String b10 = okio.f.n((str + ":" + str2).getBytes("ISO-8859-1")).b();
            return "Basic " + b10;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
