package r8;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class r implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f16789a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f16790b;

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f16791c;

    /* loaded from: classes.dex */
    static final class a extends ByteArrayOutputStream {
        /* JADX INFO: Access modifiers changed from: package-private */
        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f16790b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f16791c = Charset.forName("UTF8");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void c(ByteBuffer byteBuffer, int i10) {
        int position = byteBuffer.position() % i10;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i10) - position);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i10 = byteBuffer.get() & 255;
            return i10 < 254 ? i10 : i10 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        int size = byteArrayOutputStream.size() % i10;
        if (size != 0) {
            for (int i11 = 0; i11 < i10 - size; i11++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void j(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        if (f16790b) {
            byteArrayOutputStream.write(i10);
            i10 >>>= 8;
        } else {
            byteArrayOutputStream.write(i10 >>> 8);
        }
        byteArrayOutputStream.write(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d10) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d10));
    }

    protected static final void l(ByteArrayOutputStream byteArrayOutputStream, float f10) {
        m(byteArrayOutputStream, Float.floatToIntBits(f10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        if (f16790b) {
            byteArrayOutputStream.write(i10);
            byteArrayOutputStream.write(i10 >>> 8);
            byteArrayOutputStream.write(i10 >>> 16);
            i10 >>>= 24;
        } else {
            byteArrayOutputStream.write(i10 >>> 24);
            byteArrayOutputStream.write(i10 >>> 16);
            byteArrayOutputStream.write(i10 >>> 8);
        }
        byteArrayOutputStream.write(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        if (f16790b) {
            byteArrayOutputStream.write((byte) j10);
            byteArrayOutputStream.write((byte) (j10 >>> 8));
            byteArrayOutputStream.write((byte) (j10 >>> 16));
            byteArrayOutputStream.write((byte) (j10 >>> 24));
            byteArrayOutputStream.write((byte) (j10 >>> 32));
            byteArrayOutputStream.write((byte) (j10 >>> 40));
            byteArrayOutputStream.write((byte) (j10 >>> 48));
            j10 >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j10 >>> 56));
            byteArrayOutputStream.write((byte) (j10 >>> 48));
            byteArrayOutputStream.write((byte) (j10 >>> 40));
            byteArrayOutputStream.write((byte) (j10 >>> 32));
            byteArrayOutputStream.write((byte) (j10 >>> 24));
            byteArrayOutputStream.write((byte) (j10 >>> 16));
            byteArrayOutputStream.write((byte) (j10 >>> 8));
        }
        byteArrayOutputStream.write((byte) j10);
    }

    protected static final void o(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        if (i10 < 254) {
            byteArrayOutputStream.write(i10);
        } else if (i10 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i10);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i10);
        }
    }

    @Override // r8.i
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r8.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f10 = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map, java.util.HashMap] */
    public Object g(byte b10, ByteBuffer byteBuffer) {
        int e10;
        int e11;
        long[] jArr;
        ?? arrayList;
        int[] iArr;
        int i10 = 0;
        switch (b10) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(d(byteBuffer), f16791c), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(d(byteBuffer), f16791c);
            case 8:
                return d(byteBuffer);
            case 9:
                e10 = e(byteBuffer);
                int[] iArr2 = new int[e10];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr2);
                iArr = iArr2;
                byteBuffer.position(byteBuffer.position() + (e10 * 4));
                return iArr;
            case 10:
                e11 = e(byteBuffer);
                long[] jArr2 = new long[e11];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                jArr = jArr2;
                byteBuffer.position(byteBuffer.position() + (e11 * 8));
                return jArr;
            case 11:
                e11 = e(byteBuffer);
                double[] dArr = new double[e11];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                jArr = dArr;
                byteBuffer.position(byteBuffer.position() + (e11 * 8));
                return jArr;
            case 12:
                int e12 = e(byteBuffer);
                arrayList = new ArrayList(e12);
                while (i10 < e12) {
                    arrayList.add(f(byteBuffer));
                    i10++;
                }
                return arrayList;
            case 13:
                int e13 = e(byteBuffer);
                arrayList = new HashMap();
                while (i10 < e13) {
                    arrayList.put(f(byteBuffer), f(byteBuffer));
                    i10++;
                }
                return arrayList;
            case 14:
                e10 = e(byteBuffer);
                float[] fArr = new float[e10];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                iArr = fArr;
                byteBuffer.position(byteBuffer.position() + (e10 * 4));
                return iArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i10 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (!(obj instanceof BigInteger)) {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            } else {
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f16791c));
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f16791c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i10 < length) {
                m(byteArrayOutputStream, iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i10 < length2) {
                n(byteArrayOutputStream, jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i10 < length3) {
                k(byteArrayOutputStream, dArr[i10]);
                i10++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            o(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                p(byteArrayOutputStream, obj2);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
        } else if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        } else {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            o(byteArrayOutputStream, fArr.length);
            h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i10 < length4) {
                l(byteArrayOutputStream, fArr[i10]);
                i10++;
            }
        }
    }
}
