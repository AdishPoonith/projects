package kotlinx.coroutines.internal;

import java.util.Objects;
import la.r2;
import v9.g;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f12878a = new b0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final da.p<Object, g.b, Object> f12879b = a.f12882j;

    /* renamed from: c  reason: collision with root package name */
    private static final da.p<r2<?>, g.b, r2<?>> f12880c = b.f12883j;

    /* renamed from: d  reason: collision with root package name */
    private static final da.p<i0, g.b, i0> f12881d = c.f12884j;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.m implements da.p<Object, g.b, Object> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f12882j = new a();

        a() {
            super(2);
        }

        @Override // da.p
        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (bVar instanceof r2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.m implements da.p<r2<?>, g.b, r2<?>> {

        /* renamed from: j  reason: collision with root package name */
        public static final b f12883j = new b();

        b() {
            super(2);
        }

        @Override // da.p
        /* renamed from: a */
        public final r2<?> invoke(r2<?> r2Var, g.b bVar) {
            if (r2Var != null) {
                return r2Var;
            }
            if (bVar instanceof r2) {
                return (r2) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.m implements da.p<i0, g.b, i0> {

        /* renamed from: j  reason: collision with root package name */
        public static final c f12884j = new c();

        c() {
            super(2);
        }

        @Override // da.p
        /* renamed from: a */
        public final i0 invoke(i0 i0Var, g.b bVar) {
            if (bVar instanceof r2) {
                r2<?> r2Var = (r2) bVar;
                i0Var.a(r2Var, r2Var.h(i0Var.f12890a));
            }
            return i0Var;
        }
    }

    public static final void a(v9.g gVar, Object obj) {
        if (obj == f12878a) {
            return;
        }
        if (obj instanceof i0) {
            ((i0) obj).b(gVar);
            return;
        }
        Object N = gVar.N(null, f12880c);
        Objects.requireNonNull(N, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((r2) N).l(gVar, obj);
    }

    public static final Object b(v9.g gVar) {
        Object N = gVar.N(0, f12879b);
        kotlin.jvm.internal.l.b(N);
        return N;
    }

    public static final Object c(v9.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f12878a : obj instanceof Integer ? gVar.N(new i0(gVar, ((Number) obj).intValue()), f12881d) : ((r2) obj).h(gVar);
    }
}
