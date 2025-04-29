package j2;

import java.nio.ByteBuffer;
import s1.n1;
import u1.h0;
/* loaded from: classes.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f12013a;

    /* renamed from: b  reason: collision with root package name */
    private long f12014b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12015c;

    private long a(long j10) {
        return this.f12013a + Math.max(0L, ((this.f12014b - 529) * 1000000) / j10);
    }

    public long b(n1 n1Var) {
        return a(n1Var.I);
    }

    public void c() {
        this.f12013a = 0L;
        this.f12014b = 0L;
        this.f12015c = false;
    }

    public long d(n1 n1Var, v1.g gVar) {
        if (this.f12014b == 0) {
            this.f12013a = gVar.f19366n;
        }
        if (this.f12015c) {
            return gVar.f19366n;
        }
        ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(gVar.f19364l);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m10 = h0.m(i10);
        if (m10 != -1) {
            long a10 = a(n1Var.I);
            this.f12014b += m10;
            return a10;
        }
        this.f12015c = true;
        this.f12014b = 0L;
        this.f12013a = gVar.f19366n;
        p3.r.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f19366n;
    }
}
