package f2;

import x1.e0;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8748a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8749b;

    /* renamed from: c  reason: collision with root package name */
    public final e0.a f8750c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8751d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f8752e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        p3.a.a((bArr2 == null) ^ (i10 == 0));
        this.f8748a = z10;
        this.f8749b = str;
        this.f8751d = i10;
        this.f8752e = bArr2;
        this.f8750c = new e0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                p3.r.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
