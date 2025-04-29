package g5;

import t5.a0;
import t5.i0;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f8982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8983a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8984b;

        static {
            int[] iArr = new int[b.values().length];
            f8984b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8984b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8984b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8984b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f8983a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8983a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8983a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8983a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private k(a0 a0Var) {
        this.f8982a = a0Var;
    }

    public static k a(String str, byte[] bArr, b bVar) {
        return new k(a0.V().C(str).D(com.google.crypto.tink.shaded.protobuf.i.m(bArr)).B(c(bVar)).b());
    }

    static i0 c(b bVar) {
        int i10 = a.f8984b[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return i0.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return i0.RAW;
            }
            return i0.LEGACY;
        }
        return i0.TINK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 b() {
        return this.f8982a;
    }
}
