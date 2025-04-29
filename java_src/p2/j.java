package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.n0;
/* loaded from: classes.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15313k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15314l;

    /* renamed from: m  reason: collision with root package name */
    public final String f15315m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    j(Parcel parcel) {
        super("----");
        this.f15313k = (String) n0.j(parcel.readString());
        this.f15314l = (String) n0.j(parcel.readString());
        this.f15315m = (String) n0.j(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f15313k = str;
        this.f15314l = str2;
        this.f15315m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return n0.c(this.f15314l, jVar.f15314l) && n0.c(this.f15313k, jVar.f15313k) && n0.c(this.f15315m, jVar.f15315m);
    }

    public int hashCode() {
        String str = this.f15313k;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15314l;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15315m;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": domain=" + this.f15313k + ", description=" + this.f15314l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15312j);
        parcel.writeString(this.f15313k);
        parcel.writeString(this.f15315m);
    }
}
