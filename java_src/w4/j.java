package w4;
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: m  reason: collision with root package name */
    public final float f19880m;

    public j(float f10) {
        super(2, Float.valueOf(Math.max(f10, 0.0f)));
        this.f19880m = Math.max(f10, 0.0f);
    }

    @Override // w4.n
    public String toString() {
        float f10 = this.f19880m;
        return "[Gap: length=" + f10 + "]";
    }
}
