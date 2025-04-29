package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f13020a;

    /* renamed from: b  reason: collision with root package name */
    private Map<u.b, MenuItem> f13021b;

    /* renamed from: c  reason: collision with root package name */
    private Map<u.c, SubMenu> f13022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f13020a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof u.b) {
            u.b bVar = (u.b) menuItem;
            if (this.f13021b == null) {
                this.f13021b = new s.a();
            }
            MenuItem menuItem2 = this.f13021b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f13020a, bVar);
                this.f13021b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof u.c) {
            u.c cVar = (u.c) subMenu;
            if (this.f13022c == null) {
                this.f13022c = new s.a();
            }
            SubMenu subMenu2 = this.f13022c.get(cVar);
            if (subMenu2 == null) {
                f fVar = new f(this.f13020a, cVar);
                this.f13022c.put(cVar, fVar);
                return fVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Map<u.b, MenuItem> map = this.f13021b;
        if (map != null) {
            map.clear();
        }
        Map<u.c, SubMenu> map2 = this.f13022c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        Map<u.b, MenuItem> map = this.f13021b;
        if (map == null) {
            return;
        }
        Iterator<u.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i10 == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        Map<u.b, MenuItem> map = this.f13021b;
        if (map == null) {
            return;
        }
        Iterator<u.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i10 == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
