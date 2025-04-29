package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.e> A;
    private androidx.activity.result.c<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<p> L;
    private q M;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2298b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f2300d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f2301e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f2303g;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<m> f2308l;

    /* renamed from: r  reason: collision with root package name */
    private androidx.fragment.app.k<?> f2314r;

    /* renamed from: s  reason: collision with root package name */
    private androidx.fragment.app.g f2315s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f2316t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f2317u;

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.c<Intent> f2322z;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<InterfaceC0037n> f2297a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final v f2299c = new v();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.l f2302f = new androidx.fragment.app.l(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.j f2304h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f2305i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Bundle> f2306j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f2307k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.e>> f2309m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x.g f2310n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final androidx.fragment.app.m f2311o = new androidx.fragment.app.m(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f2312p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f2313q = -1;

    /* renamed from: v  reason: collision with root package name */
    private androidx.fragment.app.j f2318v = null;

    /* renamed from: w  reason: collision with root package name */
    private androidx.fragment.app.j f2319w = new e();

    /* renamed from: x  reason: collision with root package name */
    private d0 f2320x = null;

    /* renamed from: y  reason: collision with root package name */
    private d0 f2321y = new f();
    ArrayDeque<l> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2337j;
            int i10 = pollFirst.f2338k;
            Fragment i11 = n.this.f2299c.i(str);
            if (i11 != null) {
                i11.i0(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f2337j;
                int i11 = pollFirst.f2338k;
                Fragment i12 = n.this.f2299c.i(str);
                if (i12 != null) {
                    i12.H0(i11, strArr, iArr);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Permission request result delivered for unknown Fragment ");
                sb.append(str);
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.activity.j {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.j
        public void b() {
            n.this.C0();
        }
    }

    /* loaded from: classes.dex */
    class d implements x.g {
        d() {
        }

        @Override // androidx.fragment.app.x.g
        public void a(Fragment fragment, androidx.core.os.e eVar) {
            if (eVar.b()) {
                return;
            }
            n.this.Y0(fragment, eVar);
        }

        @Override // androidx.fragment.app.x.g
        public void b(Fragment fragment, androidx.core.os.e eVar) {
            n.this.f(fragment, eVar);
        }
    }

    /* loaded from: classes.dex */
    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.u0().c(n.this.u0().g(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class f implements d0 {
        f() {
        }

        @Override // androidx.fragment.app.d0
        public c0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.b0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f2332c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2330a = viewGroup;
            this.f2331b = view;
            this.f2332c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2330a.endViewTransition(this.f2331b);
            animator.removeListener(this);
            Fragment fragment = this.f2332c;
            View view = fragment.Q;
            if (view == null || !fragment.I) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements r {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Fragment f2334j;

        i(Fragment fragment) {
            this.f2334j = fragment;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            this.f2334j.l0(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f2337j;
            int i10 = pollFirst.f2338k;
            Fragment i11 = n.this.f2299c.i(str);
            if (i11 != null) {
                i11.i0(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends e.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        @Override // e.a
        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = eVar.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.a(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        String f2337j;

        /* renamed from: k  reason: collision with root package name */
        int f2338k;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(Parcel parcel) {
            this.f2337j = parcel.readString();
            this.f2338k = parcel.readInt();
        }

        l(String str, int i10) {
            this.f2337j = str;
            this.f2338k = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2337j);
            parcel.writeInt(this.f2338k);
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class o implements InterfaceC0037n {

        /* renamed from: a  reason: collision with root package name */
        final String f2339a;

        /* renamed from: b  reason: collision with root package name */
        final int f2340b;

        /* renamed from: c  reason: collision with root package name */
        final int f2341c;

        o(String str, int i10, int i11) {
            this.f2339a = str;
            this.f2340b = i10;
            this.f2341c = i11;
        }

        @Override // androidx.fragment.app.n.InterfaceC0037n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f2317u;
            if (fragment == null || this.f2340b >= 0 || this.f2339a != null || !fragment.t().U0()) {
                return n.this.W0(arrayList, arrayList2, this.f2339a, this.f2340b, this.f2341c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p implements Fragment.k {

        /* renamed from: a  reason: collision with root package name */
        final boolean f2343a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.fragment.app.a f2344b;

        /* renamed from: c  reason: collision with root package name */
        private int f2345c;

        p(androidx.fragment.app.a aVar, boolean z10) {
            this.f2343a = z10;
            this.f2344b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            int i10 = this.f2345c - 1;
            this.f2345c = i10;
            if (i10 != 0) {
                return;
            }
            this.f2344b.f2149t.g1();
        }

        @Override // androidx.fragment.app.Fragment.k
        public void b() {
            this.f2345c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.f2344b;
            aVar.f2149t.u(aVar, this.f2343a, false, false);
        }

        void d() {
            boolean z10 = this.f2345c > 0;
            for (Fragment fragment : this.f2344b.f2149t.t0()) {
                fragment.C1(null);
                if (z10 && fragment.b0()) {
                    fragment.H1();
                }
            }
            androidx.fragment.app.a aVar = this.f2344b;
            aVar.f2149t.u(aVar, this.f2343a, !z10, true);
        }

        public boolean e() {
            return this.f2345c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment A0(View view) {
        Object tag = view.getTag(a0.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.M && fragment.N) || fragment.D.o();
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.f2099o))) {
            return;
        }
        fragment.g1();
    }

    private void M0(s.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment r10 = bVar.r(i10);
            if (!r10.f2105u) {
                View r12 = r10.r1();
                r10.X = r12.getAlpha();
                r12.setAlpha(0.0f);
            }
        }
    }

    private void T(int i10) {
        try {
            this.f2298b = true;
            this.f2299c.d(i10);
            O0(i10, false);
            if (P) {
                for (c0 c0Var : s()) {
                    c0Var.j();
                }
            }
            this.f2298b = false;
            b0(true);
        } catch (Throwable th) {
            this.f2298b = false;
            throw th;
        }
    }

    private boolean V0(String str, int i10, int i11) {
        b0(false);
        a0(true);
        Fragment fragment = this.f2317u;
        if (fragment == null || i10 >= 0 || str != null || !fragment.t().U0()) {
            boolean W0 = W0(this.I, this.J, str, i10, i11);
            if (W0) {
                this.f2298b = true;
                try {
                    a1(this.I, this.J);
                } finally {
                    q();
                }
            }
            n1();
            W();
            this.f2299c.b();
            return W0;
        }
        return true;
    }

    private void W() {
        if (this.H) {
            this.H = false;
            m1();
        }
    }

    private int X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, s.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                p pVar = new p(aVar, booleanValue);
                this.L.add(pVar);
                aVar.z(pVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void Y() {
        if (P) {
            for (c0 c0Var : s()) {
                c0Var.j();
            }
        } else if (!this.f2309m.isEmpty()) {
            for (Fragment fragment : this.f2309m.keySet()) {
                n(fragment);
                P0(fragment);
            }
        }
    }

    private void a0(boolean z10) {
        if (this.f2298b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2314r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f2314r.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z10) {
                p();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f2298b = true;
            try {
                g0(null, null);
            } finally {
                this.f2298b = false;
            }
        }
    }

    private void a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        g0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2403r) {
                if (i11 != i10) {
                    e0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2403r) {
                        i11++;
                    }
                }
                e0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            e0(arrayList, arrayList2, i11, size);
        }
    }

    private void c1() {
        if (this.f2308l != null) {
            for (int i10 = 0; i10 < this.f2308l.size(); i10++) {
                this.f2308l.get(i10).a();
            }
        }
    }

    private void d(s.b<Fragment> bVar) {
        int i10 = this.f2313q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment.f2094j < min) {
                Q0(fragment, min);
                if (fragment.Q != null && !fragment.I && fragment.V) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.m(-1);
                aVar.r(i10 == i11 + (-1));
            } else {
                aVar.m(1);
                aVar.q();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e1(int i10) {
        if (i10 != 4097) {
            if (i10 != 4099) {
                return i10 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    private void g0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<p> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.L.get(i10);
            if (arrayList == null || pVar.f2343a || (indexOf2 = arrayList.indexOf(pVar.f2344b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (pVar.e() || (arrayList != null && pVar.f2344b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || pVar.f2343a || (indexOf = arrayList.indexOf(pVar.f2344b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        pVar.d();
                    }
                }
                i10++;
            } else {
                this.L.remove(i10);
                i10--;
                size--;
            }
            pVar.c();
            i10++;
        }
    }

    private void k1(Fragment fragment) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || fragment.D() <= 0) {
            return;
        }
        int i10 = a0.b.visible_removing_fragment_view_tag;
        if (q02.getTag(i10) == null) {
            q02.setTag(i10, fragment);
        }
        ((Fragment) q02.getTag(i10)).A1(fragment.D());
    }

    private void l0() {
        if (P) {
            for (c0 c0Var : s()) {
                c0Var.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2297a) {
            if (this.f2297a.isEmpty()) {
                return false;
            }
            int size = this.f2297a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f2297a.get(i10).a(arrayList, arrayList2);
            }
            this.f2297a.clear();
            this.f2314r.h().removeCallbacks(this.N);
            return z10;
        }
    }

    private void m1() {
        for (u uVar : this.f2299c.k()) {
            S0(uVar);
        }
    }

    private void n(Fragment fragment) {
        HashSet<androidx.core.os.e> hashSet = this.f2309m.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.e> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            x(fragment);
            this.f2309m.remove(fragment);
        }
    }

    private void n1() {
        synchronized (this.f2297a) {
            boolean z10 = true;
            if (this.f2297a.isEmpty()) {
                this.f2304h.f((n0() <= 0 || !I0(this.f2316t)) ? false : false);
            } else {
                this.f2304h.f(true);
            }
        }
    }

    private q o0(Fragment fragment) {
        return this.M.h(fragment);
    }

    private void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q() {
        this.f2298b = false;
        this.J.clear();
        this.I.clear();
    }

    private ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.G > 0 && this.f2315s.e()) {
            View d10 = this.f2315s.d(fragment.G);
            if (d10 instanceof ViewGroup) {
                return (ViewGroup) d10;
            }
        }
        return null;
    }

    private Set<c0> s() {
        HashSet hashSet = new HashSet();
        for (u uVar : this.f2299c.k()) {
            ViewGroup viewGroup = uVar.k().P;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, z0()));
            }
        }
        return hashSet;
    }

    private Set<c0> t(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<w.a> it = arrayList.get(i10).f2388c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2406b;
                if (fragment != null && (viewGroup = fragment.P) != null) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.Q != null) {
            f.d b10 = androidx.fragment.app.f.b(this.f2314r.g(), fragment, !fragment.I);
            if (b10 == null || (animator = b10.f2277b) == null) {
                if (b10 != null) {
                    fragment.Q.startAnimation(b10.f2276a);
                    b10.f2276a.start();
                }
                fragment.Q.setVisibility((!fragment.I || fragment.Y()) ? 0 : 8);
                if (fragment.Y()) {
                    fragment.z1(false);
                }
            } else {
                animator.setTarget(fragment.Q);
                if (!fragment.I) {
                    fragment.Q.setVisibility(0);
                } else if (fragment.Y()) {
                    fragment.z1(false);
                } else {
                    ViewGroup viewGroup = fragment.P;
                    View view = fragment.Q;
                    viewGroup.startViewTransition(view);
                    b10.f2277b.addListener(new h(viewGroup, view, fragment));
                }
                b10.f2277b.start();
            }
        }
        if (fragment.f2105u && G0(fragment)) {
            this.D = true;
        }
        fragment.W = false;
        fragment.x0(fragment.I);
    }

    private void x(Fragment fragment) {
        fragment.W0();
        this.f2311o.n(fragment, false);
        fragment.P = null;
        fragment.Q = null;
        fragment.f2088c0 = null;
        fragment.f2089d0.n(null);
        fragment.f2108x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Configuration configuration) {
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.Q0(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.a0 B0(Fragment fragment) {
        return this.M.k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f2313q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null && fragment.R0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void C0() {
        b0(true);
        if (this.f2304h.c()) {
            U0();
        } else {
            this.f2303g.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.I) {
            return;
        }
        fragment.I = true;
        fragment.W = true ^ fragment.W;
        k1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f2313q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null && H0(fragment) && fragment.T0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f2301e != null) {
            for (int i10 = 0; i10 < this.f2301e.size(); i10++) {
                Fragment fragment2 = this.f2301e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.t0();
                }
            }
        }
        this.f2301e = arrayList;
        return z10;
    }

    public boolean E0() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.f2314r = null;
        this.f2315s = null;
        this.f2316t = null;
        if (this.f2303g != null) {
            this.f2304h.d();
            this.f2303g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f2322z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.Z0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z10) {
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.a1(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.B;
        return fragment.equals(nVar.y0()) && I0(nVar.f2316t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<r> it = this.f2312p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J0(int i10) {
        return this.f2313q >= i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K(MenuItem menuItem) {
        if (this.f2313q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null && fragment.b1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.E || this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Menu menu) {
        if (this.f2313q < 1) {
            return;
        }
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.c1(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f2322z == null) {
            this.f2314r.o(fragment, intent, i10, bundle);
            return;
        }
        this.C.addLast(new l(fragment.f2099o, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f2322z.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(Fragment fragment) {
        if (!this.f2299c.c(fragment.f2099o)) {
            if (F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2313q + "since it is not added to " + this);
                return;
            }
            return;
        }
        P0(fragment);
        View view = fragment.Q;
        if (view != null && fragment.V && fragment.P != null) {
            float f10 = fragment.X;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.X = 0.0f;
            fragment.V = false;
            f.d b10 = androidx.fragment.app.f.b(this.f2314r.g(), fragment, true);
            if (b10 != null) {
                Animation animation = b10.f2276a;
                if (animation != null) {
                    fragment.Q.startAnimation(animation);
                } else {
                    b10.f2277b.setTarget(fragment.Q);
                    b10.f2277b.start();
                }
            }
        }
        if (fragment.W) {
            v(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(boolean z10) {
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.e1(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(int i10, boolean z10) {
        androidx.fragment.app.k<?> kVar;
        if (this.f2314r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2313q) {
            this.f2313q = i10;
            if (P) {
                this.f2299c.r();
            } else {
                for (Fragment fragment : this.f2299c.n()) {
                    N0(fragment);
                }
                for (u uVar : this.f2299c.k()) {
                    Fragment k10 = uVar.k();
                    if (!k10.V) {
                        N0(k10);
                    }
                    if (k10.f2106v && !k10.Z()) {
                        this.f2299c.q(uVar);
                    }
                }
            }
            m1();
            if (this.D && (kVar = this.f2314r) != null && this.f2313q == 7) {
                kVar.q();
                this.D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f2313q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null && H0(fragment) && fragment.f1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        Q0(fragment, this.f2313q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        n1();
        M(this.f2317u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void Q0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.Q0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0() {
        if (this.f2314r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.n(false);
        for (Fragment fragment : this.f2299c.n()) {
            if (fragment != null) {
                fragment.g0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(5);
    }

    void S0(u uVar) {
        Fragment k10 = uVar.k();
        if (k10.R) {
            if (this.f2298b) {
                this.H = true;
                return;
            }
            k10.R = false;
            if (P) {
                uVar.m();
            } else {
                P0(k10);
            }
        }
    }

    public void T0(int i10, int i11) {
        if (i10 >= 0) {
            Z(new o(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.F = true;
        this.M.n(true);
        T(4);
    }

    public boolean U0() {
        return V0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        T(2);
    }

    boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2300d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2300d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f2300d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i10 >= 0 && i10 == aVar.f2151v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f2300d.get(size2);
                        if (str == null || !str.equals(aVar2.t())) {
                            if (i10 < 0 || i10 != aVar2.f2151v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f2300d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2300d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2300d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2299c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2301e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2301e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f2300d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f2300d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2305i.get());
        synchronized (this.f2297a) {
            int size3 = this.f2297a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f2297a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2314r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2315s);
        if (this.f2316t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2316t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2313q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    void Y0(Fragment fragment, androidx.core.os.e eVar) {
        HashSet<androidx.core.os.e> hashSet = this.f2309m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f2309m.remove(fragment);
            if (fragment.f2094j < 5) {
                x(fragment);
                P0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(InterfaceC0037n interfaceC0037n, boolean z10) {
        if (!z10) {
            if (this.f2314r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f2297a) {
            if (this.f2314r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f2297a.add(interfaceC0037n);
            g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.A);
        }
        boolean z10 = !fragment.Z();
        if (!fragment.J || z10) {
            this.f2299c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.f2106v = true;
            k1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (m0(this.I, this.J)) {
            this.f2298b = true;
            try {
                a1(this.I, this.J);
                q();
                z11 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        n1();
        W();
        this.f2299c.b();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(Fragment fragment) {
        this.M.m(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(InterfaceC0037n interfaceC0037n, boolean z10) {
        if (z10 && (this.f2314r == null || this.G)) {
            return;
        }
        a0(z10);
        if (interfaceC0037n.a(this.I, this.J)) {
            this.f2298b = true;
            try {
                a1(this.I, this.J);
            } finally {
                q();
            }
        }
        n1();
        W();
        this.f2299c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1(Parcelable parcelable) {
        u uVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f2346j == null) {
            return;
        }
        this.f2299c.t();
        Iterator<t> it = pVar.f2346j.iterator();
        while (it.hasNext()) {
            t next = it.next();
            if (next != null) {
                Fragment g10 = this.M.g(next.f2363k);
                if (g10 != null) {
                    if (F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g10);
                    }
                    uVar = new u(this.f2311o, this.f2299c, g10, next);
                } else {
                    uVar = new u(this.f2311o, this.f2299c, this.f2314r.g().getClassLoader(), r0(), next);
                }
                Fragment k10 = uVar.k();
                k10.B = this;
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.f2099o + "): " + k10);
                }
                uVar.o(this.f2314r.g().getClassLoader());
                this.f2299c.p(uVar);
                uVar.t(this.f2313q);
            }
        }
        for (Fragment fragment : this.M.j()) {
            if (!this.f2299c.c(fragment.f2099o)) {
                if (F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f2346j);
                }
                this.M.m(fragment);
                fragment.B = this;
                u uVar2 = new u(this.f2311o, this.f2299c, fragment);
                uVar2.t(1);
                uVar2.m();
                fragment.f2106v = true;
                uVar2.m();
            }
        }
        this.f2299c.u(pVar.f2347k);
        if (pVar.f2348l != null) {
            this.f2300d = new ArrayList<>(pVar.f2348l.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f2348l;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a10 = bVarArr[i10].a(this);
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a10.f2151v + "): " + a10);
                    PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                    a10.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2300d.add(a10);
                i10++;
            }
        } else {
            this.f2300d = null;
        }
        this.f2305i.set(pVar.f2349m);
        String str = pVar.f2350n;
        if (str != null) {
            Fragment h02 = h0(str);
            this.f2317u = h02;
            M(h02);
        }
        ArrayList<String> arrayList = pVar.f2351o;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f2306j.put(arrayList.get(i11), pVar.f2352p.get(i11));
            }
        }
        this.C = new ArrayDeque<>(pVar.f2353q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(androidx.fragment.app.a aVar) {
        if (this.f2300d == null) {
            this.f2300d = new ArrayList<>();
        }
        this.f2300d.add(aVar);
    }

    void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f2309m.get(fragment) == null) {
            this.f2309m.put(fragment, new HashSet<>());
        }
        this.f2309m.get(fragment).add(eVar);
    }

    public boolean f0() {
        boolean b02 = b0(true);
        l0();
        return b02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable f1() {
        int size;
        l0();
        Y();
        b0(true);
        this.E = true;
        this.M.n(true);
        ArrayList<t> v10 = this.f2299c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (v10.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w10 = this.f2299c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f2300d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new androidx.fragment.app.b(this.f2300d.get(i10));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2300d.get(i10));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f2346j = v10;
        pVar.f2347k = w10;
        pVar.f2348l = bVarArr;
        pVar.f2349m = this.f2305i.get();
        Fragment fragment = this.f2317u;
        if (fragment != null) {
            pVar.f2350n = fragment.f2099o;
        }
        pVar.f2351o.addAll(this.f2306j.keySet());
        pVar.f2352p.addAll(this.f2306j.values());
        pVar.f2353q = new ArrayList<>(this.C);
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u w10 = w(fragment);
        fragment.B = this;
        this.f2299c.p(w10);
        if (fragment.J) {
            return;
        }
        this.f2299c.a(fragment);
        fragment.f2106v = false;
        if (fragment.Q == null) {
            fragment.W = false;
        }
        if (G0(fragment)) {
            this.D = true;
        }
    }

    void g1() {
        synchronized (this.f2297a) {
            ArrayList<p> arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f2297a.size() == 1;
            if (z10 || z11) {
                this.f2314r.h().removeCallbacks(this.N);
                this.f2314r.h().post(this.N);
                n1();
            }
        }
    }

    public void h(r rVar) {
        this.f2312p.add(rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h0(String str) {
        return this.f2299c.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(Fragment fragment, boolean z10) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || !(q02 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) q02).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        this.M.e(fragment);
    }

    public Fragment i0(int i10) {
        return this.f2299c.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(Fragment fragment, e.b bVar) {
        if (fragment.equals(h0(fragment.f2099o)) && (fragment.C == null || fragment.B == this)) {
            fragment.f2086a0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f2305i.getAndIncrement();
    }

    public Fragment j0(String str) {
        return this.f2299c.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.f2099o)) && (fragment.C == null || fragment.B == this))) {
            Fragment fragment2 = this.f2317u;
            this.f2317u = fragment;
            M(fragment2);
            M(this.f2317u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k0(String str) {
        return this.f2299c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.J) {
            fragment.J = false;
            if (fragment.f2105u) {
                return;
            }
            this.f2299c.a(fragment);
            if (F0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.I) {
            fragment.I = false;
            fragment.W = !fragment.W;
        }
    }

    public w m() {
        return new androidx.fragment.app.a(this);
    }

    public int n0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2300d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    boolean o() {
        boolean z10 = false;
        for (Fragment fragment : this.f2299c.l()) {
            if (fragment != null) {
                z10 = G0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.g p0() {
        return this.f2315s;
    }

    public final void r(String str) {
        this.f2306j.remove(str);
    }

    public androidx.fragment.app.j r0() {
        androidx.fragment.app.j jVar = this.f2318v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2316t;
        return fragment != null ? fragment.B.r0() : this.f2319w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v s0() {
        return this.f2299c;
    }

    public List<Fragment> t0() {
        return this.f2299c.n();
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2316t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2316t;
        } else {
            androidx.fragment.app.k<?> kVar = this.f2314r;
            if (kVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(kVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2314r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    void u(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.r(z12);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2313q >= 1) {
            x.B(this.f2314r.g(), this.f2315s, arrayList, arrayList2, 0, 1, true, this.f2310n);
        }
        if (z12) {
            O0(this.f2313q, true);
        }
        for (Fragment fragment : this.f2299c.l()) {
            if (fragment != null && fragment.Q != null && fragment.V && aVar.u(fragment.G)) {
                float f10 = fragment.X;
                if (f10 > 0.0f) {
                    fragment.Q.setAlpha(f10);
                }
                if (z12) {
                    fragment.X = 0.0f;
                } else {
                    fragment.X = -1.0f;
                    fragment.V = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.k<?> u0() {
        return this.f2314r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 v0() {
        return this.f2302f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u w(Fragment fragment) {
        u m10 = this.f2299c.m(fragment.f2099o);
        if (m10 != null) {
            return m10;
        }
        u uVar = new u(this.f2311o, this.f2299c, fragment);
        uVar.o(this.f2314r.g().getClassLoader());
        uVar.t(this.f2313q);
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.m w0() {
        return this.f2311o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment x0() {
        return this.f2316t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.J) {
            return;
        }
        fragment.J = true;
        if (fragment.f2105u) {
            if (F0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2299c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            k1(fragment);
        }
    }

    public Fragment y0() {
        return this.f2317u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0 z0() {
        d0 d0Var = this.f2320x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f2316t;
        return fragment != null ? fragment.B.z0() : this.f2321y;
    }
}
