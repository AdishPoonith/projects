package kotlin.jvm.internal;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final u f12858a;

    /* renamed from: b  reason: collision with root package name */
    private static final ia.c[] f12859b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f12858a = uVar;
        f12859b = new ia.c[0];
    }

    public static ia.e a(i iVar) {
        return f12858a.a(iVar);
    }

    public static ia.c b(Class cls) {
        return f12858a.b(cls);
    }

    public static ia.d c(Class cls) {
        return f12858a.c(cls, "");
    }

    public static ia.f d(o oVar) {
        return f12858a.d(oVar);
    }

    public static String e(h hVar) {
        return f12858a.e(hVar);
    }

    public static String f(m mVar) {
        return f12858a.f(mVar);
    }
}
