package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f15287k;

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

    b(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f15287k = (byte[]) n0.j(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f15287k = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15312j.equals(bVar.f15312j) && Arrays.equals(this.f15287k, bVar.f15287k);
    }

    public int hashCode() {
        return ((527 + this.f15312j.hashCode()) * 31) + Arrays.hashCode(this.f15287k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15312j);
        parcel.writeByteArray(this.f15287k);
    }
}
