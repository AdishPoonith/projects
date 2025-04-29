package m2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import k2.e;
import k2.h;
import p3.a0;
/* loaded from: classes.dex */
public final class b extends h {
    @Override // k2.h
    protected k2.a b(e eVar, ByteBuffer byteBuffer) {
        return new k2.a(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(a0 a0Var) {
        return new a((String) p3.a.e(a0Var.A()), (String) p3.a.e(a0Var.A()), a0Var.z(), a0Var.z(), Arrays.copyOfRange(a0Var.e(), a0Var.f(), a0Var.g()));
    }
}
