package pa;

import da.q;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.w;
import s9.u;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final q<oa.c<Object>, Object, v9.d<? super u>, Object> f15851a = (q) w.b(a.f15852j, 3);

    /* loaded from: classes.dex */
    /* synthetic */ class a extends j implements q<oa.c<? super Object>, Object, v9.d<? super u>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f15852j = new a();

        a() {
            super(3, oa.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // da.q
        /* renamed from: b */
        public final Object e(oa.c<Object> cVar, Object obj, v9.d<? super u> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    public static final /* synthetic */ q a() {
        return f15851a;
    }
}
