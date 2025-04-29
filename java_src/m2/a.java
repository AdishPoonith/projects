package m2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import p3.n0;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class a implements a.b {

    /* renamed from: j  reason: collision with root package name */
    public final String f13709j;

    /* renamed from: k  reason: collision with root package name */
    public final String f13710k;

    /* renamed from: l  reason: collision with root package name */
    public final long f13711l;

    /* renamed from: m  reason: collision with root package name */
    public final long f13712m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f13713n;

    /* renamed from: o  reason: collision with root package name */
    private int f13714o;

    /* renamed from: p  reason: collision with root package name */
    private static final n1 f13707p = new n1.b().g0("application/id3").G();

    /* renamed from: q  reason: collision with root package name */
    private static final n1 f13708q = new n1.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<a> CREATOR = new C0201a();

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0201a implements Parcelable.Creator<a> {
        C0201a() {
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

    a(Parcel parcel) {
        this.f13709j = (String) n0.j(parcel.readString());
        this.f13710k = (String) n0.j(parcel.readString());
        this.f13711l = parcel.readLong();
        this.f13712m = parcel.readLong();
        this.f13713n = (byte[]) n0.j(parcel.createByteArray());
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f13709j = str;
        this.f13710k = str2;
        this.f13711l = j10;
        this.f13712m = j11;
        this.f13713n = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13711l == aVar.f13711l && this.f13712m == aVar.f13712m && n0.c(this.f13709j, aVar.f13709j) && n0.c(this.f13710k, aVar.f13710k) && Arrays.equals(this.f13713n, aVar.f13713n);
    }

    public int hashCode() {
        if (this.f13714o == 0) {
            String str = this.f13709j;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13710k;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f13711l;
            long j11 = this.f13712m;
            this.f13714o = ((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f13713n);
        }
        return this.f13714o;
    }

    @Override // k2.a.b
    public n1 n() {
        String str = this.f13709j;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f13708q;
            case 1:
            case 2:
                return f13707p;
            default:
                return null;
        }
    }

    public String toString() {
        return "EMSG: scheme=" + this.f13709j + ", id=" + this.f13712m + ", durationMs=" + this.f13711l + ", value=" + this.f13710k;
    }

    @Override // k2.a.b
    public /* synthetic */ void u(a2.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public byte[] w() {
        if (n() != null) {
            return this.f13713n;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13709j);
        parcel.writeString(this.f13710k);
        parcel.writeLong(this.f13711l);
        parcel.writeLong(this.f13712m);
        parcel.writeByteArray(this.f13713n);
    }
}
