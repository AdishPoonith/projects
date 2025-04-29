package w9;

import da.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import s9.o;
import s9.u;
import v9.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: j  reason: collision with root package name */
        private int f20069j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f20070k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f20071l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v9.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f20070k = pVar;
            this.f20071l = obj;
            l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f20069j;
            if (i10 == 0) {
                this.f20069j = 1;
                o.b(obj);
                l.c(this.f20070k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) w.b(this.f20070k, 2)).invoke(this.f20071l, this);
            } else if (i10 == 1) {
                this.f20069j = 2;
                o.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: j  reason: collision with root package name */
        private int f20072j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f20073k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f20074l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v9.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f20073k = pVar;
            this.f20074l = obj;
            l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f20072j;
            if (i10 == 0) {
                this.f20072j = 1;
                o.b(obj);
                l.c(this.f20073k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) w.b(this.f20073k, 2)).invoke(this.f20074l, this);
            } else if (i10 == 1) {
                this.f20072j = 2;
                o.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> v9.d<u> a(p<? super R, ? super v9.d<? super T>, ? extends Object> pVar, R r10, v9.d<? super T> completion) {
        l.e(pVar, "<this>");
        l.e(completion, "completion");
        v9.d<?> a10 = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        return context == v9.h.f19537j ? new a(a10, pVar, r10) : new b(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> v9.d<T> b(v9.d<? super T> dVar) {
        v9.d<T> dVar2;
        l.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (v9.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
