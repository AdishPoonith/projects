package okio;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface m extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void j(c cVar, long j10);
}
