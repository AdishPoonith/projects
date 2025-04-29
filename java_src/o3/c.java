package o3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f14409e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14410f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f14411g;

    /* renamed from: h  reason: collision with root package name */
    private long f14412h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14413i;

    /* loaded from: classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f14409e = context.getAssets();
    }

    @Override // o3.l
    public void close() {
        this.f14410f = null;
        try {
            try {
                InputStream inputStream = this.f14411g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f14411g = null;
            if (this.f14413i) {
                this.f14413i = false;
                r();
            }
        }
    }

    @Override // o3.l
    public Uri j() {
        return this.f14410f;
    }

    @Override // o3.l
    public long m(p pVar) {
        try {
            Uri uri = pVar.f14512a;
            this.f14410f = uri;
            String str = (String) p3.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            s(pVar);
            InputStream open = this.f14409e.open(str, 1);
            this.f14411g = open;
            if (open.skip(pVar.f14518g) >= pVar.f14518g) {
                long j10 = pVar.f14519h;
                if (j10 != -1) {
                    this.f14412h = j10;
                } else {
                    long available = this.f14411g.available();
                    this.f14412h = available;
                    if (available == 2147483647L) {
                        this.f14412h = -1L;
                    }
                }
                this.f14413i = true;
                t(pVar);
                return this.f14412h;
            }
            throw new a(null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14412h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) p3.n0.j(this.f14411g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f14412h;
        if (j11 != -1) {
            this.f14412h = j11 - read;
        }
        q(read);
        return read;
    }
}
