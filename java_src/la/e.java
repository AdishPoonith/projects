package la;
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: j  reason: collision with root package name */
        Object f13608j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f13609k;

        /* renamed from: l  reason: collision with root package name */
        int f13610l;

        a(v9.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13609k = obj;
            this.f13610l |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.Collection<? extends la.v1> r4, v9.d<? super s9.u> r5) {
        /*
            boolean r0 = r5 instanceof la.e.a
            if (r0 == 0) goto L13
            r0 = r5
            la.e$a r0 = (la.e.a) r0
            int r1 = r0.f13610l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13610l = r1
            goto L18
        L13:
            la.e$a r0 = new la.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13609k
            java.lang.Object r1 = w9.b.c()
            int r2 = r0.f13610l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f13608j
            java.util.Iterator r4 = (java.util.Iterator) r4
            s9.o.b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            s9.o.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            la.v1 r5 = (la.v1) r5
            r0.f13608j = r4
            r0.f13610l = r3
            java.lang.Object r5 = r5.H(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            s9.u r4 = s9.u.f17878a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la.e.a(java.util.Collection, v9.d):java.lang.Object");
    }
}
