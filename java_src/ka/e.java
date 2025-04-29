package ka;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements ja.b<ha.f> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f12811a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12812b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12813c;

    /* renamed from: d  reason: collision with root package name */
    private final da.p<CharSequence, Integer, s9.m<Integer, Integer>> f12814d;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<ha.f>, ea.a {

        /* renamed from: j  reason: collision with root package name */
        private int f12815j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f12816k;

        /* renamed from: l  reason: collision with root package name */
        private int f12817l;

        /* renamed from: m  reason: collision with root package name */
        private ha.f f12818m;

        /* renamed from: n  reason: collision with root package name */
        private int f12819n;

        a() {
            int e10;
            e10 = ha.i.e(e.this.f12812b, 0, e.this.f12811a.length());
            this.f12816k = e10;
            this.f12817l = e10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f12820o.f12813c) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f12817l
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f12815j = r1
                r0 = 0
                r6.f12818m = r0
                goto L99
            Lc:
                ka.e r0 = ka.e.this
                int r0 = ka.e.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f12819n
                int r0 = r0 + r3
                r6.f12819n = r0
                ka.e r4 = ka.e.this
                int r4 = ka.e.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f12817l
                ka.e r4 = ka.e.this
                java.lang.CharSequence r4 = ka.e.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                ha.f r0 = new ha.f
                int r1 = r6.f12816k
                ka.e r4 = ka.e.this
                java.lang.CharSequence r4 = ka.e.b(r4)
                int r4 = ka.q.z(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f12818m = r0
            L44:
                r6.f12817l = r2
                goto L97
            L47:
                ka.e r0 = ka.e.this
                da.p r0 = ka.e.a(r0)
                ka.e r4 = ka.e.this
                java.lang.CharSequence r4 = ka.e.b(r4)
                int r5 = r6.f12817l
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                s9.m r0 = (s9.m) r0
                if (r0 != 0) goto L73
                ha.f r0 = new ha.f
                int r1 = r6.f12816k
                ka.e r4 = ka.e.this
                java.lang.CharSequence r4 = ka.e.b(r4)
                int r4 = ka.q.z(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f12816k
                ha.f r4 = ha.g.h(r4, r2)
                r6.f12818m = r4
                int r2 = r2 + r0
                r6.f12816k = r2
                if (r0 != 0) goto L95
                r1 = 1
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f12815j = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public ha.f next() {
            if (this.f12815j == -1) {
                a();
            }
            if (this.f12815j != 0) {
                ha.f fVar = this.f12818m;
                kotlin.jvm.internal.l.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f12818m = null;
                this.f12815j = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12815j == -1) {
                a();
            }
            return this.f12815j == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i10, int i11, da.p<? super CharSequence, ? super Integer, s9.m<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(getNextMatch, "getNextMatch");
        this.f12811a = input;
        this.f12812b = i10;
        this.f12813c = i11;
        this.f12814d = getNextMatch;
    }

    @Override // ja.b
    public Iterator<ha.f> iterator() {
        return new a();
    }
}
