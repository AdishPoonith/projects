package o5;

import g5.u;
import java.security.GeneralSecurityException;
import java.util.List;
import r5.b;
import r5.c;
import t5.z;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f14645a = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14646a;

        static {
            int[] iArr = new int[z.values().length];
            f14646a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14646a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14646a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b implements b.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // r5.b.a
        public void a() {
        }

        @Override // r5.b.a
        public void b(int i10, long j10) {
        }
    }

    public static <P> r5.c a(u<P> uVar) {
        c.b a10 = r5.c.a();
        a10.d(uVar.d());
        for (List<u.c<P>> list : uVar.c()) {
            for (u.c<P> cVar : list) {
                a10.a(b(cVar.g()), cVar.c(), cVar.e());
            }
        }
        if (uVar.e() != null) {
            a10.e(uVar.e().c());
        }
        try {
            return a10.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static g5.j b(z zVar) {
        int i10 = a.f14646a[zVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return g5.j.f8980d;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return g5.j.f8979c;
        }
        return g5.j.f8978b;
    }
}
