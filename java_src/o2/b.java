package o2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import p3.n0;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final int f14395j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14396k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14397l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14398m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f14399n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14400o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        p3.a.a(i11 == -1 || i11 > 0);
        this.f14395j = i10;
        this.f14396k = str;
        this.f14397l = str2;
        this.f14398m = str3;
        this.f14399n = z10;
        this.f14400o = i11;
    }

    b(Parcel parcel) {
        this.f14395j = parcel.readInt();
        this.f14396k = parcel.readString();
        this.f14397l = parcel.readString();
        this.f14398m = parcel.readString();
        this.f14399n = n0.L0(parcel);
        this.f14400o = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o2.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b.a(java.util.Map):o2.b");
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
        return this.f14395j == bVar.f14395j && n0.c(this.f14396k, bVar.f14396k) && n0.c(this.f14397l, bVar.f14397l) && n0.c(this.f14398m, bVar.f14398m) && this.f14399n == bVar.f14399n && this.f14400o == bVar.f14400o;
    }

    public int hashCode() {
        int i10 = (527 + this.f14395j) * 31;
        String str = this.f14396k;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14397l;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14398m;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f14399n ? 1 : 0)) * 31) + this.f14400o;
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f14397l + "\", genre=\"" + this.f14396k + "\", bitrate=" + this.f14395j + ", metadataInterval=" + this.f14400o;
    }

    @Override // k2.a.b
    public void u(a2.b bVar) {
        String str = this.f14397l;
        if (str != null) {
            bVar.k0(str);
        }
        String str2 = this.f14396k;
        if (str2 != null) {
            bVar.Z(str2);
        }
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14395j);
        parcel.writeString(this.f14396k);
        parcel.writeString(this.f14397l);
        parcel.writeString(this.f14398m);
        n0.Z0(parcel, this.f14399n);
        parcel.writeInt(this.f14400o);
    }
}
