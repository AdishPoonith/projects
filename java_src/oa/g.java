package oa;

import da.p;
import s9.u;
/* loaded from: classes.dex */
final class g<T> extends a<T> {

    /* renamed from: j  reason: collision with root package name */
    private final p<c<? super T>, v9.d<? super u>, Object> f14736j;

    /* JADX WARN: Multi-variable type inference failed */
    public g(p<? super c<? super T>, ? super v9.d<? super u>, ? extends Object> pVar) {
        this.f14736j = pVar;
    }

    @Override // oa.a
    public Object b(c<? super T> cVar, v9.d<? super u> dVar) {
        Object invoke = this.f14736j.invoke(cVar, dVar);
        return invoke == w9.b.c() ? invoke : u.f17878a;
    }
}
