package b5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final b5.c f2966a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2967b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2968c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2969d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b5.c f2970a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b5.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0061a extends b {
            C0061a(q qVar, CharSequence charSequence) {
                super(qVar, charSequence);
            }

            @Override // b5.q.b
            int f(int i10) {
                return i10 + 1;
            }

            @Override // b5.q.b
            int g(int i10) {
                return a.this.f2970a.c(this.f2972l, i10);
            }
        }

        a(b5.c cVar) {
            this.f2970a = cVar;
        }

        @Override // b5.q.c
        /* renamed from: b */
        public b a(q qVar, CharSequence charSequence) {
            return new C0061a(qVar, charSequence);
        }
    }

    /* loaded from: classes.dex */
    private static abstract class b extends b5.a<String> {

        /* renamed from: l  reason: collision with root package name */
        final CharSequence f2972l;

        /* renamed from: m  reason: collision with root package name */
        final b5.c f2973m;

        /* renamed from: n  reason: collision with root package name */
        final boolean f2974n;

        /* renamed from: o  reason: collision with root package name */
        int f2975o = 0;

        /* renamed from: p  reason: collision with root package name */
        int f2976p;

        protected b(q qVar, CharSequence charSequence) {
            this.f2973m = qVar.f2966a;
            this.f2974n = qVar.f2967b;
            this.f2976p = qVar.f2969d;
            this.f2972l = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            if (r0 >= r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            if (r6.f2973m.e(r6.f2972l.charAt(r0)) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
            if (r1 <= r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            if (r6.f2973m.e(r6.f2972l.charAt(r1 - 1)) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r6.f2974n == false) goto L45;
         */
        @Override // b5.a
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String a() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f2975o
            L2:
                int r1 = r6.f2975o
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f2972l
                int r1 = r1.length()
                r6.f2975o = r2
                goto L1c
            L16:
                int r3 = r6.f(r1)
                r6.f2975o = r3
            L1c:
                int r3 = r6.f2975o
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f2975o = r3
                java.lang.CharSequence r1 = r6.f2972l
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f2975o = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                b5.c r3 = r6.f2973m
                java.lang.CharSequence r4 = r6.f2972l
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                b5.c r3 = r6.f2973m
                java.lang.CharSequence r4 = r6.f2972l
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f2974n
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f2976p
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f2972l
                int r1 = r1.length()
                r6.f2975o = r2
            L6b:
                if (r1 <= r0) goto L83
                b5.c r2 = r6.f2973m
                java.lang.CharSequence r3 = r6.f2972l
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f2976p = r3
            L83:
                java.lang.CharSequence r2 = r6.f2972l
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.q.b.a():java.lang.String");
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        Iterator<String> a(q qVar, CharSequence charSequence);
    }

    private q(c cVar) {
        this(cVar, false, b5.c.f(), Integer.MAX_VALUE);
    }

    private q(c cVar, boolean z10, b5.c cVar2, int i10) {
        this.f2968c = cVar;
        this.f2967b = z10;
        this.f2966a = cVar2;
        this.f2969d = i10;
    }

    public static q d(char c10) {
        return e(b5.c.d(c10));
    }

    public static q e(b5.c cVar) {
        n.n(cVar);
        return new q(new a(cVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f2968c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        n.n(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public q h() {
        return i(b5.c.h());
    }

    public q i(b5.c cVar) {
        n.n(cVar);
        return new q(this.f2968c, this.f2967b, cVar, this.f2969d);
    }
}
