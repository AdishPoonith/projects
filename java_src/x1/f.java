package x1;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p3.n0;
import s1.k1;
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: b  reason: collision with root package name */
    private final o3.i f20128b;

    /* renamed from: c  reason: collision with root package name */
    private final long f20129c;

    /* renamed from: d  reason: collision with root package name */
    private long f20130d;

    /* renamed from: f  reason: collision with root package name */
    private int f20132f;

    /* renamed from: g  reason: collision with root package name */
    private int f20133g;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f20131e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f20127a = new byte[4096];

    static {
        k1.a("goog.exo.extractor");
    }

    public f(o3.i iVar, long j10, long j11) {
        this.f20128b = iVar;
        this.f20130d = j10;
        this.f20129c = j11;
    }

    private void q(int i10) {
        if (i10 != -1) {
            this.f20130d += i10;
        }
    }

    private void r(int i10) {
        int i11 = this.f20132f + i10;
        byte[] bArr = this.f20131e;
        if (i11 > bArr.length) {
            this.f20131e = Arrays.copyOf(this.f20131e, n0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int s(byte[] bArr, int i10, int i11) {
        int i12 = this.f20133g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f20131e, 0, bArr, i10, min);
        w(min);
        return min;
    }

    private int t(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f20128b.read(bArr, i10 + i12, i11 - i12);
        if (read == -1) {
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        return i12 + read;
    }

    private int u(int i10) {
        int min = Math.min(this.f20133g, i10);
        w(min);
        return min;
    }

    private void w(int i10) {
        int i11 = this.f20133g - i10;
        this.f20133g = i11;
        this.f20132f = 0;
        byte[] bArr = this.f20131e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f20131e = bArr2;
    }

    @Override // x1.m
    public long a() {
        return this.f20129c;
    }

    @Override // x1.m
    public int b(int i10) {
        int u10 = u(i10);
        if (u10 == 0) {
            byte[] bArr = this.f20127a;
            u10 = t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        q(u10);
        return u10;
    }

    @Override // x1.m
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        int s10 = s(bArr, i10, i11);
        while (s10 < i11 && s10 != -1) {
            s10 = t(bArr, i10, i11, s10, z10);
        }
        q(s10);
        return s10 != -1;
    }

    @Override // x1.m
    public int d(byte[] bArr, int i10, int i11) {
        int min;
        r(i11);
        int i12 = this.f20133g;
        int i13 = this.f20132f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = t(this.f20131e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f20133g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f20131e, this.f20132f, bArr, i10, min);
        this.f20132f += min;
        return min;
    }

    @Override // x1.m
    public void f() {
        this.f20132f = 0;
    }

    @Override // x1.m
    public void g(int i10) {
        v(i10, false);
    }

    @Override // x1.m
    public boolean i(int i10, boolean z10) {
        r(i10);
        int i11 = this.f20133g - this.f20132f;
        while (i11 < i10) {
            i11 = t(this.f20131e, this.f20132f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f20133g = this.f20132f + i11;
        }
        this.f20132f += i10;
        return true;
    }

    @Override // x1.m
    public boolean k(byte[] bArr, int i10, int i11, boolean z10) {
        if (i(i11, z10)) {
            System.arraycopy(this.f20131e, this.f20132f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // x1.m
    public long l() {
        return this.f20130d + this.f20132f;
    }

    @Override // x1.m
    public void n(byte[] bArr, int i10, int i11) {
        k(bArr, i10, i11, false);
    }

    @Override // x1.m
    public void o(int i10) {
        i(i10, false);
    }

    @Override // x1.m
    public long p() {
        return this.f20130d;
    }

    @Override // x1.m, o3.i
    public int read(byte[] bArr, int i10, int i11) {
        int s10 = s(bArr, i10, i11);
        if (s10 == 0) {
            s10 = t(bArr, i10, i11, 0, true);
        }
        q(s10);
        return s10;
    }

    @Override // x1.m
    public void readFully(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    public boolean v(int i10, boolean z10) {
        int u10 = u(i10);
        while (u10 < i10 && u10 != -1) {
            u10 = t(this.f20127a, -u10, Math.min(i10, this.f20127a.length + u10), u10, z10);
        }
        q(u10);
        return u10 != -1;
    }
}
