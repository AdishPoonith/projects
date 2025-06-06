package okio;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f14785a = Charset.forName("UTF-8");

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    public static void c(Throwable th) {
        d(th);
    }

    private static <T extends Throwable> void d(Throwable th) {
        throw th;
    }
}
