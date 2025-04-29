package t5;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum z implements b0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: p  reason: collision with root package name */
    private static final b0.d<z> f18321p = new b0.d<z>() { // from class: t5.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.b0.d
        /* renamed from: b */
        public z a(int i10) {
            return z.b(i10);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f18323j;

    z(int i10) {
        this.f18323j = i10;
    }

    public static z b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f18323j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
