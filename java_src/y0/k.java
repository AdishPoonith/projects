package y0;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
/* loaded from: classes.dex */
public final class k extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final String f20327a;

    /* renamed from: b  reason: collision with root package name */
    private final File f20328b;

    /* renamed from: c  reason: collision with root package name */
    private final a f20329c;

    /* loaded from: classes.dex */
    public interface a {
        void a(File file);
    }

    public k(String uriStr, File destFile, a onSuccess) {
        kotlin.jvm.internal.l.e(uriStr, "uriStr");
        kotlin.jvm.internal.l.e(destFile, "destFile");
        kotlin.jvm.internal.l.e(onSuccess, "onSuccess");
        this.f20327a = uriStr;
        this.f20328b = destFile;
        this.f20329c = onSuccess;
    }

    public Boolean a(String... args) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(args, "args");
            try {
                URL url = new URL(this.f20327a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f20328b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    protected void b(boolean z10) {
        if (!k1.a.d(this) && z10) {
            try {
                this.f20329c.a(this.f20328b);
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return a(strArr);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            b(bool.booleanValue());
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
