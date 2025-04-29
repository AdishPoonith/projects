package o2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f14401j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14402k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14403l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(Parcel parcel) {
        this.f14401j = (byte[]) p3.a.e(parcel.createByteArray());
        this.f14402k = parcel.readString();
        this.f14403l = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f14401j = bArr;
        this.f14402k = str;
        this.f14403l = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14401j, ((c) obj).f14401j);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14401j);
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f14402k, this.f14403l, Integer.valueOf(this.f14401j.length));
    }

    @Override // k2.a.b
    public void u(a2.b bVar) {
        String str = this.f14402k;
        if (str != null) {
            bVar.m0(str);
        }
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14401j);
        parcel.writeString(this.f14402k);
        parcel.writeString(this.f14403l);
    }
}
