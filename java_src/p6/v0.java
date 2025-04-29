package p6;

import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
final class v0 {

    /* renamed from: b  reason: collision with root package name */
    private static final v0 f15696b = new v0();

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<AtomicReference<b>> f15697a = new CopyOnWriteArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {
        static a a(int i10, int i11) {
            return new k(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a c(int i10, p pVar) {
            return a(i10, pVar.a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    private v0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 b() {
        return f15696b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(AtomicReference atomicReference, a aVar) {
        b bVar = (b) atomicReference.get();
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(final a aVar) {
        Iterator<AtomicReference<b>> it = this.f15697a.iterator();
        while (it.hasNext()) {
            final AtomicReference<b> next = it.next();
            q6.p.f16301c.execute(new Runnable() { // from class: p6.u0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.c(next, aVar);
                }
            });
        }
    }
}
