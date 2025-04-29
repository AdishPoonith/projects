package na;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.b0;
import s9.u;
/* loaded from: classes.dex */
public class d<E> extends na.a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final int f14364e;

    /* renamed from: f  reason: collision with root package name */
    private final e f14365f;

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f14366g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f14367h;

    /* renamed from: i  reason: collision with root package name */
    private int f14368i;
    private volatile /* synthetic */ int size;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14369a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f14369a = iArr;
        }
    }

    public d(int i10, e eVar, da.l<? super E, u> lVar) {
        super(lVar);
        this.f14364e = i10;
        this.f14365f = eVar;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        this.f14366g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        t9.j.f(objArr, b.f14354a, 0, 0, 6, null);
        this.f14367h = objArr;
        this.size = 0;
    }

    private final void x(int i10, E e10) {
        if (i10 < this.f14364e) {
            y(i10);
            Object[] objArr = this.f14367h;
            objArr[(this.f14368i + i10) % objArr.length] = e10;
            return;
        }
        Object[] objArr2 = this.f14367h;
        int i11 = this.f14368i;
        objArr2[i11 % objArr2.length] = null;
        objArr2[(i10 + i11) % objArr2.length] = e10;
        this.f14368i = (i11 + 1) % objArr2.length;
    }

    private final void y(int i10) {
        Object[] objArr = this.f14367h;
        if (i10 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f14364e);
            Object[] objArr2 = new Object[min];
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr3 = this.f14367h;
                objArr2[i11] = objArr3[(this.f14368i + i11) % objArr3.length];
            }
            t9.j.e(objArr2, b.f14354a, i10, min);
            this.f14367h = objArr2;
            this.f14368i = 0;
        }
    }

    private final b0 z(int i10) {
        if (i10 < this.f14364e) {
            this.size = i10 + 1;
            return null;
        }
        int i11 = a.f14369a[this.f14365f.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return null;
                }
                throw new s9.l();
            }
            return b.f14355b;
        }
        return b.f14356c;
    }

    @Override // na.c
    protected String c() {
        return "(buffer:capacity=" + this.f14364e + ",size=" + this.size + ')';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.c
    public Object i(E e10) {
        q<E> l10;
        ReentrantLock reentrantLock = this.f14366g;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            j<?> d10 = d();
            if (d10 != null) {
                return d10;
            }
            b0 z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            if (i10 == 0) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof j) {
                            this.size = i10;
                            return l10;
                        }
                        kotlin.jvm.internal.l.b(l10);
                    }
                } while (l10.f(e10, null) == null);
                this.size = i10;
                u uVar = u.f17878a;
                reentrantLock.unlock();
                l10.c(e10);
                return l10.d();
            }
            x(i10, e10);
            return b.f14355b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f14366g;
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
        return this.size == 0;
    }

    @Override // na.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f14366g;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object d10 = d();
                if (d10 == null) {
                    d10 = b.f14357d;
                }
                return d10;
            }
            Object[] objArr = this.f14367h;
            int i11 = this.f14368i;
            Object obj = objArr[i11];
            s sVar = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f14357d;
            boolean z10 = false;
            if (i10 == this.f14364e) {
                s sVar2 = null;
                while (true) {
                    s m10 = m();
                    if (m10 == null) {
                        sVar = sVar2;
                        break;
                    }
                    kotlin.jvm.internal.l.b(m10);
                    if (m10.C(null) != null) {
                        obj2 = m10.B();
                        sVar = m10;
                        z10 = true;
                        break;
                    }
                    m10.D();
                    sVar2 = m10;
                }
            }
            if (obj2 != b.f14357d && !(obj2 instanceof j)) {
                this.size = i10;
                Object[] objArr2 = this.f14367h;
                objArr2[(this.f14368i + i10) % objArr2.length] = obj2;
            }
            this.f14368i = (this.f14368i + 1) % this.f14367h.length;
            u uVar = u.f17878a;
            if (z10) {
                kotlin.jvm.internal.l.b(sVar);
                sVar.A();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
