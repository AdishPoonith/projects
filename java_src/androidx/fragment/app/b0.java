package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
final class b0 extends Writer {

    /* renamed from: j  reason: collision with root package name */
    private final String f2168j;

    /* renamed from: k  reason: collision with root package name */
    private StringBuilder f2169k = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(String str) {
        this.f2168j = str;
    }

    private void a() {
        if (this.f2169k.length() > 0) {
            Log.d(this.f2168j, this.f2169k.toString());
            StringBuilder sb = this.f2169k;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f2169k.append(c10);
            }
        }
    }
}
