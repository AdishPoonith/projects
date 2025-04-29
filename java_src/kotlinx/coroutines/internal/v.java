package kotlinx.coroutines.internal;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.m implements da.l<Throwable, s9.u> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ da.l<E, s9.u> f12922j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ E f12923k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ v9.g f12924l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(da.l<? super E, s9.u> lVar, E e10, v9.g gVar) {
            super(1);
            this.f12922j = lVar;
            this.f12923k = e10;
            this.f12924l = gVar;
        }

        public final void a(Throwable th) {
            v.b(this.f12922j, this.f12923k, this.f12924l);
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
            a(th);
            return s9.u.f17878a;
        }
    }

    public static final <E> da.l<Throwable, s9.u> a(da.l<? super E, s9.u> lVar, E e10, v9.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(da.l<? super E, s9.u> lVar, E e10, v9.g gVar) {
        j0 c10 = c(lVar, e10, null);
        if (c10 != null) {
            la.j0.a(gVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> j0 c(da.l<? super E, s9.u> lVar, E e10, j0 j0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (j0Var == null || j0Var.getCause() == th) {
                return new j0("Exception in undelivered element handler for " + e10, th);
            }
            s9.b.a(j0Var, th);
        }
        return j0Var;
    }

    public static /* synthetic */ j0 d(da.l lVar, Object obj, j0 j0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        return c(lVar, obj, j0Var);
    }
}
