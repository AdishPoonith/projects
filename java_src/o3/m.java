package o3;

import java.io.IOException;
/* loaded from: classes.dex */
public class m extends IOException {

    /* renamed from: j  reason: collision with root package name */
    public final int f14488j;

    public m(int i10) {
        this.f14488j = i10;
    }

    public m(String str, int i10) {
        super(str);
        this.f14488j = i10;
    }

    public m(String str, Throwable th, int i10) {
        super(str, th);
        this.f14488j = i10;
    }

    public m(Throwable th, int i10) {
        super(th);
        this.f14488j = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof o3.m
            if (r0 == 0) goto L11
            r0 = r2
            o3.m r0 = (o3.m) r0
            int r0 = r0.f14488j
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.m.a(java.io.IOException):boolean");
    }
}
