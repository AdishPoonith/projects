package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import q6.x;
/* loaded from: classes.dex */
public final class q implements Comparable<q>, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    private final long f19983j;

    /* renamed from: k  reason: collision with root package name */
    private final int f19984k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(long j10, int i10) {
        q(j10, i10);
        this.f19983j = j10;
        this.f19984k = i10;
    }

    protected q(Parcel parcel) {
        this.f19983j = parcel.readLong();
        this.f19984k = parcel.readInt();
    }

    public q(Date date) {
        long time = date.getTime();
        long j10 = time / 1000;
        int i10 = ((int) (time % 1000)) * 1000000;
        if (i10 < 0) {
            j10--;
            i10 += 1000000000;
        }
        q(j10, i10);
        this.f19983j = j10;
        this.f19984k = i10;
    }

    public static q p() {
        return new q(new Date());
    }

    private static void q(long j10, int i10) {
        x.a(i10 >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        x.a(((double) i10) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        x.a(j10 >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
        x.a(j10 < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(q qVar) {
        long j10 = this.f19983j;
        long j11 = qVar.f19983j;
        return j10 == j11 ? Integer.signum(this.f19984k - qVar.f19984k) : Long.signum(j10 - j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof q) && compareTo((q) obj) == 0;
    }

    public int hashCode() {
        long j10 = this.f19983j;
        return (((((int) j10) * 37 * 37) + ((int) (j10 >> 32))) * 37) + this.f19984k;
    }

    public int k() {
        return this.f19984k;
    }

    public long l() {
        return this.f19983j;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f19983j + ", nanoseconds=" + this.f19984k + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f19983j);
        parcel.writeInt(this.f19984k);
    }
}
