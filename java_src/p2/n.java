package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.n0;
/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15326k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15327l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    n(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f15326k = parcel.readString();
        this.f15327l = (String) n0.j(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f15326k = str2;
        this.f15327l = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f15312j.equals(nVar.f15312j) && n0.c(this.f15326k, nVar.f15326k) && n0.c(this.f15327l, nVar.f15327l);
    }

    public int hashCode() {
        int hashCode = (527 + this.f15312j.hashCode()) * 31;
        String str = this.f15326k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15327l;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": url=" + this.f15327l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15312j);
        parcel.writeString(this.f15326k);
        parcel.writeString(this.f15327l);
    }
}
