package q3;

import java.util.Arrays;
/* loaded from: classes.dex */
final class e {

    /* renamed from: c  reason: collision with root package name */
    private boolean f16038c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16039d;

    /* renamed from: f  reason: collision with root package name */
    private int f16041f;

    /* renamed from: a  reason: collision with root package name */
    private a f16036a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f16037b = new a();

    /* renamed from: e  reason: collision with root package name */
    private long f16040e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f16042a;

        /* renamed from: b  reason: collision with root package name */
        private long f16043b;

        /* renamed from: c  reason: collision with root package name */
        private long f16044c;

        /* renamed from: d  reason: collision with root package name */
        private long f16045d;

        /* renamed from: e  reason: collision with root package name */
        private long f16046e;

        /* renamed from: f  reason: collision with root package name */
        private long f16047f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f16048g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f16049h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f16046e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f16047f / j10;
        }

        public long b() {
            return this.f16047f;
        }

        public boolean d() {
            long j10 = this.f16045d;
            if (j10 == 0) {
                return false;
            }
            return this.f16048g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f16045d > 15 && this.f16049h == 0;
        }

        public void f(long j10) {
            int i10;
            long j11 = this.f16045d;
            if (j11 == 0) {
                this.f16042a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f16042a;
                this.f16043b = j12;
                this.f16047f = j12;
                this.f16046e = 1L;
            } else {
                long j13 = j10 - this.f16044c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f16043b) <= 1000000) {
                    this.f16046e++;
                    this.f16047f += j13;
                    boolean[] zArr = this.f16048g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        i10 = this.f16049h - 1;
                        this.f16049h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f16048g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        i10 = this.f16049h + 1;
                        this.f16049h = i10;
                    }
                }
            }
            this.f16045d++;
            this.f16044c = j10;
        }

        public void g() {
            this.f16045d = 0L;
            this.f16046e = 0L;
            this.f16047f = 0L;
            this.f16049h = 0;
            Arrays.fill(this.f16048g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f16036a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f16036a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f16041f;
    }

    public long d() {
        if (e()) {
            return this.f16036a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f16036a.e();
    }

    public void f(long j10) {
        this.f16036a.f(j10);
        if (this.f16036a.e() && !this.f16039d) {
            this.f16038c = false;
        } else if (this.f16040e != -9223372036854775807L) {
            if (!this.f16038c || this.f16037b.d()) {
                this.f16037b.g();
                this.f16037b.f(this.f16040e);
            }
            this.f16038c = true;
            this.f16037b.f(j10);
        }
        if (this.f16038c && this.f16037b.e()) {
            a aVar = this.f16036a;
            this.f16036a = this.f16037b;
            this.f16037b = aVar;
            this.f16038c = false;
            this.f16039d = false;
        }
        this.f16040e = j10;
        this.f16041f = this.f16036a.e() ? 0 : this.f16041f + 1;
    }

    public void g() {
        this.f16036a.g();
        this.f16037b.g();
        this.f16038c = false;
        this.f16040e = -9223372036854775807L;
        this.f16041f = 0;
    }
}
