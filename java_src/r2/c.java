package r2;

import java.nio.ByteBuffer;
import k2.a;
import k2.h;
import p3.a0;
import p3.j0;
import p3.z;
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f16639a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final z f16640b = new z();

    /* renamed from: c  reason: collision with root package name */
    private j0 f16641c;

    @Override // k2.h
    protected k2.a b(k2.e eVar, ByteBuffer byteBuffer) {
        j0 j0Var = this.f16641c;
        if (j0Var == null || eVar.f12497r != j0Var.e()) {
            j0 j0Var2 = new j0(eVar.f19366n);
            this.f16641c = j0Var2;
            j0Var2.a(eVar.f19366n - eVar.f12497r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f16639a.R(array, limit);
        this.f16640b.o(array, limit);
        this.f16640b.r(39);
        long h10 = (this.f16640b.h(1) << 32) | this.f16640b.h(32);
        this.f16640b.r(20);
        int h11 = this.f16640b.h(12);
        int h12 = this.f16640b.h(8);
        a.b bVar = null;
        this.f16639a.U(14);
        if (h12 == 0) {
            bVar = new e();
        } else if (h12 == 255) {
            bVar = a.a(this.f16639a, h11, h10);
        } else if (h12 == 4) {
            bVar = f.a(this.f16639a);
        } else if (h12 == 5) {
            bVar = d.a(this.f16639a, h10, this.f16641c);
        } else if (h12 == 6) {
            bVar = g.a(this.f16639a, h10, this.f16641c);
        }
        return bVar == null ? new k2.a(new a.b[0]) : new k2.a(bVar);
    }
}
