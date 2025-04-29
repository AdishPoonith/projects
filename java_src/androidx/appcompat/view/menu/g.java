package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
/* loaded from: classes.dex */
public final class g implements u.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f897a;

    /* renamed from: b  reason: collision with root package name */
    private final int f898b;

    /* renamed from: c  reason: collision with root package name */
    private final int f899c;

    /* renamed from: d  reason: collision with root package name */
    private final int f900d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f901e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f902f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f903g;

    /* renamed from: h  reason: collision with root package name */
    private char f904h;

    /* renamed from: j  reason: collision with root package name */
    private char f906j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f908l;

    /* renamed from: n  reason: collision with root package name */
    e f910n;

    /* renamed from: o  reason: collision with root package name */
    private m f911o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f912p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f913q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f914r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f915s;

    /* renamed from: z  reason: collision with root package name */
    private int f922z;

    /* renamed from: i  reason: collision with root package name */
    private int f905i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f907k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f909m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f916t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f917u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f918v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f919w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f920x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f921y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0031b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0031b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f910n.J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f910n = eVar;
        this.f897a = i11;
        this.f898b = i10;
        this.f899c = i12;
        this.f900d = i13;
        this.f901e = charSequence;
        this.f922z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f920x && (this.f918v || this.f919w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.f918v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f916t);
            }
            if (this.f919w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f917u);
            }
            this.f920x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f910n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f922z & 4) == 4;
    }

    @Override // u.b
    public u.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f910n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // u.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f910n.I(this);
    }

    @Override // u.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f922z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f910n.f(this);
        }
        return false;
    }

    @Override // u.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f910n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f900d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.f910n.G() ? this.f906j : this.f904h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // u.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.A = d10;
            return d10;
        }
        return null;
    }

    @Override // u.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f907k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f906j;
    }

    @Override // u.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f914r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f898b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f908l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f909m != 0) {
            Drawable d10 = h.a.d(this.f910n.u(), this.f909m);
            this.f909m = 0;
            this.f908l = d10;
            return e(d10);
        }
        return null;
    }

    @Override // u.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f916t;
    }

    @Override // u.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f917u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f903g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f897a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // u.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f905i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f904h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f899c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f911o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f901e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f902f;
        return charSequence != null ? charSequence : this.f901e;
    }

    @Override // u.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f915s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f910n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f910n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(f.h.abc_prepend_shortcut_label));
        }
        int i11 = this.f910n.G() ? this.f907k : this.f905i;
        d(sb, i11, 65536, resources.getString(f.h.abc_menu_meta_shortcut_label));
        d(sb, i11, 4096, resources.getString(f.h.abc_menu_ctrl_shortcut_label));
        d(sb, i11, 2, resources.getString(f.h.abc_menu_alt_shortcut_label));
        d(sb, i11, 1, resources.getString(f.h.abc_menu_shift_shortcut_label));
        d(sb, i11, 4, resources.getString(f.h.abc_menu_sym_shortcut_label));
        d(sb, i11, 8, resources.getString(f.h.abc_menu_function_shortcut_label));
        if (g10 == '\b') {
            i10 = f.h.abc_menu_delete_shortcut_label;
        } else if (g10 == '\n') {
            i10 = f.h.abc_menu_enter_shortcut_label;
        } else if (g10 != ' ') {
            sb.append(g10);
            return sb.toString();
        } else {
            i10 = f.h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i10));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f911o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // u.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f921y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f921y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f921y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f921y & 8) == 0 : (this.f921y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f922z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f913q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f910n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f912p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f903g != null) {
                try {
                    this.f910n.u().startActivity(this.f903g);
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f921y & 32) == 32;
    }

    public boolean m() {
        return (this.f921y & 4) != 0;
    }

    public boolean n() {
        return (this.f922z & 1) == 1;
    }

    public boolean o() {
        return (this.f922z & 2) == 2;
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: p */
    public u.b setActionView(int i10) {
        Context u10 = this.f910n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: q */
    public u.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f897a) > 0) {
            view.setId(i10);
        }
        this.f910n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f910n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f921y = i11;
        if (i10 != i11) {
            this.f910n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f906j == c10) {
            return this;
        }
        this.f906j = Character.toLowerCase(c10);
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f906j == c10 && this.f907k == i10) {
            return this;
        }
        this.f906j = Character.toLowerCase(c10);
        this.f907k = KeyEvent.normalizeMetaState(i10);
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f921y = i11;
        if (i10 != i11) {
            this.f910n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f921y & 4) != 0) {
            this.f910n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public u.b setContentDescription(CharSequence charSequence) {
        this.f914r = charSequence;
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f921y = z10 ? this.f921y | 16 : this.f921y & (-17);
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f908l = null;
        this.f909m = i10;
        this.f920x = true;
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f909m = 0;
        this.f908l = drawable;
        this.f920x = true;
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f916t = colorStateList;
        this.f918v = true;
        this.f920x = true;
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f917u = mode;
        this.f919w = true;
        this.f920x = true;
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f903g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f904h == c10) {
            return this;
        }
        this.f904h = c10;
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f904h == c10 && this.f905i == i10) {
            return this;
        }
        this.f904h = c10;
        this.f905i = KeyEvent.normalizeMetaState(i10);
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f913q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f904h = c10;
        this.f906j = Character.toLowerCase(c11);
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f904h = c10;
        this.f905i = KeyEvent.normalizeMetaState(i10);
        this.f906j = Character.toLowerCase(c11);
        this.f907k = KeyEvent.normalizeMetaState(i11);
        this.f910n.K(false);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f922z = i10;
        this.f910n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f910n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f901e = charSequence;
        this.f910n.K(false);
        m mVar = this.f911o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f902f = charSequence;
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public u.b setTooltipText(CharSequence charSequence) {
        this.f915s = charSequence;
        this.f910n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f910n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f921y = (z10 ? 4 : 0) | (this.f921y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f901e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f921y = z10 ? this.f921y | 32 : this.f921y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: w */
    public u.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f911o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f921y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f921y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f910n.A();
    }
}
