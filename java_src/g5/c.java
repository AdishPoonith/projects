package g5;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import t5.c0;
import t5.i0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f8970a = new byte[0];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8971a;

        static {
            int[] iArr = new int[i0.values().length];
            f8971a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8971a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8971a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8971a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i10 = a.f8971a[cVar.U().ordinal()];
        if (i10 == 1 || i10 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i10 != 3) {
            if (i10 == 4) {
                return f8970a;
            }
            throw new GeneralSecurityException("unknown output prefix type");
        } else {
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.T()).array();
    }
}
