package t9;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.k implements da.p<ja.d<? super List<? extends T>>, v9.d<? super s9.u>, Object> {

        /* renamed from: k  reason: collision with root package name */
        Object f18391k;

        /* renamed from: l  reason: collision with root package name */
        Object f18392l;

        /* renamed from: m  reason: collision with root package name */
        int f18393m;

        /* renamed from: n  reason: collision with root package name */
        int f18394n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f18395o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f18396p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f18397q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Iterator<T> f18398r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f18399s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f18400t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, v9.d<? super a> dVar) {
            super(2, dVar);
            this.f18396p = i10;
            this.f18397q = i11;
            this.f18398r = it;
            this.f18399s = z10;
            this.f18400t = z11;
        }

        @Override // da.p
        /* renamed from: a */
        public final Object invoke(ja.d<? super List<? extends T>> dVar, v9.d<? super s9.u> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(s9.u.f17878a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final v9.d<s9.u> create(Object obj, v9.d<?> dVar) {
            a aVar = new a(this.f18396p, this.f18397q, this.f18398r, this.f18399s, this.f18400t, dVar);
            aVar.f18395o = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t9.o0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Iterator<List<T>> a10;
        kotlin.jvm.internal.l.e(iterator, "iterator");
        if (iterator.hasNext()) {
            a10 = ja.f.a(new a(i10, i11, iterator, z11, z10, null));
            return a10;
        }
        return y.f18408j;
    }
}
