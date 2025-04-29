package l6;

import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a  reason: collision with root package name */
    private d6.e<e> f13213a = new d6.e<>(Collections.emptyList(), e.f13129c);

    /* renamed from: b  reason: collision with root package name */
    private d6.e<e> f13214b = new d6.e<>(Collections.emptyList(), e.f13130d);

    private void e(e eVar) {
        this.f13213a = this.f13213a.m(eVar);
        this.f13214b = this.f13214b.m(eVar);
    }

    public void a(m6.l lVar, int i10) {
        e eVar = new e(lVar, i10);
        this.f13213a = this.f13213a.k(eVar);
        this.f13214b = this.f13214b.k(eVar);
    }

    public void b(d6.e<m6.l> eVar, int i10) {
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            a(it.next(), i10);
        }
    }

    public boolean c(m6.l lVar) {
        Iterator<e> l10 = this.f13213a.l(new e(lVar, 0));
        if (l10.hasNext()) {
            return l10.next().d().equals(lVar);
        }
        return false;
    }

    public d6.e<m6.l> d(int i10) {
        Iterator<e> l10 = this.f13214b.l(new e(m6.l.h(), i10));
        d6.e<m6.l> i11 = m6.l.i();
        while (l10.hasNext()) {
            e next = l10.next();
            if (next.c() != i10) {
                break;
            }
            i11 = i11.k(next.d());
        }
        return i11;
    }

    public void f(m6.l lVar, int i10) {
        e(new e(lVar, i10));
    }

    public void g(d6.e<m6.l> eVar, int i10) {
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            f(it.next(), i10);
        }
    }

    public d6.e<m6.l> h(int i10) {
        Iterator<e> l10 = this.f13214b.l(new e(m6.l.h(), i10));
        d6.e<m6.l> i11 = m6.l.i();
        while (l10.hasNext()) {
            e next = l10.next();
            if (next.c() != i10) {
                break;
            }
            i11 = i11.k(next.d());
            e(next);
        }
        return i11;
    }
}
