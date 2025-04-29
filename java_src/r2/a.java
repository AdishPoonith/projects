package r2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.a0;
import p3.n0;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0241a();

    /* renamed from: j  reason: collision with root package name */
    public final long f16636j;

    /* renamed from: k  reason: collision with root package name */
    public final long f16637k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f16638l;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0241a implements Parcelable.Creator<a> {
        C0241a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f16636j = j11;
        this.f16637k = j10;
        this.f16638l = bArr;
    }

    private a(Parcel parcel) {
        this.f16636j = parcel.readLong();
        this.f16637k = parcel.readLong();
        this.f16638l = (byte[]) n0.j(parcel.createByteArray());
    }

    /* synthetic */ a(Parcel parcel, C0241a c0241a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(a0 a0Var, int i10, long j10) {
        long I = a0Var.I();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new a(I, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16636j);
        parcel.writeLong(this.f16637k);
        parcel.writeByteArray(this.f16638l);
    }
}
