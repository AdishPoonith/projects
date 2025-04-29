package j2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p3.n0;
/* loaded from: classes.dex */
class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f11981g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f11982h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f11983a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f11984b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f11985c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f11986d;

    /* renamed from: e  reason: collision with root package name */
    private final p3.g f11987e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11988f;

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11990a;

        /* renamed from: b  reason: collision with root package name */
        public int f11991b;

        /* renamed from: c  reason: collision with root package name */
        public int f11992c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f11993d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f11994e;

        /* renamed from: f  reason: collision with root package name */
        public int f11995f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f11990a = i10;
            this.f11991b = i11;
            this.f11992c = i12;
            this.f11994e = j10;
            this.f11995f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new p3.g());
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, p3.g gVar) {
        this.f11983a = mediaCodec;
        this.f11984b = handlerThread;
        this.f11987e = gVar;
        this.f11986d = new AtomicReference<>();
    }

    private void b() {
        this.f11987e.c();
        ((Handler) p3.a.e(this.f11985c)).obtainMessage(2).sendToTarget();
        this.f11987e.a();
    }

    private static void c(v1.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f19344f;
        cryptoInfo.numBytesOfClearData = e(cVar.f19342d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f19343e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) p3.a.e(d(cVar.f19340b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) p3.a.e(d(cVar.f19339a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f19341c;
        if (n0.f15397a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f19345g, cVar.f19346h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f11990a, bVar.f11991b, bVar.f11992c, bVar.f11994e, bVar.f11995f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f11990a, bVar.f11991b, bVar.f11993d, bVar.f11994e, bVar.f11995f);
        } else if (i10 != 2) {
            this.f11986d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f11987e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f11983a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f11986d.compareAndSet(null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f11982h) {
                this.f11983a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f11986d.compareAndSet(null, e10);
        }
    }

    private void j() {
        ((Handler) p3.a.e(this.f11985c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f11981g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f11981g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f11988f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void l() {
        RuntimeException andSet = this.f11986d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) n0.j(this.f11985c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, v1.c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f11993d);
        ((Handler) n0.j(this.f11985c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f11988f) {
            i();
            this.f11984b.quit();
        }
        this.f11988f = false;
    }

    public void q() {
        if (this.f11988f) {
            return;
        }
        this.f11984b.start();
        this.f11985c = new a(this.f11984b.getLooper());
        this.f11988f = true;
    }

    public void r() {
        b();
    }
}
