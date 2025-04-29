package r7;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16726a;

    /* renamed from: b  reason: collision with root package name */
    private int f16727b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10) {
        this.f16726a = new byte[i10];
    }

    private void c(int i10, boolean z10) {
        this.f16726a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f16727b;
            this.f16727b = i12 + 1;
            c(i12, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b(int i10) {
        int length = this.f16726a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f16726a[i11 / i10];
        }
        return bArr;
    }
}
