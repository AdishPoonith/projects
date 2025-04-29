package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f1773a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1774b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0026a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.c f1775j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Typeface f1776k;

        RunnableC0026a(g.c cVar, Typeface typeface) {
            this.f1775j = cVar;
            this.f1776k = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1775j.b(this.f1776k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.c f1778j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f1779k;

        b(g.c cVar, int i10) {
            this.f1778j = cVar;
            this.f1779k = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1778j.a(this.f1779k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g.c cVar, Handler handler) {
        this.f1773a = cVar;
        this.f1774b = handler;
    }

    private void a(int i10) {
        this.f1774b.post(new b(this.f1773a, i10));
    }

    private void c(Typeface typeface) {
        this.f1774b.post(new RunnableC0026a(this.f1773a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1803a);
        } else {
            a(eVar.f1804b);
        }
    }
}
