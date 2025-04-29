package h1;

import f1.l0;
import f1.n;
import h1.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import p0.n0;
import p0.o0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9064a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9065b;

    private b() {
    }

    public static final void b() {
        b bVar = f9064a;
        f9065b = true;
        f0 f0Var = f0.f14852a;
        if (f0.p()) {
            bVar.e();
        }
    }

    public static final void c(Throwable th) {
        if (!f9065b || d() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        l.d(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            n nVar = n.f8481a;
            String className = stackTraceElement.getClassName();
            l.d(className, "it.className");
            n.b d10 = n.d(className);
            if (d10 != n.b.Unknown) {
                n.c(d10);
                hashSet.add(d10.toString());
            }
        }
        f0 f0Var = f0.f14852a;
        if (f0.p() && (!hashSet.isEmpty())) {
            c.a aVar = c.a.f9074a;
            c.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c instrumentData, o0 response) {
        l.e(instrumentData, "$instrumentData");
        l.e(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (l.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        l0 l0Var = l0.f8470a;
        if (l0.U()) {
            return;
        }
        k kVar = k.f9091a;
        File[] n10 = k.n();
        ArrayList arrayList = new ArrayList();
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = n10[i10];
            i10++;
            c.a aVar = c.a.f9074a;
            final c d10 = c.a.d(file);
            if (d10.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", d10.toString());
                    j0.c cVar = j0.f14918n;
                    v vVar = v.f12860a;
                    f0 f0Var = f0.f14852a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{f0.m()}, 1));
                    l.d(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, format, jSONObject, new j0.b() { // from class: h1.a
                        @Override // p0.j0.b
                        public final void b(o0 o0Var) {
                            b.f(c.this, o0Var);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new n0(arrayList).q();
    }
}
