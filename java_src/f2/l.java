package f2;

import java.nio.ByteBuffer;
import java.util.UUID;
import p3.a0;
/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f8725a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8726b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f8727c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f8725a = uuid;
            this.f8726b = i10;
            this.f8727c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        if (a0Var.g() < 32) {
            return null;
        }
        a0Var.T(0);
        if (a0Var.p() == a0Var.a() + 4 && a0Var.p() == 1886614376) {
            int c10 = f2.a.c(a0Var.p());
            if (c10 > 1) {
                p3.r.i("PsshAtomUtil", "Unsupported pssh version: " + c10);
                return null;
            }
            UUID uuid = new UUID(a0Var.z(), a0Var.z());
            if (c10 == 1) {
                a0Var.U(a0Var.K() * 16);
            }
            int K = a0Var.K();
            if (K != a0Var.a()) {
                return null;
            }
            byte[] bArr2 = new byte[K];
            a0Var.l(bArr2, 0, K);
            return new a(uuid, c10, bArr2);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f8725a)) {
            return d10.f8727c;
        }
        p3.r.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f8725a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f8725a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f8726b;
    }
}
