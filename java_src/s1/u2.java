package s1;

import java.io.IOException;
/* loaded from: classes.dex */
public class u2 extends IOException {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17590j;

    /* renamed from: k  reason: collision with root package name */
    public final int f17591k;

    /* JADX INFO: Access modifiers changed from: protected */
    public u2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f17590j = z10;
        this.f17591k = i10;
    }

    public static u2 a(String str, Throwable th) {
        return new u2(str, th, true, 1);
    }

    public static u2 b(String str, Throwable th) {
        return new u2(str, th, true, 0);
    }

    public static u2 c(String str, Throwable th) {
        return new u2(str, th, true, 4);
    }

    public static u2 d(String str) {
        return new u2(str, null, false, 1);
    }
}
