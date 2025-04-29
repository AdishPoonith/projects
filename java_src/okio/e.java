package okio;

import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public interface e extends n, ReadableByteChannel {
    c A();

    boolean B();

    byte[] G(long j10);

    void Y(long j10);

    f n(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);
}
