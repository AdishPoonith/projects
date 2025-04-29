package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
/* loaded from: classes.dex */
public class a0 extends s<b> {
    private static final Random E = new Random();
    static x6.e F = new x6.f();
    static h4.d G = h4.f.c();
    private volatile String A;
    private volatile long B;
    private int C;
    private final int D;

    /* renamed from: l  reason: collision with root package name */
    private final l f6881l;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f6882m;

    /* renamed from: n  reason: collision with root package name */
    private final long f6883n;

    /* renamed from: o  reason: collision with root package name */
    private final x6.b f6884o;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicLong f6885p;

    /* renamed from: q  reason: collision with root package name */
    private final a6.b f6886q;

    /* renamed from: r  reason: collision with root package name */
    private final z5.b f6887r;

    /* renamed from: s  reason: collision with root package name */
    private int f6888s;

    /* renamed from: t  reason: collision with root package name */
    private x6.c f6889t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6890u;

    /* renamed from: v  reason: collision with root package name */
    private volatile k f6891v;

    /* renamed from: w  reason: collision with root package name */
    private volatile Uri f6892w;

    /* renamed from: x  reason: collision with root package name */
    private volatile Exception f6893x;

    /* renamed from: y  reason: collision with root package name */
    private volatile Exception f6894y;

    /* renamed from: z  reason: collision with root package name */
    private volatile int f6895z;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ y6.e f6896j;

