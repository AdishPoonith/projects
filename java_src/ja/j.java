package ja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import t9.o;
import t9.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterable<T>, ea.a {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f12419j;

        public a(b bVar) {
            this.f12419j = bVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f12419j.iterator();
        }
    }

    public static <T> Iterable<T> e(b<? extends T> bVar) {
        l.e(bVar, "<this>");
        return new a(bVar);
    }

    public static <T, R> b<R> f(b<? extends T> bVar, da.l<? super T, ? extends R> transform) {
        l.e(bVar, "<this>");
        l.e(transform, "transform");
        return new k(bVar, transform);
    }

    public static <T> List<T> g(b<? extends T> bVar) {
        List<T> b10;
        List<T> e10;
        l.e(bVar, "<this>");
        Iterator<? extends T> it = bVar.iterator();
        if (!it.hasNext()) {
            e10 = p.e();
            return e10;
        }
        T next = it.next();
        if (!it.hasNext()) {
            b10 = o.b(next);
            return b10;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
