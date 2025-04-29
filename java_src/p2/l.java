package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f15321k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f15322l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f15321k = (String) n0.j(parcel.readString());
        this.f15322l = (byte[]) n0.j(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f15321k = str;
        this.f15322l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return n0.c(this.f15321k, lVar.f15321k) && Arrays.equals(this.f15322l, lVar.f15322l);
    }

    public int hashCode() {
        String str = this.f15321k;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15322l);
    }

    @Override // p2.i
    public String toString() {
        return this.f15312j + ": owner=" + this.f15321k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15321k);
        parcel.writeByteArray(this.f15322l);
    }
}
