package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g0.b;
import g0.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f2721d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2722e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f2725c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends g0.a<?>>> f2724b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f2723a = new HashMap();

    a(Context context) {
        this.f2725c = context.getApplicationContext();
    }

    private <T> T c(Class<? extends g0.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (h0.a.h()) {
            try {
                h0.a.c(cls.getSimpleName());
            } finally {
                h0.a.f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f2723a.containsKey(cls)) {
            t10 = (T) this.f2723a.get(cls);
        } else {
            set.add(cls);
            g0.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends g0.a<?>>> a10 = newInstance.a();
            if (!a10.isEmpty()) {
                for (Class<? extends g0.a<?>> cls2 : a10) {
                    if (!this.f2723a.containsKey(cls2)) {
                        c(cls2, set);
                    }
                }
            }
            t10 = (T) newInstance.b(this.f2725c);
            set.remove(cls);
            this.f2723a.put(cls, t10);
        }
        return t10;
    }

    public static a d(Context context) {
        if (f2721d == null) {
            synchronized (f2722e) {
                if (f2721d == null) {
                    f2721d = new a(context);
                }
            }
        }
        return f2721d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                h0.a.c("Startup");
                b(this.f2725c.getPackageManager().getProviderInfo(new ComponentName(this.f2725c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            h0.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f2725c.getString(b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (g0.a.class.isAssignableFrom(cls)) {
                            this.f2724b.add(cls);
                        }
                    }
                }
                for (Class<? extends g0.a<?>> cls2 : this.f2724b) {
                    c(cls2, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }
}
