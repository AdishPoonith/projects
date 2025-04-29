package j9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import b5.n;
import i9.g;
import i9.p;
import i9.u0;
import i9.v0;
import i9.w0;
import i9.y;
import i9.z0;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a extends y<a> {

    /* renamed from: c  reason: collision with root package name */
    private static final w0 f12397c = j();

    /* renamed from: a  reason: collision with root package name */
    private final v0<?> f12398a;

    /* renamed from: b  reason: collision with root package name */
    private Context f12399b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u0 {

        /* renamed from: a  reason: collision with root package name */
        private final u0 f12400a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f12401b;

        /* renamed from: c  reason: collision with root package name */
        private final ConnectivityManager f12402c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f12403d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Runnable f12404e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j9.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0182a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c f12405j;

            RunnableC0182a(c cVar) {
                this.f12405j = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12402c.unregisterNetworkCallback(this.f12405j);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j9.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0183b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ d f12407j;

            RunnableC0183b(d dVar) {
                this.f12407j = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12401b.unregisterReceiver(this.f12407j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f12400a.j();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z10) {
                if (z10) {
                    return;
                }
                b.this.f12400a.j();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class d extends BroadcastReceiver {

            /* renamed from: a  reason: collision with root package name */
            private boolean f12410a;

            private d() {
                this.f12410a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z10 = this.f12410a;
                boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f12410a = z11;
                if (!z11 || z10) {
                    return;
                }
                b.this.f12400a.j();
            }
        }

        b(u0 u0Var, Context context) {
            this.f12400a = u0Var;
            this.f12401b = context;
            if (context == null) {
                this.f12402c = null;
                return;
            }
            this.f12402c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                r();
            } catch (SecurityException e10) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e10);
            }
        }

        private void r() {
            Runnable runnableC0183b;
            if (Build.VERSION.SDK_INT < 24 || this.f12402c == null) {
                d dVar = new d();
                this.f12401b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                runnableC0183b = new RunnableC0183b(dVar);
            } else {
                c cVar = new c();
                this.f12402c.registerDefaultNetworkCallback(cVar);
                runnableC0183b = new RunnableC0182a(cVar);
            }
            this.f12404e = runnableC0183b;
        }

        private void s() {
            synchronized (this.f12403d) {
                Runnable runnable = this.f12404e;
                if (runnable != null) {
                    runnable.run();
                    this.f12404e = null;
                }
            }
        }

        @Override // i9.d
        public String b() {
            return this.f12400a.b();
        }

        @Override // i9.d
        public <RequestT, ResponseT> g<RequestT, ResponseT> e(z0<RequestT, ResponseT> z0Var, i9.c cVar) {
            return this.f12400a.e(z0Var, cVar);
        }

        @Override // i9.u0
        public boolean i(long j10, TimeUnit timeUnit) {
            return this.f12400a.i(j10, timeUnit);
        }

        @Override // i9.u0
        public void j() {
            this.f12400a.j();
        }

        @Override // i9.u0
        public p k(boolean z10) {
            return this.f12400a.k(z10);
        }

        @Override // i9.u0
        public void l(p pVar, Runnable runnable) {
            this.f12400a.l(pVar, runnable);
        }

        @Override // i9.u0
        public u0 m() {
            s();
            return this.f12400a.m();
        }

        @Override // i9.u0
        public u0 n() {
            s();
            return this.f12400a.n();
        }
    }

    private a(v0<?> v0Var) {
        this.f12398a = (v0) n.o(v0Var, "delegateBuilder");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:18:0x0035
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static i9.w0 j() {
        /*
            java.lang.String r0 = "AndroidChannelBuilder"
            r1 = 0
            java.lang.Class<k9.g> r2 = k9.g.class
            java.lang.Class<i9.w0> r3 = i9.w0.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.ClassCastException -> L2e
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L27
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L27
            i9.w0 r2 = (i9.w0) r2     // Catch: java.lang.Exception -> L27
            boolean r3 = i9.k0.a(r2)
            if (r3 != 0) goto L26
            java.lang.String r2 = "OkHttpChannelProvider.isAvailable() returned false"
            android.util.Log.w(r0, r2)
            return r1
        L26:
            return r2
        L27:
            r2 = move-exception
            java.lang.String r3 = "Failed to construct OkHttpChannelProvider"
            android.util.Log.w(r0, r3, r2)
            return r1
        L2e:
            r2 = move-exception
            java.lang.String r3 = "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider"
            android.util.Log.w(r0, r3, r2)
            return r1
        L35:
            r2 = move-exception
            java.lang.String r3 = "Failed to find OkHttpChannelProvider"
            android.util.Log.w(r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.a.j():i9.w0");
    }

    public static a k(v0<?> v0Var) {
        return new a(v0Var);
    }

    @Override // i9.v0
    public u0 a() {
        return new b(this.f12398a.a(), this.f12399b);
    }

    @Override // i9.y
    protected v0<?> e() {
        return this.f12398a;
    }

    public a i(Context context) {
        this.f12399b = context;
        return this;
    }
}
