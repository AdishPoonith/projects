package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import j2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import p3.k0;
import p3.n0;
/* loaded from: classes.dex */
public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f12098a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f12099b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f12100c;

    /* loaded from: classes.dex */
    public static class b implements l.b {
        @Override // j2.l.b
        public l a(l.a aVar) {
            MediaCodec b10;
            MediaCodec mediaCodec = null;
            try {
                b10 = b(aVar);
            } catch (IOException e10) {
                e = e10;
            } catch (RuntimeException e11) {
                e = e11;
            }
            try {
                k0.a("configureCodec");
                b10.configure(aVar.f12024b, aVar.f12026d, aVar.f12027e, aVar.f12028f);
                k0.c();
                k0.a("startCodec");
                b10.start();
                k0.c();
                return new x(b10);
            } catch (IOException | RuntimeException e12) {
                e = e12;
                mediaCodec = b10;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected MediaCodec b(l.a aVar) {
            p3.a.e(aVar.f12023a);
            String str = aVar.f12023a.f12031a;
            k0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            k0.c();
            return createByCodecName;
        }
    }

    private x(MediaCodec mediaCodec) {
        this.f12098a = mediaCodec;
        if (n0.f15397a < 21) {
            this.f12099b = mediaCodec.getInputBuffers();
            this.f12100c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // j2.l
    public void a() {
        this.f12099b = null;
        this.f12100c = null;
        this.f12098a.release();
    }

    @Override // j2.l
    public int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f12098a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && n0.f15397a < 21) {
                this.f12100c = this.f12098a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // j2.l
    public boolean c() {
        return false;
    }

    @Override // j2.l
    public void d(int i10, boolean z10) {
        this.f12098a.releaseOutputBuffer(i10, z10);
    }

    @Override // j2.l
    public void e(int i10, int i11, v1.c cVar, long j10, int i12) {
        this.f12098a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // j2.l
    public void f(int i10) {
        this.f12098a.setVideoScalingMode(i10);
    }

    @Override // j2.l
    public void flush() {
        this.f12098a.flush();
    }

    @Override // j2.l
    public MediaFormat g() {
        return this.f12098a.getOutputFormat();
    }

    @Override // j2.l
    public ByteBuffer h(int i10) {
        return n0.f15397a >= 21 ? this.f12098a.getInputBuffer(i10) : ((ByteBuffer[]) n0.j(this.f12099b))[i10];
    }

    @Override // j2.l
    public void i(Surface surface) {
        this.f12098a.setOutputSurface(surface);
    }

    @Override // j2.l
    public void j(final l.c cVar, Handler handler) {
        this.f12098a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j2.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                x.this.q(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // j2.l
    public void k(int i10, int i11, int i12, long j10, int i13) {
        this.f12098a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // j2.l
    public void l(Bundle bundle) {
        this.f12098a.setParameters(bundle);
    }

    @Override // j2.l
    public ByteBuffer m(int i10) {
        return n0.f15397a >= 21 ? this.f12098a.getOutputBuffer(i10) : ((ByteBuffer[]) n0.j(this.f12100c))[i10];
    }

    @Override // j2.l
    public void n(int i10, long j10) {
        this.f12098a.releaseOutputBuffer(i10, j10);
    }

    @Override // j2.l
    public int o() {
        return this.f12098a.dequeueInputBuffer(0L);
    }
}
