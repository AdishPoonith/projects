package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2571a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Closeable> f2572b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f2573c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f2573c = true;
        Map<String, Object> map = this.f2571a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f2571a.values()) {
                    b(obj);
                }
            }
        }
        Set<Closeable> set = this.f2572b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.f2572b) {
                    b(closeable);
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f2571a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f2571a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }
}
