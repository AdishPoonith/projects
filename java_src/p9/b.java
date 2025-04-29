package p9;

import b5.n;
import i9.d;
import java.util.concurrent.Executor;
import p9.b;
/* loaded from: classes.dex */
public abstract class b<S extends b<S>> {

    /* renamed from: a  reason: collision with root package name */
    private final d f15832a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.c f15833b;

    /* loaded from: classes.dex */
    public interface a<T extends b<T>> {
        T a(d dVar, i9.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(d dVar, i9.c cVar) {
        this.f15832a = (d) n.o(dVar, "channel");
        this.f15833b = (i9.c) n.o(cVar, "callOptions");
    }

    protected abstract S a(d dVar, i9.c cVar);

    public final i9.c b() {
        return this.f15833b;
    }

    public final S c(i9.b bVar) {
        return a(this.f15832a, this.f15833b.l(bVar));
    }

    public final S d(Executor executor) {
        return a(this.f15832a, this.f15833b.n(executor));
    }
}
