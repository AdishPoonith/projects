package j6;

import java.util.List;
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final m6.t f12324a;

    /* renamed from: b  reason: collision with root package name */
    private final n6.d f12325b;

    /* renamed from: c  reason: collision with root package name */
    private final List<n6.e> f12326c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1(m6.t tVar, n6.d dVar, List<n6.e> list) {
        this.f12324a = tVar;
        this.f12325b = dVar;
        this.f12326c = list;
    }

    public n6.f a(m6.l lVar, n6.m mVar) {
        n6.d dVar = this.f12325b;
        return dVar != null ? new n6.l(lVar, this.f12324a, dVar, mVar, this.f12326c) : new n6.o(lVar, this.f12324a, mVar, this.f12326c);
    }
}
