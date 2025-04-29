package b4;

import java.util.Arrays;
/* loaded from: classes.dex */
final class w extends v {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2925b = bArr;
    }

    @Override // b4.v
    final byte[] M() {
        return this.f2925b;
    }
}
