package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f12834a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f12835b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f12836c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12837a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f12838b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f12839c;

        public a(Method method, Method method2, Method method3) {
            this.f12837a = method;
            this.f12838b = method2;
            this.f12839c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f12836c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f12835b;
            f12836c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        kotlin.jvm.internal.l.e(continuation, "continuation");
        a aVar = f12836c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f12835b) {
            return null;
        }
        Method method = aVar.f12837a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f12838b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f12839c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
