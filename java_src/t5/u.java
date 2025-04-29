package t5;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum u implements b0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: r  reason: collision with root package name */
    private static final b0.d<u> f18300r = new b0.d<u>() { // from class: t5.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.b0.d
        /* renamed from: b */
        public u a(int i10) {
            return u.b(i10);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f18302j;

    u(int i10) {
        this.f18302j = i10;
    }

    public static u b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return SHA224;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f18302j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
