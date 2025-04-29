package k7;
/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f12606c;

    /* renamed from: d  reason: collision with root package name */
    private final short f12607d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f12606c = (short) i10;
        this.f12607d = (short) i11;
    }

    @Override // k7.g
    public void c(l7.a aVar, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            short s10 = this.f12607d;
            if (i11 >= s10) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s10 <= 62)) {
                int i12 = 5;
                aVar.d(31, 5);
                short s11 = this.f12607d;
                if (s11 > 62) {
                    i10 = s11 - 31;
                    i12 = 16;
                } else if (i11 == 0) {
                    aVar.d(Math.min((int) s11, 31), 5);
                } else {
                    i10 = s11 - 31;
                }
                aVar.d(i10, i12);
            }
            aVar.d(bArr[this.f12606c + i11], 8);
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f12606c);
        sb.append("::");
        sb.append((this.f12606c + this.f12607d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
