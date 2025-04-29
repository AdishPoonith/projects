package na;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.v;
import s9.u;
/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f14381e;

    /* renamed from: f  reason: collision with root package name */
    private Object f14382f;

    public m(da.l<? super E, u> lVar) {
        super(lVar);
        this.f14381e = new ReentrantLock();
        this.f14382f = b.f14354a;
    }

    private final j0 x(Object obj) {
        da.l<E, u> lVar;
        Object obj2 = this.f14382f;
        j0 j0Var = null;
        if (obj2 != b.f14354a && (lVar = this.f14361b) != null) {
            j0Var = v.d(lVar, obj2, null, 2, null);
        }
        this.f14382f = obj;
        return j0Var;
    }

    @Override // na.c
    protected String c() {
        ReentrantLock reentrantLock = this.f14381e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f14382f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.c
    public Object i(E e10) {
        q<E> l10;
        ReentrantLock reentrantLock = this.f14381e;
        reentrantLock.lock();
        try {
            j<?> d10 = d();
            if (d10 != null) {
                return d10;
            }
            if (this.f14382f == b.f14354a) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof j) {
                            return l10;
                        }
                        kotlin.jvm.internal.l.b(l10);
                    }
                } while (l10.f(e10, null) == null);
                u uVar = u.f17878a;
                reentrantLock.unlock();
                l10.c(e10);
                return l10.d();
            }
            j0 x10 = x(e10);
            if (x10 == null) {
                return b.f14355b;
            }
            throw x10;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f14381e;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // na.a
    protected final boolean r() {
        return false;
    }

    @Override // na.a
    protected final boolean s() {
        ReentrantLock reentrantLock = this.f14381e;
        reentrantLock.lock();
        try {
            return this.f14382f == b.f14354a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // na.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f14381e;
        reentrantLock.lock();
        try {
            Object obj = this.f14382f;
            b0 b0Var = b.f14354a;
            if (obj != b0Var) {
                this.f14382f = b0Var;
                u uVar = u.f17878a;
                return obj;
            }
            Object d10 = d();
            if (d10 == null) {
                d10 = b.f14357d;
            }
            return d10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
