package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i8.a;
import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w5.n;
/* loaded from: classes.dex */
public class i implements i8.a, l.d, l.c {

    /* renamed from: j  reason: collision with root package name */
    private Context f10542j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10543k = false;

    private <T> void A(TaskCompletionSource<T> taskCompletionSource, final l.h<T> hVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.core.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                i.w(l.h.this, task);
            }
        });
    }

    private Task<l.g> q(final w5.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e
            @Override // java.lang.Runnable
            public final void run() {
                i.this.t(fVar, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private l.f r(w5.n nVar) {
        l.f.a aVar = new l.f.a();
        aVar.b(nVar.b());
        aVar.c(nVar.c());
        if (nVar.f() != null) {
            aVar.e(nVar.f());
        }
        if (nVar.g() != null) {
            aVar.f(nVar.g());
        }
        aVar.d(nVar.d());
        aVar.g(nVar.h());
        aVar.h(nVar.e());
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                w5.f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(w5.f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            l.g.a aVar = new l.g.a();
            aVar.c(fVar.q());
            aVar.d(r(fVar.r()));
            aVar.b(Boolean.valueOf(fVar.x()));
            aVar.e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            taskCompletionSource.setResult(aVar.a());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(l.f fVar, String str, TaskCompletionSource taskCompletionSource) {
        try {
            w5.n a10 = new n.b().b(fVar.b()).c(fVar.c()).d(fVar.d()).f(fVar.e()).g(fVar.f()).h(fVar.g()).e(fVar.h()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            taskCompletionSource.setResult((l.g) Tasks.await(q(w5.f.w(this.f10542j, a10, str))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f10543k) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f10543k = true;
            }
            List<w5.f> n10 = w5.f.n(this.f10542j);
            ArrayList arrayList = new ArrayList(n10.size());
            for (w5.f fVar : n10) {
                arrayList.add((l.g) Tasks.await(q(fVar)));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(l.h hVar, Task task) {
        if (task.isSuccessful()) {
            hVar.a(task.getResult());
        } else {
            hVar.b(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(TaskCompletionSource taskCompletionSource) {
        try {
            w5.n a10 = w5.n.a(this.f10542j);
            if (a10 == null) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setResult(r(a10));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            w5.f.p(str).F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            w5.f.p(str).E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void a(final String str, final l.f fVar, l.h<l.g> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                i.this.u(fVar, str, taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void b(l.h<List<l.g>> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                i.this.v(taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.d
    public void c(l.h<l.f> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                i.this.x(taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f10542j = null;
        t.e(bVar.b(), null);
        p.e(bVar.b(), null);
    }

    @Override // io.flutter.plugins.firebase.core.l.c
    public void e(final String str, final Boolean bool, l.h<Void> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g
            @Override // java.lang.Runnable
            public final void run() {
                i.y(str, bool, taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.c
    public void f(final String str, final Boolean bool, l.h<Void> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h
            @Override // java.lang.Runnable
            public final void run() {
                i.z(str, bool, taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // io.flutter.plugins.firebase.core.l.c
    public void g(final String str, l.h<Void> hVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                i.s(str, taskCompletionSource);
            }
        });
        A(taskCompletionSource, hVar);
    }

    @Override // i8.a
    public void m(a.b bVar) {
        t.e(bVar.b(), this);
        p.e(bVar.b(), this);
        this.f10542j = bVar.a();
    }
}
