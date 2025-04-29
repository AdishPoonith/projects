package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f2613a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2614b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f2615c;

    /* renamed from: e  reason: collision with root package name */
    private final File f2617e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2618f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2619g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2620h;

    /* renamed from: j  reason: collision with root package name */
    private d[] f2622j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f2623k;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2621i = false;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f2616d = d();

    public c(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f2613a = assetManager;
        this.f2614b = executor;
        this.f2615c = cVar;
        this.f2618f = str;
        this.f2619g = str2;
        this.f2620h = str3;
        this.f2617e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        i.c cVar;
        int i10;
        InputStream h10;
        try {
            h10 = h(this.f2613a, this.f2620h);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f2615c;
            i10 = 9;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f2615c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f2622j = null;
            cVar = this.f2615c;
            i10 = 8;
            cVar.b(i10, e);
            return null;
        }
        if (h10 != null) {
            this.f2622j = n.q(h10, n.o(h10, n.f2652b), bArr, dVarArr);
            h10.close();
            return this;
        }
        if (h10 != null) {
            h10.close();
        }
        return null;
    }

    private void c() {
        if (!this.f2621i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return null;
        }
        switch (i10) {
            case f.j.f8335u3 /* 24 */:
            case 25:
                return p.f2667e;
            case 26:
                return p.f2666d;
            case 27:
                return p.f2665c;
            case 28:
            case f.j.f8360z3 /* 29 */:
            case 30:
                return p.f2664b;
            case 31:
            case 32:
            case 33:
                return p.f2663a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        i.c cVar;
        int i10;
        try {
            return h(assetManager, this.f2619g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f2615c;
            i10 = 6;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f2615c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f2615c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2615c.a(5, null);
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
        } catch (IOException e10) {
            this.f2615c.b(7, e10);
        }
        try {
            try {
                d[] w10 = n.w(inputStream, n.o(inputStream, n.f2651a), this.f2618f);
                try {
                    inputStream.close();
                    return w10;
                } catch (IOException e11) {
                    this.f2615c.b(7, e11);
                    return w10;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    this.f2615c.b(7, e12);
                }
                throw th;
            }
        } catch (IOException e13) {
            this.f2615c.b(7, e13);
            inputStream.close();
            return null;
        } catch (IllegalStateException e14) {
            this.f2615c.b(8, e14);
            inputStream.close();
            return null;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f2614b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i10, obj);
            }
        });
    }

    public boolean e() {
        int i10;
        Integer num;
        if (this.f2616d == null) {
            i10 = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (this.f2617e.canWrite()) {
            this.f2621i = true;
            return true;
        } else {
            i10 = 4;
            num = null;
        }
        l(i10, num);
        return false;
    }

    public c i() {
        c b10;
        c();
        if (this.f2616d == null) {
            return this;
        }
        InputStream f10 = f(this.f2613a);
        if (f10 != null) {
            this.f2622j = j(f10);
        }
        d[] dVarArr = this.f2622j;
        return (dVarArr == null || !k() || (b10 = b(dVarArr, this.f2616d)) == null) ? this : b10;
    }

    public c m() {
        i.c cVar;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f2622j;
        byte[] bArr = this.f2616d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    n.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                cVar = this.f2615c;
                i10 = 7;
                cVar.b(i10, e);
                this.f2622j = null;
                return this;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f2615c;
                i10 = 8;
                cVar.b(i10, e);
                this.f2622j = null;
                return this;
            }
            if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f2615c.b(5, null);
                this.f2622j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f2623k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f2622j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], androidx.profileinstaller.d[]] */
    public boolean n() {
        byte[] bArr = this.f2623k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2617e);
                    e.l(byteArrayInputStream, fileOutputStream);
                    l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                l(6, e10);
                return false;
            } catch (IOException e11) {
                l(7, e11);
                return false;
            }
        } finally {
            this.f2623k = null;
            this.f2622j = null;
        }
    }
}
