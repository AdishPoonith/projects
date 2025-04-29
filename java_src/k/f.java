package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.b;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f12439a;

    /* renamed from: b  reason: collision with root package name */
    final b f12440b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f12441a;

        /* renamed from: b  reason: collision with root package name */
        final Context f12442b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f12443c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final s.g<Menu, Menu> f12444d = new s.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f12442b = context;
            this.f12441a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f12444d.get(menu);
            if (menu2 == null) {
                l.d dVar = new l.d(this.f12442b, (u.a) menu);
                this.f12444d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // k.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f12441a.onActionItemClicked(e(bVar), new l.c(this.f12442b, (u.b) menuItem));
        }

        @Override // k.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f12441a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f12441a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public void d(b bVar) {
            this.f12441a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f12443c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f12443c.get(i10);
                if (fVar != null && fVar.f12440b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f12442b, bVar);
            this.f12443c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f12439a = context;
        this.f12440b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f12440b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f12440b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new l.d(this.f12439a, (u.a) this.f12440b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f12440b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f12440b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f12440b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f12440b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f12440b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f12440b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f12440b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f12440b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f12440b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f12440b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f12440b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f12440b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f12440b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f12440b.s(z10);
    }
}
