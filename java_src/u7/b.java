package u7;

import java.lang.reflect.Array;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f19142a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19143b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19144c;

    public b(int i10, int i11) {
        this.f19142a = (byte[][]) Array.newInstance(byte.class, i11, i10);
        this.f19143b = i10;
        this.f19144c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f19142a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f19142a[i11][i10];
    }

    public byte[][] c() {
        return this.f19142a;
    }

    public int d() {
        return this.f19144c;
    }

    public int e() {
        return this.f19143b;
    }

    public void f(int i10, int i11, int i12) {
        this.f19142a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f19142a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f19143b * 2 * this.f19144c) + 2);
        for (int i10 = 0; i10 < this.f19144c; i10++) {
            byte[] bArr = this.f19142a[i10];
            for (int i11 = 0; i11 < this.f19143b; i11++) {
                byte b10 = bArr[i11];
                sb.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
