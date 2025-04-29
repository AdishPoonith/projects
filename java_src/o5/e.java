package o5;

import g5.t;
import g5.x;
import t5.i0;
import t5.y;
/* loaded from: classes.dex */
public final class e extends g5.f {

    /* renamed from: a  reason: collision with root package name */
    private final l f14640a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14641a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14642b;

        static {
            int[] iArr = new int[y.c.values().length];
            f14642b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14642b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i0.values().length];
            f14641a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14641a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14641a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14641a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b extends t {

        /* renamed from: a  reason: collision with root package name */
        private final String f14643a;

        /* renamed from: b  reason: collision with root package name */
        private final i0 f14644b;

        private b(String str, i0 i0Var) {
            this.f14643a = str;
            this.f14644b = i0Var;
        }

        /* synthetic */ b(String str, i0 i0Var, a aVar) {
            this(str, i0Var);
        }

        private static String a(i0 i0Var) {
            int i10 = a.f14641a[i0Var.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f14643a, a(this.f14644b));
        }
    }

    public e(l lVar, x xVar) {
        b(lVar, xVar);
        this.f14640a = lVar;
    }

    private static void b(l lVar, x xVar) {
        int i10 = a.f14642b[lVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            x.b(xVar);
        }
    }

    @Override // g5.f
    public t a() {
        return new b(this.f14640a.f(), this.f14640a.e(), null);
    }
}
