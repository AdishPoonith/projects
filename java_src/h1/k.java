package h1;

import f1.l0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import ka.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f9091a = new k();

    private k() {
    }

    public static final boolean d(String str) {
        File f10 = f();
        if (f10 == null || str == null) {
            return false;
        }
        return new File(f10, str).delete();
    }

    public static final String e(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File f() {
        f0 f0Var = f0.f14852a;
        File file = new File(f0.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        l.e(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        l.d(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.d(stackTrace, "t.stackTrace");
            int i10 = 0;
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement element) {
        boolean t10;
        boolean t11;
        l.e(element, "element");
        String className = element.getClassName();
        l.d(className, "element.className");
        t10 = p.t(className, "com.facebook", false, 2, null);
        if (!t10) {
            String className2 = element.getClassName();
            l.d(className2, "element.className");
            t11 = p.t(className2, "com.meta", false, 2, null);
            if (!t11) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                i10++;
                l.d(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean t10;
        boolean t11;
        boolean t12;
        boolean t13;
        boolean t14;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                l.d(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    l.d(className, "element.className");
                    t10 = p.t(className, "com.facebook.appevents.codeless", false, 2, null);
                    if (!t10) {
                        String className2 = element.getClassName();
                        l.d(className2, "element.className");
                        t14 = p.t(className2, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!t14) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    l.d(methodName, "element.methodName");
                    t11 = p.t(methodName, "onClick", false, 2, null);
                    if (t11) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        l.d(methodName2, "element.methodName");
                        t12 = p.t(methodName2, "onItemClick", false, 2, null);
                        if (t12) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            l.d(methodName3, "element.methodName");
                            t13 = p.t(methodName3, "onTouch", false, 2, null);
                            if (!t13) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: h1.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m10;
                m10 = k.m(file, str);
                return m10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(File file, String name) {
        l.d(name, "name");
        v vVar = v.f12860a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        l.d(format, "java.lang.String.format(format, *args)");
        return new ka.f(format).a(name);
    }

    public static final File[] n() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: h1.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean o10;
                o10 = k.o(file, str);
                return o10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file, String name) {
        l.d(name, "name");
        v vVar = v.f12860a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        l.d(format, "java.lang.String.format(format, *args)");
        return new ka.f(format).a(name);
    }

    public static final File[] p() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: h1.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean q10;
                q10 = k.q(file, str);
                return q10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(File file, String name) {
        l.d(name, "name");
        v vVar = v.f12860a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        l.d(format, "java.lang.String.format(format, *args)");
        return new ka.f(format).a(name);
    }

    public static final JSONObject r(String str, boolean z10) {
        File f10 = f();
        if (f10 != null && str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(f10, str));
                l0 l0Var = l0.f8470a;
                return new JSONObject(l0.n0(fileInputStream));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray reports, j0.b bVar) {
        l.e(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            l0 l0Var = l0.f8470a;
            JSONObject A = l0.A();
            if (A != null) {
                Iterator<String> keys = A.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, A.get(next));
                }
            }
            j0.c cVar = j0.f14918n;
            v vVar = v.f12860a;
            f0 f0Var = f0.f14852a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{f0.m()}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            cVar.A(null, format, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(String str, String str2) {
        File f10 = f();
        if (f10 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f10, str));
            byte[] bytes = str2.getBytes(ka.d.f12805b);
            l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
