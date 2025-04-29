package j1;

import android.util.Log;
import f1.l0;
import h1.c;
import h1.k;
import ha.f;
import ha.i;
import j1.c;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import p0.o0;
import t9.c0;
import t9.x;
/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11964b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f11965c = c.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    private static c f11966d;

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f11967a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void d() {
            final List K;
            f h10;
            l0 l0Var = l0.f8470a;
            if (l0.U()) {
                return;
            }
            k kVar = k.f9091a;
            File[] p10 = k.p();
            ArrayList arrayList = new ArrayList(p10.length);
            for (File file : p10) {
                c.a aVar = c.a.f9074a;
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((h1.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            K = x.K(arrayList2, new Comparator() { // from class: j1.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = c.a.e((h1.c) obj2, (h1.c) obj3);
                    return e10;
                }
            });
            JSONArray jSONArray = new JSONArray();
            h10 = i.h(0, Math.min(K.size(), 5));
            Iterator<Integer> it = h10.iterator();
            while (it.hasNext()) {
                jSONArray.put(K.get(((c0) it).a()));
            }
            k kVar2 = k.f9091a;
            k.s("crash_reports", jSONArray, new j0.b() { // from class: j1.b
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    c.a.f(K, o0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(h1.c cVar, h1.c o22) {
            l.d(o22, "o2");
            return cVar.b(o22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List validReports, o0 response) {
            l.e(validReports, "$validReports");
            l.e(response, "response");
            try {
                if (response.b() == null) {
                    JSONObject d10 = response.d();
                    if (l.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((h1.c) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void c() {
            f0 f0Var = f0.f14852a;
            if (f0.p()) {
                d();
            }
            if (c.f11966d != null) {
                Log.w(c.f11965c, "Already enabled!");
                return;
            }
            c.f11966d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
            Thread.setDefaultUncaughtExceptionHandler(c.f11966d);
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11967a = uncaughtExceptionHandler;
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g gVar) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        l.e(t10, "t");
        l.e(e10, "e");
        k kVar = k.f9091a;
        if (k.j(e10)) {
            h1.b bVar = h1.b.f9064a;
            h1.b.c(e10);
            c.a aVar = c.a.f9074a;
            c.a.b(e10, c.EnumC0151c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11967a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }
}
