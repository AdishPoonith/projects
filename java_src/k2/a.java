package k2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p3.n0;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0185a();

    /* renamed from: j  reason: collision with root package name */
    private final b[] f12494j;

    /* renamed from: k  reason: collision with root package name */
    public final long f12495k;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0185a implements Parcelable.Creator<a> {
        C0185a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        n1 n();

        void u(a2.b bVar);

        byte[] w();
    }

    public a(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    public a(long j10, b... bVarArr) {
        this.f12495k = j10;
        this.f12494j = bVarArr;
    }

    a(Parcel parcel) {
        this.f12494j = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f12494j;
            if (i10 >= bVarArr.length) {
                this.f12495k = parcel.readLong();
                return;
            } else {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            }
        }
    }

    public a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a(this.f12495k, (b[]) n0.F0(this.f12494j, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f12494j);
    }

    public a c(long j10) {
        return this.f12495k == j10 ? this : new a(j10, this.f12494j);
    }

    public b d(int i10) {
        return this.f12494j[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f12494j.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f12494j, aVar.f12494j) && this.f12495k == aVar.f12495k;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f12494j) * 31) + e5.g.b(this.f12495k);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f12494j));
        if (this.f12495k == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f12495k;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12494j.length);
        for (b bVar : this.f12494j) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f12495k);
    }
}
