package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s9.u;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f517a;

    /* renamed from: b  reason: collision with root package name */
    private final da.a<u> f518b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f519c;

    /* renamed from: d  reason: collision with root package name */
    private int f520d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f521e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f522f;

    /* renamed from: g  reason: collision with root package name */
    private final List<da.a<u>> f523g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f524h;

    public h(Executor executor, da.a<u> reportFullyDrawn) {
        kotlin.jvm.internal.l.e(executor, "executor");
        kotlin.jvm.internal.l.e(reportFullyDrawn, "reportFullyDrawn");
        this.f517a = executor;
        this.f518b = reportFullyDrawn;
        this.f519c = new Object();
        this.f523g = new ArrayList();
        this.f524h = new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                h.d(h.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(h this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        synchronized (this$0.f519c) {
            this$0.f521e = false;
            if (this$0.f520d == 0 && !this$0.f522f) {
                this$0.f518b.invoke();
                this$0.b();
            }
            u uVar = u.f17878a;
        }
    }

    public final void b() {
        synchronized (this.f519c) {
            this.f522f = true;
            Iterator<T> it = this.f523g.iterator();
            while (it.hasNext()) {
                ((da.a) it.next()).invoke();
            }
            this.f523g.clear();
            u uVar = u.f17878a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f519c) {
            z10 = this.f522f;
        }
        return z10;
    }
}
