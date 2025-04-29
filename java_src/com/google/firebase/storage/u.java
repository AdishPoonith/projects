package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class u extends s<d> {

    /* renamed from: l  reason: collision with root package name */
    private l f7004l;

    /* renamed from: m  reason: collision with root package name */
    private x6.c f7005m;

    /* renamed from: p  reason: collision with root package name */
    private b f7008p;

    /* renamed from: r  reason: collision with root package name */
    private long f7010r;

    /* renamed from: s  reason: collision with root package name */
    private long f7011s;

    /* renamed from: t  reason: collision with root package name */
    private InputStream f7012t;

    /* renamed from: u  reason: collision with root package name */
    private y6.e f7013u;

    /* renamed from: v  reason: collision with root package name */
    private String f7014v;

    /* renamed from: n  reason: collision with root package name */
    private volatile Exception f7006n = null;

    /* renamed from: o  reason: collision with root package name */
    private volatile int f7007o = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f7009q = -1;

    /* loaded from: classes.dex */
    class a implements Callable<InputStream> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public InputStream call() {
            return u.this.o0();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(d dVar, InputStream inputStream);
    }

    /* loaded from: classes.dex */
    static class c extends InputStream {

        /* renamed from: j  reason: collision with root package name */
        private u f7016j;

        /* renamed from: k  reason: collision with root package name */
        private InputStream f7017k;

        /* renamed from: l  reason: collision with root package name */
        private Callable<InputStream> f7018l;

        /* renamed from: m  reason: collision with root package name */
        private IOException f7019m;

        /* renamed from: n  reason: collision with root package name */
        private long f7020n;

        /* renamed from: o  reason: collision with root package name */
        private long f7021o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f7022p;

        c(Callable<InputStream> callable, u uVar) {
            this.f7016j = uVar;
            this.f7018l = callable;
        }

        private void b() {
            u uVar = this.f7016j;
            if (uVar != null && uVar.B() == 32) {
                throw new com.google.firebase.storage.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            b();
            if (this.f7019m != null) {
                try {
                    InputStream inputStream = this.f7017k;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f7017k = null;
                if (this.f7021o == this.f7020n) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f7019m);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f7020n, this.f7019m);
                this.f7021o = this.f7020n;
                this.f7019m = null;
            }
            if (this.f7022p) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f7017k == null) {
                try {
                    this.f7017k = this.f7018l.call();
                    return true;
                } catch (Exception e10) {
                    if (e10 instanceof IOException) {
                        throw ((IOException) e10);
                    }
                    throw new IOException("Unable to open stream", e10);
                }
            }
            return true;
        }

        private void h(long j10) {
            u uVar = this.f7016j;
            if (uVar != null) {
                uVar.q0(j10);
            }
            this.f7020n += j10;
        }

        @Override // java.io.InputStream
        public int available() {
            while (e()) {
                try {
                    return this.f7017k.available();
                } catch (IOException e10) {
                    this.f7019m = e10;
                }
            }
            throw this.f7019m;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f7017k;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f7022p = true;
            u uVar = this.f7016j;
            if (uVar != null && uVar.f7013u != null) {
                this.f7016j.f7013u.D();
                this.f7016j.f7013u = null;
            }
            b();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            while (e()) {
                try {
                    int read = this.f7017k.read();
                    if (read != -1) {
                        h(1L);
                    }
                    return read;
                } catch (IOException e10) {
                    this.f7019m = e10;
                }
            }
            throw this.f7019m;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (e()) {
                while (i11 > 262144) {
                    try {
                        int read = this.f7017k.read(bArr, i10, 262144);
                        if (read == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += read;
                        i10 += read;
                        i11 -= read;
                        h(read);
                        b();
                    } catch (IOException e10) {
                        this.f7019m = e10;
                    }
                }
                if (i11 > 0) {
                    int read2 = this.f7017k.read(bArr, i10, i11);
                    if (read2 == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    i10 += read2;
                    i12 += read2;
                    i11 -= read2;
                    h(read2);
                }
                if (i11 == 0) {
                    return i12;
                }
            }
            throw this.f7019m;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = 0;
            while (e()) {
                while (j10 > 262144) {
                    try {
                        long skip = this.f7017k.skip(262144L);
                        if (skip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += skip;
                        j10 -= skip;
                        h(skip);
                        b();
                    } catch (IOException e10) {
                        this.f7019m = e10;
                    }
                }
                if (j10 > 0) {
                    long skip2 = this.f7017k.skip(j10);
                    if (skip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += skip2;
                    j10 -= skip2;
                    h(skip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.f7019m;
        }
    }

    /* loaded from: classes.dex */
    public class d extends s<d>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f7023c;

        d(Exception exc, long j10) {
            super(exc);
            this.f7023c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(l lVar) {
        this.f7004l = lVar;
        com.google.firebase.storage.d v10 = lVar.v();
        this.f7005m = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream o0() {
        String str;
        this.f7005m.c();
        y6.e eVar = this.f7013u;
        if (eVar != null) {
            eVar.D();
        }
        y6.c cVar = new y6.c(this.f7004l.w(), this.f7004l.k(), this.f7010r);
        this.f7013u = cVar;
        boolean z10 = false;
        this.f7005m.e(cVar, false);
        this.f7007o = this.f7013u.p();
        this.f7006n = this.f7013u.f() != null ? this.f7013u.f() : this.f7006n;
        if (p0(this.f7007o) && this.f7006n == null && B() == 4) {
            z10 = true;
        }
        if (z10) {
            String r10 = this.f7013u.r("ETag");
            if (!TextUtils.isEmpty(r10) && (str = this.f7014v) != null && !str.equals(r10)) {
                this.f7007o = 409;
                throw new IOException("The ETag on the server changed.");
            }
            this.f7014v = r10;
            this.f7009q = this.f7013u.s() + this.f7010r;
            return this.f7013u.u();
        }
        throw new IOException("Could not open resulting stream.");
    }

    private boolean p0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.s
    public l I() {
        return this.f7004l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.storage.s
    public void U() {
        this.f7005m.a();
        this.f7006n = j.c(Status.f3738t);
    }

    @Override // com.google.firebase.storage.s
    protected void X() {
        this.f7011s = this.f7010r;
    }

    @Override // com.google.firebase.storage.s
    public boolean a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.s
    public boolean d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.s
    void e0() {
        if (this.f7006n != null) {
            j0(64, false);
        } else if (j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f7012t = new BufferedInputStream(cVar);
            try {
                cVar.e();
                b bVar = this.f7008p;
                if (bVar != null) {
                    try {
                        bVar.a(g0(), this.f7012t);
                    } catch (Exception e10) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e10);
                        this.f7006n = e10;
                    }
                }
            } catch (IOException e11) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e11);
                this.f7006n = e11;
            }
            if (this.f7012t == null) {
                this.f7013u.D();
                this.f7013u = null;
            }
            if (this.f7006n == null && B() == 4) {
                j0(4, false);
                j0(128, false);
                return;
            }
            if (j0(B() == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + B());
        }
    }

    @Override // com.google.firebase.storage.s
    protected void f0() {
        w6.m.b().e(E());
    }

    void q0(long j10) {
        long j11 = this.f7010r + j10;
        this.f7010r = j11;
        if (this.f7011s + 262144 <= j11) {
            if (B() == 4) {
                j0(4, false);
            } else {
                this.f7011s = this.f7010r;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u r0(b bVar) {
        c4.s.j(bVar);
        c4.s.l(this.f7008p == null);
        this.f7008p = bVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.s
    /* renamed from: s0 */
    public d h0() {
        return new d(j.e(this.f7006n, this.f7007o), this.f7011s);
    }
}
