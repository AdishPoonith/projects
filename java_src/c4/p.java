package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class p extends d4.a {
    public static final Parcelable.Creator<p> CREATOR = new m0();

    /* renamed from: j  reason: collision with root package name */
    private final int f3362j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3363k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3364l;

    /* renamed from: m  reason: collision with root package name */
    private final long f3365m;

    /* renamed from: n  reason: collision with root package name */
    private final long f3366n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3367o;

    /* renamed from: p  reason: collision with root package name */
    private final String f3368p;

    /* renamed from: q  reason: collision with root package name */
    private final int f3369q;

    /* renamed from: r  reason: collision with root package name */
    private final int f3370r;

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f3362j = i10;
        this.f3363k = i11;
        this.f3364l = i12;
        this.f3365m = j10;
        this.f3366n = j11;
        this.f3367o = str;
        this.f3368p = str2;
        this.f3369q = i13;
        this.f3370r = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3362j);
        d4.c.l(parcel, 2, this.f3363k);
        d4.c.l(parcel, 3, this.f3364l);
        d4.c.p(parcel, 4, this.f3365m);
        d4.c.p(parcel, 5, this.f3366n);
        d4.c.s(parcel, 6, this.f3367o, false);
        d4.c.s(parcel, 7, this.f3368p, false);
        d4.c.l(parcel, 8, this.f3369q);
        d4.c.l(parcel, 9, this.f3370r);
        d4.c.b(parcel, a10);
    }
}
