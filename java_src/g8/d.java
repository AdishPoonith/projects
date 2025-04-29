package g8;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import g8.d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9035a;

    /* renamed from: b  reason: collision with root package name */
    private c f9036b;

    /* renamed from: c  reason: collision with root package name */
    private long f9037c;

    /* renamed from: d  reason: collision with root package name */
    private g8.b f9038d;

    /* renamed from: e  reason: collision with root package name */
    private FlutterJNI f9039e;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f9040f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f9041g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f9042a;

        a(Context context) {
            this.f9042a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f9039e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public b call() {
            f9.e.a("FlutterLoader initTask");
            try {
                d.a(d.this, this.f9042a);
                d.this.f9039e.loadLibrary();
                d.this.f9039e.updateRefreshRate();
                d.this.f9040f.execute(new Runnable() { // from class: g8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.this.c();
                    }
                });
                return new b(f9.b.d(this.f9042a), f9.b.a(this.f9042a), f9.b.c(this.f9042a), null);
            } finally {
                f9.e.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f9044a;

        /* renamed from: b  reason: collision with root package name */
        final String f9045b;

        /* renamed from: c  reason: collision with root package name */
        final String f9046c;

        private b(String str, String str2, String str3) {
            this.f9044a = str;
            this.f9045b = str2;
            this.f9046c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f9047a;

        public String a() {
            return this.f9047a;
        }
    }

    public d() {
        this(d8.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, d8.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f9035a = false;
        this.f9039e = flutterJNI;
        this.f9040f = executorService;
    }

    static /* synthetic */ e a(d dVar, Context context) {
        dVar.j(context);
        return null;
    }

    private String g(String str) {
        return this.f9038d.f9030d + File.separator + str;
    }

    private e j(Context context) {
        return null;
    }

    private static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean d() {
        return this.f9038d.f9033g;
    }

    public void e(Context context, String[] strArr) {
        if (this.f9035a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f9036b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        f9.e.a("FlutterLoader#ensureInitializationComplete");
        try {
            try {
                b bVar = this.f9041g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f9038d.f9032f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f9038d.f9027a);
                arrayList.add("--aot-shared-library-name=" + this.f9038d.f9032f + str + this.f9038d.f9027a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f9045b);
                arrayList.add(sb2.toString());
                if (this.f9038d.f9031e != null) {
                    arrayList.add("--domain-network-policy=" + this.f9038d.f9031e);
                }
                if (this.f9036b.a() != null) {
                    arrayList.add("--log-tag=" + this.f9036b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i10 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i10 == 0) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    i10 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i10);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null && bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                    arrayList.add("--enable-impeller");
                }
                String str2 = l(bundle) ? "true" : "false";
                arrayList.add("--leak-vm=" + str2);
                this.f9039e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f9044a, bVar.f9045b, SystemClock.uptimeMillis() - this.f9037c);
                this.f9035a = true;
            } catch (Exception e10) {
                d8.b.c("FlutterLoader", "Flutter initialization failed.", e10);
                throw new RuntimeException(e10);
            }
        } finally {
            f9.e.d();
        }
    }

    public String f() {
        return this.f9038d.f9030d;
    }

    public String h(String str) {
        return g(str);
    }

    public String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return h(sb.toString());
    }

    public boolean k() {
        return this.f9035a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f9036b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        f9.e.a("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f9036b = cVar;
            this.f9037c = SystemClock.uptimeMillis();
            this.f9038d = g8.a.e(applicationContext);
            f.f((DisplayManager) applicationContext.getSystemService("display"), this.f9039e).g();
            this.f9041g = this.f9040f.submit(new a(applicationContext));
        } finally {
            f9.e.d();
        }
    }
}
