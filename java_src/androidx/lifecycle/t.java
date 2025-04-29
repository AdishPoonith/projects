package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.e;
import c0.a;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<f0.d> f2561a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<b0> f2562b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f2563c = new a();

    /* loaded from: classes.dex */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b<f0.d> {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a.b<b0> {
        c() {
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.m implements da.l<c0.a, v> {

        /* renamed from: j  reason: collision with root package name */
        public static final d f2564j = new d();

        d() {
            super(1);
        }

        @Override // da.l
        /* renamed from: a */
        public final v invoke(c0.a initializer) {
            kotlin.jvm.internal.l.e(initializer, "$this$initializer");
            return new v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends f0.d & b0> void a(T t10) {
        kotlin.jvm.internal.l.e(t10, "<this>");
        e.b b10 = t10.a().b();
        if (!(b10 == e.b.INITIALIZED || b10 == e.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.j().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            u uVar = new u(t10.j(), t10);
            t10.j().h("androidx.lifecycle.internal.SavedStateHandlesProvider", uVar);
            t10.a().a(new SavedStateHandleAttacher(uVar));
        }
    }

    public static final v b(b0 b0Var) {
        kotlin.jvm.internal.l.e(b0Var, "<this>");
        c0.c cVar = new c0.c();
        cVar.a(kotlin.jvm.internal.t.b(v.class), d.f2564j);
        return (v) new x(b0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", v.class);
    }
}
