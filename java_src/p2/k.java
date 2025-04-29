package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.n0;
/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final int f15316k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15317l;

    /* renamed from: m  reason: collision with root package name */
    public final int f15318m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f15319n;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f15320o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f15316k = i10;
        this.f15317l = i11;
        this.f15318m = i12;
        this.f15319n = iArr;
        this.f15320o = iArr2;
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f15316k = parcel.readInt();
        this.f15317l = parcel.readInt();
        this.f15318m = parcel.readInt();
        this.f15319n = (int[]) n0.j(parcel.createIntArray());
        this.f15320o = (int[]) n0.j(parcel.createIntArray());
    }

    @Override // p2.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f15316k == kVar.f15316k && this.f15317l == kVar.f15317l && this.f15318m == kVar.f15318m && Arrays.equals(this.f15319n, kVar.f15319n) && Arrays.equals(this.f15320o, kVar.f15320o);
    }

    public int hashCode() {
        return ((((((((527 + this.f15316k) * 31) + this.f15317l) * 31) + this.f15318m) * 31) + Arrays.hashCode(this.f15319n)) * 31) + Arrays.hashCode(this.f15320o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15316k);
        parcel.writeInt(this.f15317l);
        parcel.writeInt(this.f15318m);
        parcel.writeIntArray(this.f15319n);
        parcel.writeIntArray(this.f15320o);
    }
}
