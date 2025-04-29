package l6;

import java.util.Map;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int f13238a;

    /* renamed from: b  reason: collision with root package name */
    private final d6.c<m6.l, m6.i> f13239b;

    m(int i10, d6.c<m6.l, m6.i> cVar) {
        this.f13238a = i10;
        this.f13239b = cVar;
    }

    public static m a(int i10, Map<m6.l, d1> map) {
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        for (Map.Entry<m6.l, d1> entry : map.entrySet()) {
            a10 = a10.p(entry.getKey(), entry.getValue().a());
        }
        return new m(i10, a10);
    }

    public int b() {
        return this.f13238a;
    }

    public d6.c<m6.l, m6.i> c() {
        return this.f13239b;
    }
}
