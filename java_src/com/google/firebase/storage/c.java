package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class c extends s<a> {

    /* renamed from: l  reason: collision with root package name */
    private final Uri f6905l;

    /* renamed from: m  reason: collision with root package name */
    private long f6906m;

    /* renamed from: n  reason: collision with root package name */
    private l f6907n;

    /* renamed from: o  reason: collision with root package name */
    private x6.c f6908o;

    /* renamed from: p  reason: collision with root package name */
    private long f6909p = -1;

    /* renamed from: q  reason: collision with root package name */
    private String f6910q = null;

    /* renamed from: r  reason: collision with root package name */
    private volatile Exception f6911r = null;

    /* renamed from: s  reason: collision with root package name */
    private long f6912s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f6913t;

    /* loaded from: classes.dex */
    public class a extends s<a>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f6914c;

        a(Exception exc, long j10) {
            super(exc);
            this.f6914c = j10;
        }

        public long d() {
            return this.f6914c;
        }

        public long e() {
            return c.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(l lVar, Uri uri) {
        this.f6907n = lVar;
        this.f6905l = uri;
        d v10 = lVar.v();
        this.f6908o = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.j());
    }

    private int l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i10 = 0;
        boolean z10 = false;
        while (i10 != bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            try {
                z10 = true;
                i10 += read;
            } catch (IOException e10) {
                this.f6911r = e10;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    private boolean n0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean o0(y6.e eVar) {
        FileOutputStream fileOutputStream;
        InputStream u10 = eVar.u();
        if (u10 == null) {
            this.f6911r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f6905l.getPath());
        if (!file.exists()) {
            if (this.f6912s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z10 = true;
        if (this.f6912s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f6912s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z10) {
                int l02 = l0(u10, bArr);
                if (l02 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, l02);
                this.f6906m += l02;
                if (this.f6911r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f6911r);
                    this.f6911r = null;
                    z10 = false;
                }
                if (!j0(4, false)) {
                    z10 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            u10.close();
            return z10;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            u10.close();
            throw th;
        }
    }

    @Override // com.google.firebase.storage.s
    l I() {
        return this.f6907n;
    }

    @Override // com.google.firebase.storage.s
    protected void U() {
        this.f6908o.a();
        this.f6911r = j.c(Status.f3738t);
    }

    @Override // com.google.firebase.storage.s
    void e0() {
        String str;
        if (this.f6911r != null) {
            j0(64, false);
        } else if (j0(4, false)) {
            do {
                this.f6906m = 0L;
                this.f6911r = null;
                this.f6908o.c();
                y6.c cVar = new y6.c(this.f6907n.w(), this.f6907n.k(), this.f6912s);
                this.f6908o.e(cVar, false);
                this.f6913t = cVar.p();
                this.f6911r = cVar.f() != null ? cVar.f() : this.f6911r;
                boolean z10 = true;
                boolean z11 = n0(this.f6913t) && this.f6911r == null && B() == 4;
                if (z11) {
                    this.f6909p = cVar.s() + this.f6912s;
                    String r10 = cVar.r("ETag");
                    if (!TextUtils.isEmpty(r10) && (str = this.f6910q) != null && !str.equals(r10)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f6912s = 0L;
                        this.f6910q = null;
                        cVar.D();
                        f0();
                        return;
                    }
                    this.f6910q = r10;
                    try {
                        z11 = o0(cVar);
                    } catch (IOException e10) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e10);
                        this.f6911r = e10;
                    }
                }
                cVar.D();
                if ((z11 && this.f6911r == null && B() == 4) ? false : false) {
                    j0(128, false);
                    return;
                }
                File file = new File(this.f6905l.getPath());
                if (file.exists()) {
                    this.f6912s = file.length();
                } else {
                    this.f6912s = 0L;
                }
                if (B() == 8) {
                    j0(16, false);
                    return;
                } else if (B() == 32) {
                    if (j0(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + B());
                    return;
                }
            } while (this.f6906m > 0);
            j0(64, false);
        }
    }

    @Override // com.google.firebase.storage.s
    protected void f0() {
        w6.m.b().e(E());
    }

    long m0() {
        return this.f6909p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.s
    /* renamed from: p0 */
    public a h0() {
        return new a(j.e(this.f6911r, this.f6913t), this.f6906m + this.f6912s);
    }
}
