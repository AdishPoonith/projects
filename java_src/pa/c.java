package pa;

import da.p;
import ka.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import la.z1;
import s9.n;
import s9.u;
import v9.g;
import v9.h;
/* loaded from: classes.dex */
public final class c<T> extends kotlin.coroutines.jvm.internal.d implements oa.c<T> {

    /* renamed from: j  reason: collision with root package name */
    public final oa.c<T> f15845j;

    /* renamed from: k  reason: collision with root package name */
    public final g f15846k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15847l;

    /* renamed from: m  reason: collision with root package name */
    private g f15848m;

    /* renamed from: n  reason: collision with root package name */
    private v9.d<? super u> f15849n;

    /* loaded from: classes.dex */
    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f15850j = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(oa.c<? super T> cVar, g gVar) {
        super(b.f15843j, h.f19537j);
        this.f15845j = cVar;
        this.f15846k = gVar;
        this.f15847l = ((Number) gVar.N(0, a.f15850j)).intValue();
    }

    private final void a(g gVar, g gVar2, T t10) {
        if (gVar2 instanceof pa.a) {
            h((pa.a) gVar2, t10);
        }
        e.a(this, gVar);
    }

    private final Object b(v9.d<? super u> dVar, T t10) {
        Object c10;
        g context = dVar.getContext();
        z1.i(context);
        g gVar = this.f15848m;
        if (gVar != context) {
            a(context, gVar, t10);
            this.f15848m = context;
        }
        this.f15849n = dVar;
        Object e10 = d.a().e(this.f15845j, t10, this);
        c10 = w9.d.c();
        if (!l.a(e10, c10)) {
            this.f15849n = null;
        }
        return e10;
    }

    private final void h(pa.a aVar, Object obj) {
        String e10;
        e10 = i.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f15841j + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e10.toString());
    }

    @Override // oa.c
    public Object emit(T t10, v9.d<? super u> dVar) {
        Object c10;
        Object c11;
        try {
            Object b10 = b(dVar, t10);
            c10 = w9.d.c();
            if (b10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = w9.d.c();
            return b10 == c11 ? b10 : u.f17878a;
        } catch (Throwable th) {
            this.f15848m = new pa.a(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        v9.d<? super u> dVar = this.f15849n;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, v9.d
    public g getContext() {
        g gVar = this.f15848m;
        return gVar == null ? h.f19537j : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c10;
        Throwable d10 = n.d(obj);
        if (d10 != null) {
            this.f15848m = new pa.a(d10, getContext());
        }
        v9.d<? super u> dVar = this.f15849n;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c10 = w9.d.c();
        return c10;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