        a(y6.e eVar) {
            this.f6896j = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6896j.C(x6.i.c(a0.this.f6886q), x6.i.b(a0.this.f6887r), a0.this.f6881l.k().m());
        }
    }

    /* loaded from: classes.dex */
    public class b extends s<b>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f6898c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f6899d;

        /* renamed from: e  reason: collision with root package name */
        private final k f6900e;

        b(Exception exc, long j10, Uri uri, k kVar) {
            super(exc);
            this.f6898c = j10;
            this.f6899d = uri;
            this.f6900e = kVar;
        }

        public long d() {
            return this.f6898c;
        }

        public k e() {
            return this.f6900e;
        }

        public long f() {
            return a0.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(com.google.firebase.storage.l r11, com.google.firebase.storage.k r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.a0.<init>(com.google.firebase.storage.l, com.google.firebase.storage.k, android.net.Uri, android.net.Uri):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(l lVar, k kVar, byte[] bArr) {
        this.f6885p = new AtomicLong(0L);
        this.f6888s = 262144;
        this.f6892w = null;
        this.f6893x = null;
        this.f6894y = null;
        this.f6895z = 0;
        this.C = 0;
        this.D = 1000;
        c4.s.j(lVar);
        c4.s.j(bArr);
        d v10 = lVar.v();
        this.f6883n = bArr.length;
        this.f6881l = lVar;
        this.f6891v = kVar;
        a6.b c10 = v10.c();
        this.f6886q = c10;
        z5.b b10 = v10.b();
        this.f6887r = b10;
        this.f6882m = null;
        this.f6884o = new x6.b(new ByteArrayInputStream(bArr), 262144);
        this.f6890u = true;
        this.B = v10.i();
        this.f6889t = new x6.c(v10.a().m(), c10, b10, v10.j());
    }

    private void o0() {
        String w10 = this.f6891v != null ? this.f6891v.w() : null;
        if (this.f6882m != null && TextUtils.isEmpty(w10)) {
            w10 = this.f6881l.v().a().m().getContentResolver().getType(this.f6882m);
        }
        if (TextUtils.isEmpty(w10)) {
            w10 = "application/octet-stream";
        }
        y6.j jVar = new y6.j(this.f6881l.w(), this.f6881l.k(), this.f6891v != null ? this.f6891v.q() : null, w10);
        if (v0(jVar)) {
            String r10 = jVar.r("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            this.f6892w = Uri.parse(r10);
        }
    }

    private boolean p0(y6.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.C + " milliseconds");
            F.a(this.C + E.nextInt(250));
            boolean u02 = u0(eVar);
            if (u02) {
                this.C = 0;
            }
            return u02;
        } catch (InterruptedException e10) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f6894y = e10;
            return false;
        }
    }

    private boolean r0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean s0(y6.e eVar) {
        int p10 = eVar.p();
        if (this.f6889t.b(p10)) {
            p10 = -2;
        }
        this.f6895z = p10;
        this.f6894y = eVar.f();
        this.A = eVar.r("X-Goog-Upload-Status");
        return r0(this.f6895z) && this.f6894y == null;
    }

    private boolean t0(boolean z10) {
        y6.i iVar = new y6.i(this.f6881l.w(), this.f6881l.k(), this.f6892w);
        if ("final".equals(this.A)) {
            return false;
        }
        if (z10) {
            if (!v0(iVar)) {
                return false;
            }
        } else if (!u0(iVar)) {
            return false;
        }
        if ("final".equals(iVar.r("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String r10 = iVar.r("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(r10) ? Long.parseLong(r10) : 0L;
            long j10 = this.f6885p.get();
            int i10 = (j10 > parseLong ? 1 : (j10 == parseLong ? 0 : -1));
            if (i10 > 0) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else if (i10 >= 0) {
                return true;
            } else {
                try {
                    long j11 = parseLong - j10;
                    if (this.f6884o.a((int) j11) != j11) {
                        this.f6893x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    } else if (this.f6885p.compareAndSet(j10, parseLong)) {
                        return true;
                    } else {
                        Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                        this.f6893x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                        return false;
                    }
                } catch (IOException e10) {
                    e = e10;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f6893x = e;
        return false;
    }

    private boolean u0(y6.e eVar) {
        eVar.C(x6.i.c(this.f6886q), x6.i.b(this.f6887r), this.f6881l.k().m());
        return s0(eVar);
    }

    private boolean v0(y6.e eVar) {
        this.f6889t.d(eVar);
        return s0(eVar);
    }

    private boolean w0() {
        if ("final".equals(this.A)) {
            if (this.f6893x == null) {
                this.f6893x = new IOException("The server has terminated the upload session", this.f6894y);
            }
            j0(64, false);
            return false;
        }
        return true;
    }

    private boolean x0() {
        if (B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f6893x = new InterruptedException();
            j0(64, false);
            return false;
        } else if (B() == 32) {
            j0(256, false);
            return false;
        } else if (B() == 8) {
            j0(16, false);
            return false;
        } else if (w0()) {
            if (this.f6892w == null) {
                if (this.f6893x == null) {
                    this.f6893x = new IllegalStateException("Unable to obtain an upload URL.");
                }
                j0(64, false);
                return false;
            } else if (this.f6893x != null) {
                j0(64, false);
                return false;
            } else {
                boolean z10 = this.f6894y != null || this.f6895z < 200 || this.f6895z >= 300;
                long a10 = G.a() + this.B;
                long a11 = G.a() + this.C;
                if (z10) {
                    if (a11 > a10 || !t0(true)) {
                        if (w0()) {
                            j0(64, false);
                        }
                        return false;
                    }
                    this.C = Math.max(this.C * 2, 1000);
                }
                return true;
            }
        } else {
            return false;
        }
    }

    private void z0() {
        try {
            this.f6884o.d(this.f6888s);
            int min = Math.min(this.f6888s, this.f6884o.b());
            y6.g gVar = new y6.g(this.f6881l.w(), this.f6881l.k(), this.f6892w, this.f6884o.e(), this.f6885p.get(), min, this.f6884o.f());
            if (!p0(gVar)) {
                this.f6888s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f6888s);
                return;
            }
            this.f6885p.getAndAdd(min);
            if (!this.f6884o.f()) {
                this.f6884o.a(min);
                int i10 = this.f6888s;
                if (i10 < 33554432) {
                    this.f6888s = i10 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f6888s);
                    return;
                }
                return;
            }
            try {
                this.f6891v = new k.b(gVar.o(), this.f6881l).a();
                j0(4, false);
                j0(128, false);
            } catch (JSONException e10) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + gVar.n(), e10);
                this.f6893x = e10;
            }
        } catch (IOException e11) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e11);
            this.f6893x = e11;
        }
    }

    @Override // com.google.firebase.storage.s
    l I() {
        return this.f6881l;
    }

    @Override // com.google.firebase.storage.s
    protected void U() {
        this.f6889t.a();
        y6.h hVar = this.f6892w != null ? new y6.h(this.f6881l.w(), this.f6881l.k(), this.f6892w) : null;
        if (hVar != null) {
            w6.m.b().d(new a(hVar));
        }
        this.f6893x = j.c(Status.f3738t);
        super.U();
    }

    @Override // com.google.firebase.storage.s
    protected void c0() {
        this.f6893x = null;
        this.f6894y = null;
        this.f6895z = 0;
        this.A = null;
    }

    @Override // com.google.firebase.storage.s
    void e0() {
        this.f6889t.c();
        if (!j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f6881l.s() == null) {
            this.f6893x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f6893x != null) {
            return;
        }
        if (this.f6892w == null) {
            o0();
        } else {
            t0(false);
        }
        boolean x02 = x0();
        while (x02) {
            z0();
            x02 = x0();
            if (x02) {
                j0(4, false);
            }
        }
        if (!this.f6890u || B() == 16) {
            return;
        }
        try {
            this.f6884o.c();
        } catch (IOException e10) {
            Log.e("UploadTask", "Unable to close stream.", e10);
        }
    }

    @Override // com.google.firebase.storage.s
    protected void f0() {
        w6.m.b().f(E());
    }

    long q0() {
        return this.f6883n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.s
    /* renamed from: y0 */
    public b h0() {
        return new b(j.e(this.f6893x != null ? this.f6893x : this.f6894y, this.f6895z), this.f6885p.get(), this.f6892w, this.f6891v);
    }
}
