package q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import p3.n0;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0236a();

    /* renamed from: j  reason: collision with root package name */
    public final String f15998j;

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f15999k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16000l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16001m;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0236a implements Parcelable.Creator<a> {
        C0236a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f15998j = (String) n0.j(parcel.readString());
        this.f15999k = (byte[]) n0.j(parcel.createByteArray());
        this.f16000l = parcel.readInt();
        this.f16001m = parcel.readInt();
    }

    /* synthetic */ a(Parcel parcel, C0236a c0236a) {
        this(parcel);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f15998j = str;
        this.f15999k = bArr;
        this.f16000l = i10;
        this.f16001m = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15998j.equals(aVar.f15998j) && Arrays.equals(this.f15999k, aVar.f15999k) && this.f16000l == aVar.f16000l && this.f16001m == aVar.f16001m;
    }

    public int hashCode() {
        return ((((((527 + this.f15998j.hashCode()) * 31) + Arrays.hashCode(this.f15999k)) * 31) + this.f16000l) * 31) + this.f16001m;
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "mdta: key=" + this.f15998j;
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
        parcel.writeString(this.f15998j);
        parcel.writeByteArray(this.f15999k);
        parcel.writeInt(this.f16000l);
        parcel.writeInt(this.f16001m);
    }
}
