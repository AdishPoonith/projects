package i1;

import f1.l0;
import h1.c;
import h1.k;
import ha.f;
import ha.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
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
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9625a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f9626b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void c() {
        synchronized (e.class) {
            if (k1.a.d(e.class)) {
                return;
            }
            if (f9626b.getAndSet(true)) {
                return;
            }
            f0 f0Var = f0.f14852a;
            if (f0.p()) {
                d();
            }
            b bVar = b.f9618a;
            b.d();
        }
    }

    public static final void d() {
        final List K;
        f h10;
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            l0 l0Var = l0.f8470a;
            if (l0.U()) {
                return;
            }
            k kVar = k.f9091a;
            File[] l10 = k.l();
            ArrayList arrayList = new ArrayList(l10.length);
            for (File file : l10) {
                c.a aVar = c.a.f9074a;
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((h1.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            K = x.K(arrayList2, new Comparator() { // from class: i1.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = e.e((h1.c) obj2, (h1.c) obj3);
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
            k.s("anr_reports", jSONArray, new j0.b() { // from class: i1.d
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    e.f(K, o0Var);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(h1.c cVar, h1.c o22) {
        if (k1.a.d(e.class)) {
            return 0;
        }
        try {
            l.d(o22, "o2");
            return cVar.b(o22);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List validReports, o0 response) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }
}
