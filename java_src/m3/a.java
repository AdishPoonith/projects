package m3;

import d3.b;
import java.util.ArrayList;
import java.util.Collections;
import p3.a0;
import p3.n0;
/* loaded from: classes.dex */
public final class a extends d3.g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f13717o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f13717o = new a0();
    }

    private static d3.b C(a0 a0Var, int i10) {
        CharSequence charSequence = null;
        b.C0115b c0115b = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new d3.j("Incomplete vtt cue box header found.");
            }
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            int i11 = p10 - 8;
            String E = n0.E(a0Var.e(), a0Var.f(), i11);
            a0Var.U(i11);
            i10 = (i10 - 8) - i11;
            if (p11 == 1937011815) {
                c0115b = f.o(E);
            } else if (p11 == 1885436268) {
                charSequence = f.q(null, E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return c0115b != null ? c0115b.o(charSequence).a() : f.l(charSequence);
    }

    @Override // d3.g
    protected d3.h A(byte[] bArr, int i10, boolean z10) {
        this.f13717o.R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f13717o.a() > 0) {
            if (this.f13717o.a() < 8) {
                throw new d3.j("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int p10 = this.f13717o.p();
            if (this.f13717o.p() == 1987343459) {
                arrayList.add(C(this.f13717o, p10 - 8));
            } else {
                this.f13717o.U(p10 - 8);
            }
        }
        return new b(arrayList);
    }
}
