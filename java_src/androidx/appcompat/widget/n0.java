package androidx.appcompat.widget;
/* loaded from: classes.dex */
class n0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1266a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1267b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1268c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1269d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1270e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1271f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1272g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1273h = false;

    public int a() {
        return this.f1272g ? this.f1266a : this.f1267b;
    }

    public int b() {
        return this.f1266a;
    }

    public int c() {
        return this.f1267b;
    }

    public int d() {
        return this.f1272g ? this.f1267b : this.f1266a;
    }

    public void e(int i10, int i11) {
        this.f1273h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1270e = i10;
            this.f1266a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1271f = i11;
            this.f1267b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1272g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1272g = r2
            boolean r0 = r1.f1273h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1269d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1270e
        L16:
            r1.f1266a = r2
            int r2 = r1.f1268c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1268c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1270e
        L24:
            r1.f1266a = r2
            int r2 = r1.f1269d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1270e
            r1.f1266a = r2
        L2f:
            int r2 = r1.f1271f
        L31:
            r1.f1267b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1268c = i10;
        this.f1269d = i11;
        this.f1273h = true;
        if (this.f1272g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1266a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1267b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1266a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1267b = i11;
        }
    }
}
