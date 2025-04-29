package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p3.n0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f11998b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f11999c;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f12004h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f12005i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f12006j;

    /* renamed from: k  reason: collision with root package name */
    private long f12007k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12008l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f12009m;

    /* renamed from: a  reason: collision with root package name */
    private final Object f11997a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final k f12000d = new k();

    /* renamed from: e  reason: collision with root package name */
    private final k f12001e = new k();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f12002f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f12003g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HandlerThread handlerThread) {
        this.f11998b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f12001e.a(-2);
        this.f12003g.add(mediaFormat);
    }

    private void f() {
        if (!this.f12003g.isEmpty()) {
            this.f12005i = this.f12003g.getLast();
        }
        this.f12000d.b();
        this.f12001e.b();
        this.f12002f.clear();
        this.f12003g.clear();
    }

    private boolean i() {
        return this.f12007k > 0 || this.f12008l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f12009m;
        if (illegalStateException == null) {
            return;
        }
        this.f12009m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f12006j;
        if (codecException == null) {
            return;
        }
        this.f12006j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f11997a) {
            if (this.f12008l) {
                return;
            }
            long j10 = this.f12007k - 1;
            this.f12007k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f11997a) {
            this.f12009m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f11997a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f12000d.d()) {
                i10 = this.f12000d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11997a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f12001e.d()) {
                return -1;
            }
            int e10 = this.f12001e.e();
            if (e10 >= 0) {
                p3.a.h(this.f12004h);
                MediaCodec.BufferInfo remove = this.f12002f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e10 == -2) {
                this.f12004h = this.f12003g.remove();
            }
            return e10;
        }
    }

    public void e() {
        synchronized (this.f11997a) {
            this.f12007k++;
            ((Handler) n0.j(this.f11999c)).post(new Runnable() { // from class: j2.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f11997a) {
            mediaFormat = this.f12004h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        p3.a.f(this.f11999c == null);
        this.f11998b.start();
        Handler handler = new Handler(this.f11998b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f11999c = handler;
    }

    public void o() {
        synchronized (this.f11997a) {
            this.f12008l = true;
            this.f11998b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f11997a) {
            this.f12006j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f11997a) {
            this.f12000d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11997a) {
            MediaFormat mediaFormat = this.f12005i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f12005i = null;
            }
            this.f12001e.a(i10);
            this.f12002f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f11997a) {
            b(mediaFormat);
            this.f12005i = null;
        }
    }
}
