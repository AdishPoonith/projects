package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f529a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f530b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f531c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f532d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f533e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f534f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f535g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f536h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f542b;

        a(String str, e.a aVar) {
            this.f541a = str;
            this.f542b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f531c.get(this.f541a);
            if (num != null) {
                ActivityResultRegistry.this.f533e.add(this.f541a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f542b, i10, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f533e.remove(this.f541a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f542b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f541a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f545b;

        b(String str, e.a aVar) {
            this.f544a = str;
            this.f545b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f531c.get(this.f544a);
            if (num != null) {
                ActivityResultRegistry.this.f533e.add(this.f544a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f545b, i10, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f533e.remove(this.f544a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f545b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f544a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final androidx.activity.result.b<O> f547a;

        /* renamed from: b  reason: collision with root package name */
        final e.a<?, O> f548b;

        c(androidx.activity.result.b<O> bVar, e.a<?, O> aVar) {
            this.f547a = bVar;
            this.f548b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final androidx.lifecycle.e f549a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<g> f550b = new ArrayList<>();

        d(androidx.lifecycle.e eVar) {
            this.f549a = eVar;
        }

        void a(g gVar) {
            this.f549a.a(gVar);
            this.f550b.add(gVar);
        }

        void b() {
            Iterator<g> it = this.f550b.iterator();
            while (it.hasNext()) {
                this.f549a.c(it.next());
            }
            this.f550b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f530b.put(Integer.valueOf(i10), str);
        this.f531c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f547a == null || !this.f533e.contains(str)) {
            this.f535g.remove(str);
            this.f536h.putParcelable(str, new androidx.activity.result.a(i10, intent));
            return;
        }
        cVar.f547a.a(cVar.f548b.c(i10, intent));
        this.f533e.remove(str);
    }

    private int e() {
        int nextInt = this.f529a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f530b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f529a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f531c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f530b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f534f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, O o10) {
        androidx.activity.result.b<?> bVar;
        String str = this.f530b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f534f.get(str);
        if (cVar == null || (bVar = cVar.f547a) == null) {
            this.f536h.remove(str);
            this.f535g.put(str, o10);
            return true;
        } else if (this.f533e.remove(str)) {
            bVar.a(o10);
            return true;
        } else {
            return true;
        }
    }

    public abstract <I, O> void f(int i10, e.a<I, O> aVar, I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f533e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f529a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f536h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f531c.containsKey(str)) {
                Integer remove = this.f531c.remove(str);
                if (!this.f536h.containsKey(str)) {
                    this.f530b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f531c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f531c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f533e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f536h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f529a);
    }

    public final <I, O> androidx.activity.result.c<I> i(final String str, i iVar, final e.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        androidx.lifecycle.e a10 = iVar.a();
        if (a10.b().g(e.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + iVar + " is attempting to register while current state is " + a10.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f532d.get(str);
        if (dVar == null) {
            dVar = new d(a10);
        }
        dVar.a(new g() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.g
            public void q(i iVar2, e.a aVar2) {
                if (!e.a.ON_START.equals(aVar2)) {
                    if (e.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f534f.remove(str);
                        return;
                    } else if (e.a.ON_DESTROY.equals(aVar2)) {
                        ActivityResultRegistry.this.l(str);
                        return;
                    } else {
                        return;
                    }
                }
                ActivityResultRegistry.this.f534f.put(str, new c<>(bVar, aVar));
                if (ActivityResultRegistry.this.f535g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f535g.get(str);
                    ActivityResultRegistry.this.f535g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f536h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f536h.remove(str);
                    bVar.a(aVar.c(aVar3.b(), aVar3.a()));
                }
            }
        });
        this.f532d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> j(String str, e.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        k(str);
        this.f534f.put(str, new c<>(bVar, aVar));
        if (this.f535g.containsKey(str)) {
            Object obj = this.f535g.get(str);
            this.f535g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f536h.getParcelable(str);
        if (aVar2 != null) {
            this.f536h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f533e.contains(str) && (remove = this.f531c.remove(str)) != null) {
            this.f530b.remove(remove);
        }
        this.f534f.remove(str);
        if (this.f535g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f535g.get(str));
            this.f535g.remove(str);
        }
        if (this.f536h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f536h.getParcelable(str));
            this.f536h.remove(str);
        }
        d dVar = this.f532d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f532d.remove(str);
        }
    }
}
