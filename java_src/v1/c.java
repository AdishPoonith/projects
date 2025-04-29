package v1;

import android.media.MediaCodec;
import p3.n0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f19339a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f19340b;

    /* renamed from: c  reason: collision with root package name */
    public int f19341c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f19342d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f19343e;

    /* renamed from: f  reason: collision with root package name */
    public int f19344f;

    /* renamed from: g  reason: collision with root package name */
    public int f19345g;

    /* renamed from: h  reason: collision with root package name */
    public int f19346h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f19347i;

    /* renamed from: j  reason: collision with root package name */
    private final b f19348j;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f19349a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f19350b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f19349a = cryptoInfo;
            this.f19350b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f19350b.set(i10, i11);
            this.f19349a.setPattern(this.f19350b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f19347i = cryptoInfo;
        this.f19348j = n0.f15397a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f19347i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f19342d == null) {
            int[] iArr = new int[1];
            this.f19342d = iArr;
            this.f19347i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f19342d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f19344f = i10;
        this.f19342d = iArr;
        this.f19343e = iArr2;
        this.f19340b = bArr;
        this.f19339a = bArr2;
        this.f19341c = i11;
        this.f19345g = i12;
        this.f19346h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f19347i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (n0.f15397a >= 24) {
            ((b) p3.a.e(this.f19348j)).b(i12, i13);
        }
    }
}
