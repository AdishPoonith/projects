package v7;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import i8.a;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;
import r8.j;
import r8.k;
import v7.e;
/* loaded from: classes.dex */
public class e implements k.c, i8.a {

    /* renamed from: j  reason: collision with root package name */
    private k f19456j;

    /* renamed from: k  reason: collision with root package name */
    private v7.a f19457k;

    /* renamed from: l  reason: collision with root package name */
    private HandlerThread f19458l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f19459m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private final k.d f19460a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f19461b = new Handler(Looper.getMainLooper());

        a(k.d dVar) {
            this.f19460a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, String str2, Object obj) {
            this.f19460a.b(str, str2, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Object obj) {
            this.f19460a.a(obj);
        }

        @Override // r8.k.d
        public void a(final Object obj) {
            this.f19461b.post(new Runnable() { // from class: v7.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.g(obj);
                }
            });
        }

        @Override // r8.k.d
        public void b(final String str, final String str2, final Object obj) {
            this.f19461b.post(new Runnable() { // from class: v7.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.f(str, str2, obj);
                }
            });
        }

        @Override // r8.k.d
        public void c() {
            Handler handler = this.f19461b;
            final k.d dVar = this.f19460a;
            Objects.requireNonNull(dVar);
            handler.post(new Runnable() { // from class: v7.b
                @Override // java.lang.Runnable
                public final void run() {
                    k.d.this.c();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final j f19462j;

        /* renamed from: k  reason: collision with root package name */
        private final k.d f19463k;

        b(j jVar, k.d dVar) {
            this.f19462j = jVar;
            this.f19463k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Exception e10;
            boolean z10;
            k.d dVar;
            Object k10;
            k.d dVar2;
            char c10 = 0;
            try {
                try {
                    e.this.f19457k.f19443e = (Map) ((Map) this.f19462j.f16778b).get("options");
                    z10 = e.this.h(this.f19462j);
                } catch (FileNotFoundException e11) {
                    Log.i("Creating sharedPrefs", e11.getLocalizedMessage());
                    return;
                }
            } catch (Exception e12) {
                e10 = e12;
                z10 = false;
            }
            try {
                String str = this.f19462j.f16777a;
                switch (str.hashCode()) {
                    case -1335458389:
                        if (str.equals("delete")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -358737930:
                        if (str.equals("deleteAll")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3496342:
                        if (str.equals("read")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 113399775:
                        if (str.equals("write")) {
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 208013248:
                        if (str.equals("containsKey")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1080375339:
                        if (str.equals("readAll")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                Map<String, String> map = null;
                if (c10 == 0) {
                    String g10 = e.this.g(this.f19462j);
                    String i10 = e.this.i(this.f19462j);
                    if (i10 == null) {
                        this.f19463k.b("null", null, null);
                        return;
                    } else {
                        e.this.f19457k.m(g10, i10);
                        dVar = this.f19463k;
                    }
                } else if (c10 == 1) {
                    String g11 = e.this.g(this.f19462j);
                    if (e.this.f19457k.b(g11)) {
                        k10 = e.this.f19457k.k(g11);
                        dVar2 = this.f19463k;
                        dVar2.a(k10);
                        return;
                    }
                    dVar = this.f19463k;
                } else if (c10 == 2) {
                    dVar = this.f19463k;
                    map = e.this.f19457k.l();
                } else if (c10 == 3) {
                    boolean b10 = e.this.f19457k.b(e.this.g(this.f19462j));
                    dVar2 = this.f19463k;
                    k10 = Boolean.valueOf(b10);
                    dVar2.a(k10);
                    return;
                } else if (c10 == 4) {
                    e.this.f19457k.d(e.this.g(this.f19462j));
                    dVar = this.f19463k;
                } else if (c10 != 5) {
                    this.f19463k.c();
                    return;
                } else {
                    e.this.f19457k.e();
                    dVar = this.f19463k;
                }
                dVar.a(map);
            } catch (Exception e13) {
                e10 = e13;
                if (z10) {
                    e.this.f19457k.e();
                    this.f19463k.a("Data has been reset");
                    return;
                }
                StringWriter stringWriter = new StringWriter();
                e10.printStackTrace(new PrintWriter(stringWriter));
                this.f19463k.b("Exception encountered", this.f19462j.f16777a, stringWriter.toString());
            }
        }
    }

    private String f(String str) {
        return this.f19457k.f19442d + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g(j jVar) {
        return f((String) ((Map) jVar.f16778b).get("key"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(j jVar) {
        Map map = (Map) jVar.f16778b;
        return map.containsKey("resetOnError") && map.get("resetOnError").equals("true");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(j jVar) {
        return (String) ((Map) jVar.f16778b).get("value");
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        this.f19459m.post(new b(jVar, new a(dVar)));
    }

    @Override // i8.a
    public void d(a.b bVar) {
        if (this.f19456j != null) {
            this.f19458l.quitSafely();
            this.f19458l = null;
            this.f19456j.e(null);
            this.f19456j = null;
        }
        this.f19457k = null;
    }

    public void j(r8.c cVar, Context context) {
        try {
            this.f19457k = new v7.a(context);
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f19458l = handlerThread;
            handlerThread.start();
            this.f19459m = new Handler(this.f19458l.getLooper());
            k kVar = new k(cVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f19456j = kVar;
            kVar.e(this);
        } catch (Exception e10) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e10);
        }
    }

    @Override // i8.a
    public void m(a.b bVar) {
        j(bVar.b(), bVar.a());
    }
}
