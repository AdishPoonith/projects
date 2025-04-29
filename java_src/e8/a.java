package e8;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import r8.c;
import r8.t;
/* loaded from: classes.dex */
public class a implements r8.c {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f8123a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f8124b;

    /* renamed from: c  reason: collision with root package name */
    private final e8.c f8125c;

    /* renamed from: d  reason: collision with root package name */
    private final r8.c f8126d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8127e;

    /* renamed from: f  reason: collision with root package name */
    private String f8128f;

    /* renamed from: g  reason: collision with root package name */
    private d f8129g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f8130h;

    /* renamed from: e8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0135a implements c.a {
        C0135a() {
        }

        @Override // r8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            a.this.f8128f = t.f16795b.b(byteBuffer);
            if (a.this.f8129g != null) {
                a.this.f8129g.a(a.this.f8128f);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8132a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8133b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8134c;

        public b(String str, String str2) {
            this.f8132a = str;
            this.f8133b = null;
            this.f8134c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f8132a = str;
            this.f8133b = str2;
            this.f8134c = str3;
        }

        public static b a() {
            g8.d c10 = d8.a.e().c();
            if (c10.k()) {
                return new b(c10.f(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f8132a.equals(bVar.f8132a)) {
                return this.f8134c.equals(bVar.f8134c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f8132a.hashCode() * 31) + this.f8134c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f8132a + ", function: " + this.f8134c + " )";
        }
    }

    /* loaded from: classes.dex */
    private static class c implements r8.c {

        /* renamed from: a  reason: collision with root package name */
        private final e8.c f8135a;

        private c(e8.c cVar) {
            this.f8135a = cVar;
        }

        /* synthetic */ c(e8.c cVar, C0135a c0135a) {
            this(cVar);
        }

        @Override // r8.c
        public c.InterfaceC0246c a(c.d dVar) {
            return this.f8135a.a(dVar);
        }

        @Override // r8.c
        public void b(String str, c.a aVar, c.InterfaceC0246c interfaceC0246c) {
            this.f8135a.b(str, aVar, interfaceC0246c);
        }

        @Override // r8.c
        public void c(String str, c.a aVar) {
            this.f8135a.c(str, aVar);
        }

        @Override // r8.c
        public /* synthetic */ c.InterfaceC0246c d() {
            return r8.b.a(this);
        }

        @Override // r8.c
        public void e(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f8135a.e(str, byteBuffer, bVar);
        }

        @Override // r8.c
        public void f(String str, ByteBuffer byteBuffer) {
            this.f8135a.e(str, byteBuffer, null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f8127e = false;
        C0135a c0135a = new C0135a();
        this.f8130h = c0135a;
        this.f8123a = flutterJNI;
        this.f8124b = assetManager;
        e8.c cVar = new e8.c(flutterJNI);
        this.f8125c = cVar;
        cVar.c("flutter/isolate", c0135a);
        this.f8126d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f8127e = true;
        }
    }

    @Override // r8.c
    @Deprecated
    public c.InterfaceC0246c a(c.d dVar) {
        return this.f8126d.a(dVar);
    }

    @Override // r8.c
    @Deprecated
    public void b(String str, c.a aVar, c.InterfaceC0246c interfaceC0246c) {
        this.f8126d.b(str, aVar, interfaceC0246c);
    }

    @Override // r8.c
    @Deprecated
    public void c(String str, c.a aVar) {
        this.f8126d.c(str, aVar);
    }

    @Override // r8.c
    public /* synthetic */ c.InterfaceC0246c d() {
        return r8.b.a(this);
    }

    @Override // r8.c
    @Deprecated
    public void e(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f8126d.e(str, byteBuffer, bVar);
    }

    @Override // r8.c
    @Deprecated
    public void f(String str, ByteBuffer byteBuffer) {
        this.f8126d.f(str, byteBuffer);
    }

    public void j(b bVar, List<String> list) {
        if (this.f8127e) {
            d8.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        f9.e.a("DartExecutor#executeDartEntrypoint");
        try {
            d8.b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f8123a.runBundleAndSnapshotFromLibrary(bVar.f8132a, bVar.f8134c, bVar.f8133b, this.f8124b, list);
            this.f8127e = true;
        } finally {
            f9.e.d();
        }
    }

    public String k() {
        return this.f8128f;
    }

    public boolean l() {
        return this.f8127e;
    }

    public void m() {
        if (this.f8123a.isAttached()) {
            this.f8123a.notifyLowMemoryWarning();
        }
    }

    public void n() {
        d8.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f8123a.setPlatformMessageHandler(this.f8125c);
    }

    public void o() {
        d8.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f8123a.setPlatformMessageHandler(null);
    }
}
