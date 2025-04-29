package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<a> f11694a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private volatile i9.p f11695b = i9.p.IDLE;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f11696a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f11697b;

        a(Runnable runnable, Executor executor) {
            this.f11696a = runnable;
            this.f11697b = executor;
        }

        void a() {
            this.f11697b.execute(this.f11696a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.p a() {
        i9.p pVar = this.f11695b;
        if (pVar != null) {
            return pVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(i9.p pVar) {
        b5.n.o(pVar, "newState");
        if (this.f11695b == pVar || this.f11695b == i9.p.SHUTDOWN) {
            return;
        }
        this.f11695b = pVar;
        if (this.f11694a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f11694a;
        this.f11694a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Runnable runnable, Executor executor, i9.p pVar) {
        b5.n.o(runnable, "callback");
        b5.n.o(executor, "executor");
        b5.n.o(pVar, "source");
        a aVar = new a(runnable, executor);
        if (this.f11695b != pVar) {
            aVar.a();
        } else {
            this.f11694a.add(aVar);
        }
    }
}
