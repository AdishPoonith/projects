package d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f7551a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f7552b;

    public final void a(b listener) {
        l.e(listener, "listener");
        Context context = this.f7552b;
        if (context != null) {
            listener.a(context);
        }
        this.f7551a.add(listener);
    }

    public final void b() {
        this.f7552b = null;
    }

    public final void c(Context context) {
        l.e(context, "context");
        this.f7552b = context;
        for (b bVar : this.f7551a) {
            bVar.a(context);
        }
    }
}
