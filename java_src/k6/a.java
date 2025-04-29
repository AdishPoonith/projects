package k6;

import java.util.Arrays;
import java.util.Objects;
import m6.l;
/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: j  reason: collision with root package name */
    private final int f12586j;

    /* renamed from: k  reason: collision with root package name */
    private final l f12587k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f12588l;

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f12589m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, l lVar, byte[] bArr, byte[] bArr2) {
        this.f12586j = i10;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f12587k = lVar;
        Objects.requireNonNull(bArr, "Null arrayValue");
        this.f12588l = bArr;
        Objects.requireNonNull(bArr2, "Null directionalValue");
        this.f12589m = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f12586j == eVar.l() && this.f12587k.equals(eVar.k())) {
                boolean z10 = eVar instanceof a;
                if (Arrays.equals(this.f12588l, z10 ? ((a) eVar).f12588l : eVar.h())) {
                    if (Arrays.equals(this.f12589m, z10 ? ((a) eVar).f12589m : eVar.i())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // k6.e
    public byte[] h() {
        return this.f12588l;
    }

    public int hashCode() {
        return ((((((this.f12586j ^ 1000003) * 1000003) ^ this.f12587k.hashCode()) * 1000003) ^ Arrays.hashCode(this.f12588l)) * 1000003) ^ Arrays.hashCode(this.f12589m);
    }

    @Override // k6.e
    public byte[] i() {
        return this.f12589m;
    }

    @Override // k6.e
    public l k() {
        return this.f12587k;
    }

    @Override // k6.e
    public int l() {
        return this.f12586j;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f12586j + ", documentKey=" + this.f12587k + ", arrayValue=" + Arrays.toString(this.f12588l) + ", directionalValue=" + Arrays.toString(this.f12589m) + "}";
    }
}
