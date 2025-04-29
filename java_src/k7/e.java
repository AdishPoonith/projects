package k7;
/* loaded from: classes.dex */
final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f12615c;

    /* renamed from: d  reason: collision with root package name */
    private final short f12616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f12615c = (short) i10;
        this.f12616d = (short) i11;
    }

    @Override // k7.g
    void c(l7.a aVar, byte[] bArr) {
        aVar.d(this.f12615c, this.f12616d);
    }

    public String toString() {
        short s10 = this.f12615c;
        short s11 = this.f12616d;
        int i10 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(i10 | (1 << this.f12616d)).substring(1) + '>';
    }
}
