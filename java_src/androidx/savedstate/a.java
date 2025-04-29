package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import f0.d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f2677g = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private boolean f2679b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f2680c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2681d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f2682e;

    /* renamed from: a  reason: collision with root package name */
    private final n.b<String, c> f2678a = new n.b<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f2683f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0047a {
        void a(d dVar);
    }

    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, i iVar, e.a event) {
        boolean z10;
        l.e(this$0, "this$0");
        l.e(iVar, "<anonymous parameter 0>");
        l.e(event, "event");
        if (event == e.a.ON_START) {
            z10 = true;
        } else if (event != e.a.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        this$0.f2683f = z10;
    }

    public final Bundle b(String key) {
        l.e(key, "key");
        if (this.f2681d) {
            Bundle bundle = this.f2680c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
                Bundle bundle3 = this.f2680c;
                if (bundle3 != null) {
                    bundle3.remove(key);
                }
                Bundle bundle4 = this.f2680c;
                boolean z10 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    this.f2680c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String key) {
        l.e(key, "key");
        Iterator<Map.Entry<String, c>> it = this.f2678a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> components = it.next();
            l.d(components, "components");
            c value = components.getValue();
            if (l.a(components.getKey(), key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(e lifecycle) {
        l.e(lifecycle, "lifecycle");
        if (!(!this.f2679b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new androidx.lifecycle.g() { // from class: f0.b
            @Override // androidx.lifecycle.g
            public final void q(i iVar, e.a aVar) {
                androidx.savedstate.a.d(androidx.savedstate.a.this, iVar, aVar);
            }
        });
        this.f2679b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f2679b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f2681d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f2680c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f2681d = true;
    }

    public final void g(Bundle outBundle) {
        l.e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2680c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        n.b<String, c>.d k10 = this.f2678a.k();
        l.d(k10, "this.components.iteratorWithAdditions()");
        while (k10.hasNext()) {
            Map.Entry next = k10.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        l.e(key, "key");
        l.e(provider, "provider");
        if (!(this.f2678a.p(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends InterfaceC0047a> clazz) {
        l.e(clazz, "clazz");
        if (!this.f2683f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f2682e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f2682e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f2682e;
            if (bVar2 != null) {
                String name = clazz.getName();
                l.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
