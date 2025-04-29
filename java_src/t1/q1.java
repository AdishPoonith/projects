package t1;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import s1.y3;
import t1.c;
import t1.s1;
import u2.u;
/* loaded from: classes.dex */
public final class q1 implements s1 {

    /* renamed from: h  reason: collision with root package name */
    public static final b5.t<String> f18098h = new b5.t() { // from class: t1.p1
        @Override // b5.t
        public final Object get() {
            String k10;
            k10 = q1.k();
            return k10;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Random f18099i = new Random();

    /* renamed from: a  reason: collision with root package name */
    private final y3.d f18100a;

    /* renamed from: b  reason: collision with root package name */
    private final y3.b f18101b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, a> f18102c;

    /* renamed from: d  reason: collision with root package name */
    private final b5.t<String> f18103d;

    /* renamed from: e  reason: collision with root package name */
    private s1.a f18104e;

    /* renamed from: f  reason: collision with root package name */
    private y3 f18105f;

    /* renamed from: g  reason: collision with root package name */
    private String f18106g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f18107a;

        /* renamed from: b  reason: collision with root package name */
        private int f18108b;

        /* renamed from: c  reason: collision with root package name */
        private long f18109c;

        /* renamed from: d  reason: collision with root package name */
        private u.b f18110d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18111e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f18112f;

        public a(String str, int i10, u.b bVar) {
            this.f18107a = str;
            this.f18108b = i10;
            this.f18109c = bVar == null ? -1L : bVar.f18972d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f18110d = bVar;
        }

        private int l(y3 y3Var, y3 y3Var2, int i10) {
            if (i10 >= y3Var.t()) {
                if (i10 < y3Var2.t()) {
                    return i10;
                }
                return -1;
            }
            y3Var.r(i10, q1.this.f18100a);
            for (int i11 = q1.this.f18100a.f17828x; i11 <= q1.this.f18100a.f17829y; i11++) {
                int f10 = y3Var2.f(y3Var.q(i11));
                if (f10 != -1) {
                    return y3Var2.j(f10, q1.this.f18101b).f17805l;
                }
            }
            return -1;
        }

        public boolean i(int i10, u.b bVar) {
            if (bVar == null) {
                return i10 == this.f18108b;
            }
            u.b bVar2 = this.f18110d;
            return bVar2 == null ? !bVar.b() && bVar.f18972d == this.f18109c : bVar.f18972d == bVar2.f18972d && bVar.f18970b == bVar2.f18970b && bVar.f18971c == bVar2.f18971c;
        }

        public boolean j(c.a aVar) {
            u.b bVar = aVar.f17983d;
            if (bVar == null) {
                return this.f18108b != aVar.f17982c;
            }
            long j10 = this.f18109c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f18972d > j10) {
                return true;
            }
            if (this.f18110d == null) {
                return false;
            }
            int f10 = aVar.f17981b.f(bVar.f18969a);
            int f11 = aVar.f17981b.f(this.f18110d.f18969a);
            u.b bVar2 = aVar.f17983d;
            if (bVar2.f18972d < this.f18110d.f18972d || f10 < f11) {
                return false;
            }
            if (f10 > f11) {
                return true;
            }
            boolean b10 = bVar2.b();
            u.b bVar3 = aVar.f17983d;
            if (!b10) {
                int i10 = bVar3.f18973e;
                return i10 == -1 || i10 > this.f18110d.f18970b;
            }
            int i11 = bVar3.f18970b;
            int i12 = bVar3.f18971c;
            u.b bVar4 = this.f18110d;
            int i13 = bVar4.f18970b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f18971c;
            }
            return true;
        }

        public void k(int i10, u.b bVar) {
            if (this.f18109c == -1 && i10 == this.f18108b && bVar != null) {
                this.f18109c = bVar.f18972d;
            }
        }

        public boolean m(y3 y3Var, y3 y3Var2) {
            int l10 = l(y3Var, y3Var2, this.f18108b);
            this.f18108b = l10;
            if (l10 == -1) {
                return false;
            }
            u.b bVar = this.f18110d;
            return bVar == null || y3Var2.f(bVar.f18969a) != -1;
        }
    }

    public q1() {
        this(f18098h);
    }

    public q1(b5.t<String> tVar) {
        this.f18103d = tVar;
        this.f18100a = new y3.d();
        this.f18101b = new y3.b();
        this.f18102c = new HashMap<>();
        this.f18105f = y3.f17792j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f18099i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, u.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f18102c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f18109c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (i11 == 0 && ((a) p3.n0.j(aVar)).f18110d != null && aVar2.f18110d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar == null) {
            String str = this.f18103d.get();
            a aVar3 = new a(str, i10, bVar);
            this.f18102c.put(str, aVar3);
            return aVar3;
        }
        return aVar;
    }

    private void m(c.a aVar) {
        if (aVar.f17981b.u()) {
            this.f18106g = null;
            return;
        }
        a aVar2 = this.f18102c.get(this.f18106g);
        a l10 = l(aVar.f17982c, aVar.f17983d);
        this.f18106g = l10.f18107a;
        e(aVar);
        u.b bVar = aVar.f17983d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f18109c == aVar.f17983d.f18972d && aVar2.f18110d != null && aVar2.f18110d.f18970b == aVar.f17983d.f18970b && aVar2.f18110d.f18971c == aVar.f17983d.f18971c) {
            return;
        }
        u.b bVar2 = aVar.f17983d;
        this.f18104e.P(aVar, l(aVar.f17982c, new u.b(bVar2.f18969a, bVar2.f18972d)).f18107a, l10.f18107a);
    }

    @Override // t1.s1
    public synchronized void a(c.a aVar) {
        p3.a.e(this.f18104e);
        y3 y3Var = this.f18105f;
        this.f18105f = aVar.f17981b;
        Iterator<a> it = this.f18102c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(y3Var, this.f18105f) || next.j(aVar)) {
                it.remove();
                if (next.f18111e) {
                    if (next.f18107a.equals(this.f18106g)) {
                        this.f18106g = null;
                    }
                    this.f18104e.R(aVar, next.f18107a, false);
                }
            }
        }
        m(aVar);
    }

    @Override // t1.s1
    public synchronized void b(c.a aVar, int i10) {
        p3.a.e(this.f18104e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f18102c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f18111e) {
                    boolean equals = next.f18107a.equals(this.f18106g);
                    boolean z11 = z10 && equals && next.f18112f;
                    if (equals) {
                        this.f18106g = null;
                    }
                    this.f18104e.R(aVar, next.f18107a, z11);
                }
            }
        }
        m(aVar);
    }

    @Override // t1.s1
    public synchronized String c() {
        return this.f18106g;
    }

    @Override // t1.s1
    public synchronized String d(y3 y3Var, u.b bVar) {
        return l(y3Var.l(bVar.f18969a, this.f18101b).f17805l, bVar).f18107a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:11:0x0025, B:13:0x0030, B:16:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:34:0x00db, B:36:0x00e1, B:38:0x00f7, B:40:0x0103, B:42:0x0109), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // t1.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void e(t1.c.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.q1.e(t1.c$a):void");
    }

    @Override // t1.s1
    public synchronized void f(c.a aVar) {
        s1.a aVar2;
        this.f18106g = null;
        Iterator<a> it = this.f18102c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f18111e && (aVar2 = this.f18104e) != null) {
                aVar2.R(aVar, next.f18107a, false);
            }
        }
    }

    @Override // t1.s1
    public void g(s1.a aVar) {
        this.f18104e = aVar;
    }
}
