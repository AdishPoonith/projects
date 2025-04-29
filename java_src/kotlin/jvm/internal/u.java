package kotlin.jvm.internal;
/* loaded from: classes.dex */
public class u {
    public ia.e a(i iVar) {
        return iVar;
    }

    public ia.c b(Class cls) {
        return new e(cls);
    }

    public ia.d c(Class cls, String str) {
        return new n(cls, str);
    }

    public ia.f d(o oVar) {
        return oVar;
    }

    public String e(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(m mVar) {
        return e(mVar);
    }
}
