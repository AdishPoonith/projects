package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15294k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f15295l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15296m;

    /* renamed from: n  reason: collision with root package name */
    public final String[] f15297n;

    /* renamed from: o  reason: collision with root package name */
    private final i[] f15298o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f15294k = (String) n0.j(parcel.readString());
        this.f15295l = parcel.readByte() != 0;
        this.f15296m = parcel.readByte() != 0;
        this.f15297n = (String[]) n0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f15298o = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f15298o[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f15294k = str;
        this.f15295l = z10;
        this.f15296m = z11;
        this.f15297n = strArr;
        this.f15298o = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15295l == dVar.f15295l && this.f15296m == dVar.f15296m && n0.c(this.f15294k, dVar.f15294k) && Arrays.equals(this.f15297n, dVar.f15297n) && Arrays.equals(this.f15298o, dVar.f15298o);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f15295l ? 1 : 0)) * 31) + (this.f15296m ? 1 : 0)) * 31;
        String str = this.f15294k;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15294k);
        parcel.writeByte(this.f15295l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15296m ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f15297n);
        parcel.writeInt(this.f15298o.length);
        for (i iVar : this.f15298o) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
