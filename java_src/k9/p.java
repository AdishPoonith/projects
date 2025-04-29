package k9;

import io.grpc.internal.p2;
import io.grpc.internal.q2;
/* loaded from: classes.dex */
class p implements q2 {
    @Override // io.grpc.internal.q2
    public p2 a(int i10) {
        return new o(new okio.c(), Math.min(1048576, Math.max(4096, i10)));
    }
}
