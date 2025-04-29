package i9;

import i9.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f10068c = Logger.getLogger(x0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static x0 f10069d;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<w0> f10070a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private List<w0> f10071b = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<w0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(w0 w0Var, w0 w0Var2) {
            return w0Var.c() - w0Var2.c();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements i1.b<w0> {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // i9.i1.b
        /* renamed from: c */
        public int b(w0 w0Var) {
            return w0Var.c();
        }

        @Override // i9.i1.b
        /* renamed from: d */
        public boolean a(w0 w0Var) {
            return w0Var.b();
        }
    }

    private synchronized void a(w0 w0Var) {
        b5.n.e(w0Var.b(), "isAvailable() returned false");
        this.f10070a.add(w0Var);
    }

    public static synchronized x0 b() {
        x0 x0Var;
        synchronized (x0.class) {
            if (f10069d == null) {
                List<w0> e10 = i1.e(w0.class, c(), w0.class.getClassLoader(), new b(null));
                f10069d = new x0();
                for (w0 w0Var : e10) {
                    Logger logger = f10068c;
                    logger.fine("Service loader found " + w0Var);
                    f10069d.a(w0Var);
                }
                f10069d.f();
            }
            x0Var = f10069d;
        }
        return x0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(k9.g.class);
        } catch (ClassNotFoundException e10) {
            f10068c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f10068c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f10068c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f10070a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f10071b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0 d() {
        List<w0> e10 = e();
        if (e10.isEmpty()) {
            return null;
        }
        return e10.get(0);
    }

    synchronized List<w0> e() {
        return this.f10071b;
    }
}
