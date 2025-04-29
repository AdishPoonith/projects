package m3;

import android.text.TextUtils;
import java.util.ArrayList;
import p3.a0;
import s1.u2;
/* loaded from: classes.dex */
public final class h extends d3.g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f13768o;

    /* renamed from: p  reason: collision with root package name */
    private final c f13769p;

    public h() {
        super("WebvttDecoder");
        this.f13768o = new a0();
        this.f13769p = new c();
    }

    private static int C(a0 a0Var) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = a0Var.f();
            String r10 = a0Var.r();
            i10 = r10 == null ? 0 : "STYLE".equals(r10) ? 2 : r10.startsWith("NOTE") ? 1 : 3;
        }
        a0Var.T(i11);
        return i10;
    }

    private static void D(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.r()));
    }

    @Override // d3.g
    protected d3.h A(byte[] bArr, int i10, boolean z10) {
        e n10;
        this.f13768o.R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f13768o);
            do {
            } while (!TextUtils.isEmpty(this.f13768o.r()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = C(this.f13768o);
                if (C == 0) {
                    return new k(arrayList2);
                }
                if (C == 1) {
                    D(this.f13768o);
                } else if (C == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new d3.j("A style block was found after the first cue.");
                    }
                    this.f13768o.r();
                    arrayList.addAll(this.f13769p.d(this.f13768o));
                } else if (C == 3 && (n10 = f.n(this.f13768o, arrayList)) != null) {
                    arrayList2.add(n10);
                }
            }
        } catch (u2 e10) {
            throw new d3.j(e10);
        }
    }
}
