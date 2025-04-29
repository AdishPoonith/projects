package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: m  reason: collision with root package name */
    static final char[] f14753m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: n  reason: collision with root package name */
    public static final f f14754n = n(new byte[0]);

    /* renamed from: j  reason: collision with root package name */
    final byte[] f14755j;

    /* renamed from: k  reason: collision with root package name */
    transient int f14756k;

    /* renamed from: l  reason: collision with root package name */
    transient String f14757l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.f14755j = bArr;
    }

    static int g(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f i(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(p.f14785a));
            fVar.f14757l = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f n(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f q(InputStream inputStream, int i10) {
        if (inputStream != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + i10);
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    throw new EOFException();
                }
                i11 += read;
            }
            return new f(bArr);
        }
        throw new IllegalArgumentException("in == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        f q10 = q(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = f.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField.set(this, q10.f14755j);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f14755j.length);
        objectOutputStream.write(this.f14755j);
    }

    public String b() {
        return b.a(this.f14755j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int r10 = fVar.r();
            byte[] bArr = this.f14755j;
            if (r10 == bArr.length && fVar.p(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(f fVar) {
        int r10 = r();
        int r11 = fVar.r();
        int min = Math.min(r10, r11);
        for (int i10 = 0; i10 < min; i10++) {
            int k10 = k(i10) & 255;
            int k11 = fVar.k(i10) & 255;
            if (k10 != k11) {
                return k10 < k11 ? -1 : 1;
            }
        }
        if (r10 == r11) {
            return 0;
        }
        return r10 < r11 ? -1 : 1;
    }

    public int hashCode() {
        int i10 = this.f14756k;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f14755j);
        this.f14756k = hashCode;
        return hashCode;
    }

    public byte k(int i10) {
        return this.f14755j[i10];
    }

    public String l() {
        byte[] bArr = this.f14755j;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f14753m;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean o(int i10, f fVar, int i11, int i12) {
        return fVar.p(i11, this.f14755j, i10, i12);
    }

    public boolean p(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f14755j;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && p.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public int r() {
        return this.f14755j.length;
    }

    public final boolean s(f fVar) {
        return o(0, fVar, 0, fVar.r());
    }

    public f t(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f14755j;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f14755j.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f14755j.length == 0) {
            return "[size=0]";
        }
        String w10 = w();
        int g10 = g(w10, 64);
        if (g10 == -1) {
            if (this.f14755j.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(l());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f14755j.length);
                sb2.append(" hex=");
                sb2.append(t(0, 64).l());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = w10.substring(0, g10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (g10 < w10.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f14755j.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public f u() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f14755j;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
            i10++;
        }
    }

    public byte[] v() {
        return (byte[]) this.f14755j.clone();
    }

    public String w() {
        String str = this.f14757l;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f14755j, p.f14785a);
        this.f14757l = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(c cVar) {
        byte[] bArr = this.f14755j;
        cVar.i0(bArr, 0, bArr.length);
    }
}
