package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
import s1.a2;
/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0223a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15283k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15284l;

    /* renamed from: m  reason: collision with root package name */
    public final int f15285m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f15286n;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0223a implements Parcelable.Creator<a> {
        C0223a() {
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

    a(Parcel parcel) {
        super("APIC");
        this.f15283k = (String) n0.j(parcel.readString());
        this.f15284l = parcel.readString();
        this.f15285m = parcel.readInt();
        this.f15286n = (byte[]) n0.j(parcel.createByteArray());
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f15283k = str;
        this.f15284l = str2;
        this.f15285m = i10;
        this.f15286n = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15285m == aVar.f15285m && n0.c(this.f15283k, aVar.f15283k) && n0.c(this.f15284l, aVar.f15284l) && Arrays.equals(this.f15286n, aVar.f15286n);
    }

    public int hashCode() {
        int i10 = (527 + this.f15285m) * 31;
        String str = this.f15283k;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15284l;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15286n);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": mimeType=" + this.f15283k + ", description=" + this.f15284l;
    }

    @Override // p2.i, k2.a.b
    public void u(a2.b bVar) {
        bVar.I(this.f15286n, this.f15285m);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15283k);
        parcel.writeString(this.f15284l);
        parcel.writeInt(this.f15285m);
        parcel.writeByteArray(this.f15286n);
    }
}
