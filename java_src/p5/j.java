package p5;

import java.security.GeneralSecurityException;
import t5.j0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15518a = new i().d();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f15519b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f15520c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f15521d;

    static {
        j0 O = j0.O();
        f15519b = O;
        f15520c = O;
        f15521d = O;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        m.f();
        i.p(true);
        if (k5.a.a()) {
            return;
        }
        b.o(true);
    }
}
