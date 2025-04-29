package r2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.a0;
import p3.j0;
/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final long f16672j;

    /* renamed from: k  reason: collision with root package name */
    public final long f16673k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    private g(long j10, long j11) {
        this.f16672j = j10;
        this.f16673k = j11;
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(a0 a0Var, long j10, j0 j0Var) {
        long b10 = b(a0Var, j10);
        return new g(b10, j0Var.b(b10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(a0 a0Var, long j10) {
        long G = a0Var.G();
        if ((128 & G) != 0) {
            return 8589934591L & ((((G & 1) << 32) | a0Var.I()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16672j);
        parcel.writeLong(this.f16673k);
    }
}
