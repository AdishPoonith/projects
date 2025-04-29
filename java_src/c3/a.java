package c3;

import android.net.Uri;
import f2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p3.l0;
import p3.n0;
import s1.n1;
import t2.c;
/* loaded from: classes.dex */
public class a implements t2.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f3192a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3193b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3194c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3195d;

    /* renamed from: e  reason: collision with root package name */
    public final C0074a f3196e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f3197f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3198g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3199h;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f3200a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f3201b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f3202c;

        public C0074a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f3200a = uuid;
            this.f3201b = bArr;
            this.f3202c = pVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3203a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3204b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3205c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3206d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3207e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3208f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3209g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3210h;

        /* renamed from: i  reason: collision with root package name */
        public final String f3211i;

        /* renamed from: j  reason: collision with root package name */
        public final n1[] f3212j;

        /* renamed from: k  reason: collision with root package name */
        public final int f3213k;

        /* renamed from: l  reason: collision with root package name */
        private final String f3214l;

        /* renamed from: m  reason: collision with root package name */
        private final String f3215m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f3216n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f3217o;

        /* renamed from: p  reason: collision with root package name */
        private final long f3218p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, n1[] n1VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, n1VarArr, list, n0.O0(list, 1000000L, j10), n0.N0(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, n1[] n1VarArr, List<Long> list, long[] jArr, long j11) {
            this.f3214l = str;
            this.f3215m = str2;
            this.f3203a = i10;
            this.f3204b = str3;
            this.f3205c = j10;
            this.f3206d = str4;
            this.f3207e = i11;
            this.f3208f = i12;
            this.f3209g = i13;
            this.f3210h = i14;
            this.f3211i = str5;
            this.f3212j = n1VarArr;
            this.f3216n = list;
            this.f3217o = jArr;
            this.f3218p = j11;
            this.f3213k = list.size();
        }

        public Uri a(int i10, int i11) {
            p3.a.f(this.f3212j != null);
            p3.a.f(this.f3216n != null);
            p3.a.f(i11 < this.f3216n.size());
            String num = Integer.toString(this.f3212j[i10].f17415q);
            String l10 = this.f3216n.get(i11).toString();
            return l0.e(this.f3214l, this.f3215m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(n1[] n1VarArr) {
            return new b(this.f3214l, this.f3215m, this.f3203a, this.f3204b, this.f3205c, this.f3206d, this.f3207e, this.f3208f, this.f3209g, this.f3210h, this.f3211i, n1VarArr, this.f3216n, this.f3217o, this.f3218p);
        }

        public long c(int i10) {
            if (i10 == this.f3213k - 1) {
                return this.f3218p;
            }
            long[] jArr = this.f3217o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return n0.i(this.f3217o, j10, true, true);
        }

        public long e(int i10) {
            return this.f3217o[i10];
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0074a c0074a, b[] bVarArr) {
        this.f3192a = i10;
        this.f3193b = i11;
        this.f3198g = j10;
        this.f3199h = j11;
        this.f3194c = i12;
        this.f3195d = z10;
        this.f3196e = c0074a;
        this.f3197f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0074a c0074a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : n0.N0(j11, 1000000L, j10), j12 != 0 ? n0.N0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0074a, bVarArr);
    }

    @Override // t2.a
    /* renamed from: b */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f3197f[cVar.f18193k];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((n1[]) arrayList3.toArray(new n1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f3212j[cVar.f18194l]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((n1[]) arrayList3.toArray(new n1[0])));
        }
        return new a(this.f3192a, this.f3193b, this.f3198g, this.f3199h, this.f3194c, this.f3195d, this.f3196e, (b[]) arrayList2.toArray(new b[0]));
    }
}
