package p7;

import java.util.Map;
/* loaded from: classes.dex */
public final class o implements i7.g {

    /* renamed from: a  reason: collision with root package name */
    private final j f15773a = new j();

    @Override // i7.g
    public l7.b a(String str, i7.a aVar, int i10, int i11, Map<i7.c, ?> map) {
        if (aVar == i7.a.UPC_A) {
            return this.f15773a.a("0".concat(String.valueOf(str)), i7.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
