package r8;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class t implements i<String> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f16794a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final t f16795b = new t();

    private t() {
    }

    @Override // r8.i
    /* renamed from: c */
    public String b(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i10;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i10 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i10 = 0;
        }
        return new String(bArr, i10, remaining, f16794a);
    }

    @Override // r8.i
    /* renamed from: d */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f16794a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
