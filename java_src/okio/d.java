package okio;

import java.nio.channels.WritableByteChannel;
/* loaded from: classes.dex */
public interface d extends m, WritableByteChannel {
    d D(int i10);

    d J(byte[] bArr);

    d a0(String str);

    @Override // okio.m, java.io.Flushable
    void flush();

    d p(int i10);

    d s(int i10);
}
