package j6;

import j6.n;
import j6.u0;
import j6.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    private final b1 f12358a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12360c;

    /* renamed from: d  reason: collision with root package name */
    private m6.n f12361d;

    /* renamed from: e  reason: collision with root package name */
    private d6.e<m6.l> f12362e;

    /* renamed from: b  reason: collision with root package name */
    private y1.a f12359b = y1.a.NONE;

    /* renamed from: f  reason: collision with root package name */
    private d6.e<m6.l> f12363f = m6.l.i();

    /* renamed from: g  reason: collision with root package name */
    private d6.e<m6.l> f12364g = m6.l.i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12365a;

        static {
            int[] iArr = new int[n.a.values().length];
            f12365a = iArr;
            try {
                iArr[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12365a[n.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12365a[n.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12365a[n.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final m6.n f12366a;

        /* renamed from: b  reason: collision with root package name */
        final o f12367b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f12368c;

        /* renamed from: d  reason: collision with root package name */
        final d6.e<m6.l> f12369d;

        private b(m6.n nVar, o oVar, d6.e<m6.l> eVar, boolean z10) {
            this.f12366a = nVar;
            this.f12367b = oVar;
            this.f12369d = eVar;
            this.f12368c = z10;
        }

        /* synthetic */ b(m6.n nVar, o oVar, d6.e eVar, boolean z10, a aVar) {
            this(nVar, oVar, eVar, z10);
        }

        public boolean b() {
            return this.f12368c;
        }
    }

    public w1(b1 b1Var, d6.e<m6.l> eVar) {
        this.f12358a = b1Var;
        this.f12361d = m6.n.k(b1Var.c());
        this.f12362e = eVar;
    }

    private void e(p6.s0 s0Var) {
        if (s0Var != null) {
            Iterator<m6.l> it = s0Var.b().iterator();
            while (it.hasNext()) {
                this.f12362e = this.f12362e.k(it.next());
            }
            Iterator<m6.l> it2 = s0Var.c().iterator();
            while (it2.hasNext()) {
                m6.l next = it2.next();
                q6.b.d(this.f12362e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<m6.l> it3 = s0Var.d().iterator();
            while (it3.hasNext()) {
                this.f12362e = this.f12362e.m(it3.next());
            }
            this.f12360c = s0Var.f();
        }
    }

    private static int f(n nVar) {
        int i10 = a.f12365a[nVar.c().ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + nVar.c());
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int k(n nVar, n nVar2) {
        int l10 = q6.g0.l(f(nVar), f(nVar2));
        nVar.c().compareTo(nVar2.c());
        return l10 != 0 ? l10 : this.f12358a.c().compare(nVar.b(), nVar2.b());
    }

    private boolean l(m6.l lVar) {
        m6.i l10;
        return (this.f12362e.contains(lVar) || (l10 = this.f12361d.l(lVar)) == null || l10.e()) ? false : true;
    }

    private boolean m(m6.i iVar, m6.i iVar2) {
        return iVar.e() && iVar2.d() && !iVar2.e();
    }

    private List<u0> n() {
        if (this.f12360c) {
            d6.e<m6.l> eVar = this.f12363f;
            this.f12363f = m6.l.i();
            Iterator<m6.i> it = this.f12361d.iterator();
            while (it.hasNext()) {
                m6.i next = it.next();
                if (l(next.getKey())) {
                    this.f12363f = this.f12363f.k(next.getKey());
                }
            }
            ArrayList arrayList = new ArrayList(eVar.size() + this.f12363f.size());
            Iterator<m6.l> it2 = eVar.iterator();
            while (it2.hasNext()) {
                m6.l next2 = it2.next();
                if (!this.f12363f.contains(next2)) {
                    arrayList.add(new u0(u0.a.REMOVED, next2));
                }
            }
            Iterator<m6.l> it3 = this.f12363f.iterator();
            while (it3.hasNext()) {
                m6.l next3 = it3.next();
                if (!eVar.contains(next3)) {
                    arrayList.add(new u0(u0.a.ADDED, next3));
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public x1 b(b bVar) {
        return c(bVar, null);
    }

    public x1 c(b bVar, p6.s0 s0Var) {
        q6.b.d(!bVar.f12368c, "Cannot apply changes that need a refill", new Object[0]);
        m6.n nVar = this.f12361d;
        this.f12361d = bVar.f12366a;
        this.f12364g = bVar.f12369d;
        List<n> b10 = bVar.f12367b.b();
        Collections.sort(b10, new Comparator() { // from class: j6.v1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int k10;
                k10 = w1.this.k((n) obj, (n) obj2);
                return k10;
            }
        });
        e(s0Var);
        List<u0> n10 = n();
        y1.a aVar = this.f12363f.size() == 0 && this.f12360c ? y1.a.SYNCED : y1.a.LOCAL;
        boolean z10 = aVar != this.f12359b;
        this.f12359b = aVar;
        y1 y1Var = null;
        if (b10.size() != 0 || z10) {
            y1Var = new y1(this.f12358a, bVar.f12366a, nVar, b10, aVar == y1.a.LOCAL, bVar.f12369d, z10, false, (s0Var == null || s0Var.e().isEmpty()) ? false : true);
        }
        return new x1(y1Var, n10);
    }

    public x1 d(z0 z0Var) {
        if (this.f12360c && z0Var == z0.OFFLINE) {
            this.f12360c = false;
            return b(new b(this.f12361d, new o(), this.f12364g, false, null));
        }
        return new x1(null, Collections.emptyList());
    }

    public b g(d6.c<m6.l, m6.i> cVar) {
        return h(cVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        if (r18.f12358a.c().compare(r6, r4) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (r18.f12358a.c().compare(r6, r7) < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
        if (r7 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j6.w1.b h(d6.c<m6.l, m6.i> r19, j6.w1.b r20) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.w1.h(d6.c, j6.w1$b):j6.w1$b");
    }

    public y1.a i() {
        return this.f12359b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6.e<m6.l> j() {
        return this.f12362e;
    }
}
