package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f2472j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f2473k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ArrayList f2474l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2475m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2476n;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2472j = i10;
            this.f2473k = arrayList;
            this.f2474l = arrayList2;
            this.f2475m = arrayList3;
            this.f2476n = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f2472j; i10++) {
                androidx.core.view.t.M((View) this.f2473k.get(i10), (String) this.f2474l.get(i10));
                androidx.core.view.t.M((View) this.f2475m.get(i10), (String) this.f2476n.get(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f2478j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Map f2479k;

        b(ArrayList arrayList, Map map) {
            this.f2478j = arrayList;
            this.f2479k = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2478j.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2478j.get(i10);
                String p10 = androidx.core.view.t.p(view);
                if (p10 != null) {
                    androidx.core.view.t.M(view, z.i(this.f2479k, p10));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f2481j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Map f2482k;

        c(ArrayList arrayList, Map map) {
            this.f2481j = arrayList;
            this.f2482k = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2481j.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2481j.get(i10);
                androidx.core.view.t.M(view, (String) this.f2482k.get(androidx.core.view.t.p(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z10 = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z10) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a10 = androidx.core.view.w.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a10) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        f(arrayList, viewGroup2.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String p10 = androidx.core.view.t.p(view);
            if (p10 != null) {
                map.put(p10, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (androidx.core.view.t.t(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(androidx.core.view.t.p(view));
            androidx.core.view.t.M(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.r.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.r.a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String p10 = androidx.core.view.t.p(view2);
            arrayList4.add(p10);
            if (p10 != null) {
                androidx.core.view.t.M(view2, null);
                String str = map.get(p10);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        androidx.core.view.t.M(arrayList2.get(i11), p10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        androidx.core.view.r.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
