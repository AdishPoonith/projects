package t2;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final int f18192j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18193k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18194l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public final int f18195m;

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

    public c(int i10, int i11, int i12) {
        this.f18192j = i10;
        this.f18193k = i11;
        this.f18194l = i12;
        this.f18195m = i12;
    }

    c(Parcel parcel) {
        this.f18192j = parcel.readInt();
        this.f18193k = parcel.readInt();
        int readInt = parcel.readInt();
        this.f18194l = readInt;
        this.f18195m = readInt;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(c cVar) {
        int i10 = this.f18192j - cVar.f18192j;
        if (i10 == 0) {
            int i11 = this.f18193k - cVar.f18193k;
            return i11 == 0 ? this.f18194l - cVar.f18194l : i11;
        }
        return i10;
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
        c cVar = (c) obj;
        return this.f18192j == cVar.f18192j && this.f18193k == cVar.f18193k && this.f18194l == cVar.f18194l;
    }

    public int hashCode() {
        return (((this.f18192j * 31) + this.f18193k) * 31) + this.f18194l;
    }

    public String toString() {
        return this.f18192j + "." + this.f18193k + "." + this.f18194l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18192j);
        parcel.writeInt(this.f18193k);
        parcel.writeInt(this.f18194l);
    }
}
