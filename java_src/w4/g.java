package w4;
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: n  reason: collision with root package name */
    public final a f19877n;

    /* renamed from: o  reason: collision with root package name */
    public final float f19878o;

    public g(a aVar) {
        this(aVar, 10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(w4.a r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = c4.s.k(r3, r0)
            w4.a r0 = (w4.a) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L15
            r2.<init>(r0, r4)
            r2.f19877n = r3
            r2.f19878o = r4
            return
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.<init>(w4.a, float):void");
    }

    @Override // w4.d
    public String toString() {
        String valueOf = String.valueOf(this.f19877n);
        float f10 = this.f19878o;
        return "[CustomCap: bitmapDescriptor=" + valueOf + " refWidth=" + f10 + "]";
    }
}
