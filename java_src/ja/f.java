package ja;

import da.p;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import s9.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f12417a;

        public a(p pVar) {
            this.f12417a = pVar;
        }

        @Override // ja.b
        public Iterator<T> iterator() {
            Iterator<T> a10;
            a10 = f.a(this.f12417a);
            return a10;
        }
    }

    public static <T> Iterator<T> a(p<? super d<? super T>, ? super v9.d<? super u>, ? extends Object> block) {
        v9.d<? super u> a10;
        l.e(block, "block");
        c cVar = new c();
        a10 = w9.c.a(block, cVar, cVar);
        cVar.i(a10);
        return cVar;
    }

    public static <T> b<T> b(p<? super d<? super T>, ? super v9.d<? super u>, ? extends Object> block) {
        l.e(block, "block");
        return new a(block);
    }
}
