package j6;

import android.app.Activity;
import android.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<Runnable> f12155a;

        private b() {
            this.f12155a = new ArrayList();
        }

        synchronized void a(Runnable runnable) {
            this.f12155a.add(runnable);
        }

        void b() {
            for (Runnable runnable : this.f12155a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Fragment {

        /* renamed from: j  reason: collision with root package name */
        b f12156j = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f12156j) {
                bVar = this.f12156j;
                this.f12156j = new b();
            }
            bVar.b();
        }
    }

    /* renamed from: j6.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0180d extends androidx.fragment.app.Fragment {

        /* renamed from: j0  reason: collision with root package name */
        b f12157j0 = new b();

        @Override // androidx.fragment.app.Fragment
        public void L0() {
            b bVar;
            super.L0();
            synchronized (this.f12157j0) {
                bVar = this.f12157j0;
                this.f12157j0 = new b();
            }
            bVar.b();
        }
    }

    public static com.google.firebase.firestore.f0 c(Activity activity, final com.google.firebase.firestore.f0 f0Var) {
        if (activity != null) {
            if (activity instanceof androidx.fragment.app.e) {
                Objects.requireNonNull(f0Var);
                h((androidx.fragment.app.e) activity, new Runnable() { // from class: j6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.firestore.f0.this.remove();
                    }
                });
            } else {
                Objects.requireNonNull(f0Var);
                g(activity, new Runnable() { // from class: j6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.firestore.f0.this.remove();
                    }
                });
            }
        }
        return f0Var;
    }

    private static <T> T d(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity, Runnable runnable) {
        c cVar = (c) d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f12156j.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(androidx.fragment.app.e eVar, Runnable runnable) {
        C0180d c0180d = (C0180d) d(C0180d.class, eVar.F().j0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (c0180d == null || c0180d.c0()) {
            c0180d = new C0180d();
            eVar.F().m().d(c0180d, "FirestoreOnStopObserverSupportFragment").g();
            eVar.F().f0();
        }
        c0180d.f12157j0.a(runnable);
    }

    private static void g(final Activity activity, final Runnable runnable) {
        q6.b.d(!(activity instanceof androidx.fragment.app.e), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: j6.a
            @Override // java.lang.Runnable
            public final void run() {
                d.e(activity, runnable);
            }
        });
    }

    private static void h(final androidx.fragment.app.e eVar, final Runnable runnable) {
        eVar.runOnUiThread(new Runnable() { // from class: j6.b
            @Override // java.lang.Runnable
            public final void run() {
                d.f(androidx.fragment.app.e.this, runnable);
            }
        });
    }
}
