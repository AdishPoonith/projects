package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.n0;
/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15299k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15300l;

    /* renamed from: m  reason: collision with root package name */
    public final String f15301m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    e(Parcel parcel) {
        super("COMM");
        this.f15299k = (String) n0.j(parcel.readString());
        this.f15300l = (String) n0.j(parcel.readString());
        this.f15301m = (String) n0.j(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f15299k = str;
        this.f15300l = str2;
        this.f15301m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return n0.c(this.f15300l, eVar.f15300l) && n0.c(this.f15299k, eVar.f15299k) && n0.c(this.f15301m, eVar.f15301m);
    }

    public int hashCode() {
        String str = this.f15299k;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15300l;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15301m;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": language=" + this.f15299k + ", description=" + this.f15300l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15312j);
        parcel.writeString(this.f15299k);
        parcel.writeString(this.f15301m);
    }
}
