package q2;

import android.os.Parcel;
import android.os.Parcelable;
import e5.g;
import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final long f16002j;

    /* renamed from: k  reason: collision with root package name */
    public final long f16003k;

    /* renamed from: l  reason: collision with root package name */
    public final long f16004l;

    /* renamed from: m  reason: collision with root package name */
    public final long f16005m;

    /* renamed from: n  reason: collision with root package name */
    public final long f16006n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f16002j = j10;
        this.f16003k = j11;
        this.f16004l = j12;
        this.f16005m = j13;
        this.f16006n = j14;
    }

    private b(Parcel parcel) {
        this.f16002j = parcel.readLong();
        this.f16003k = parcel.readLong();
        this.f16004l = parcel.readLong();
        this.f16005m = parcel.readLong();
        this.f16006n = parcel.readLong();
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16002j == bVar.f16002j && this.f16003k == bVar.f16003k && this.f16004l == bVar.f16004l && this.f16005m == bVar.f16005m && this.f16006n == bVar.f16006n;
    }

    public int hashCode() {
        return ((((((((527 + g.b(this.f16002j)) * 31) + g.b(this.f16003k)) * 31) + g.b(this.f16004l)) * 31) + g.b(this.f16005m)) * 31) + g.b(this.f16006n);
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f16002j + ", photoSize=" + this.f16003k + ", photoPresentationTimestampUs=" + this.f16004l + ", videoStartPosition=" + this.f16005m + ", videoSize=" + this.f16006n;
    }

    @Override // k2.a.b
    public /* synthetic */ void u(a2.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16002j);
        parcel.writeLong(this.f16003k);
        parcel.writeLong(this.f16004l);
        parcel.writeLong(this.f16005m);
        parcel.writeLong(this.f16006n);
    }
}
