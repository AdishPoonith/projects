package r7;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f16722a;

    /* renamed from: b  reason: collision with root package name */
    private int f16723b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16724c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16725d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f16722a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f16722a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f16725d = i11 * 17;
        this.f16724c = i10;
        this.f16723b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a() {
        return this.f16722a[this.f16723b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.f16724c * i11, this.f16725d * i10);
        int i12 = this.f16724c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f16722a[i13 / i11].b(i10);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f16723b++;
    }
}
