package f3;

import d3.g;
import d3.h;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final b f8779o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f8779o = new b(a0Var.M(), a0Var.M());
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f8779o.r();
        }
        return new c(this.f8779o.b(bArr, i10));
    }
}
