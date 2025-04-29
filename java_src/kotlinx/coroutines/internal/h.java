package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f12888a = new h();

    private h() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> P;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            P = t9.x.P(ServiceLoader.load(cls, classLoader));
            return P;
        }
    }

    private final List<String> e(URL url) {
        boolean t10;
        String i02;
        String n02;
        String i03;
        String url2 = url.toString();
        t10 = ka.p.t(url2, "jar", false, 2, null);
        if (!t10) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f10 = f12888a.f(bufferedReader);
                ba.a.a(bufferedReader, null);
                return f10;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ba.a.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        i02 = ka.q.i0(url2, "jar:file:", null, 2, null);
        n02 = ka.q.n0(i02, '!', null, 2, null);
        i03 = ka.q.i0(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(n02, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(i03)), "UTF-8"));
            List<String> f11 = f12888a.f(bufferedReader2);
            ba.a.a(bufferedReader2, null);
            jarFile.close();
            return f11;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    s9.b.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> P;
        String o02;
        CharSequence p02;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                P = t9.x.P(linkedHashSet);
                return P;
            }
            o02 = ka.q.o0(readLine, "#", null, 2, null);
            p02 = ka.q.p0(o02);
            String obj = p02.toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<r> c() {
        r rVar;
        if (i.a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                r rVar2 = null;
                try {
                    rVar = (r) r.class.cast(Class.forName("ma.a", true, r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused) {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
                try {
                    rVar2 = (r) r.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused2) {
                }
                if (rVar2 != null) {
                    arrayList.add(rVar2);
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable unused3) {
                return b(r.class, r.class.getClassLoader());
            }
        }
        return b(r.class, r.class.getClassLoader());
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set<String> T;
        int j10;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        kotlin.jvm.internal.l.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            t9.u.l(arrayList, f12888a.e(url));
        }
        T = t9.x.T(arrayList);
        if (!T.isEmpty()) {
            j10 = t9.q.j(T, 10);
            ArrayList arrayList2 = new ArrayList(j10);
            for (String str : T) {
                arrayList2.add(f12888a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
