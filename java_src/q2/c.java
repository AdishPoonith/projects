package q2;

import android.os.Parcel;
import android.os.Parcelable;
import b5.j;
import com.google.common.collect.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k2.a;
import p3.n0;
import q2.c;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final List<b> f16007j;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: j  reason: collision with root package name */
        public final long f16009j;

        /* renamed from: k  reason: collision with root package name */
        public final long f16010k;

        /* renamed from: l  reason: collision with root package name */
        public final int f16011l;

        /* renamed from: m  reason: collision with root package name */
        public static final Comparator<b> f16008m = new Comparator() { // from class: q2.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b10;
                b10 = c.b.b((c.b) obj, (c.b) obj2);
                return b10;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            p3.a.a(j10 < j11);
            this.f16009j = j10;
            this.f16010k = j11;
            this.f16011l = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            return k.j().e(bVar.f16009j, bVar2.f16009j).e(bVar.f16010k, bVar2.f16010k).d(bVar.f16011l, bVar2.f16011l).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16009j == bVar.f16009j && this.f16010k == bVar.f16010k && this.f16011l == bVar.f16011l;
        }

        public int hashCode() {
            return j.b(Long.valueOf(this.f16009j), Long.valueOf(this.f16010k), Integer.valueOf(this.f16011l));
        }

        public String toString() {
            return n0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f16009j), Long.valueOf(this.f16010k), Integer.valueOf(this.f16011l));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f16009j);
            parcel.writeLong(this.f16010k);
            parcel.writeInt(this.f16011l);
        }
    }

    public c(List<b> list) {
        this.f16007j = list;
        p3.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f16010k;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f16009j < j10) {
                return true;
            }
            j10 = list.get(i10).f16010k;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f16007j.equals(((c) obj).f16007j);
    }

    public int hashCode() {
        return this.f16007j.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f16007j;
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
        parcel.writeList(this.f16007j);
    }
}
