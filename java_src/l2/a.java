package l2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0194a();

    /* renamed from: j  reason: collision with root package name */
    public final int f13049j;

    /* renamed from: k  reason: collision with root package name */
    public final String f13050k;

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0194a implements Parcelable.Creator<a> {
        C0194a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) p3.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f13049j = i10;
        this.f13050k = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f13049j + ",url=" + this.f13050k + ")";
    }

    @Override // k2.a.b
    public /* synthetic */ void u(a2.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13050k);
        parcel.writeInt(this.f13049j);
    }
}
