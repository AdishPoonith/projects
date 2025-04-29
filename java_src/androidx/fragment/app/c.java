package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class c extends c0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2170a;

        static {
            int[] iArr = new int[c0.e.c.values().length];
            f2170a = iArr;
            try {
                iArr[c0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2170a[c0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2170a[c0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2170a[c0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f2171j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c0.e f2172k;

        b(List list, c0.e eVar) {
            this.f2171j = list;
            this.f2172k = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2171j.contains(this.f2172k)) {
                this.f2171j.remove(this.f2172k);
                c.this.s(this.f2172k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0035c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f2176c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f2177d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f2178e;

        C0035c(ViewGroup viewGroup, View view, boolean z10, c0.e eVar, k kVar) {
            this.f2174a = viewGroup;
            this.f2175b = view;
            this.f2176c = z10;
            this.f2177d = eVar;
            this.f2178e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2174a.endViewTransition(this.f2175b);
            if (this.f2176c) {
                this.f2177d.e().b(this.f2175b);
            }
            this.f2178e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f2180a;

        d(Animator animator) {
            this.f2180a = animator;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f2180a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2183b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f2184c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2182a.endViewTransition(eVar.f2183b);
                e.this.f2184c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2182a = viewGroup;
            this.f2183b = view;
            this.f2184c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2182a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f2187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f2189c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2187a = view;
            this.f2188b = viewGroup;
            this.f2189c = kVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f2187a.clearAnimation();
            this.f2188b.endViewTransition(this.f2187a);
            this.f2189c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c0.e f2191j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c0.e f2192k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f2193l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a f2194m;

        g(c0.e eVar, c0.e eVar2, boolean z10, s.a aVar) {
            this.f2191j = eVar;
            this.f2192k = eVar2;
            this.f2193l = z10;
            this.f2194m = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f2191j.f(), this.f2192k.f(), this.f2193l, this.f2194m, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ z f2196j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ View f2197k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Rect f2198l;

        h(z zVar, View view, Rect rect) {
            this.f2196j = zVar;
            this.f2197k = view;
            this.f2198l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2196j.k(this.f2197k, this.f2198l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f2200j;

        i(ArrayList arrayList) {
            this.f2200j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f2200j, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ m f2202j;

        j(m mVar) {
            this.f2202j = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2202j.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f2204c;

        /* renamed from: d  reason: collision with root package name */
        private f.d f2205d;

        k(c0.e eVar, androidx.core.os.e eVar2) {
            super(eVar, eVar2);
            this.f2204c = false;
        }

        f.d e(Context context) {
            if (this.f2204c) {
                return this.f2205d;
            }
            f.d b10 = androidx.fragment.app.f.b(context, b().f(), b().e() == c0.e.c.VISIBLE);
            this.f2205d = b10;
            this.f2204c = true;
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private final c0.e f2206a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f2207b;

        l(c0.e eVar, androidx.core.os.e eVar2) {
            this.f2206a = eVar;
            this.f2207b = eVar2;
        }

        void a() {
            this.f2206a.d(this.f2207b);
        }

        c0.e b() {
            return this.f2206a;
        }

        androidx.core.os.e c() {
            return this.f2207b;
        }

        boolean d() {
            c0.e.c cVar;
            c0.e.c h10 = c0.e.c.h(this.f2206a.f().Q);
            c0.e.c e10 = this.f2206a.e();
            return h10 == e10 || !(h10 == (cVar = c0.e.c.VISIBLE) || e10 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f2208c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2209d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f2210e;

        m(c0.e eVar, androidx.core.os.e eVar2, boolean z10, boolean z11) {
            super(eVar, eVar2);
            boolean z12;
            Object obj;
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment f10 = eVar.f();
                this.f2208c = z10 ? f10.I() : f10.v();
                Fragment f11 = eVar.f();
                z12 = z10 ? f11.q() : f11.o();
            } else {
                Fragment f12 = eVar.f();
                this.f2208c = z10 ? f12.L() : f12.x();
                z12 = true;
            }
            this.f2209d = z12;
            if (z11) {
                Fragment f13 = eVar.f();
                obj = z10 ? f13.N() : f13.M();
            } else {
                obj = null;
            }
            this.f2210e = obj;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f2414b;
            if (zVar == null || !zVar.e(obj)) {
                z zVar2 = x.f2415c;
                if (zVar2 == null || !zVar2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return zVar2;
            }
            return zVar;
        }

        z e() {
            z f10 = f(this.f2208c);
            z f11 = f(this.f2210e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2208c + " which uses a different Transition  type than its shared element transition " + this.f2210e);
        }

        public Object g() {
            return this.f2210e;
        }

        Object h() {
            return this.f2208c;
        }

        public boolean i() {
            return this.f2210e != null;
        }

        boolean j() {
            return this.f2209d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z10, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d e10;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.d() || (e10 = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = e10.f2277b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    c0.e b10 = kVar.b();
                    Fragment f10 = b10.f();
                    if (Boolean.TRUE.equals(map.get(b10))) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z12 = b10.e() == c0.e.c.GONE;
                        if (z12) {
                            list2.remove(b10);
                        }
                        View view = f10.Q;
                        m10.startViewTransition(view);
                        animator.addListener(new C0035c(m10, view, z12, b10, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(animator));
                        z11 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            c0.e b11 = kVar2.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f11);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z11) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f11);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = f11.Q;
                Animation animation = (Animation) androidx.core.util.d.c(((f.d) androidx.core.util.d.c(kVar2.e(context))).f2276a);
                if (b11.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m10.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m10, view2);
                    eVar.setAnimationListener(new e(m10, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m10, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<c0.e, Boolean> x(List<m> list, boolean z10, c0.e eVar, c0.e eVar2) {
        View view;
        Object obj;
        c0.e eVar3;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        c0.e eVar4;
        View view2;
        s.a aVar;
        ArrayList<View> arrayList3;
        c0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        z zVar;
        c0.e eVar6;
        View view4;
        boolean z11 = z10;
        c0.e eVar7 = eVar;
        c0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        z zVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                z e10 = mVar.e();
                if (zVar2 == null) {
                    zVar2 = e10;
                } else if (e10 != null && zVar2 != e10) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        s.a aVar2 = new s.a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                zVar = zVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B = zVar2.B(zVar2.g(mVar3.g()));
                ArrayList<String> O = eVar2.f().O();
                ArrayList<String> O2 = eVar.f().O();
                ArrayList<String> P = eVar.f().P();
                View view7 = view6;
                int i10 = 0;
                while (i10 < P.size()) {
                    int indexOf = O.indexOf(P.get(i10));
                    ArrayList<String> arrayList7 = P;
                    if (indexOf != -1) {
                        O.set(indexOf, O2.get(i10));
                    }
                    i10++;
                    P = arrayList7;
                }
                ArrayList<String> P2 = eVar2.f().P();
                Fragment f10 = eVar.f();
                if (z11) {
                    f10.w();
                    eVar2.f().y();
                } else {
                    f10.y();
                    eVar2.f().w();
                }
                int i11 = 0;
                for (int size = O.size(); i11 < size; size = size) {
                    aVar2.put(O.get(i11), P2.get(i11));
                    i11++;
                }
                s.a<String, View> aVar3 = new s.a<>();
                u(aVar3, eVar.f().Q);
                aVar3.n(O);
                aVar2.n(aVar3.keySet());
                s.a<String, View> aVar4 = new s.a<>();
                u(aVar4, eVar2.f().Q);
                aVar4.n(P2);
                aVar4.n(aVar2.values());
                x.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    zVar = zVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    x.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    androidx.core.view.r.a(m(), new g(eVar2, eVar, z10, aVar4));
                    for (View view8 : aVar3.values()) {
                        t(arrayList5, view8);
                    }
                    if (O.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view9 = aVar3.get(O.get(0));
                        zVar2.v(B, view9);
                        view6 = view9;
                    }
                    for (View view10 : aVar4.values()) {
                        t(arrayList8, view10);
                    }
                    arrayList3 = arrayList8;
                    if (!P2.isEmpty() && (view4 = aVar4.get(P2.get(0))) != null) {
                        androidx.core.view.r.a(m(), new h(zVar2, view4, rect2));
                        z12 = true;
                    }
                    zVar2.z(B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    zVar = zVar2;
                    zVar2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            zVar2 = zVar;
        }
        View view11 = view6;
        s.a aVar5 = aVar2;
        ArrayList<View> arrayList9 = arrayList6;
        c0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view12 = view5;
        z zVar3 = zVar2;
        c0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g10 = zVar3.g(mVar4.h());
                c0.e b10 = mVar4.b();
                boolean z13 = obj3 != null && (b10 == eVar9 || b10 == eVar10);
                if (g10 == null) {
                    if (!z13) {
                        hashMap.put(b10, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view12;
                    eVar4 = eVar10;
                    view2 = view11;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList12, b10.f().Q);
                    if (z13) {
                        if (b10 == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        zVar3.a(g10, view12);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view12;
                        obj2 = obj5;
                        eVar4 = eVar10;
                        obj = obj6;
                        eVar3 = b10;
                    } else {
                        zVar3.b(g10, arrayList12);
                        view = view12;
                        obj = obj6;
                        eVar3 = b10;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar4 = eVar10;
                        zVar3.t(g10, g10, arrayList12, null, null, null, null);
                        if (eVar3.e() == c0.e.c.GONE) {
                            zVar3.r(g10, eVar3.f().Q, arrayList12);
                            androidx.core.view.r.a(m(), new i(arrayList12));
                        }
                    }
                    if (eVar3.e() == c0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            zVar3.u(g10, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        zVar3.v(g10, view2);
                    }
                    hashMap.put(eVar3, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = zVar3.n(obj2, g10, null);
                        obj4 = obj;
                    } else {
                        obj4 = zVar3.n(obj, g10, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar4;
                view11 = view2;
                view12 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList13 = arrayList9;
        ArrayList<View> arrayList14 = arrayList10;
        c0.e eVar11 = eVar10;
        Object m10 = zVar3.m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h10 = mVar5.h();
                c0.e b11 = mVar5.b();
                boolean z14 = obj3 != null && (b11 == eVar9 || b11 == eVar11);
                if (h10 != null || z14) {
                    zVar3.w(mVar5.b().f(), m10, mVar5.c(), new j(mVar5));
                }
            }
        }
        x.A(arrayList11, 4);
        ArrayList<String> o10 = zVar3.o(arrayList13);
        zVar3.c(m(), m10);
        zVar3.y(m(), arrayList14, arrayList13, o10, aVar5);
        x.A(arrayList11, 0);
        zVar3.A(obj3, arrayList14, arrayList13);
        return hashMap;
    }

    @Override // androidx.fragment.app.c0
    void f(List<c0.e> list, boolean z10) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e eVar3 : list) {
            c0.e.c h10 = c0.e.c.h(eVar3.f().Q);
            int i10 = a.f2170a[eVar3.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (h10 == c0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && h10 != c0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList(list);
        for (c0.e eVar4 : list) {
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new k(eVar4, eVar5));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<c0.e, Boolean> x10 = x(arrayList2, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (c0.e eVar7 : arrayList3) {
            s(eVar7);
        }
        arrayList3.clear();
    }

    void s(c0.e eVar) {
        eVar.e().b(eVar.f().Q);
    }

    void t(ArrayList<View> arrayList, View view) {
        boolean z10 = view instanceof ViewGroup;
        ViewGroup viewGroup = view;
        if (z10) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            boolean a10 = androidx.core.view.w.a(viewGroup2);
            viewGroup = viewGroup2;
            if (!a10) {
                int childCount = viewGroup2.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup2.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
                return;
            }
        }
        arrayList.add(viewGroup);
    }

    void u(Map<String, View> map, View view) {
        String p10 = androidx.core.view.t.p(view);
        if (p10 != null) {
            map.put(p10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(s.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.t.p(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
