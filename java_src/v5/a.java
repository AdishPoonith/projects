package v5;

import java.util.Arrays;
import java.util.Objects;
import u5.k;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f19428a;

    private a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f19428a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static a a(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return b(bArr, 0, bArr.length);
    }

    public static a b(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new a(bArr, i10, i11);
    }

    public int c() {
        return this.f19428a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f19428a, this.f19428a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19428a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f19428a) + ")";
    }
}
