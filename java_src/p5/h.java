package p5;

import com.google.crypto.tink.shaded.protobuf.c0;
import g5.x;
import java.security.GeneralSecurityException;
import o5.b;
import o5.c;
import o5.i;
import o5.j;
import o5.n;
import o5.q;
import p5.c;
import t5.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final v5.a f15510a;

    /* renamed from: b  reason: collision with root package name */
    private static final o5.j<c, o5.m> f15511b;

    /* renamed from: c  reason: collision with root package name */
    private static final o5.i<o5.m> f15512c;

    /* renamed from: d  reason: collision with root package name */
    private static final o5.c<p5.a, o5.l> f15513d;

    /* renamed from: e  reason: collision with root package name */
    private static final o5.b<o5.l> f15514e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15515a;

        static {
            int[] iArr = new int[i0.values().length];
            f15515a = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15515a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15515a[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15515a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v5.a d10 = q.d("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f15510a = d10;
        f15511b = o5.j.a(new j.b() { // from class: p5.g
        }, c.class, o5.m.class);
        f15512c = o5.i.a(new i.b() { // from class: p5.f
        }, d10, o5.m.class);
        f15513d = o5.c.a(new c.b() { // from class: p5.e
        }, p5.a.class, o5.l.class);
        f15514e = o5.b.a(new b.InterfaceC0214b() { // from class: p5.d
            @Override // o5.b.InterfaceC0214b
            public final g5.f a(n nVar, x xVar) {
                a b10;
                b10 = h.b((o5.l) nVar, xVar);
                return b10;
            }
        }, d10, o5.l.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p5.a b(o5.l lVar, x xVar) {
        if (lVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                t5.a V = t5.a.V(lVar.g(), com.google.crypto.tink.shaded.protobuf.q.b());
                if (V.T() == 0) {
                    return p5.a.d(c(V.S(), lVar.e()), v5.b.a(V.R().A(), x.b(xVar)), lVar.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (c0 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    private static c c(t5.c cVar, i0 i0Var) {
        return c.a(cVar.Q(), f(i0Var));
    }

    public static void d() {
        e(o5.h.a());
    }

    public static void e(o5.h hVar) {
        hVar.g(f15511b);
        hVar.f(f15512c);
        hVar.e(f15513d);
        hVar.d(f15514e);
    }

    private static c.a f(i0 i0Var) {
        int i10 = a.f15515a[i0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return c.a.f15504e;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
                }
                return c.a.f15503d;
            }
            return c.a.f15502c;
        }
        return c.a.f15501b;
    }
}
