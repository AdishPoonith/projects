package k9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final d f12790a;

    /* renamed from: b  reason: collision with root package name */
    private final m9.c f12791b;

    /* renamed from: c  reason: collision with root package name */
    private int f12792c = 65535;

    /* renamed from: d  reason: collision with root package name */
    private final c f12793d = new c(0, 65535, null);

    /* loaded from: classes.dex */
    public interface b {
        void d(int i10);
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: b  reason: collision with root package name */
        private Runnable f12795b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12796c;

        /* renamed from: d  reason: collision with root package name */
        private int f12797d;

        /* renamed from: e  reason: collision with root package name */
        private int f12798e;

        /* renamed from: f  reason: collision with root package name */
        private final b f12799f;

        /* renamed from: a  reason: collision with root package name */
        private final okio.c f12794a = new okio.c();

        /* renamed from: g  reason: collision with root package name */
        private boolean f12800g = false;

        c(int i10, int i11, b bVar) {
            this.f12796c = i10;
            this.f12797d = i11;
            this.f12799f = bVar;
        }

        void a(int i10) {
            this.f12798e += i10;
        }

        int b() {
            return this.f12798e;
        }

        void c() {
            this.f12798e = 0;
        }

        void d(okio.c cVar, int i10, boolean z10) {
            this.f12794a.j(cVar, i10);
            this.f12800g |= z10;
        }

        boolean e() {
            return this.f12794a.b0() > 0;
        }

        int f(int i10) {
            if (i10 <= 0 || Integer.MAX_VALUE - i10 >= this.f12797d) {
                int i11 = this.f12797d + i10;
                this.f12797d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f12796c);
        }

        int g() {
            return Math.max(0, Math.min(this.f12797d, (int) this.f12794a.b0()));
        }

        int h() {
            return g() - this.f12798e;
        }

        int i() {
            return this.f12797d;
        }

        int j() {
            return Math.min(this.f12797d, q.this.f12793d.i());
        }

        void k(okio.c cVar, int i10, boolean z10) {
            do {
                int min = Math.min(i10, q.this.f12791b.V());
                int i11 = -min;
                q.this.f12793d.f(i11);
                f(i11);
                try {
                    q.this.f12791b.K(cVar.b0() == ((long) min) && z10, this.f12796c, cVar, min);
                    this.f12799f.d(min);
                    i10 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        int l(int i10, e eVar) {
            Runnable runnable;
            int min = Math.min(i10, j());
            int i11 = 0;
            while (e() && min > 0) {
                if (min >= this.f12794a.b0()) {
                    i11 += (int) this.f12794a.b0();
                    okio.c cVar = this.f12794a;
                    k(cVar, (int) cVar.b0(), this.f12800g);
                } else {
                    i11 += min;
                    k(this.f12794a, min, false);
                }
                eVar.b();
                min = Math.min(i10 - i11, j());
            }
            if (!e() && (runnable = this.f12795b) != null) {
                runnable.run();
                this.f12795b = null;
            }
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        c[] b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        int f12802a;

        private e() {
        }

        boolean a() {
            return this.f12802a > 0;
        }

        void b() {
            this.f12802a++;
        }
    }

    public q(d dVar, m9.c cVar) {
        this.f12790a = (d) b5.n.o(dVar, "transport");
        this.f12791b = (m9.c) b5.n.o(cVar, "frameWriter");
    }

    public c c(b bVar, int i10) {
        return new c(i10, this.f12792c, (b) b5.n.o(bVar, "stream"));
    }

    public void d(boolean z10, c cVar, okio.c cVar2, boolean z11) {
        b5.n.o(cVar2, "source");
        int j10 = cVar.j();
        boolean e10 = cVar.e();
        int b02 = (int) cVar2.b0();
        if (e10 || j10 < b02) {
            if (!e10 && j10 > 0) {
                cVar.k(cVar2, j10, false);
            }
            cVar.d(cVar2, (int) cVar2.b0(), z10);
        } else {
            cVar.k(cVar2, b02, z10);
        }
        if (z11) {
            e();
        }
    }

    public void e() {
        try {
            this.f12791b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i10);
        }
        int i11 = i10 - this.f12792c;
        this.f12792c = i10;
        for (c cVar : this.f12790a.b()) {
            cVar.f(i11);
        }
        return i11 > 0;
    }

    public int g(c cVar, int i10) {
        if (cVar == null) {
            int f10 = this.f12793d.f(i10);
            h();
            return f10;
        }
        int f11 = cVar.f(i10);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return f11;
    }

    public void h() {
        int i10;
        c[] b10 = this.f12790a.b();
        Collections.shuffle(Arrays.asList(b10));
        int i11 = this.f12793d.i();
        int length = b10.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || i11 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i11 / length);
            for (int i12 = 0; i12 < length && i11 > 0; i12++) {
                c cVar = b10[i12];
                int min = Math.min(i11, Math.min(cVar.h(), ceil));
                if (min > 0) {
                    cVar.a(min);
                    i11 -= min;
                }
                if (cVar.h() > 0) {
                    b10[i10] = cVar;
                    i10++;
                }
            }
            length = i10;
        }
        e eVar = new e();
        c[] b11 = this.f12790a.b();
        int length2 = b11.length;
        while (i10 < length2) {
            c cVar2 = b11[i10];
            cVar2.l(cVar2.b(), eVar);
            cVar2.c();
            i10++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
