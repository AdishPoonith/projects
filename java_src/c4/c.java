package c4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private f1 B;
    private final a D;
    private final b E;
    private final int F;
    private final String G;
    private volatile String H;

    /* renamed from: j  reason: collision with root package name */
    private int f3251j;

    /* renamed from: k  reason: collision with root package name */
    private long f3252k;

    /* renamed from: l  reason: collision with root package name */
    private long f3253l;

    /* renamed from: m  reason: collision with root package name */
    private int f3254m;

    /* renamed from: n  reason: collision with root package name */
    private long f3255n;

    /* renamed from: p  reason: collision with root package name */
    s1 f3257p;

    /* renamed from: q  reason: collision with root package name */
    private final Context f3258q;

    /* renamed from: r  reason: collision with root package name */
    private final Looper f3259r;

    /* renamed from: s  reason: collision with root package name */
    private final i f3260s;

    /* renamed from: t  reason: collision with root package name */
    private final b4.f f3261t;

    /* renamed from: u  reason: collision with root package name */
    final Handler f3262u;

    /* renamed from: x  reason: collision with root package name */
    private n f3265x;

    /* renamed from: y  reason: collision with root package name */
    protected InterfaceC0076c f3266y;

    /* renamed from: z  reason: collision with root package name */
    private IInterface f3267z;
    private static final b4.d[] N = new b4.d[0];
    public static final String[] M = {"service_esmobile", "service_googleme"};

    /* renamed from: o  reason: collision with root package name */
    private volatile String f3256o = null;

    /* renamed from: v  reason: collision with root package name */
    private final Object f3263v = new Object();

    /* renamed from: w  reason: collision with root package name */
    private final Object f3264w = new Object();
    private final ArrayList A = new ArrayList();
    private int C = 1;
    private b4.b I = null;
    private boolean J = false;
    private volatile i1 K = null;
    protected AtomicInteger L = new AtomicInteger(0);

    /* loaded from: classes.dex */
    public interface a {
        void M(Bundle bundle);

        void p(int i10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void x(b4.b bVar);
    }

    /* renamed from: c4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0076c {
        void a(b4.b bVar);
    }

    /* loaded from: classes.dex */
    protected class d implements InterfaceC0076c {
        public d() {
        }

        @Override // c4.c.InterfaceC0076c
        public final void a(b4.b bVar) {
            if (bVar.F()) {
                c cVar = c.this;
                cVar.c(null, cVar.B());
            } else if (c.this.E != null) {
                c.this.E.x(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, Looper looper, i iVar, b4.f fVar, int i10, a aVar, b bVar, String str) {
        s.k(context, "Context must not be null");
        this.f3258q = context;
        s.k(looper, "Looper must not be null");
        this.f3259r = looper;
        s.k(iVar, "Supervisor must not be null");
        this.f3260s = iVar;
        s.k(fVar, "API availability must not be null");
        this.f3261t = fVar;
        this.f3262u = new c1(this, looper);
        this.F = i10;
        this.D = aVar;
        this.E = bVar;
        this.G = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a0(c cVar, i1 i1Var) {
        cVar.K = i1Var;
        if (cVar.Q()) {
            f fVar = i1Var.f3335m;
            t.b().c(fVar == null ? null : fVar.G());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void b0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f3263v) {
            i11 = cVar.C;
        }
        if (i11 == 3) {
            cVar.J = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f3262u;
        handler.sendMessage(handler.obtainMessage(i12, cVar.L.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean e0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f3263v) {
            if (cVar.C != i10) {
                return false;
            }
            cVar.g0(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean f0(c4.c r2) {
        /*
            boolean r0 = r2.J
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.D()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.c.f0(c4.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(int i10, IInterface iInterface) {
        s1 s1Var;
        s.a((i10 == 4) == (iInterface != 0));
        synchronized (this.f3263v) {
            this.C = i10;
            this.f3267z = iInterface;
            if (i10 == 1) {
                f1 f1Var = this.B;
                if (f1Var != null) {
                    i iVar = this.f3260s;
                    String b10 = this.f3257p.b();
                    s.j(b10);
                    iVar.g(b10, this.f3257p.a(), 4225, f1Var, V(), this.f3257p.c());
                    this.B = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                f1 f1Var2 = this.B;
                if (f1Var2 != null && (s1Var = this.f3257p) != null) {
                    String b11 = s1Var.b();
                    String a10 = s1Var.a();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + b11 + " on " + a10);
                    i iVar2 = this.f3260s;
                    String b12 = this.f3257p.b();
                    s.j(b12);
                    iVar2.g(b12, this.f3257p.a(), 4225, f1Var2, V(), this.f3257p.c());
                    this.L.incrementAndGet();
                }
                f1 f1Var3 = new f1(this, this.L.get());
                this.B = f1Var3;
                s1 s1Var2 = (this.C != 3 || A() == null) ? new s1(F(), E(), false, 4225, H()) : new s1(x().getPackageName(), A(), true, 4225, false);
                this.f3257p = s1Var2;
                if (s1Var2.c() && h() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f3257p.b())));
                }
                i iVar3 = this.f3260s;
                String b13 = this.f3257p.b();
                s.j(b13);
                if (!iVar3.h(new m1(b13, this.f3257p.a(), 4225, this.f3257p.c()), f1Var3, V(), v())) {
                    String b14 = this.f3257p.b();
                    String a11 = this.f3257p.a();
                    Log.w("GmsClient", "unable to connect to service: " + b14 + " on " + a11);
                    c0(16, null, this.L.get());
                }
            } else if (i10 == 4) {
                s.j(iInterface);
                J(iInterface);
            }
        }
    }

    protected String A() {
        return null;
    }

    protected Set<Scope> B() {
        return Collections.emptySet();
    }

    public final T C() {
        T t10;
        synchronized (this.f3263v) {
            if (this.C == 5) {
                throw new DeadObjectException();
            }
            q();
            t10 = (T) this.f3267z;
            s.k(t10, "Client is connected but service is null");
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public f G() {
        i1 i1Var = this.K;
        if (i1Var == null) {
            return null;
        }
        return i1Var.f3335m;
    }

    protected boolean H() {
        return h() >= 211700000;
    }

    public boolean I() {
        return this.K != null;
    }

    protected void J(T t10) {
        this.f3253l = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(b4.b bVar) {
        this.f3254m = bVar.B();
        this.f3255n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(int i10) {
        this.f3251j = i10;
        this.f3252k = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f3262u;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new g1(this, i10, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.H = str;
    }

    public void P(int i10) {
        Handler handler = this.f3262u;
        handler.sendMessage(handler.obtainMessage(6, this.L.get(), i10));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.G;
        return str == null ? this.f3258q.getClass().getName() : str;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f3263v) {
            z10 = this.C == 4;
        }
        return z10;
    }

    public void b(InterfaceC0076c interfaceC0076c) {
        s.k(interfaceC0076c, "Connection progress callbacks cannot be null.");
        this.f3266y = interfaceC0076c;
        g0(2, null);
    }

    public void c(k kVar, Set<Scope> set) {
        Bundle z10 = z();
        int i10 = this.F;
        String str = this.H;
        int i11 = b4.f.f2908a;
        Scope[] scopeArr = g.f3303x;
        Bundle bundle = new Bundle();
        b4.d[] dVarArr = g.f3304y;
        g gVar = new g(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f3308m = this.f3258q.getPackageName();
        gVar.f3311p = z10;
        if (set != null) {
            gVar.f3310o = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account t10 = t();
            if (t10 == null) {
                t10 = new Account("<<default account>>", "com.google");
            }
            gVar.f3312q = t10;
            if (kVar != null) {
                gVar.f3309n = kVar.asBinder();
            }
        } else if (N()) {
            gVar.f3312q = t();
        }
        gVar.f3313r = N;
        gVar.f3314s = u();
        if (Q()) {
            gVar.f3317v = true;
        }
        try {
            synchronized (this.f3264w) {
                n nVar = this.f3265x;
                if (nVar != null) {
                    nVar.n2(new e1(this, this.L.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            P(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.L.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.L.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f3262u;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new h1(this, i10, null)));
    }

    public void d(e eVar) {
        eVar.a();
    }

    public void f(String str) {
        this.f3256o = str;
        n();
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return b4.f.f2908a;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f3263v) {
            int i10 = this.C;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final b4.d[] j() {
        i1 i1Var = this.K;
        if (i1Var == null) {
            return null;
        }
        return i1Var.f3333k;
    }

    public String k() {
        s1 s1Var;
        if (!a() || (s1Var = this.f3257p) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return s1Var.a();
    }

    public String m() {
        return this.f3256o;
    }

    public void n() {
        this.L.incrementAndGet();
        synchronized (this.A) {
            int size = this.A.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d1) this.A.get(i10)).d();
            }
            this.A.clear();
        }
        synchronized (this.f3264w) {
            this.f3265x = null;
        }
        g0(1, null);
    }

    public boolean o() {
        return false;
    }

    protected final void q() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T r(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public b4.d[] u() {
        return N;
    }

    protected Executor v() {
        return null;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f3258q;
    }

    public int y() {
        return this.F;
    }

    protected Bundle z() {
        return new Bundle();
    }
}
