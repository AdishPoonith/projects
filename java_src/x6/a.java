package x6;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final a f20232c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, C0287a> f20233a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f20234b = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0287a {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f20235a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f20236b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f20237c;

        public C0287a(Activity activity, Runnable runnable, Object obj) {
            this.f20235a = activity;
            this.f20236b = runnable;
            this.f20237c = obj;
        }

        public Activity a() {
            return this.f20235a;
        }

        public Object b() {
            return this.f20237c;
        }

        public Runnable c() {
            return this.f20236b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0287a) {
                C0287a c0287a = (C0287a) obj;
                return c0287a.f20237c.equals(this.f20237c) && c0287a.f20236b == this.f20236b && c0287a.f20235a == this.f20235a;
            }
            return false;
        }

        public int hashCode() {
            return this.f20237c.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends LifecycleCallback {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0287a> f20238a;

        private b(com.google.android.gms.common.api.internal.i iVar) {
            super(iVar);
            this.f20238a = new ArrayList();
            this.mLifecycleFragment.b("StorageOnStopCallback", this);
        }

        public static b b(Activity activity) {
            com.google.android.gms.common.api.internal.i fragment = LifecycleCallback.getFragment(new com.google.android.gms.common.api.internal.h(activity));
            b bVar = (b) fragment.c("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        public void a(C0287a c0287a) {
            synchronized (this.f20238a) {
                this.f20238a.add(c0287a);
            }
        }

        public void c(C0287a c0287a) {
            synchronized (this.f20238a) {
                this.f20238a.remove(c0287a);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f20238a) {
                arrayList = new ArrayList(this.f20238a);
                this.f20238a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0287a c0287a = (C0287a) it.next();
                if (c0287a != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    c0287a.c().run();
                    a.a().b(c0287a.b());
                }
            }
        }
    }

    private a() {
    }

    public static a a() {
        return f20232c;
    }

    public void b(Object obj) {
        synchronized (this.f20234b) {
            C0287a c0287a = this.f20233a.get(obj);
            if (c0287a != null) {
                b.b(c0287a.a()).c(c0287a);
            }
        }
    }

    public void c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f20234b) {
            C0287a c0287a = new C0287a(activity, runnable, obj);
            b.b(activity).a(c0287a);
            this.f20233a.put(obj, c0287a);
        }
    }
}
