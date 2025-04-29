package i9;

import i9.i1;
import io.grpc.internal.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: d  reason: collision with root package name */
    private static t0 f10054d;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<s0> f10056a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, s0> f10057b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f10053c = Logger.getLogger(t0.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final Iterable<Class<?>> f10055e = c();

    /* loaded from: classes.dex */
    private static final class a implements i1.b<s0> {
        a() {
        }

        @Override // i9.i1.b
        /* renamed from: c */
        public int b(s0 s0Var) {
            return s0Var.c();
        }

        @Override // i9.i1.b
        /* renamed from: d */
        public boolean a(s0 s0Var) {
            return s0Var.d();
        }
    }

    private synchronized void a(s0 s0Var) {
        b5.n.e(s0Var.d(), "isAvailable() returned false");
        this.f10056a.add(s0Var);
    }

    public static synchronized t0 b() {
        t0 t0Var;
        synchronized (t0.class) {
            if (f10054d == null) {
                List<s0> e10 = i1.e(s0.class, f10055e, s0.class.getClassLoader(), new a());
                f10054d = new t0();
                for (s0 s0Var : e10) {
                    Logger logger = f10053c;
                    logger.fine("Service loader found " + s0Var);
                    f10054d.a(s0Var);
                }
                f10054d.e();
            }
            t0Var = f10054d;
        }
        return t0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = s1.f11651b;
            arrayList.add(s1.class);
        } catch (ClassNotFoundException e10) {
            f10053c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i11 = q9.i.f16602b;
            arrayList.add(q9.i.class);
        } catch (ClassNotFoundException e11) {
            f10053c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        this.f10057b.clear();
        Iterator<s0> it = this.f10056a.iterator();
        while (it.hasNext()) {
            s0 next = it.next();
            String b10 = next.b();
            s0 s0Var = this.f10057b.get(b10);
            if (s0Var == null || s0Var.c() < next.c()) {
                this.f10057b.put(b10, next);
            }
        }
    }

    public synchronized s0 d(String str) {
        return this.f10057b.get(b5.n.o(str, "policy"));
    }
}
