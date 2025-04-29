package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f1912a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<j> f1913b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<j, Object> f1914c = new HashMap();

    public h(Runnable runnable) {
        this.f1912a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<j> it = this.f1913b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void b(Menu menu) {
        Iterator<j> it = this.f1913b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean c(MenuItem menuItem) {
        Iterator<j> it = this.f1913b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d(Menu menu) {
        Iterator<j> it = this.f1913b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }
}
