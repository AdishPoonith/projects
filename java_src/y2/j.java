package y2;

import android.net.Uri;
import com.google.common.collect.q;
import java.util.Collections;
import java.util.List;
import s1.n1;
import y2.k;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f20431a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f20432b;

    /* renamed from: c  reason: collision with root package name */
    public final q<y2.b> f20433c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20434d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f20435e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f20436f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f20437g;

    /* renamed from: h  reason: collision with root package name */
    private final i f20438h;

    /* loaded from: classes.dex */
    public static class b extends j implements x2.f {

        /* renamed from: i  reason: collision with root package name */
        final k.a f20439i;

        public b(long j10, n1 n1Var, List<y2.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, n1Var, list, aVar, list2, list3, list4);
            this.f20439i = aVar;
        }

        @Override // x2.f
        public long a(long j10, long j11) {
            return this.f20439i.i(j10, j11);
        }

        @Override // x2.f
        public long b(long j10, long j11) {
            return this.f20439i.h(j10, j11);
        }

        @Override // x2.f
        public long c(long j10, long j11) {
            return this.f20439i.d(j10, j11);
        }

        @Override // x2.f
        public long d(long j10) {
            return this.f20439i.j(j10);
        }

        @Override // x2.f
        public long e(long j10, long j11) {
            return this.f20439i.f(j10, j11);
        }

        @Override // x2.f
        public i f(long j10) {
            return this.f20439i.k(this, j10);
        }

        @Override // x2.f
        public boolean g() {
            return this.f20439i.l();
        }

        @Override // x2.f
        public long h() {
            return this.f20439i.e();
        }

        @Override // x2.f
        public long i(long j10) {
            return this.f20439i.g(j10);
        }

        @Override // x2.f
        public long j(long j10, long j11) {
            return this.f20439i.c(j10, j11);
        }

        @Override // y2.j
        public String k() {
            return null;
        }

        @Override // y2.j
        public x2.f l() {
            return this;
        }

        @Override // y2.j
        public i m() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: i  reason: collision with root package name */
        public final Uri f20440i;

        /* renamed from: j  reason: collision with root package name */
        public final long f20441j;

        /* renamed from: k  reason: collision with root package name */
        private final String f20442k;

        /* renamed from: l  reason: collision with root package name */
        private final i f20443l;

        /* renamed from: m  reason: collision with root package name */
        private final m f20444m;

        public c(long j10, n1 n1Var, List<y2.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, n1Var, list, eVar, list2, list3, list4);
            this.f20440i = Uri.parse(list.get(0).f20378a);
            i c10 = eVar.c();
            this.f20443l = c10;
            this.f20442k = str;
            this.f20441j = j11;
            this.f20444m = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // y2.j
        public String k() {
            return this.f20442k;
        }

        @Override // y2.j
        public x2.f l() {
            return this.f20444m;
        }

        @Override // y2.j
        public i m() {
            return this.f20443l;
        }
    }

    private j(long j10, n1 n1Var, List<y2.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        p3.a.a(!list.isEmpty());
        this.f20431a = j10;
        this.f20432b = n1Var;
        this.f20433c = q.v(list);
        this.f20435e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f20436f = list3;
        this.f20437g = list4;
        this.f20438h = kVar.a(this);
        this.f20434d = kVar.b();
    }

    public static j o(long j10, n1 n1Var, List<y2.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, n1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, n1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract x2.f l();

    public abstract i m();

    public i n() {
        return this.f20438h;
    }
}
