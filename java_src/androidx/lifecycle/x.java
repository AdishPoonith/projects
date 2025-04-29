package androidx.lifecycle;

import android.app.Application;
import c0.a;
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f2574a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2575b;

    /* renamed from: c  reason: collision with root package name */
    private final c0.a f2576c;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public static final C0041a f2577d = new C0041a(null);

        /* renamed from: e  reason: collision with root package name */
        public static final a.b<Application> f2578e = C0041a.C0042a.f2579a;

        /* renamed from: androidx.lifecycle.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0041a {

            /* renamed from: androidx.lifecycle.x$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0042a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0042a f2579a = new C0042a();

                private C0042a() {
                }
            }

            private C0041a() {
            }

            public /* synthetic */ C0041a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2580a = a.f2581a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f2581a = new a();

            private a() {
            }
        }

        <T extends w> T a(Class<T> cls);

        <T extends w> T b(Class<T> cls, c0.a aVar);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2582b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        public static final a.b<String> f2583c = a.C0043a.f2584a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.x$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0043a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0043a f2584a = new C0043a();

                private C0043a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void a(w viewModel) {
            kotlin.jvm.internal.l.e(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(a0 store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
    }

    public x(a0 store, b factory, c0.a defaultCreationExtras) {
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(defaultCreationExtras, "defaultCreationExtras");
        this.f2574a = store;
        this.f2575b = factory;
        this.f2576c = defaultCreationExtras;
    }

    public /* synthetic */ x(a0 a0Var, b bVar, c0.a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this(a0Var, bVar, (i10 & 4) != 0 ? a.C0073a.f3128b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(b0 owner, b factory) {
        this(owner.p(), factory, z.a(owner));
        kotlin.jvm.internal.l.e(owner, "owner");
        kotlin.jvm.internal.l.e(factory, "factory");
    }

    public <T extends w> T a(Class<T> modelClass) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends w> T b(String key, Class<T> modelClass) {
        T t10;
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        T t11 = (T) this.f2574a.b(key);
        if (!modelClass.isInstance(t11)) {
            c0.d dVar = new c0.d(this.f2576c);
            dVar.b(c.f2583c, key);
            try {
                t10 = (T) this.f2575b.b(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f2575b.a(modelClass);
            }
            this.f2574a.d(key, t10);
            return t10;
        }
        b bVar = this.f2575b;
        d dVar2 = bVar instanceof d ? (d) bVar : null;
        if (dVar2 != null) {
            kotlin.jvm.internal.l.b(t11);
            dVar2.a(t11);
        }
        kotlin.jvm.internal.l.c(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
