package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2413a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final z f2414b = new y();

    /* renamed from: c  reason: collision with root package name */
    static final z f2415c = w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f2416j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f2417k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2418l;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2416j = gVar;
            this.f2417k = fragment;
            this.f2418l = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2416j.a(this.f2417k, this.f2418l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f2419j;

        b(ArrayList arrayList) {
            this.f2419j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f2419j, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f2420j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f2421k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2422l;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2420j = gVar;
            this.f2421k = fragment;
            this.f2422l = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2420j.a(this.f2421k, this.f2422l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f2423j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ z f2424k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ View f2425l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Fragment f2426m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2427n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ArrayList f2428o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ArrayList f2429p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f2430q;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2423j = obj;
            this.f2424k = zVar;
            this.f2425l = view;
            this.f2426m = fragment;
            this.f2427n = arrayList;
            this.f2428o = arrayList2;
            this.f2429p = arrayList3;
            this.f2430q = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2423j;
            if (obj != null) {
                this.f2424k.p(obj, this.f2425l);
                this.f2428o.addAll(x.k(this.f2424k, this.f2423j, this.f2426m, this.f2427n, this.f2425l));
            }
            if (this.f2429p != null) {
                if (this.f2430q != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2425l);
                    this.f2424k.q(this.f2430q, this.f2429p, arrayList);
                }
                this.f2429p.clear();
                this.f2429p.add(this.f2425l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Fragment f2431j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f2432k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f2433l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a f2434m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f2435n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ z f2436o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Rect f2437p;

        e(Fragment fragment, Fragment fragment2, boolean z10, s.a aVar, View view, z zVar, Rect rect) {
            this.f2431j = fragment;
            this.f2432k = fragment2;
            this.f2433l = z10;
            this.f2434m = aVar;
            this.f2435n = view;
            this.f2436o = zVar;
            this.f2437p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f2431j, this.f2432k, this.f2433l, this.f2434m, false);
            View view = this.f2435n;
            if (view != null) {
                this.f2436o.k(view, this.f2437p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ z f2438j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ s.a f2439k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f2440l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f2441m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2442n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ View f2443o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Fragment f2444p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Fragment f2445q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f2446r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ArrayList f2447s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Object f2448t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Rect f2449u;

        f(z zVar, s.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2438j = zVar;
            this.f2439k = aVar;
            this.f2440l = obj;
            this.f2441m = hVar;
            this.f2442n = arrayList;
            this.f2443o = view;
            this.f2444p = fragment;
            this.f2445q = fragment2;
            this.f2446r = z10;
            this.f2447s = arrayList2;
            this.f2448t = obj2;
            this.f2449u = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.a<String, View> h10 = x.h(this.f2438j, this.f2439k, this.f2440l, this.f2441m);
            if (h10 != null) {
                this.f2442n.addAll(h10.values());
                this.f2442n.add(this.f2443o);
            }
            x.f(this.f2444p, this.f2445q, this.f2446r, h10, false);
            Object obj = this.f2440l;
            if (obj != null) {
                this.f2438j.A(obj, this.f2447s, this.f2442n);
                View s10 = x.s(h10, this.f2441m, this.f2448t, this.f2446r);
                if (s10 != null) {
                    this.f2438j.k(s10, this.f2449u);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, androidx.core.os.e eVar);

        void b(Fragment fragment, androidx.core.os.e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f2450a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2451b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f2452c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2453d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2454e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f2455f;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                s.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.e() && (viewGroup = (ViewGroup) gVar.d(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, s.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l10 = aVar.l(size);
            if (collection.contains(androidx.core.view.t.p(l10))) {
                arrayList.add(l10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.f2105u != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        if (r0.I == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.w.a r9, android.util.SparseArray<androidx.fragment.app.x.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f2388c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f2388c.get(i10), sparseArray, false, z10);
        }
    }

    private static s.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        s.a<String, String> aVar = new s.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.u(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2401p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2401p;
                        arrayList4 = aVar2.f2402q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2401p;
                        arrayList3 = aVar2.f2402q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f2149t.p0().e()) {
            for (int size = aVar.f2388c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2388c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Fragment fragment, Fragment fragment2, boolean z10, s.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.w();
        } else {
            fragment.w();
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static s.a<String, View> h(z zVar, s.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2450a;
        View S = fragment.S();
        if (aVar.isEmpty() || obj == null || S == null) {
            aVar.clear();
            return null;
        }
        s.a<String, View> aVar2 = new s.a<>();
        zVar.j(aVar2, S);
        androidx.fragment.app.a aVar3 = hVar.f2452c;
        if (hVar.f2451b) {
            fragment.y();
            arrayList = aVar3.f2401p;
        } else {
            fragment.w();
            arrayList = aVar3.f2402q;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static s.a<String, View> i(z zVar, s.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2453d;
        s.a<String, View> aVar2 = new s.a<>();
        zVar.j(aVar2, fragment.r1());
        androidx.fragment.app.a aVar3 = hVar.f2455f;
        if (hVar.f2454e) {
            fragment.w();
            arrayList = aVar3.f2402q;
        } else {
            fragment.y();
            arrayList = aVar3.f2401p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
        }
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object x10 = fragment.x();
            if (x10 != null) {
                arrayList.add(x10);
            }
            Object L = fragment.L();
            if (L != null) {
                arrayList.add(L);
            }
            Object N = fragment.N();
            if (N != null) {
                arrayList.add(N);
            }
        }
        if (fragment2 != null) {
            Object v10 = fragment2.v();
            if (v10 != null) {
                arrayList.add(v10);
            }
            Object I = fragment2.I();
            if (I != null) {
                arrayList.add(I);
            }
            Object M = fragment2.M();
            if (M != null) {
                arrayList.add(M);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = f2414b;
        if (zVar == null || !g(zVar, arrayList)) {
            z zVar2 = f2415c;
            if (zVar2 == null || !g(zVar2, arrayList)) {
                if (zVar == null && zVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return zVar2;
        }
        return zVar;
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View S = fragment.S();
            if (S != null) {
                zVar.f(arrayList2, S);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            zVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, s.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t10;
        s.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f2450a;
        Fragment fragment2 = hVar.f2453d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f2451b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t10 = null;
        } else {
            t10 = t(zVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        s.a<String, View> i10 = i(zVar, aVar2, t10, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i10.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            rect = new Rect();
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, i10, hVar.f2454e, hVar.f2455f);
            if (obj != null) {
                zVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new f(zVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, s.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f2450a;
        Fragment fragment2 = hVar.f2453d;
        if (fragment != null) {
            fragment.r1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f2451b;
        Object t10 = aVar.isEmpty() ? null : t(zVar, fragment, fragment2, z10);
        s.a<String, View> i10 = i(zVar, aVar, t10, hVar);
        s.a<String, View> h10 = h(zVar, aVar, t10, hVar);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i10, aVar.keySet());
            a(arrayList2, h10, aVar.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList2.add(view);
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, i10, hVar.f2454e, hVar.f2455f);
            Rect rect2 = new Rect();
            View s10 = s(h10, hVar, obj, z10);
            if (s10 != null) {
                zVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, s.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2450a;
        Fragment fragment2 = hVar.f2453d;
        z j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f2451b;
        boolean z11 = hVar.f2454e;
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q10, r10);
        if (q10 == null && l10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList, view);
        Object obj2 = (k10 == null || k10.isEmpty()) ? null : null;
        j10.a(q10, view);
        Object u10 = u(j10, q10, obj2, l10, fragment, hVar.f2451b);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            j10.w(fragment2, u10, eVar, new c(gVar, fragment2, eVar));
        }
        if (u10 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j10.t(u10, q10, arrayList3, obj2, k10, l10, arrayList2);
            y(j10, viewGroup, fragment, view, arrayList2, q10, arrayList3, obj2, k10);
            j10.x(viewGroup, arrayList2, aVar);
            j10.c(viewGroup, u10);
            j10.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, s.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2450a;
        Fragment fragment2 = hVar.f2453d;
        z j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f2451b;
        boolean z11 = hVar.f2454e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q10, r10);
        if (q10 == null && m10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList2, view);
        ArrayList<View> k11 = k(j10, q10, fragment, arrayList, view);
        A(k11, 4);
        Object u10 = u(j10, q10, obj, m10, fragment, z10);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            j10.w(fragment2, u10, eVar, new a(gVar, fragment2, eVar));
        }
        if (u10 != null) {
            v(j10, obj, fragment2, k10);
            ArrayList<String> o10 = j10.o(arrayList);
            j10.t(u10, q10, k11, obj, k10, m10, arrayList);
            j10.c(viewGroup, u10);
            j10.y(viewGroup, arrayList2, arrayList, o10, aVar);
            A(k11, 0);
            j10.A(m10, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i10, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private static Object q(z zVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z10 ? fragment.I() : fragment.v());
    }

    private static Object r(z zVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z10 ? fragment.L() : fragment.x());
    }

    static View s(s.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f2452c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2401p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z10 ? aVar2.f2401p : aVar2.f2402q).get(0));
    }

    private static Object t(z zVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z10 ? fragment2.N() : fragment.M()));
    }

    private static Object u(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.q() : fragment.o() ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void v(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2105u && fragment.I && fragment.W) {
            fragment.z1(true);
            zVar.r(obj, fragment.S(), arrayList);
            androidx.core.view.r.a(fragment.P, new b(arrayList));
        }
    }

    private static z w() {
        try {
            return (z) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(s.a<String, String> aVar, s.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.r.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(z zVar, Object obj, Object obj2, s.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f2401p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z10 ? aVar2.f2402q : aVar2.f2401p).get(0));
        zVar.v(obj, view);
        if (obj2 != null) {
            zVar.v(obj2, view);
        }
    }
}
