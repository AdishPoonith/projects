package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class e implements u.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f867a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f868b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f869c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f870d;

    /* renamed from: e  reason: collision with root package name */
    private a f871e;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f879m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f880n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f881o;

    /* renamed from: p  reason: collision with root package name */
    View f882p;

    /* renamed from: x  reason: collision with root package name */
    private g f890x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f892z;

    /* renamed from: l  reason: collision with root package name */
    private int f878l = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f883q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f884r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f885s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f886t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f887u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f888v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f889w = new CopyOnWriteArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private boolean f891y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f872f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f873g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f874h = true;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f875i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f876j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private boolean f877k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f867a = context;
        this.f868b = context.getResources();
        b0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f872f.size()) {
            return;
        }
        this.f872f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f882p = view;
            this.f880n = null;
            this.f881o = null;
        } else {
            if (i10 > 0) {
                this.f880n = C.getText(i10);
            } else if (charSequence != null) {
                this.f880n = charSequence;
            }
            if (i11 > 0) {
                this.f881o = androidx.core.content.a.d(u(), i11);
            } else if (drawable != null) {
                this.f881o = drawable;
            }
            this.f882p = null;
        }
        K(false);
    }

    private void b0(boolean z10) {
        boolean z11 = true;
        this.f870d = (z10 && this.f868b.getConfiguration().keyboard != 1 && v.b(ViewConfiguration.get(this.f867a), this.f867a)) ? false : false;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f889w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f889w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f889w.remove(next);
            } else {
                jVar.f(z10);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f889w.isEmpty()) {
            return false;
        }
        boolean e10 = jVar != null ? jVar.e(mVar) : false;
        Iterator<WeakReference<j>> it = this.f889w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f889w.remove(next);
            } else if (!e10) {
                e10 = jVar2.e(mVar);
            }
        }
        return e10;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f886t;
    }

    Resources C() {
        return this.f868b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (this.f874h) {
            this.f873g.clear();
            int size = this.f872f.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = this.f872f.get(i10);
                if (gVar.isVisible()) {
                    this.f873g.add(gVar);
                }
            }
            this.f874h = false;
            this.f877k = true;
            return this.f873g;
        }
        return this.f873g;
    }

    public boolean F() {
        return this.f891y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f869c;
    }

    public boolean H() {
        return this.f870d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f877k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f874h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (this.f883q) {
            this.f884r = true;
            if (z10) {
                this.f885s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f874h = true;
            this.f877k = true;
        }
        i(z10);
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L63
            r2.f(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.M(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f889w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f889w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f871e = aVar;
    }

    public e S(int i10) {
        this.f878l = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f872f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f872f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f878l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f879m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f872f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f892z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f868b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f868b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f867a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f868b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f868b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f867a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f867a);
    }

    public void c(j jVar, Context context) {
        this.f889w.add(new WeakReference<>(jVar));
        jVar.d(context, this);
        this.f877k = true;
    }

    public void c0() {
        this.f883q = false;
        if (this.f884r) {
            this.f884r = false;
            K(this.f885s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f890x;
        if (gVar != null) {
            f(gVar);
        }
        this.f872f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f881o = null;
        this.f880n = null;
        this.f882p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f871e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f883q) {
            return;
        }
        this.f883q = true;
        this.f884r = false;
        this.f885s = false;
    }

    public final void e(boolean z10) {
        if (this.f887u) {
            return;
        }
        this.f887u = true;
        Iterator<WeakReference<j>> it = this.f889w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f889w.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f887u = false;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f889w.isEmpty() && this.f890x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f889w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f889w.remove(next);
                } else {
                    z10 = jVar.i(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            c0();
            if (z10) {
                this.f890x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f872f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f872f.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f871e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f892z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f872f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f889w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f889w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f889w.remove(next);
            } else {
                z10 = jVar.j(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        c0();
        if (z10) {
            this.f890x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f872f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f872f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f888v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f872f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f872f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f877k) {
            Iterator<WeakReference<j>> it = this.f889w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f889w.remove(next);
                } else {
                    z10 |= jVar.h();
                }
            }
            if (z10) {
                this.f875i.clear();
                this.f876j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    (gVar.l() ? this.f875i : this.f876j).add(gVar);
                }
            } else {
                this.f875i.clear();
                this.f876j.clear();
                this.f876j.addAll(E());
            }
            this.f877k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f872f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f872f.get(l10).getGroupId() != i10) {
                    break;
                }
                N(l10, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f875i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f872f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f872f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f891y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f872f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f872f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f872f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f872f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f869c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f872f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f867a;
    }

    public g v() {
        return this.f890x;
    }

    public Drawable w() {
        return this.f881o;
    }

    public CharSequence x() {
        return this.f880n;
    }

    public View y() {
        return this.f882p;
    }

    public ArrayList<g> z() {
        r();
        return this.f876j;
    }
}
