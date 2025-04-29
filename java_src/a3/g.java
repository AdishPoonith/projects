package a3;

import android.net.Uri;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w1.m;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f92d;

    /* renamed from: e  reason: collision with root package name */
    public final long f93e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f94f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f95g;

    /* renamed from: h  reason: collision with root package name */
    public final long f96h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f97i;

    /* renamed from: j  reason: collision with root package name */
    public final int f98j;

    /* renamed from: k  reason: collision with root package name */
    public final long f99k;

    /* renamed from: l  reason: collision with root package name */
    public final int f100l;

    /* renamed from: m  reason: collision with root package name */
    public final long f101m;

    /* renamed from: n  reason: collision with root package name */
    public final long f102n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f103o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f104p;

    /* renamed from: q  reason: collision with root package name */
    public final m f105q;

    /* renamed from: r  reason: collision with root package name */
    public final List<d> f106r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f107s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f108t;

    /* renamed from: u  reason: collision with root package name */
    public final long f109u;

    /* renamed from: v  reason: collision with root package name */
    public final f f110v;

    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: u  reason: collision with root package name */
        public final boolean f111u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f112v;

        public b(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, mVar, str2, str3, j12, j13, z10);
            this.f111u = z11;
            this.f112v = z12;
        }

        public b g(long j10, int i10) {
            return new b(this.f118j, this.f119k, this.f120l, i10, j10, this.f123o, this.f124p, this.f125q, this.f126r, this.f127s, this.f128t, this.f111u, this.f112v);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f113a;

        /* renamed from: b  reason: collision with root package name */
        public final long f114b;

        /* renamed from: c  reason: collision with root package name */
        public final int f115c;

        public c(Uri uri, long j10, int i10) {
            this.f113a = uri;
            this.f114b = j10;
            this.f115c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: u  reason: collision with root package name */
        public final String f116u;

        /* renamed from: v  reason: collision with root package name */
        public final List<b> f117v;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, q.z());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, m mVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
            this.f116u = str2;
            this.f117v = q.v(list);
        }

        public d g(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f117v.size(); i11++) {
                b bVar = this.f117v.get(i11);
                arrayList.add(bVar.g(j11, i10));
                j11 += bVar.f120l;
            }
            return new d(this.f118j, this.f119k, this.f116u, this.f120l, i10, j10, this.f123o, this.f124p, this.f125q, this.f126r, this.f127s, this.f128t, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: j  reason: collision with root package name */
        public final String f118j;

        /* renamed from: k  reason: collision with root package name */
        public final d f119k;

        /* renamed from: l  reason: collision with root package name */
        public final long f120l;

        /* renamed from: m  reason: collision with root package name */
        public final int f121m;

        /* renamed from: n  reason: collision with root package name */
        public final long f122n;

        /* renamed from: o  reason: collision with root package name */
        public final m f123o;

        /* renamed from: p  reason: collision with root package name */
        public final String f124p;

        /* renamed from: q  reason: collision with root package name */
        public final String f125q;

        /* renamed from: r  reason: collision with root package name */
        public final long f126r;

        /* renamed from: s  reason: collision with root package name */
        public final long f127s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f128t;

        private e(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f118j = str;
            this.f119k = dVar;
            this.f120l = j10;
            this.f121m = i10;
            this.f122n = j11;
            this.f123o = mVar;
            this.f124p = str2;
            this.f125q = str3;
            this.f126r = j12;
            this.f127s = j13;
            this.f128t = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Long l10) {
            if (this.f122n > l10.longValue()) {
                return 1;
            }
            return this.f122n < l10.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f129a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f130b;

        /* renamed from: c  reason: collision with root package name */
        public final long f131c;

        /* renamed from: d  reason: collision with root package name */
        public final long f132d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f133e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f129a = j10;
            this.f130b = z10;
            this.f131c = j11;
            this.f132d = j12;
            this.f133e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, w1.m r31, java.util.List<a3.g.d> r32, java.util.List<a3.g.b> r33, a3.g.f r34, java.util.Map<android.net.Uri, a3.g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f92d = r3
            r3 = r17
            r0.f96h = r3
            r3 = r16
            r0.f95g = r3
            r3 = r19
            r0.f97i = r3
            r3 = r20
            r0.f98j = r3
            r3 = r21
            r0.f99k = r3
            r3 = r23
            r0.f100l = r3
            r3 = r24
            r0.f101m = r3
            r3 = r26
            r0.f102n = r3
            r3 = r29
            r0.f103o = r3
            r3 = r30
            r0.f104p = r3
            r3 = r31
            r0.f105q = r3
            com.google.common.collect.q r3 = com.google.common.collect.q.v(r32)
            r0.f106r = r3
            com.google.common.collect.q r3 = com.google.common.collect.q.v(r33)
            r0.f107s = r3
            com.google.common.collect.r r3 = com.google.common.collect.r.c(r35)
            r0.f108t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = com.google.common.collect.t.c(r33)
            a3.g$b r3 = (a3.g.b) r3
        L58:
            long r6 = r3.f122n
            long r8 = r3.f120l
            long r6 = r6 + r8
            r0.f109u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = com.google.common.collect.t.c(r32)
            a3.g$d r3 = (a3.g.d) r3
            goto L58
        L6d:
            r0.f109u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f109u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f93e = r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f94f = r1
            r1 = r34
            r0.f110v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, w1.m, java.util.List, java.util.List, a3.g$f, java.util.Map):void");
    }

    @Override // t2.a
    /* renamed from: b */
    public g a(List<t2.c> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f92d, this.f155a, this.f156b, this.f93e, this.f95g, j10, true, i10, this.f99k, this.f100l, this.f101m, this.f102n, this.f157c, this.f103o, this.f104p, this.f105q, this.f106r, this.f107s, this.f110v, this.f108t);
    }

    public g d() {
        return this.f103o ? this : new g(this.f92d, this.f155a, this.f156b, this.f93e, this.f95g, this.f96h, this.f97i, this.f98j, this.f99k, this.f100l, this.f101m, this.f102n, this.f157c, true, this.f104p, this.f105q, this.f106r, this.f107s, this.f110v, this.f108t);
    }

    public long e() {
        return this.f96h + this.f109u;
    }

    public boolean f(g gVar) {
        if (gVar != null) {
            long j10 = this.f99k;
            long j11 = gVar.f99k;
            if (j10 > j11) {
                return true;
            }
            if (j10 < j11) {
                return false;
            }
            int size = this.f106r.size() - gVar.f106r.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.f107s.size();
            int size3 = gVar.f107s.size();
            if (size2 <= size3) {
                return size2 == size3 && this.f103o && !gVar.f103o;
            }
            return true;
        }
        return true;
    }
}
