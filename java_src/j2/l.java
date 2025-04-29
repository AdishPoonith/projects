package j2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import s1.n1;
/* loaded from: classes.dex */
public interface l {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f12023a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f12024b;

        /* renamed from: c  reason: collision with root package name */
        public final n1 f12025c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f12026d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f12027e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12028f;

        private a(n nVar, MediaFormat mediaFormat, n1 n1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f12023a = nVar;
            this.f12024b = mediaFormat;
            this.f12025c = n1Var;
            this.f12026d = surface;
            this.f12027e = mediaCrypto;
            this.f12028f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, n1 n1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, n1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, n1 n1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, n1Var, surface, mediaCrypto, 0);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        l a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    void a();

    int b(MediaCodec.BufferInfo bufferInfo);

    boolean c();

    void d(int i10, boolean z10);

    void e(int i10, int i11, v1.c cVar, long j10, int i12);

    void f(int i10);

    void flush();

    MediaFormat g();

    ByteBuffer h(int i10);

    void i(Surface surface);

    void j(c cVar, Handler handler);

    void k(int i10, int i11, int i12, long j10, int i13);

    void l(Bundle bundle);

    ByteBuffer m(int i10);

    void n(int i10, long j10);

    int o();
}
