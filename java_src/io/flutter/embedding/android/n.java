package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    long f10225a;

    /* renamed from: b  reason: collision with root package name */
    a f10226b;

    /* renamed from: c  reason: collision with root package name */
    long f10227c;

    /* renamed from: d  reason: collision with root package name */
    long f10228d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10229e;

    /* renamed from: f  reason: collision with root package name */
    String f10230f;

    /* loaded from: classes.dex */
    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: j  reason: collision with root package name */
        private long f10235j;

        a(long j10) {
            this.f10235j = j10;
        }

        public long b() {
            return this.f10235j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a() {
        try {
            String str = this.f10230f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f10225a);
            allocateDirect.putLong(this.f10226b.b());
            allocateDirect.putLong(this.f10227c);
            allocateDirect.putLong(this.f10228d);
            allocateDirect.putLong(this.f10229e ? 1L : 0L);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
