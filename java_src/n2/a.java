package n2;

import android.os.Parcel;
import android.os.Parcelable;
import b5.d;
import java.util.Arrays;
import k2.a;
import p3.a0;
import p3.n0;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0205a();

    /* renamed from: j  reason: collision with root package name */
    public final int f14053j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14054k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14055l;

    /* renamed from: m  reason: collision with root package name */
    public final int f14056m;

    /* renamed from: n  reason: collision with root package name */
    public final int f14057n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14058o;

    /* renamed from: p  reason: collision with root package name */
    public final int f14059p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f14060q;

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0205a implements Parcelable.Creator<a> {
        C0205a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f14053j = i10;
        this.f14054k = str;
        this.f14055l = str2;
        this.f14056m = i11;
        this.f14057n = i12;
        this.f14058o = i13;
        this.f14059p = i14;
        this.f14060q = bArr;
    }

    a(Parcel parcel) {
        this.f14053j = parcel.readInt();
        this.f14054k = (String) n0.j(parcel.readString());
        this.f14055l = (String) n0.j(parcel.readString());
        this.f14056m = parcel.readInt();
        this.f14057n = parcel.readInt();
        this.f14058o = parcel.readInt();
        this.f14059p = parcel.readInt();
        this.f14060q = (byte[]) n0.j(parcel.createByteArray());
    }

    public static a a(a0 a0Var) {
        int p10 = a0Var.p();
        String E = a0Var.E(a0Var.p(), d.f2948a);
        String D = a0Var.D(a0Var.p());
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        int p13 = a0Var.p();
        int p14 = a0Var.p();
        int p15 = a0Var.p();
        byte[] bArr = new byte[p15];
        a0Var.l(bArr, 0, p15);
        return new a(p10, E, D, p11, p12, p13, p14, bArr);
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
        return this.f14053j == aVar.f14053j && this.f14054k.equals(aVar.f14054k) && this.f14055l.equals(aVar.f14055l) && this.f14056m == aVar.f14056m && this.f14057n == aVar.f14057n && this.f14058o == aVar.f14058o && this.f14059p == aVar.f14059p && Arrays.equals(this.f14060q, aVar.f14060q);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f14053j) * 31) + this.f14054k.hashCode()) * 31) + this.f14055l.hashCode()) * 31) + this.f14056m) * 31) + this.f14057n) * 31) + this.f14058o) * 31) + this.f14059p) * 31) + Arrays.hashCode(this.f14060q);
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f14054k + ", description=" + this.f14055l;
    }

    @Override // k2.a.b
    public void u(a2.b bVar) {
        bVar.I(this.f14060q, this.f14053j);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14053j);
        parcel.writeString(this.f14054k);
        parcel.writeString(this.f14055l);
        parcel.writeInt(this.f14056m);
        parcel.writeInt(this.f14057n);
        parcel.writeInt(this.f14058o);
        parcel.writeInt(this.f14059p);
        parcel.writeByteArray(this.f14060q);
    }
}
