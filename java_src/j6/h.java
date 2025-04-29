package j6;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class h<T> implements com.google.firebase.firestore.o<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12199a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.firestore.o<T> f12200b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f12201c = false;

    public h(Executor executor, com.google.firebase.firestore.o<T> oVar) {
        this.f12199a = executor;
        this.f12200b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj, com.google.firebase.firestore.z zVar) {
        if (this.f12201c) {
            return;
        }
        this.f12200b.a(obj, zVar);
    }

    @Override // com.google.firebase.firestore.o
    public void a(final T t10, final com.google.firebase.firestore.z zVar) {
        this.f12199a.execute(new Runnable() { // from class: j6.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.c(t10, zVar);
            }
        });
    }

    public void d() {
        this.f12201c = true;
    }
}
