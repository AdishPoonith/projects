package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends androidx.lifecycle.w {

    /* renamed from: k  reason: collision with root package name */
    private static final x.b f2354k = new a();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2358g;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f2355d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, q> f2356e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.a0> f2357f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f2359h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2360i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2361j = false;

    /* loaded from: classes.dex */
    class a implements x.b {
        a() {
        }

        @Override // androidx.lifecycle.x.b
        public <T extends androidx.lifecycle.w> T a(Class<T> cls) {
            return new q(true);
        }

        @Override // androidx.lifecycle.x.b
        public /* synthetic */ androidx.lifecycle.w b(Class cls, c0.a aVar) {
            return androidx.lifecycle.y.b(this, cls, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(boolean z10) {
        this.f2358g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q i(androidx.lifecycle.a0 a0Var) {
        return (q) new androidx.lifecycle.x(a0Var, f2354k).a(q.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.w
    public void d() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2359h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (this.f2361j) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2355d.containsKey(fragment.f2099o)) {
        } else {
            this.f2355d.put(fragment.f2099o, fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2355d.equals(qVar.f2355d) && this.f2356e.equals(qVar.f2356e) && this.f2357f.equals(qVar.f2357f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f2356e.get(fragment.f2099o);
        if (qVar != null) {
            qVar.d();
            this.f2356e.remove(fragment.f2099o);
        }
        androidx.lifecycle.a0 a0Var = this.f2357f.get(fragment.f2099o);
        if (a0Var != null) {
            a0Var.a();
            this.f2357f.remove(fragment.f2099o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(String str) {
        return this.f2355d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q h(Fragment fragment) {
        q qVar = this.f2356e.get(fragment.f2099o);
        if (qVar == null) {
            q qVar2 = new q(this.f2358g);
            this.f2356e.put(fragment.f2099o, qVar2);
            return qVar2;
        }
        return qVar;
    }

    public int hashCode() {
        return (((this.f2355d.hashCode() * 31) + this.f2356e.hashCode()) * 31) + this.f2357f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> j() {
        return new ArrayList(this.f2355d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.a0 k(Fragment fragment) {
        androidx.lifecycle.a0 a0Var = this.f2357f.get(fragment.f2099o);
        if (a0Var == null) {
            androidx.lifecycle.a0 a0Var2 = new androidx.lifecycle.a0();
            this.f2357f.put(fragment.f2099o, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f2359h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        if (this.f2361j) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2355d.remove(fragment.f2099o) != null) && n.F0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z10) {
        this.f2361j = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        if (this.f2355d.containsKey(fragment.f2099o)) {
            return this.f2358g ? this.f2359h : !this.f2360i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2355d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2356e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2357f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
