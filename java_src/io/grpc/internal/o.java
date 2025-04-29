package io.grpc.internal;

import i9.e0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    static final Logger f11484f = Logger.getLogger(i9.f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Object f11485a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final i9.j0 f11486b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<i9.e0> f11487c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11488d;

    /* renamed from: e  reason: collision with root package name */
    private int f11489e;

    /* loaded from: classes.dex */
    class a extends ArrayDeque<i9.e0> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11490j;

        a(int i10) {
            this.f11490j = i10;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: p */
        public boolean add(i9.e0 e0Var) {
            if (size() == this.f11490j) {
                removeFirst();
            }
            o.a(o.this);
            return super.add(e0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11492a;

        static {
            int[] iArr = new int[e0.b.values().length];
            f11492a = iArr;
            try {
                iArr[e0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11492a[e0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(i9.j0 j0Var, int i10, long j10, String str) {
        b5.n.o(str, "description");
        this.f11486b = (i9.j0) b5.n.o(j0Var, "logId");
        this.f11487c = i10 > 0 ? new a(i10) : null;
        this.f11488d = j10;
        e0.a aVar = new e0.a();
        e(aVar.b(str + " created").c(e0.b.CT_INFO).e(j10).a());
    }

    static /* synthetic */ int a(o oVar) {
        int i10 = oVar.f11489e;
        oVar.f11489e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(i9.j0 j0Var, Level level, String str) {
        Logger logger = f11484f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + j0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.j0 b() {
        return this.f11486b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        boolean z10;
        synchronized (this.f11485a) {
            z10 = this.f11487c != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(i9.e0 e0Var) {
        int i10 = b.f11492a[e0Var.f9884b.ordinal()];
        Level level = i10 != 1 ? i10 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(e0Var);
        d(this.f11486b, level, e0Var.f9883a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(i9.e0 e0Var) {
        synchronized (this.f11485a) {
            Collection<i9.e0> collection = this.f11487c;
            if (collection != null) {
                collection.add(e0Var);
            }
        }
    }
}
