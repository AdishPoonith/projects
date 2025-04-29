package p1;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class d extends q.e {

    /* renamed from: l  reason: collision with root package name */
    private static q.c f15098l;

    /* renamed from: m  reason: collision with root package name */
    private static q.f f15099m;

    /* renamed from: k  reason: collision with root package name */
    public static final a f15097k = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private static final ReentrantLock f15100n = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            q.c cVar;
            d.f15100n.lock();
            if (d.f15099m == null && (cVar = d.f15098l) != null) {
                a aVar = d.f15097k;
                d.f15099m = cVar.d(null);
            }
            d.f15100n.unlock();
        }

        public final q.f b() {
            d.f15100n.lock();
            q.f fVar = d.f15099m;
            d.f15099m = null;
            d.f15100n.unlock();
            return fVar;
        }

        public final void c(Uri url) {
            kotlin.jvm.internal.l.e(url, "url");
            d();
            d.f15100n.lock();
            q.f fVar = d.f15099m;
            if (fVar != null) {
                fVar.f(url, null, null);
            }
            d.f15100n.unlock();
        }
    }

    @Override // q.e
    public void a(ComponentName name, q.c newClient) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(newClient, "newClient");
        newClient.f(0L);
        a aVar = f15097k;
        f15098l = newClient;
        aVar.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.l.e(componentName, "componentName");
    }
}
