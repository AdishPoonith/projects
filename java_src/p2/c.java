package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15288k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15289l;

    /* renamed from: m  reason: collision with root package name */
    public final int f15290m;

    /* renamed from: n  reason: collision with root package name */
    public final long f15291n;

    /* renamed from: o  reason: collision with root package name */
    public final long f15292o;

    /* renamed from: p  reason: collision with root package name */
    private final i[] f15293p;

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
        super("CHAP");
        this.f15288k = (String) n0.j(parcel.readString());
        this.f15289l = parcel.readInt();
        this.f15290m = parcel.readInt();
        this.f15291n = parcel.readLong();
        this.f15292o = parcel.readLong();
        int readInt = parcel.readInt();
        this.f15293p = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f15293p[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f15288k = str;
        this.f15289l = i10;
        this.f15290m = i11;
        this.f15291n = j10;
        this.f15292o = j11;
        this.f15293p = iVarArr;
    }

    @Override // p2.i, android.os.Parcelable
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
        c cVar = (c) obj;
        return this.f15289l == cVar.f15289l && this.f15290m == cVar.f15290m && this.f15291n == cVar.f15291n && this.f15292o == cVar.f15292o && n0.c(this.f15288k, cVar.f15288k) && Arrays.equals(this.f15293p, cVar.f15293p);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f15289l) * 31) + this.f15290m) * 31) + ((int) this.f15291n)) * 31) + ((int) this.f15292o)) * 31;
        String str = this.f15288k;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15288k);
        parcel.writeInt(this.f15289l);
        parcel.writeInt(this.f15290m);
        parcel.writeLong(this.f15291n);
        parcel.writeLong(this.f15292o);
        parcel.writeInt(this.f15293p.length);
        for (i iVar : this.f15293p) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
