package w5;

import c4.s;
/* loaded from: classes.dex */
public class l extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        s.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th) {
        super(str, th);
        s.g(str, "Detail message must not be empty");
    }
}
