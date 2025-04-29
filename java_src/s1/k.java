package s1;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;
/* loaded from: classes.dex */
public class k implements t1 {

    /* renamed from: a  reason: collision with root package name */
    private final o3.q f17342a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17343b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17344c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17345d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17346e;

    /* renamed from: f  reason: collision with root package name */
    private final int f17347f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17348g;

    /* renamed from: h  reason: collision with root package name */
    private final long f17349h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17350i;

    /* renamed from: j  reason: collision with root package name */
    private int f17351j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17352k;

    public k() {
        this(new o3.q(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected k(o3.q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f17342a = qVar;
        this.f17343b = p3.n0.B0(i10);
        this.f17344c = p3.n0.B0(i11);
        this.f17345d = p3.n0.B0(i12);
        this.f17346e = p3.n0.B0(i13);
        this.f17347f = i14;
        this.f17351j = i14 == -1 ? 13107200 : i14;
        this.f17348g = z10;
        this.f17349h = p3.n0.B0(i15);
        this.f17350i = z11;
    }

    private static void a(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        p3.a.b(z10, str + " cannot be less than " + str2);
    }

    private static int l(int i10) {
        switch (i10) {
            case IntegrityErrorCode.PLAY_STORE_NOT_FOUND /* -2 */:
                return 0;
            case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void m(boolean z10) {
        int i10 = this.f17347f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f17351j = i10;
        this.f17352k = false;
        if (z10) {
            this.f17342a.g();
        }
    }

    @Override // s1.t1
    public void b() {
        m(false);
    }

    @Override // s1.t1
    public boolean c() {
        return this.f17350i;
    }

    @Override // s1.t1
    public void d() {
        m(true);
    }

    @Override // s1.t1
    public boolean e(long j10, float f10, boolean z10, long j11) {
        long e02 = p3.n0.e0(j10, f10);
        long j12 = z10 ? this.f17346e : this.f17345d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || e02 >= j12 || (!this.f17348g && this.f17342a.f() >= this.f17351j);
    }

    @Override // s1.t1
    public boolean f(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f17342a.f() >= this.f17351j;
        long j12 = this.f17343b;
        if (f10 > 1.0f) {
            j12 = Math.min(p3.n0.Z(j12, f10), this.f17344c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f17348g && z11) {
                z10 = false;
            }
            this.f17352k = z10;
            if (!z10 && j11 < 500000) {
                p3.r.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f17344c || z11) {
            this.f17352k = false;
        }
        return this.f17352k;
    }

    @Override // s1.t1
    public o3.b g() {
        return this.f17342a;
    }

    @Override // s1.t1
    public void h() {
        m(true);
    }

    @Override // s1.t1
    public void i(l3[] l3VarArr, u2.v0 v0Var, n3.t[] tVarArr) {
        int i10 = this.f17347f;
        if (i10 == -1) {
            i10 = k(l3VarArr, tVarArr);
        }
        this.f17351j = i10;
        this.f17342a.h(i10);
    }

    @Override // s1.t1
    public long j() {
        return this.f17349h;
    }

    protected int k(l3[] l3VarArr, n3.t[] tVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < l3VarArr.length; i11++) {
            if (tVarArr[i11] != null) {
                i10 += l(l3VarArr[i11].h());
            }
        }
        return Math.max(13107200, i10);
    }
}
