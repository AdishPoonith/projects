package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: j  reason: collision with root package name */
    protected Context f814j;

    /* renamed from: k  reason: collision with root package name */
    protected Context f815k;

    /* renamed from: l  reason: collision with root package name */
    protected e f816l;

    /* renamed from: m  reason: collision with root package name */
    protected LayoutInflater f817m;

    /* renamed from: n  reason: collision with root package name */
    protected LayoutInflater f818n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f819o;

    /* renamed from: p  reason: collision with root package name */
    private int f820p;

    /* renamed from: q  reason: collision with root package name */
    private int f821q;

    /* renamed from: r  reason: collision with root package name */
    protected k f822r;

    /* renamed from: s  reason: collision with root package name */
    private int f823s;

    public a(Context context, int i10, int i11) {
        this.f814j = context;
        this.f817m = LayoutInflater.from(context);
        this.f820p = i10;
        this.f821q = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f822r).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f819o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void d(Context context, e eVar) {
        this.f815k = context;
        this.f818n = LayoutInflater.from(context);
        this.f816l = eVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f819o;
        if (aVar != null) {
            return aVar.c(mVar);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f822r;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f816l;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f816l.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n10 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    public k.a g(ViewGroup viewGroup) {
        return (k.a) this.f817m.inflate(this.f821q, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f819o = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f819o;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a g10 = view instanceof k.a ? (k.a) view : g(viewGroup);
        c(gVar, g10);
        return (View) g10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f822r == null) {
            k kVar = (k) this.f817m.inflate(this.f820p, viewGroup, false);
            this.f822r = kVar;
            kVar.b(this.f816l);
            f(true);
        }
        return this.f822r;
    }

    public void p(int i10) {
        this.f823s = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
