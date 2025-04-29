package oa;

import s9.u;
/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: oa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0219a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: j  reason: collision with root package name */
        Object f14732j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f14733k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a<T> f14734l;

        /* renamed from: m  reason: collision with root package name */
        int f14735m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0219a(a<T> aVar, v9.d<? super C0219a> dVar) {
            super(dVar);
            this.f14734l = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14733k = obj;
            this.f14735m |= Integer.MIN_VALUE;
            return this.f14734l.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // oa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(oa.c<? super T> r6, v9.d<? super s9.u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oa.a.C0219a
            if (r0 == 0) goto L13
            r0 = r7
            oa.a$a r0 = (oa.a.C0219a) r0
            int r1 = r0.f14735m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14735m = r1
            goto L18
        L13:
            oa.a$a r0 = new oa.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14733k
            java.lang.Object r1 = w9.b.c()
            int r2 = r0.f14735m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f14732j
            pa.c r6 = (pa.c) r6
            s9.o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            s9.o.b(r7)
            pa.c r7 = new pa.c
            v9.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f14732j = r7     // Catch: java.lang.Throwable -> L55
            r0.f14735m = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            s9.u r6 = s9.u.f17878a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.a.a(oa.c, v9.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, v9.d<? super u> dVar);
}
