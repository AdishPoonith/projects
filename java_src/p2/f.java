package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15302k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15303l;

    /* renamed from: m  reason: collision with root package name */
    public final String f15304m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f15305n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f15302k = (String) n0.j(parcel.readString());
        this.f15303l = (String) n0.j(parcel.readString());
        this.f15304m = (String) n0.j(parcel.readString());
        this.f15305n = (byte[]) n0.j(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f15302k = str;
        this.f15303l = str2;
        this.f15304m = str3;
        this.f15305n = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return n0.c(this.f15302k, fVar.f15302k) && n0.c(this.f15303l, fVar.f15303l) && n0.c(this.f15304m, fVar.f15304m) && Arrays.equals(this.f15305n, fVar.f15305n);
    }

    public int hashCode() {
        String str = this.f15302k;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15303l;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15304m;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15305n);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": mimeType=" + this.f15302k + ", filename=" + this.f15303l + ", description=" + this.f15304m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15302k);
        parcel.writeString(this.f15303l);
        parcel.writeString(this.f15304m);
        parcel.writeByteArray(this.f15305n);
    }
}
