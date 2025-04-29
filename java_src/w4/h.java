package w4;
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: m  reason: collision with root package name */
    public final float f19879m;

    public h(float f10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f19879m = Math.max(f10, 0.0f);
    }

    @Override // w4.n
    public String toString() {
        float f10 = this.f19879m;
        return "[Dash: length=" + f10 + "]";
    }
}
