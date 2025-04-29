package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class f extends d4.a {
    public static final Parcelable.Creator<f> CREATOR = new k1();

    /* renamed from: j  reason: collision with root package name */
    private final u f3293j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f3294k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f3295l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f3296m;

    /* renamed from: n  reason: collision with root package name */
    private final int f3297n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f3298o;

    public f(u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f3293j = uVar;
        this.f3294k = z10;
        this.f3295l = z11;
        this.f3296m = iArr;
        this.f3297n = i10;
        this.f3298o = iArr2;
    }

    public int B() {
        return this.f3297n;
    }

    public int[] C() {
        return this.f3296m;
    }

    public int[] D() {
        return this.f3298o;
    }

    public boolean E() {
        return this.f3294k;
    }

    public boolean F() {
        return this.f3295l;
    }

    public final u G() {
        return this.f3293j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, this.f3293j, i10, false);
        d4.c.c(parcel, 2, E());
        d4.c.c(parcel, 3, F());
        d4.c.m(parcel, 4, C(), false);
        d4.c.l(parcel, 5, B());
        d4.c.m(parcel, 6, D(), false);
        d4.c.b(parcel, a10);
    }
}
