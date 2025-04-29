package ka;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s extends r {
    public static final String q0(String str, int i10) {
        int c10;
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i10 >= 0) {
            c10 = ha.i.c(i10, str.length());
            String substring = str.substring(c10);
            kotlin.jvm.internal.l.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
