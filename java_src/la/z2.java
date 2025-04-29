package la;
/* loaded from: classes.dex */
public final class z2<T> extends kotlinx.coroutines.internal.z<T> {

    /* renamed from: m  reason: collision with root package name */
    private ThreadLocal<s9.m<v9.g, Object>> f13691m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z2(v9.g r3, v9.d<? super T> r4) {
        /*
            r2 = this;
            la.a3 r0 = la.a3.f13580j
            v9.g$b r1 = r3.b(r0)
            if (r1 != 0) goto Ld
            v9.g r0 = r3.r(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f13691m = r0
            v9.g r4 = r4.getContext()
            v9.e$b r0 = v9.e.f19534h
            v9.g$b r4 = r4.b(r0)
            boolean r4 = r4 instanceof la.g0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.f0.c(r3, r4)
            kotlinx.coroutines.internal.f0.a(r3, r4)
            r2.V0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la.z2.<init>(v9.g, v9.d):void");
    }

    @Override // kotlinx.coroutines.internal.z, la.a
    protected void P0(Object obj) {
        s9.m<v9.g, Object> mVar = this.f13691m.get();
        if (mVar != null) {
            kotlinx.coroutines.internal.f0.a(mVar.a(), mVar.b());
            this.f13691m.set(null);
        }
        Object a10 = d0.a(obj, this.f12926l);
        v9.d<T> dVar = this.f12926l;
        v9.g context = dVar.getContext();
        Object c10 = kotlinx.coroutines.internal.f0.c(context, null);
        z2<?> g10 = c10 != kotlinx.coroutines.internal.f0.f12878a ? f0.g(dVar, context, c10) : null;
        try {
            this.f12926l.resumeWith(a10);
            s9.u uVar = s9.u.f17878a;
        } finally {
            if (g10 == null || g10.U0()) {
                kotlinx.coroutines.internal.f0.a(context, c10);
            }
        }
    }

    public final boolean U0() {
        if (this.f13691m.get() == null) {
            return false;
        }
        this.f13691m.set(null);
        return true;
    }

    public final void V0(v9.g gVar, Object obj) {
        this.f13691m.set(s9.q.a(gVar, obj));
    }
}
