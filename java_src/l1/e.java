package l1;

import f1.l0;
import h1.k;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import ka.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import p0.o0;
import t9.t;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13048a = new e();

    private e() {
    }

    public static final void d() {
        f0 f0Var = f0.f14852a;
        if (f0.p()) {
            h();
        }
    }

    public static final File[] e() {
        k kVar = k.f9091a;
        File f10 = k.f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: l1.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f11;
                f11 = e.f(file, str);
                return f11;
            }
        });
        l.d(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file, String name) {
        l.d(name, "name");
        v vVar = v.f12860a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        l.d(format, "java.lang.String.format(format, *args)");
        return new f(format).a(name);
    }

    public static final void g(String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        l0 l0Var = l0.f8470a;
        if (l0.U()) {
            return;
        }
        File[] e10 = e();
        final ArrayList arrayList = new ArrayList();
        int length = e10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = e10[i10];
            i10++;
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        t.k(arrayList, new Comparator() { // from class: l1.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i11;
                i11 = e.i((a) obj, (a) obj2);
                return i11;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        k kVar = k.f9091a;
        k.s("error_reports", jSONArray, new j0.b() { // from class: l1.d
            @Override // p0.j0.b
            public final void b(o0 o0Var) {
                e.j(arrayList, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(a aVar, a o22) {
        l.d(o22, "o2");
        return aVar.b(o22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ArrayList validReports, o0 response) {
        l.e(validReports, "$validReports");
        l.e(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (l.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
