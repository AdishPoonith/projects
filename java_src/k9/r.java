package k9;

import i9.m0;
import i9.y0;
import io.grpc.internal.m2;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f12803a = Logger.getLogger(r.class.getName());

    private r() {
    }

    public static y0 a(List<m9.d> list) {
        return m0.c(b(list));
    }

    private static byte[][] b(List<m9.d> list) {
        byte[][] bArr = new byte[list.size() * 2];
        int i10 = 0;
        for (m9.d dVar : list) {
            int i11 = i10 + 1;
            bArr[i10] = dVar.f13897a.v();
            i10 = i11 + 1;
            bArr[i11] = dVar.f13898b.v();
        }
        return m2.e(bArr);
    }

    public static y0 c(List<m9.d> list) {
        return m0.c(b(list));
    }
}
