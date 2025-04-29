package t5;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum i0 implements b0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: q  reason: collision with root package name */
    private static final b0.d<i0> f18276q = new b0.d<i0>() { // from class: t5.i0.a
        @Override // com.google.crypto.tink.shaded.protobuf.b0.d
        /* renamed from: b */
        public i0 a(int i10) {
            return i0.b(i10);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f18278j;

    i0(int i10) {
        this.f18278j = i10;
    }

    public static i0 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f18278j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
