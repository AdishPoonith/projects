package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import e8.a;
import io.flutter.plugin.platform.q;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import q8.h;
import q8.i;
import q8.l;
import q8.m;
import q8.n;
import q8.o;
import q8.p;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f10283a;

    /* renamed from: b  reason: collision with root package name */
    private final p8.a f10284b;

    /* renamed from: c  reason: collision with root package name */
    private final e8.a f10285c;

    /* renamed from: d  reason: collision with root package name */
    private final c f10286d;

    /* renamed from: e  reason: collision with root package name */
    private final s8.a f10287e;

    /* renamed from: f  reason: collision with root package name */
    private final q8.a f10288f;

    /* renamed from: g  reason: collision with root package name */
    private final q8.b f10289g;

    /* renamed from: h  reason: collision with root package name */
    private final q8.e f10290h;

    /* renamed from: i  reason: collision with root package name */
    private final q8.f f10291i;

    /* renamed from: j  reason: collision with root package name */
    private final q8.g f10292j;

    /* renamed from: k  reason: collision with root package name */
    private final h f10293k;

    /* renamed from: l  reason: collision with root package name */
    private final l f10294l;

    /* renamed from: m  reason: collision with root package name */
    private final i f10295m;

    /* renamed from: n  reason: collision with root package name */
    private final m f10296n;

    /* renamed from: o  reason: collision with root package name */
    private final n f10297o;

    /* renamed from: p  reason: collision with root package name */
    private final o f10298p;

    /* renamed from: q  reason: collision with root package name */
    private final p f10299q;

    /* renamed from: r  reason: collision with root package name */
    private final q f10300r;

    /* renamed from: s  reason: collision with root package name */
    private final Set<b> f10301s;

    /* renamed from: t  reason: collision with root package name */
    private final b f10302t;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0164a implements b {
        C0164a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            d8.b.f("FlutterEngine", "onPreEngineRestart()");
            for (b bVar : a.this.f10301s) {
                bVar.b();
            }
            a.this.f10300r.b0();
            a.this.f10294l.g();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public a(Context context, g8.d dVar, FlutterJNI flutterJNI, q qVar, String[] strArr, boolean z10, boolean z11) {
        this(context, dVar, flutterJNI, qVar, strArr, z10, z11, null);
    }

    public a(Context context, g8.d dVar, FlutterJNI flutterJNI, q qVar, String[] strArr, boolean z10, boolean z11, d dVar2) {
        AssetManager assets;
        this.f10301s = new HashSet();
        this.f10302t = new C0164a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        d8.a e10 = d8.a.e();
        flutterJNI = flutterJNI == null ? e10.d().a() : flutterJNI;
        this.f10283a = flutterJNI;
        e8.a aVar = new e8.a(flutterJNI, assets);
        this.f10285c = aVar;
        aVar.n();
        f8.a a10 = d8.a.e().a();
        this.f10288f = new q8.a(aVar, flutterJNI);
        q8.b bVar = new q8.b(aVar);
        this.f10289g = bVar;
        this.f10290h = new q8.e(aVar);
        q8.f fVar = new q8.f(aVar);
        this.f10291i = fVar;
        this.f10292j = new q8.g(aVar);
        this.f10293k = new h(aVar);
        this.f10295m = new i(aVar);
        this.f10294l = new l(aVar, z11);
        this.f10296n = new m(aVar);
        this.f10297o = new n(aVar);
        this.f10298p = new o(aVar);
        this.f10299q = new p(aVar);
        if (a10 != null) {
            a10.e(bVar);
        }
        s8.a aVar2 = new s8.a(context, fVar);
        this.f10287e = aVar2;
        dVar = dVar == null ? e10.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f10302t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e10.a());
        if (!flutterJNI.isAttached()) {
            e();
        }
        this.f10284b = new p8.a(flutterJNI);
        this.f10300r = qVar;
        qVar.V();
        this.f10286d = new c(context.getApplicationContext(), this, dVar, dVar2);
        aVar2.d(context.getResources().getConfiguration());
        if (z10 && dVar.d()) {
            o8.a.a(this);
        }
    }

    private void e() {
        d8.b.f("FlutterEngine", "Attaching to JNI.");
        this.f10283a.attachToNative();
        if (!w()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean w() {
        return this.f10283a.isAttached();
    }

    public void d(b bVar) {
        this.f10301s.add(bVar);
    }

    public void f() {
        d8.b.f("FlutterEngine", "Destroying.");
        for (b bVar : this.f10301s) {
            bVar.a();
        }
        this.f10286d.k();
        this.f10300r.X();
        this.f10285c.o();
        this.f10283a.removeEngineLifecycleListener(this.f10302t);
        this.f10283a.setDeferredComponentManager(null);
        this.f10283a.detachFromNativeAndReleaseResources();
        if (d8.a.e().a() != null) {
            d8.a.e().a().d();
            this.f10289g.c(null);
        }
    }

    public q8.a g() {
        return this.f10288f;
    }

    public j8.b h() {
        return this.f10286d;
    }

    public e8.a i() {
        return this.f10285c;
    }

    public q8.e j() {
        return this.f10290h;
    }

    public s8.a k() {
        return this.f10287e;
    }

    public q8.g l() {
        return this.f10292j;
    }

    public h m() {
        return this.f10293k;
    }

    public i n() {
        return this.f10295m;
    }

    public q o() {
        return this.f10300r;
    }

    public i8.b p() {
        return this.f10286d;
    }

    public p8.a q() {
        return this.f10284b;
    }

    public l r() {
        return this.f10294l;
    }

    public m s() {
        return this.f10296n;
    }

    public n t() {
        return this.f10297o;
    }

    public o u() {
        return this.f10298p;
    }

    public p v() {
        return this.f10299q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a x(Context context, a.b bVar, String str, List<String> list, q qVar, boolean z10, boolean z11) {
        if (w()) {
            return new a(context, null, this.f10283a.spawn(bVar.f8134c, bVar.f8133b, str, list), qVar, null, z10, z11);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
}
