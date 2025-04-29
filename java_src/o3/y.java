package o3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class y extends g {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f14618e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14619f;

    /* renamed from: g  reason: collision with root package name */
    private long f14620g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14621h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends m {
        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public b(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public y() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) p3.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, (p3.n0.f15397a < 21 || !a.b(e10.getCause())) ? 2005 : 2005);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // o3.l
    public void close() {
        this.f14619f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14618e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f14618e = null;
            if (this.f14621h) {
                this.f14621h = false;
                r();
            }
        }
    }

    @Override // o3.l
    public Uri j() {
        return this.f14619f;
    }

    @Override // o3.l
    public long m(p pVar) {
        Uri uri = pVar.f14512a;
        this.f14619f = uri;
        s(pVar);
        RandomAccessFile u10 = u(uri);
        this.f14618e = u10;
        try {
            u10.seek(pVar.f14518g);
            long j10 = pVar.f14519h;
            if (j10 == -1) {
                j10 = this.f14618e.length() - pVar.f14518g;
            }
            this.f14620g = j10;
            if (j10 >= 0) {
                this.f14621h = true;
                t(pVar);
                return this.f14620g;
            }
            throw new b(null, null, 2008);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14620g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) p3.n0.j(this.f14618e)).read(bArr, i10, (int) Math.min(this.f14620g, i11));
            if (read > 0) {
                this.f14620g -= read;
                q(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
