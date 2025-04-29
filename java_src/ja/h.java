package ja;

import java.util.Iterator;
import kotlin.jvm.internal.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f12418a;

        public a(Iterator it) {
            this.f12418a = it;
        }

        @Override // ja.b
        public Iterator<T> iterator() {
            return this.f12418a;
        }
    }

    public static <T> b<T> c(Iterator<? extends T> it) {
        l.e(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> d(b<? extends T> bVar) {
        l.e(bVar, "<this>");
        return bVar instanceof ja.a ? bVar : new ja.a(bVar);
    }
}
