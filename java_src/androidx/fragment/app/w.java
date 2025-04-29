package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final j f2386a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f2387b;

    /* renamed from: d  reason: collision with root package name */
    int f2389d;

    /* renamed from: e  reason: collision with root package name */
    int f2390e;

    /* renamed from: f  reason: collision with root package name */
    int f2391f;

    /* renamed from: g  reason: collision with root package name */
    int f2392g;

    /* renamed from: h  reason: collision with root package name */
    int f2393h;

    /* renamed from: i  reason: collision with root package name */
    boolean f2394i;

    /* renamed from: k  reason: collision with root package name */
    String f2396k;

    /* renamed from: l  reason: collision with root package name */
    int f2397l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f2398m;

    /* renamed from: n  reason: collision with root package name */
    int f2399n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f2400o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f2401p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f2402q;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f2404s;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f2388c = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    boolean f2395j = true;

    /* renamed from: r  reason: collision with root package name */
    boolean f2403r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f2405a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f2406b;

        /* renamed from: c  reason: collision with root package name */
        int f2407c;

        /* renamed from: d  reason: collision with root package name */
        int f2408d;

        /* renamed from: e  reason: collision with root package name */
        int f2409e;

        /* renamed from: f  reason: collision with root package name */
        int f2410f;

        /* renamed from: g  reason: collision with root package name */
        e.b f2411g;

        /* renamed from: h  reason: collision with root package name */
        e.b f2412h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f2405a = i10;
            this.f2406b = fragment;
            e.b bVar = e.b.RESUMED;
            this.f2411g = bVar;
            this.f2412h = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(j jVar, ClassLoader classLoader) {
        this.f2386a = jVar;
        this.f2387b = classLoader;
    }

    public w b(int i10, Fragment fragment, String str) {
        j(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.P = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public w d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f2388c.add(aVar);
        aVar.f2407c = this.f2389d;
        aVar.f2408d = this.f2390e;
        aVar.f2409e = this.f2391f;
        aVar.f2410f = this.f2392g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public w i() {
        if (this.f2394i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2395j = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.H;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.H + " now " + str);
            }
            fragment.H = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.F;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.F + " now " + i10);
            }
            fragment.F = i10;
            fragment.G = i10;
        }
        e(new a(i11, fragment));
    }

    public w k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w l(boolean z10) {
        this.f2403r = z10;
        return this;
    }
}
