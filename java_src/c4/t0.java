package c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c4.k;
/* loaded from: classes.dex */
public final class t0 extends d4.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    /* renamed from: j  reason: collision with root package name */
    final int f3393j;

    /* renamed from: k  reason: collision with root package name */
    final IBinder f3394k;

    /* renamed from: l  reason: collision with root package name */
    private final b4.b f3395l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f3396m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f3397n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(int i10, IBinder iBinder, b4.b bVar, boolean z10, boolean z11) {
        this.f3393j = i10;
        this.f3394k = iBinder;
        this.f3395l = bVar;
        this.f3396m = z10;
        this.f3397n = z11;
    }

    public final b4.b B() {
        return this.f3395l;
    }

    public final k C() {
        IBinder iBinder = this.f3394k;
        if (iBinder == null) {
            return null;
        }
        return k.a.x(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            return this.f3395l.equals(t0Var.f3395l) && q.b(C(), t0Var.C());
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3393j);
        d4.c.k(parcel, 2, this.f3394k, false);
        d4.c.r(parcel, 3, this.f3395l, i10, false);
        d4.c.c(parcel, 4, this.f3396m);
        d4.c.c(parcel, 5, this.f3397n);
        d4.c.b(parcel, a10);
    }
}
