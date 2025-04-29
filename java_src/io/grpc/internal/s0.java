package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    private int f11627n;

    /* renamed from: o  reason: collision with root package name */
    private int f11628o;

    /* renamed from: p  reason: collision with root package name */
    private Inflater f11629p;

    /* renamed from: s  reason: collision with root package name */
    private int f11632s;

    /* renamed from: t  reason: collision with root package name */
    private int f11633t;

    /* renamed from: u  reason: collision with root package name */
    private long f11634u;

    /* renamed from: j  reason: collision with root package name */
    private final u f11623j = new u();

    /* renamed from: k  reason: collision with root package name */
    private final CRC32 f11624k = new CRC32();

    /* renamed from: l  reason: collision with root package name */
    private final b f11625l = new b(this, null);

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f11626m = new byte[512];

    /* renamed from: q  reason: collision with root package name */
    private c f11630q = c.HEADER;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11631r = false;

    /* renamed from: v  reason: collision with root package name */
    private int f11635v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f11636w = 0;

    /* renamed from: x  reason: collision with root package name */
    private boolean f11637x = true;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11638a;

        static {
            int[] iArr = new int[c.values().length];
            f11638a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11638a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11638a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11638a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11638a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11638a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11638a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11638a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11638a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11638a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        private b() {
        }

        /* synthetic */ b(s0 s0Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int readUnsignedByte;
            if (s0.this.f11628o - s0.this.f11627n > 0) {
                readUnsignedByte = s0.this.f11626m[s0.this.f11627n] & 255;
                s0.e(s0.this, 1);
            } else {
                readUnsignedByte = s0.this.f11623j.readUnsignedByte();
            }
            s0.this.f11624k.update(readUnsignedByte);
            s0.l(s0.this, 1);
            return readUnsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return j() | (j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (s0.this.f11628o - s0.this.f11627n) + s0.this.f11623j.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10) {
            int i11;
            int i12 = s0.this.f11628o - s0.this.f11627n;
            if (i12 > 0) {
                int min = Math.min(i12, i10);
                s0.this.f11624k.update(s0.this.f11626m, s0.this.f11627n, min);
                s0.e(s0.this, min);
                i11 = i10 - min;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[512];
                int i13 = 0;
                while (i13 < i11) {
                    int min2 = Math.min(i11 - i13, 512);
                    s0.this.f11623j.d0(bArr, 0, min2);
                    s0.this.f11624k.update(bArr, 0, min2);
                    i13 += min2;
                }
            }
            s0.l(s0.this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    private boolean C() {
        if (this.f11625l.k() < 10) {
            return false;
        }
        if (this.f11625l.j() == 35615) {
            if (this.f11625l.h() == 8) {
                this.f11632s = this.f11625l.h();
                this.f11625l.l(6);
                this.f11630q = c.HEADER_EXTRA_LEN;
                return true;
            }
            throw new ZipException("Unsupported compression method");
        }
        throw new ZipException("Not in GZIP format");
    }

    private boolean H() {
        if ((this.f11632s & 16) == 16 && !this.f11625l.g()) {
            return false;
        }
        this.f11630q = c.HEADER_CRC;
        return true;
    }

    private boolean L() {
        if ((this.f11632s & 2) == 2) {
            if (this.f11625l.k() < 2) {
                return false;
            }
            if ((65535 & ((int) this.f11624k.getValue())) != this.f11625l.j()) {
                throw new ZipException("Corrupt GZIP header");
            }
        }
        this.f11630q = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean N() {
        int k10 = this.f11625l.k();
        int i10 = this.f11633t;
        if (k10 < i10) {
            return false;
        }
        this.f11625l.l(i10);
        this.f11630q = c.HEADER_NAME;
        return true;
    }

    private boolean O() {
        c cVar;
        if ((this.f11632s & 4) != 4) {
            cVar = c.HEADER_NAME;
        } else if (this.f11625l.k() < 2) {
            return false;
        } else {
            this.f11633t = this.f11625l.j();
            cVar = c.HEADER_EXTRA;
        }
        this.f11630q = cVar;
        return true;
    }

    private boolean T() {
        if ((this.f11632s & 8) == 8 && !this.f11625l.g()) {
            return false;
        }
        this.f11630q = c.HEADER_COMMENT;
        return true;
    }

    private boolean U() {
        if (this.f11629p != null && this.f11625l.k() <= 18) {
            this.f11629p.end();
            this.f11629p = null;
        }
        if (this.f11625l.k() < 8) {
            return false;
        }
        if (this.f11624k.getValue() == this.f11625l.i() && this.f11634u == this.f11625l.i()) {
            this.f11624k.reset();
            this.f11630q = c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    static /* synthetic */ int e(s0 s0Var, int i10) {
        int i11 = s0Var.f11627n + i10;
        s0Var.f11627n = i11;
        return i11;
    }

    static /* synthetic */ int l(s0 s0Var, int i10) {
        int i11 = s0Var.f11635v + i10;
        s0Var.f11635v = i11;
        return i11;
    }

    private boolean q() {
        b5.n.u(this.f11629p != null, "inflater is null");
        b5.n.u(this.f11627n == this.f11628o, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f11623j.c(), 512);
        if (min == 0) {
            return false;
        }
        this.f11627n = 0;
        this.f11628o = min;
        this.f11623j.d0(this.f11626m, 0, min);
        this.f11629p.setInput(this.f11626m, this.f11627n, min);
        this.f11630q = c.INFLATING;
        return true;
    }

    private int w(byte[] bArr, int i10, int i11) {
        c cVar;
        b5.n.u(this.f11629p != null, "inflater is null");
        try {
            int totalIn = this.f11629p.getTotalIn();
            int inflate = this.f11629p.inflate(bArr, i10, i11);
            int totalIn2 = this.f11629p.getTotalIn() - totalIn;
            this.f11635v += totalIn2;
            this.f11636w += totalIn2;
            this.f11627n += totalIn2;
            this.f11624k.update(bArr, i10, inflate);
            if (!this.f11629p.finished()) {
                if (this.f11629p.needsInput()) {
                    cVar = c.INFLATER_NEEDS_INPUT;
                }
                return inflate;
            }
            this.f11634u = this.f11629p.getBytesWritten() & 4294967295L;
            cVar = c.TRAILER;
            this.f11630q = cVar;
            return inflate;
        } catch (DataFormatException e10) {
            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
        }
    }

    private boolean y() {
        c cVar;
        Inflater inflater = this.f11629p;
        if (inflater == null) {
            this.f11629p = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f11624k.reset();
        int i10 = this.f11628o;
        int i11 = this.f11627n;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f11629p.setInput(this.f11626m, i11, i12);
            cVar = c.INFLATING;
        } else {
            cVar = c.INFLATER_NEEDS_INPUT;
        }
        this.f11630q = cVar;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11631r) {
            return;
        }
        this.f11631r = true;
        this.f11623j.close();
        Inflater inflater = this.f11629p;
        if (inflater != null) {
            inflater.end();
            this.f11629p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(v1 v1Var) {
        b5.n.u(!this.f11631r, "GzipInflatingBuffer is closed");
        this.f11623j.b(v1Var);
        this.f11637x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        int i10 = this.f11635v;
        this.f11635v = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        int i10 = this.f11636w;
        this.f11636w = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        b5.n.u(!this.f11631r, "GzipInflatingBuffer is closed");
        return (this.f11625l.k() == 0 && this.f11630q == c.HEADER) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x(byte[] bArr, int i10, int i11) {
        boolean z10 = true;
        b5.n.u(!this.f11631r, "GzipInflatingBuffer is closed");
        boolean z11 = true;
        int i12 = 0;
        while (z11) {
            int i13 = i11 - i12;
            if (i13 <= 0) {
                if (z11 && (this.f11630q != c.HEADER || this.f11625l.k() >= 10)) {
                    z10 = false;
                }
                this.f11637x = z10;
                return i12;
            }
            switch (a.f11638a[this.f11630q.ordinal()]) {
                case 1:
                    z11 = C();
                    continue;
                case 2:
                    z11 = O();
                    continue;
                case 3:
                    z11 = N();
                    continue;
                case 4:
                    z11 = T();
                    continue;
                case 5:
                    z11 = H();
                    continue;
                case 6:
                    z11 = L();
                    continue;
                case 7:
                    z11 = y();
                    continue;
                case 8:
                    i12 += w(bArr, i10 + i12, i13);
                    if (this.f11630q == c.TRAILER) {
                        break;
                    } else {
                        z11 = true;
                        continue;
                    }
                case 9:
                    z11 = q();
                    continue;
                case 10:
                    break;
                default:
                    throw new AssertionError("Invalid state: " + this.f11630q);
            }
            z11 = U();
        }
        if (z11) {
            z10 = false;
        }
        this.f11637x = z10;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        b5.n.u(!this.f11631r, "GzipInflatingBuffer is closed");
        return this.f11637x;
    }
}
