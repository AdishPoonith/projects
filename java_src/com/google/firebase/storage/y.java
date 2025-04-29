package com.google.firebase.storage;

import android.app.Activity;
import com.google.firebase.storage.s;
import com.google.firebase.storage.s.a;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y<ListenerTypeT, ResultT extends s.a> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<ListenerTypeT> f7033a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<ListenerTypeT, x6.g> f7034b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private s<ResultT> f7035c;

    /* renamed from: d  reason: collision with root package name */
    private int f7036d;

    /* renamed from: e  reason: collision with root package name */
    private a<ListenerTypeT, ResultT> f7037e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<ListenerTypeT, ResultT> {
        void a(ListenerTypeT listenertypet, ResultT resultt);
    }

    public y(s<ResultT> sVar, int i10, a<ListenerTypeT, ResultT> aVar) {
        this.f7035c = sVar;
        this.f7036d = i10;
        this.f7037e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj, s.a aVar) {
        this.f7037e.a(obj, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj, s.a aVar) {
        this.f7037e.a(obj, aVar);
    }

    public void d(Activity activity, Executor executor, final ListenerTypeT listenertypet) {
        boolean z10;
        x6.g gVar;
        c4.s.j(listenertypet);
        synchronized (this.f7035c.J()) {
            boolean z11 = true;
            z10 = (this.f7035c.B() & this.f7036d) != 0;
            this.f7033a.add(listenertypet);
            gVar = new x6.g(executor);
            this.f7034b.put(listenertypet, gVar);
            if (activity != null) {
                if (activity.isDestroyed()) {
                    z11 = false;
                }
                c4.s.b(z11, "Activity is already destroyed!");
                x6.a.a().c(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.this.e(listenertypet);
                    }
                });
            }
        }
        if (z10) {
            final ResultT g02 = this.f7035c.g0();
            gVar.a(new Runnable() { // from class: com.google.firebase.storage.x
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.f(listenertypet, g02);
                }
            });
        }
    }

    public void h() {
        if ((this.f7035c.B() & this.f7036d) != 0) {
            final ResultT g02 = this.f7035c.g0();
            for (final ListenerTypeT listenertypet : this.f7033a) {
                x6.g gVar = this.f7034b.get(listenertypet);
                if (gVar != null) {
                    gVar.a(new Runnable() { // from class: com.google.firebase.storage.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.g(listenertypet, g02);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: i */
    public void e(ListenerTypeT listenertypet) {
        c4.s.j(listenertypet);
        synchronized (this.f7035c.J()) {
            this.f7034b.remove(listenertypet);
            this.f7033a.remove(listenertypet);
            x6.a.a().b(listenertypet);
        }
    }
}
