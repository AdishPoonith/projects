package r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
public final class f extends r2.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final List<c> f16658j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16659a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16660b;

        private b(int i10, long j10) {
            this.f16659a = i10;
            this.f16660b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f16659a);
            parcel.writeLong(this.f16660b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f16661a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16662b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16663c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16664d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16665e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f16666f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16667g;

        /* renamed from: h  reason: collision with root package name */
        public final long f16668h;

        /* renamed from: i  reason: collision with root package name */
        public final int f16669i;

        /* renamed from: j  reason: collision with root package name */
        public final int f16670j;

        /* renamed from: k  reason: collision with root package name */
        public final int f16671k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f16661a = j10;
            this.f16662b = z10;
            this.f16663c = z11;
            this.f16664d = z12;
            this.f16666f = Collections.unmodifiableList(list);
            this.f16665e = j11;
            this.f16667g = z13;
            this.f16668h = j12;
            this.f16669i = i10;
            this.f16670j = i11;
            this.f16671k = i12;
        }

        private c(Parcel parcel) {
            this.f16661a = parcel.readLong();
            this.f16662b = parcel.readByte() == 1;
            this.f16663c = parcel.readByte() == 1;
            this.f16664d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f16666f = Collections.unmodifiableList(arrayList);
            this.f16665e = parcel.readLong();
            this.f16667g = parcel.readByte() == 1;
            this.f16668h = parcel.readLong();
            this.f16669i = parcel.readInt();
            this.f16670j = parcel.readInt();
            this.f16671k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(a0 a0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long I = a0Var.I();
            boolean z14 = (a0Var.G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int G = a0Var.G();
                boolean z15 = (G & 128) != 0;
                boolean z16 = (G & 64) != 0;
                boolean z17 = (G & 32) != 0;
                long I2 = z16 ? a0Var.I() : -9223372036854775807L;
                if (!z16) {
                    int G2 = a0Var.G();
                    ArrayList arrayList3 = new ArrayList(G2);
                    for (int i13 = 0; i13 < G2; i13++) {
                        arrayList3.add(new b(a0Var.G(), a0Var.I(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long G3 = a0Var.G();
                    boolean z18 = (128 & G3) != 0;
                    j12 = ((((G3 & 1) << 32) | a0Var.I()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int M = a0Var.M();
                int G4 = a0Var.G();
                z12 = z16;
                i12 = a0Var.G();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = I2;
                i10 = M;
                i11 = G4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(I, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f16661a);
            parcel.writeByte(this.f16662b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16663c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16664d ? (byte) 1 : (byte) 0);
            int size = this.f16666f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f16666f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f16665e);
            parcel.writeByte(this.f16667g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f16668h);
            parcel.writeInt(this.f16669i);
            parcel.writeInt(this.f16670j);
            parcel.writeInt(this.f16671k);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f16658j = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private f(List<c> list) {
        this.f16658j = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(a0 a0Var) {
        int G = a0Var.G();
        ArrayList arrayList = new ArrayList(G);
        for (int i10 = 0; i10 < G; i10++) {
            arrayList.add(c.e(a0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f16658j.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f16658j.get(i11).f(parcel);
        }
    }
}
