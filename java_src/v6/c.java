package v6;

import b6.r;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f19433a;

    /* renamed from: b  reason: collision with root package name */
    private final d f19434b;

    c(Set<f> set, d dVar) {
        this.f19433a = e(set);
        this.f19434b = dVar;
    }

    public static b6.c<i> c() {
        return b6.c.e(i.class).b(r.m(f.class)).d(new b6.h() { // from class: v6.b
            @Override // b6.h
            public final Object a(b6.e eVar) {
                i d10;
                d10 = c.d(eVar);
                return d10;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(b6.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // v6.i
    public String a() {
        if (this.f19434b.b().isEmpty()) {
            return this.f19433a;
        }
        return this.f19433a + ' ' + e(this.f19434b.b());
    }
}
