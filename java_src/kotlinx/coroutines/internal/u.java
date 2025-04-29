package kotlinx.coroutines.internal;

import la.c1;
import la.g2;
import la.t0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends g2 implements t0 {

    /* renamed from: l  reason: collision with root package name */
    private final Throwable f12920l;

    /* renamed from: m  reason: collision with root package name */
    private final String f12921m;

    public u(Throwable th, String str) {
        this.f12920l = th;
        this.f12921m = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void n0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f12920l
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f12921m
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f12920l
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.t.d()
            s9.e r0 = new s9.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.u.n0():java.lang.Void");
    }

    @Override // la.t0
    public c1 c0(long j10, Runnable runnable, v9.g gVar) {
        n0();
        throw new s9.e();
    }

    @Override // la.g0
    public boolean i0(v9.g gVar) {
        n0();
        throw new s9.e();
    }

    @Override // la.g2
    public g2 k0() {
        return this;
    }

    @Override // la.g0
    /* renamed from: m0 */
    public Void h0(v9.g gVar, Runnable runnable) {
        n0();
        throw new s9.e();
    }

    @Override // la.g2, la.g0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f12920l != null) {
            str = ", cause=" + this.f12920l;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
