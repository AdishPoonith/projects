package r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.j0;
/* loaded from: classes.dex */
public final class d extends r2.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final long f16642j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16643k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16644l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f16645m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f16646n;

    /* renamed from: o  reason: collision with root package name */
    public final long f16647o;

    /* renamed from: p  reason: collision with root package name */
    public final long f16648p;

    /* renamed from: q  reason: collision with root package name */
    public final List<b> f16649q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f16650r;

    /* renamed from: s  reason: collision with root package name */
    public final long f16651s;

    /* renamed from: t  reason: collision with root package name */
    public final int f16652t;

    /* renamed from: u  reason: collision with root package name */
    public final int f16653u;

    /* renamed from: v  reason: collision with root package name */
    public final int f16654v;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16655a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16656b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16657c;

        private b(int i10, long j10, long j11) {
            this.f16655a = i10;
            this.f16656b = j10;
            this.f16657c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f16655a);
            parcel.writeLong(this.f16656b);
            parcel.writeLong(this.f16657c);
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f16642j = j10;
        this.f16643k = z10;
        this.f16644l = z11;
        this.f16645m = z12;
        this.f16646n = z13;
        this.f16647o = j11;
        this.f16648p = j12;
        this.f16649q = Collections.unmodifiableList(list);
        this.f16650r = z14;
        this.f16651s = j13;
        this.f16652t = i10;
        this.f16653u = i11;
        this.f16654v = i12;
    }

    private d(Parcel parcel) {
        this.f16642j = parcel.readLong();
        this.f16643k = parcel.readByte() == 1;
        this.f16644l = parcel.readByte() == 1;
        this.f16645m = parcel.readByte() == 1;
        this.f16646n = parcel.readByte() == 1;
        this.f16647o = parcel.readLong();
        this.f16648p = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f16649q = Collections.unmodifiableList(arrayList);
        this.f16650r = parcel.readByte() == 1;
        this.f16651s = parcel.readLong();
        this.f16652t = parcel.readInt();
        this.f16653u = parcel.readInt();
        this.f16654v = parcel.readInt();
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(a0 a0Var, long j10, j0 j0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long I = a0Var.I();
        boolean z15 = (a0Var.G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int G = a0Var.G();
            boolean z16 = (G & 128) != 0;
            boolean z17 = (G & 64) != 0;
            boolean z18 = (G & 32) != 0;
            boolean z19 = (G & 16) != 0;
            long b10 = (!z17 || z19) ? -9223372036854775807L : g.b(a0Var, j10);
            if (!z17) {
                int G2 = a0Var.G();
                ArrayList arrayList = new ArrayList(G2);
                for (int i13 = 0; i13 < G2; i13++) {
                    int G3 = a0Var.G();
                    long b11 = !z19 ? g.b(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(G3, b11, j0Var.b(b11), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long G4 = a0Var.G();
                boolean z20 = (128 & G4) != 0;
                j13 = ((((G4 & 1) << 32) | a0Var.I()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = a0Var.M();
            z13 = z17;
            i11 = a0Var.G();
            i12 = a0Var.G();
            list = emptyList;
            long j14 = b10;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new d(I, z15, z10, z13, z11, j11, j0Var.b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16642j);
        parcel.writeByte(this.f16643k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16644l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16645m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16646n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16647o);
        parcel.writeLong(this.f16648p);
        int size = this.f16649q.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f16649q.get(i11).b(parcel);
        }
        parcel.writeByte(this.f16650r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16651s);
        parcel.writeInt(this.f16652t);
        parcel.writeInt(this.f16653u);
        parcel.writeInt(this.f16654v);
    }
}
