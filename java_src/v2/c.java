package v2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p3.n0;
import s1.h;
import v2.c;
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: p  reason: collision with root package name */
    public static final c f19395p = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: q  reason: collision with root package name */
    private static final a f19396q = new a(0).i(0);

    /* renamed from: r  reason: collision with root package name */
    private static final String f19397r = n0.q0(1);

    /* renamed from: s  reason: collision with root package name */
    private static final String f19398s = n0.q0(2);

    /* renamed from: t  reason: collision with root package name */
    private static final String f19399t = n0.q0(3);

    /* renamed from: u  reason: collision with root package name */
    private static final String f19400u = n0.q0(4);

    /* renamed from: v  reason: collision with root package name */
    public static final h.a<c> f19401v = new h.a() { // from class: v2.a
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            c b10;
            b10 = c.b(bundle);
            return b10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final Object f19402j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19403k;

    /* renamed from: l  reason: collision with root package name */
    public final long f19404l;

    /* renamed from: m  reason: collision with root package name */
    public final long f19405m;

    /* renamed from: n  reason: collision with root package name */
    public final int f19406n;

    /* renamed from: o  reason: collision with root package name */
    private final a[] f19407o;

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: r  reason: collision with root package name */
        private static final String f19408r = n0.q0(0);

        /* renamed from: s  reason: collision with root package name */
        private static final String f19409s = n0.q0(1);

        /* renamed from: t  reason: collision with root package name */
        private static final String f19410t = n0.q0(2);

        /* renamed from: u  reason: collision with root package name */
        private static final String f19411u = n0.q0(3);

        /* renamed from: v  reason: collision with root package name */
        private static final String f19412v = n0.q0(4);

        /* renamed from: w  reason: collision with root package name */
        private static final String f19413w = n0.q0(5);

        /* renamed from: x  reason: collision with root package name */
        private static final String f19414x = n0.q0(6);

        /* renamed from: y  reason: collision with root package name */
        private static final String f19415y = n0.q0(7);

        /* renamed from: z  reason: collision with root package name */
        public static final h.a<a> f19416z = new h.a() { // from class: v2.b
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                c.a d10;
                d10 = c.a.d(bundle);
                return d10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final long f19417j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19418k;

        /* renamed from: l  reason: collision with root package name */
        public final int f19419l;

        /* renamed from: m  reason: collision with root package name */
        public final Uri[] f19420m;

        /* renamed from: n  reason: collision with root package name */
        public final int[] f19421n;

        /* renamed from: o  reason: collision with root package name */
        public final long[] f19422o;

        /* renamed from: p  reason: collision with root package name */
        public final long f19423p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f19424q;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            p3.a.a(iArr.length == uriArr.length);
            this.f19417j = j10;
            this.f19418k = i10;
            this.f19419l = i11;
            this.f19421n = iArr;
            this.f19420m = uriArr;
            this.f19422o = jArr;
            this.f19423p = j11;
            this.f19424q = z10;
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a d(Bundle bundle) {
            long j10 = bundle.getLong(f19408r);
            int i10 = bundle.getInt(f19409s);
            int i11 = bundle.getInt(f19415y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19410t);
            int[] intArray = bundle.getIntArray(f19411u);
            long[] longArray = bundle.getLongArray(f19412v);
            long j11 = bundle.getLong(f19413w);
            boolean z10 = bundle.getBoolean(f19414x);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19417j == aVar.f19417j && this.f19418k == aVar.f19418k && this.f19419l == aVar.f19419l && Arrays.equals(this.f19420m, aVar.f19420m) && Arrays.equals(this.f19421n, aVar.f19421n) && Arrays.equals(this.f19422o, aVar.f19422o) && this.f19423p == aVar.f19423p && this.f19424q == aVar.f19424q;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f19421n;
                if (i11 >= iArr.length || this.f19424q || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f19418k == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f19418k; i10++) {
                int[] iArr = this.f19421n;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            return this.f19418k == -1 || e() < this.f19418k;
        }

        public int hashCode() {
            long j10 = this.f19417j;
            long j11 = this.f19423p;
            return (((((((((((((this.f19418k * 31) + this.f19419l) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f19420m)) * 31) + Arrays.hashCode(this.f19421n)) * 31) + Arrays.hashCode(this.f19422o)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f19424q ? 1 : 0);
        }

        public a i(int i10) {
            int[] c10 = c(this.f19421n, i10);
            long[] b10 = b(this.f19422o, i10);
            return new a(this.f19417j, i10, this.f19419l, c10, (Uri[]) Arrays.copyOf(this.f19420m, i10), b10, this.f19423p, this.f19424q);
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f19402j = obj;
        this.f19404l = j10;
        this.f19405m = j11;
        this.f19403k = aVarArr.length + i10;
        this.f19407o = aVarArr;
        this.f19406n = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19397r);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f19416z.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f19398s;
        c cVar = f19395p;
        return new c(null, aVarArr, bundle.getLong(str, cVar.f19404l), bundle.getLong(f19399t, cVar.f19405m), bundle.getInt(f19400u, cVar.f19406n));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f19417j;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public a c(int i10) {
        int i11 = this.f19406n;
        return i10 < i11 ? f19396q : this.f19407o[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                int i10 = this.f19406n;
                while (i10 < this.f19403k && ((c(i10).f19417j != Long.MIN_VALUE && c(i10).f19417j <= j10) || !c(i10).h())) {
                    i10++;
                }
                if (i10 < this.f19403k) {
                    return i10;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f19403k - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return n0.c(this.f19402j, cVar.f19402j) && this.f19403k == cVar.f19403k && this.f19404l == cVar.f19404l && this.f19405m == cVar.f19405m && this.f19406n == cVar.f19406n && Arrays.equals(this.f19407o, cVar.f19407o);
    }

    public int hashCode() {
        int i10 = this.f19403k * 31;
        Object obj = this.f19402j;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f19404l)) * 31) + ((int) this.f19405m)) * 31) + this.f19406n) * 31) + Arrays.hashCode(this.f19407o);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f19402j);
        sb.append(", adResumePositionUs=");
        sb.append(this.f19404l);
        sb.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f19407o.length; i10++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f19407o[i10].f19417j);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < this.f19407o[i10].f19421n.length; i11++) {
                sb.append("ad(state=");
                int i12 = this.f19407o[i10].f19421n[i11];
                sb.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f19407o[i10].f19422o[i11]);
                sb.append(')');
                if (i11 < this.f19407o[i10].f19421n.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < this.f19407o.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
