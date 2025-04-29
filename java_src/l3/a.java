package l3;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import b5.d;
import d3.b;
import d3.g;
import d3.h;
import d3.j;
import java.nio.charset.Charset;
import java.util.List;
import p3.a0;
import p3.n0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f13051o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f13052p;

    /* renamed from: q  reason: collision with root package name */
    private final int f13053q;

    /* renamed from: r  reason: collision with root package name */
    private final int f13054r;

    /* renamed from: s  reason: collision with root package name */
    private final String f13055s;

    /* renamed from: t  reason: collision with root package name */
    private final float f13056t;

    /* renamed from: u  reason: collision with root package name */
    private final int f13057u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f13051o = new a0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f13053q = 0;
            this.f13054r = -1;
            this.f13055s = "sans-serif";
            this.f13052p = false;
            this.f13056t = 0.85f;
            this.f13057u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f13053q = bArr[24];
        this.f13054r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f13055s = "Serif".equals(n0.E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f13057u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f13052p = z10;
        if (z10) {
            this.f13056t = n0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f13056t = 0.85f;
        }
    }

    private void C(a0 a0Var, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        D(a0Var.a() >= 12);
        int M = a0Var.M();
        int M2 = a0Var.M();
        a0Var.U(2);
        int G = a0Var.G();
        a0Var.U(1);
        int p10 = a0Var.p();
        if (M2 > spannableStringBuilder.length()) {
            r.i("Tx3gDecoder", "Truncating styl end (" + M2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = M2;
        }
        if (M < i10) {
            int i11 = i10;
            F(spannableStringBuilder, G, this.f13053q, M, i11, 0);
            E(spannableStringBuilder, p10, this.f13054r, M, i11, 0);
            return;
        }
        r.i("Tx3gDecoder", "Ignoring styl with start (" + M + ") >= end (" + i10 + ").");
    }

    private static void D(boolean z10) {
        if (!z10) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void G(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String H(a0 a0Var) {
        D(a0Var.a() >= 2);
        int M = a0Var.M();
        if (M == 0) {
            return "";
        }
        int f10 = a0Var.f();
        Charset O = a0Var.O();
        int f11 = M - (a0Var.f() - f10);
        if (O == null) {
            O = d.f2950c;
        }
        return a0Var.E(f11, O);
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        this.f13051o.R(bArr, i10);
        String H = H(this.f13051o);
        if (H.isEmpty()) {
            return b.f13058k;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        F(spannableStringBuilder, this.f13053q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.f13054r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.f13055s, 0, spannableStringBuilder.length());
        float f10 = this.f13056t;
        while (this.f13051o.a() >= 8) {
            int f11 = this.f13051o.f();
            int p10 = this.f13051o.p();
            int p11 = this.f13051o.p();
            if (p11 == 1937013100) {
                D(this.f13051o.a() >= 2);
                int M = this.f13051o.M();
                for (int i11 = 0; i11 < M; i11++) {
                    C(this.f13051o, spannableStringBuilder);
                }
            } else if (p11 == 1952608120 && this.f13052p) {
                D(this.f13051o.a() >= 2);
                f10 = n0.p(this.f13051o.M() / this.f13057u, 0.0f, 0.95f);
            }
            this.f13051o.T(f11 + p10);
        }
        return new b(new b.C0115b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
