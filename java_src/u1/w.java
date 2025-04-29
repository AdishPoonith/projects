package u1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final a f18707a;

    /* renamed from: b  reason: collision with root package name */
    private int f18708b;

    /* renamed from: c  reason: collision with root package name */
    private long f18709c;

    /* renamed from: d  reason: collision with root package name */
    private long f18710d;

    /* renamed from: e  reason: collision with root package name */
    private long f18711e;

    /* renamed from: f  reason: collision with root package name */
    private long f18712f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f18713a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f18714b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f18715c;

        /* renamed from: d  reason: collision with root package name */
        private long f18716d;

        /* renamed from: e  reason: collision with root package name */
        private long f18717e;

        public a(AudioTrack audioTrack) {
            this.f18713a = audioTrack;
        }

        public long a() {
            return this.f18717e;
        }

        public long b() {
            return this.f18714b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f18713a.getTimestamp(this.f18714b);
            if (timestamp) {
                long j10 = this.f18714b.framePosition;
                if (this.f18716d > j10) {
                    this.f18715c++;
                }
                this.f18716d = j10;
                this.f18717e = j10 + (this.f18715c << 32);
            }
            return timestamp;
        }
    }

    public w(AudioTrack audioTrack) {
        if (p3.n0.f15397a >= 19) {
            this.f18707a = new a(audioTrack);
            g();
            return;
        }
        this.f18707a = null;
        h(3);
    }

    private void h(int i10) {
        this.f18708b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f18711e = 0L;
            this.f18712f = -1L;
            this.f18709c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else if (i10 != 4) {
                throw new IllegalStateException();
            } else {
                j10 = 500000;
            }
        }
        this.f18710d = j10;
    }

    public void a() {
        if (this.f18708b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f18707a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f18707a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f18708b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(long r8) {
        /*
            r7 = this;
            u1.w$a r0 = r7.f18707a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r7.f18711e
            long r2 = r8 - r2
            long r4 = r7.f18710d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L71
        L10:
            r7.f18711e = r8
            boolean r0 = r0.c()
            int r2 = r7.f18708b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r8 = 2
            if (r2 == r4) goto L33
            if (r2 == r8) goto L30
            if (r2 == r3) goto L2d
            r8 = 4
            if (r2 != r8) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            u1.w$a r9 = r7.f18707a
            long r1 = r9.a()
            long r3 = r7.f18712f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L70
            r7.h(r8)
            goto L70
        L45:
            r7.g()
            goto L70
        L49:
            if (r0 == 0) goto L63
            u1.w$a r8 = r7.f18707a
            long r8 = r8.b()
            long r2 = r7.f18709c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L71
            u1.w$a r8 = r7.f18707a
            long r8 = r8.a()
            r7.f18712f = r8
            r7.h(r4)
            goto L70
        L63:
            long r1 = r7.f18709c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L70
            r7.h(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.w.e(long):boolean");
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f18707a != null) {
            h(0);
        }
    }
}
