package x1;

import java.util.Collections;
import java.util.List;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f20196a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20197b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20198c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20199d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20200e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20201f;

    /* renamed from: g  reason: collision with root package name */
    public final int f20202g;

    /* renamed from: h  reason: collision with root package name */
    public final int f20203h;

    /* renamed from: i  reason: collision with root package name */
    public final int f20204i;

    /* renamed from: j  reason: collision with root package name */
    public final long f20205j;

    /* renamed from: k  reason: collision with root package name */
    public final a f20206k;

    /* renamed from: l  reason: collision with root package name */
    private final k2.a f20207l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f20208a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f20209b;

        public a(long[] jArr, long[] jArr2) {
            this.f20208a = jArr;
            this.f20209b = jArr2;
        }
    }

    private v(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, k2.a aVar2) {
        this.f20196a = i10;
        this.f20197b = i11;
        this.f20198c = i12;
        this.f20199d = i13;
        this.f20200e = i14;
        this.f20201f = j(i14);
        this.f20202g = i15;
        this.f20203h = i16;
        this.f20204i = e(i16);
        this.f20205j = j10;
        this.f20206k = aVar;
        this.f20207l = aVar2;
    }

    public v(byte[] bArr, int i10) {
        p3.z zVar = new p3.z(bArr);
        zVar.p(i10 * 8);
        this.f20196a = zVar.h(16);
        this.f20197b = zVar.h(16);
        this.f20198c = zVar.h(24);
        this.f20199d = zVar.h(24);
        int h10 = zVar.h(20);
        this.f20200e = h10;
        this.f20201f = j(h10);
        this.f20202g = zVar.h(3) + 1;
        int h11 = zVar.h(5) + 1;
        this.f20203h = h11;
        this.f20204i = e(h11);
        this.f20205j = zVar.j(36);
        this.f20206k = null;
        this.f20207l = null;
    }

    private static int e(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public v a(List<n2.a> list) {
        return new v(this.f20196a, this.f20197b, this.f20198c, this.f20199d, this.f20200e, this.f20202g, this.f20203h, this.f20205j, this.f20206k, h(new k2.a(list)));
    }

    public v b(a aVar) {
        return new v(this.f20196a, this.f20197b, this.f20198c, this.f20199d, this.f20200e, this.f20202g, this.f20203h, this.f20205j, aVar, this.f20207l);
    }

    public v c(List<String> list) {
        return new v(this.f20196a, this.f20197b, this.f20198c, this.f20199d, this.f20200e, this.f20202g, this.f20203h, this.f20205j, this.f20206k, h(h0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f20199d;
        if (i10 > 0) {
            j10 = (i10 + this.f20198c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f20196a;
            j10 = ((((i11 != this.f20197b || i11 <= 0) ? 4096L : i11) * this.f20202g) * this.f20203h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f20205j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f20200e;
    }

    public n1 g(byte[] bArr, k2.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f20199d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new n1.b().g0("audio/flac").Y(i10).J(this.f20202g).h0(this.f20200e).V(Collections.singletonList(bArr)).Z(h(aVar)).G();
    }

    public k2.a h(k2.a aVar) {
        k2.a aVar2 = this.f20207l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j10) {
        return n0.r((j10 * this.f20200e) / 1000000, 0L, this.f20205j - 1);
    }
}
