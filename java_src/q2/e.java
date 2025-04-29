package q2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final float f16013j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16014k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(float f10, int i10) {
        this.f16013j = f10;
        this.f16014k = i10;
    }

    private e(Parcel parcel) {
        this.f16013j = parcel.readFloat();
        this.f16014k = parcel.readInt();
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16013j == eVar.f16013j && this.f16014k == eVar.f16014k;
    }

    public int hashCode() {
        return ((527 + e5.c.a(this.f16013j)) * 31) + this.f16014k;
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f16013j + ", svcTemporalLayerCount=" + this.f16014k;
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
        parcel.writeFloat(this.f16013j);
        parcel.writeInt(this.f16014k);
    }
}
