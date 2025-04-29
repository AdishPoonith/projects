package na;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import la.o0;
import na.i;
import s9.u;
/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14360d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b  reason: collision with root package name */
    protected final da.l<E, u> f14361b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.internal.m f14362c = new kotlinx.coroutines.internal.m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes.dex */
    public static final class a<E> extends s {

        /* renamed from: m  reason: collision with root package name */
        public final E f14363m;

        public a(E e10) {
            this.f14363m = e10;
        }

        @Override // na.s
        public void A() {
        }

        @Override // na.s
        public Object B() {
            return this.f14363m;
        }

        @Override // na.s
        public b0 C(o.b bVar) {
            return la.n.f13652a;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "SendBuffered@" + o0.b(this) + '(' + this.f14363m + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(da.l<? super E, u> lVar) {
        this.f14361b = lVar;
    }

    private final int b() {
        kotlinx.coroutines.internal.m mVar = this.f14362c;
        int i10 = 0;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) mVar.p(); !kotlin.jvm.internal.l.a(oVar, mVar); oVar = oVar.q()) {
            if (oVar instanceof kotlinx.coroutines.internal.o) {
                i10++;
            }
        }
        return i10;
    }

    private final String f() {
        String str;
        kotlinx.coroutines.internal.o q10 = this.f14362c.q();
        if (q10 == this.f14362c) {
            return "EmptyQueue";
        }
        if (q10 instanceof j) {
            str = q10.toString();
        } else if (q10 instanceof o) {
            str = "ReceiveQueued";
        } else if (q10 instanceof s) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + q10;
        }
        kotlinx.coroutines.internal.o r10 = this.f14362c.r();
        if (r10 != q10) {
            String str2 = str + ",queueSize=" + b();
            if (r10 instanceof j) {
                return str2 + ",closedForSend=" + r10;
            }
            return str2;
        }
        return str;
    }

    private final void g(j<?> jVar) {
        Object b10 = kotlinx.coroutines.internal.j.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.o r10 = jVar.r();
            o oVar = r10 instanceof o ? (o) r10 : null;
            if (oVar == null) {
                break;
            } else if (oVar.v()) {
                b10 = kotlinx.coroutines.internal.j.c(b10, oVar);
            } else {
                oVar.s();
            }
        }
        if (b10 != null) {
            if (b10 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) b10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((o) arrayList.get(size)).B(jVar);
                }
            } else {
                ((o) b10).B(jVar);
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.H();
    }

    @Override // na.t
    public final Object a(E e10) {
        i.b bVar;
        j<?> jVar;
        Object i10 = i(e10);
        if (i10 == b.f14355b) {
            return i.f14377a.c(u.f17878a);
        }
        if (i10 == b.f14356c) {
            jVar = d();
            if (jVar == null) {
                return i.f14377a.b();
            }
            bVar = i.f14377a;
        } else if (!(i10 instanceof j)) {
            throw new IllegalStateException(("trySend returned " + i10).toString());
        } else {
            bVar = i.f14377a;
            jVar = (j) i10;
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j<?> d() {
        kotlinx.coroutines.internal.o r10 = this.f14362c.r();
        j<?> jVar = r10 instanceof j ? (j) r10 : null;
        if (jVar != null) {
            g(jVar);
            return jVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlinx.coroutines.internal.m e() {
        return this.f14362c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object i(E e10) {
        q<E> l10;
        do {
            l10 = l();
            if (l10 == null) {
                return b.f14356c;
            }
        } while (l10.f(e10, null) == null);
        l10.c(e10);
        return l10.d();
    }

    protected void j(kotlinx.coroutines.internal.o oVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q<?> k(E e10) {
        kotlinx.coroutines.internal.o r10;
        kotlinx.coroutines.internal.o oVar = this.f14362c;
        a aVar = new a(e10);
        do {
            r10 = oVar.r();
            if (r10 instanceof q) {
                return (q) r10;
            }
        } while (!r10.j(aVar, oVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q<E> l() {
        kotlinx.coroutines.internal.o oVar;
        kotlinx.coroutines.internal.o x10;
        kotlinx.coroutines.internal.m mVar = this.f14362c;
        while (true) {
            oVar = (kotlinx.coroutines.internal.o) mVar.p();
            if (oVar != mVar && (oVar instanceof q)) {
                if (((((q) oVar) instanceof j) && !oVar.u()) || (x10 = oVar.x()) == null) {
                    break;
                }
                x10.t();
            }
        }
        oVar = null;
        return (q) oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s m() {
        kotlinx.coroutines.internal.o oVar;
        kotlinx.coroutines.internal.o x10;
        kotlinx.coroutines.internal.m mVar = this.f14362c;
        while (true) {
            oVar = (kotlinx.coroutines.internal.o) mVar.p();
            if (oVar != mVar && (oVar instanceof s)) {
                if (((((s) oVar) instanceof j) && !oVar.u()) || (x10 = oVar.x()) == null) {
                    break;
                }
                x10.t();
            }
        }
        oVar = null;
        return (s) oVar;
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + '{' + f() + '}' + c();
    }
}
