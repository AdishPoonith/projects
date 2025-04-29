package b4;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
abstract class x extends v {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f2926c = new WeakReference(null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f2927b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(byte[] bArr) {
        super(bArr);
        this.f2927b = f2926c;
    }

    protected abstract byte[] H2();

    @Override // b4.v
    final byte[] M() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f2927b.get();
            if (bArr == null) {
                bArr = H2();
                this.f2927b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
