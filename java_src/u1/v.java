package u1;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import s1.b3;
import s1.n1;
import t1.t1;
/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: j  reason: collision with root package name */
        public final n1 f18698j;

        public a(String str, n1 n1Var) {
            super(str);
            this.f18698j = n1Var;
        }

        public a(Throwable th, n1 n1Var) {
            super(th);
            this.f18698j = n1Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: j  reason: collision with root package name */
        public final int f18699j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f18700k;

        /* renamed from: l  reason: collision with root package name */
        public final n1 f18701l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, int r6, int r7, s1.n1 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f18699j = r4
                r3.f18700k = r9
                r3.f18701l = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.v.b.<init>(int, int, int, int, s1.n1, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(long j10);

        void b(boolean z10);

        void c(Exception exc);

        void d();

        void e();

        void f();

        void g(int i10, long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: j  reason: collision with root package name */
        public final long f18702j;

        /* renamed from: k  reason: collision with root package name */
        public final long f18703k;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f18702j = j10;
            this.f18703k = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: j  reason: collision with root package name */
        public final int f18704j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f18705k;

        /* renamed from: l  reason: collision with root package name */
        public final n1 f18706l;

        public e(int i10, n1 n1Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f18705k = z10;
            this.f18704j = i10;
            this.f18706l = n1Var;
        }
    }

    boolean a(n1 n1Var);

    boolean b();

    void c(b3 b3Var);

    void d();

    void e(float f10);

    void f(c cVar);

    void flush();

    b3 g();

    void h();

    void i(AudioDeviceInfo audioDeviceInfo);

    void j();

    boolean k();

    void l(int i10);

    void m(n1 n1Var, int i10, int[] iArr);

    void n(t1 t1Var);

    void o();

    boolean p(ByteBuffer byteBuffer, long j10, int i10);

    long q(boolean z10);

    void r(y yVar);

    void reset();

    void s();

    void t(u1.e eVar);

    void u(long j10);

    void v();

    void w(boolean z10);

    void x();

    int y(n1 n1Var);
}
