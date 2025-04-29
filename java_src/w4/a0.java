package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a0 extends d4.a {
    public static final Parcelable.Creator<a0> CREATOR = new g0();

    /* renamed from: j  reason: collision with root package name */
    private r4.n f19847j;

    /* renamed from: k  reason: collision with root package name */
    private b0 f19848k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19849l;

    /* renamed from: m  reason: collision with root package name */
    private float f19850m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f19851n;

    /* renamed from: o  reason: collision with root package name */
    private float f19852o;

    public a0() {
        this.f19849l = true;
        this.f19851n = true;
        this.f19852o = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f19849l = true;
        this.f19851n = true;
        this.f19852o = 0.0f;
        r4.n x10 = r4.m.x(iBinder);
        this.f19847j = x10;
        this.f19848k = x10 == null ? null : new e0(this);
        this.f19849l = z10;
        this.f19850m = f10;
        this.f19851n = z11;
        this.f19852o = f11;
    }

    public a0 B(boolean z10) {
        this.f19851n = z10;
        return this;
    }

    public boolean C() {
        return this.f19851n;
    }

    public float D() {
        return this.f19852o;
    }

    public float E() {
        return this.f19850m;
    }

    public boolean F() {
        return this.f19849l;
    }

    public a0 G(b0 b0Var) {
        this.f19848k = (b0) c4.s.k(b0Var, "tileProvider must not be null.");
        this.f19847j = new f0(this, b0Var);
        return this;
    }

    public a0 H(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        c4.s.b(z10, "Transparency must be in the range [0..1]");
        this.f19852o = f10;
        return this;
    }

    public a0 I(boolean z10) {
        this.f19849l = z10;
        return this;
    }

    public a0 J(float f10) {
        this.f19850m = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        r4.n nVar = this.f19847j;
        d4.c.k(parcel, 2, nVar == null ? null : nVar.asBinder(), false);
        d4.c.c(parcel, 3, F());
        d4.c.i(parcel, 4, E());
        d4.c.c(parcel, 5, C());
        d4.c.i(parcel, 6, D());
        d4.c.b(parcel, a10);
    }
}
