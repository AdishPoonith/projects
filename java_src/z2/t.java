package z2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.j0;
import s1.n1;
import s1.u2;
import x1.b0;
import x1.e0;
/* loaded from: classes.dex */
public final class t implements x1.l {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f20849g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f20850h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f20851a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f20852b;

    /* renamed from: d  reason: collision with root package name */
    private x1.n f20854d;

    /* renamed from: f  reason: collision with root package name */
    private int f20856f;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f20853c = new a0();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f20855e = new byte[1024];

    public t(String str, j0 j0Var) {
        this.f20851a = str;
        this.f20852b = j0Var;
    }

    private e0 d(long j10) {
        e0 d10 = this.f20854d.d(0, 3);
        d10.e(new n1.b().g0("text/vtt").X(this.f20851a).k0(j10).G());
        this.f20854d.k();
        return d10;
    }

    private void e() {
        a0 a0Var = new a0(this.f20855e);
        m3.i.e(a0Var);
        long j10 = 0;
        long j11 = 0;
        for (String r10 = a0Var.r(); !TextUtils.isEmpty(r10); r10 = a0Var.r()) {
            if (r10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f20849g.matcher(r10);
                if (!matcher.find()) {
                    throw u2.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + r10, null);
                }
                Matcher matcher2 = f20850h.matcher(r10);
                if (!matcher2.find()) {
                    throw u2.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + r10, null);
                }
                j11 = m3.i.d((String) p3.a.e(matcher.group(1)));
                j10 = j0.f(Long.parseLong((String) p3.a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = m3.i.a(a0Var);
        if (a10 == null) {
            d(0L);
            return;
        }
        long d10 = m3.i.d((String) p3.a.e(a10.group(1)));
        long b10 = this.f20852b.b(j0.j((j10 + d10) - j11));
        e0 d11 = d(b10 - d10);
        this.f20853c.R(this.f20855e, this.f20856f);
        d11.d(this.f20853c, this.f20856f);
        d11.c(b10, 1, this.f20856f, 0, null);
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f20854d = nVar;
        nVar.t(new b0.b(-9223372036854775807L));
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        p3.a.e(this.f20854d);
        int a10 = (int) mVar.a();
        int i10 = this.f20856f;
        byte[] bArr = this.f20855e;
        if (i10 == bArr.length) {
            this.f20855e = Arrays.copyOf(bArr, ((a10 != -1 ? a10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f20855e;
        int i11 = this.f20856f;
        int read = mVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f20856f + read;
            this.f20856f = i12;
            if (a10 == -1 || i12 != a10) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        mVar.k(this.f20855e, 0, 6, false);
        this.f20853c.R(this.f20855e, 6);
        if (m3.i.b(this.f20853c)) {
            return true;
        }
        mVar.k(this.f20855e, 6, 3, false);
        this.f20853c.R(this.f20855e, 9);
        return m3.i.b(this.f20853c);
    }
}
