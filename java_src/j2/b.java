package j2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import j2.b;
import j2.l;
import java.nio.ByteBuffer;
import p3.k0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f11970a;

    /* renamed from: b  reason: collision with root package name */
    private final g f11971b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11972c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11973d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11974e;

    /* renamed from: f  reason: collision with root package name */
    private int f11975f;

    /* renamed from: j2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0178b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final b5.t<HandlerThread> f11976a;

        /* renamed from: b  reason: collision with root package name */
        private final b5.t<HandlerThread> f11977b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f11978c;

        public C0178b(final int i10, boolean z10) {
            this(new b5.t() { // from class: j2.c
                @Override // b5.t
                public final Object get() {
                    HandlerThread e10;
                    e10 = b.C0178b.e(i10);
                    return e10;
                }
            }, new b5.t() { // from class: j2.d
                @Override // b5.t
                public final Object get() {
                    HandlerThread f10;
                    f10 = b.C0178b.f(i10);
                    return f10;
                }
            }, z10);
        }

        C0178b(b5.t<HandlerThread> tVar, b5.t<HandlerThread> tVar2, boolean z10) {
            this.f11976a = tVar;
            this.f11977b = tVar2;
            this.f11978c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.t(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.u(i10));
        }

        @Override // j2.l.b
        /* renamed from: d */
        public b a(l.a aVar) {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f12023a.f12031a;
            b bVar2 = null;
            try {
                k0.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f11976a.get(), this.f11977b.get(), this.f11978c);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                k0.c();
                bVar.w(aVar.f12024b, aVar.f12026d, aVar.f12027e, aVar.f12028f);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f11970a = mediaCodec;
        this.f11971b = new g(handlerThread);
        this.f11972c = new e(mediaCodec, handlerThread2);
        this.f11973d = z10;
        this.f11975f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        return v(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return v(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String v(int i10, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f11971b.h(this.f11970a);
        k0.a("configureCodec");
        this.f11970a.configure(mediaFormat, surface, mediaCrypto, i10);
        k0.c();
        this.f11972c.q();
        k0.a("startCodec");
        this.f11970a.start();
        k0.c();
        this.f11975f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void y() {
        if (this.f11973d) {
            try {
                this.f11972c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // j2.l
    public void a() {
        try {
            if (this.f11975f == 1) {
                this.f11972c.p();
                this.f11971b.o();
            }
            this.f11975f = 2;
        } finally {
            if (!this.f11974e) {
                this.f11970a.release();
                this.f11974e = true;
            }
        }
    }

    @Override // j2.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        this.f11972c.l();
        return this.f11971b.d(bufferInfo);
    }

    @Override // j2.l
    public boolean c() {
        return false;
    }

    @Override // j2.l
    public void d(int i10, boolean z10) {
        this.f11970a.releaseOutputBuffer(i10, z10);
    }

    @Override // j2.l
    public void e(int i10, int i11, v1.c cVar, long j10, int i12) {
        this.f11972c.n(i10, i11, cVar, j10, i12);
    }

    @Override // j2.l
    public void f(int i10) {
        y();
        this.f11970a.setVideoScalingMode(i10);
    }

    @Override // j2.l
    public void flush() {
        this.f11972c.i();
        this.f11970a.flush();
        this.f11971b.e();
        this.f11970a.start();
    }

    @Override // j2.l
    public MediaFormat g() {
        return this.f11971b.g();
    }

    @Override // j2.l
    public ByteBuffer h(int i10) {
        return this.f11970a.getInputBuffer(i10);
    }

    @Override // j2.l
    public void i(Surface surface) {
        y();
        this.f11970a.setOutputSurface(surface);
    }

    @Override // j2.l
    public void j(final l.c cVar, Handler handler) {
        y();
        this.f11970a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j2.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.this.x(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // j2.l
    public void k(int i10, int i11, int i12, long j10, int i13) {
        this.f11972c.m(i10, i11, i12, j10, i13);
    }

    @Override // j2.l
    public void l(Bundle bundle) {
        y();
        this.f11970a.setParameters(bundle);
    }

    @Override // j2.l
    public ByteBuffer m(int i10) {
        return this.f11970a.getOutputBuffer(i10);
    }

    @Override // j2.l
    public void n(int i10, long j10) {
        this.f11970a.releaseOutputBuffer(i10, j10);
    }

    @Override // j2.l
    public int o() {
        this.f11972c.l();
        return this.f11971b.c();
    }
}
