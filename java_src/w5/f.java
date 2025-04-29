package w5;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import b6.o;
import b6.x;
import c4.s;
import com.google.android.gms.common.api.internal.c;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class f {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f19950k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, f> f19951l = new s.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f19952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19953b;

    /* renamed from: c  reason: collision with root package name */
    private final n f19954c;

    /* renamed from: d  reason: collision with root package name */
    private final b6.o f19955d;

    /* renamed from: g  reason: collision with root package name */
    private final x<t6.a> f19958g;

    /* renamed from: h  reason: collision with root package name */
    private final s6.b<r6.f> f19959h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f19956e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f19957f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f19960i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<g> f19961j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f19962a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (h4.j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f19962a.get() == null) {
                    b bVar = new b();
                    if (f19962a.compareAndSet(null, bVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z10) {
            synchronized (f.f19950k) {
                Iterator it = new ArrayList(f.f19951l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f19956e.get()) {
                        fVar.C(z10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f19963b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f19964a;

        public c(Context context) {
            this.f19964a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f19963b.get() == null) {
                c cVar = new c(context);
                if (f19963b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f19964a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f19950k) {
                for (f fVar : f.f19951l.values()) {
                    fVar.t();
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, n nVar) {
        this.f19952a = (Context) s.j(context);
        this.f19953b = s.f(str);
        this.f19954c = (n) s.j(nVar);
        p b10 = FirebaseInitProvider.b();
        a7.c.b("Firebase");
        a7.c.b("ComponentDiscovery");
        List<s6.b<ComponentRegistrar>> b11 = b6.g.c(context, ComponentDiscoveryService.class).b();
        a7.c.a();
        a7.c.b("Runtime");
        o.b g10 = b6.o.m(c6.i.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(b6.c.s(context, Context.class, new Class[0])).b(b6.c.s(this, f.class, new Class[0])).b(b6.c.s(nVar, n.class, new Class[0])).g(new a7.b());
        if (androidx.core.os.l.a(context) && FirebaseInitProvider.c()) {
            g10.b(b6.c.s(b10, p.class, new Class[0]));
        }
        b6.o e10 = g10.e();
        this.f19955d = e10;
        a7.c.a();
        this.f19958g = new x<>(new s6.b() { // from class: w5.d
            @Override // s6.b
            public final Object get() {
                t6.a z10;
                z10 = f.this.z(context);
                return z10;
            }
        });
        this.f19959h = e10.g(r6.f.class);
        g(new a() { // from class: w5.e
            @Override // w5.f.a
            public final void a(boolean z10) {
                f.this.A(z10);
            }
        });
        a7.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(boolean z10) {
        if (z10) {
            return;
        }
        this.f19959h.get().l();
    }

    private static String B(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a aVar : this.f19960i) {
            aVar.a(z10);
        }
    }

    private void D() {
        for (g gVar : this.f19961j) {
            gVar.a(this.f19953b, this.f19954c);
        }
    }

    private void i() {
        s.m(!this.f19957f.get(), "FirebaseApp was deleted");
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f19950k) {
            for (f fVar : f19951l.values()) {
                arrayList.add(fVar.q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<f> n(Context context) {
        ArrayList arrayList;
        synchronized (f19950k) {
            arrayList = new ArrayList(f19951l.values());
        }
        return arrayList;
    }

    public static f o() {
        f fVar;
        synchronized (f19950k) {
            fVar = f19951l.get("[DEFAULT]");
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h4.k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    public static f p(String str) {
        f fVar;
        List<String> l10;
        String str2;
        synchronized (f19950k) {
            fVar = f19951l.get(B(str));
            if (fVar == null) {
                if (l().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            fVar.f19959h.get().l();
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!androidx.core.os.l.a(this.f19952a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f19952a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f19955d.p(y());
        this.f19959h.get().l();
    }

    public static f u(Context context) {
        synchronized (f19950k) {
            if (f19951l.containsKey("[DEFAULT]")) {
                return o();
            }
            n a10 = n.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return v(context, a10);
        }
    }

    public static f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static f w(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f19950k) {
            Map<String, f> map = f19951l;
            boolean z10 = !map.containsKey(B);
            s.m(z10, "FirebaseApp name " + B + " already exists!");
            s.k(context, "Application context cannot be null.");
            fVar = new f(context, B, nVar);
            map.put(B, fVar);
        }
        fVar.t();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t6.a z(Context context) {
        return new t6.a(context, s(), (g6.c) this.f19955d.a(g6.c.class));
    }

    public void E(boolean z10) {
        boolean z11;
        i();
        if (this.f19956e.compareAndSet(!z10, z10)) {
            boolean d10 = com.google.android.gms.common.api.internal.c.b().d();
            if (z10 && d10) {
                z11 = true;
            } else if (z10 || !d10) {
                return;
            } else {
                z11 = false;
            }
            C(z11);
        }
    }

    public void F(Boolean bool) {
        i();
        this.f19958g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f19953b.equals(((f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f19956e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            aVar.a(true);
        }
        this.f19960i.add(aVar);
    }

    public void h(g gVar) {
        i();
        s.j(gVar);
        this.f19961j.add(gVar);
    }

    public int hashCode() {
        return this.f19953b.hashCode();
    }

    public void j() {
        if (this.f19957f.compareAndSet(false, true)) {
            synchronized (f19950k) {
                f19951l.remove(this.f19953b);
            }
            D();
        }
    }

    public <T> T k(Class<T> cls) {
        i();
        return (T) this.f19955d.a(cls);
    }

    public Context m() {
        i();
        return this.f19952a;
    }

    public String q() {
        i();
        return this.f19953b;
    }

    public n r() {
        i();
        return this.f19954c;
    }

    public String s() {
        return h4.c.e(q().getBytes(Charset.defaultCharset())) + "+" + h4.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return c4.q.d(this).a("name", this.f19953b).a("options", this.f19954c).toString();
    }

    public boolean x() {
        i();
        return this.f19958g.get().b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
