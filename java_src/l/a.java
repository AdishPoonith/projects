package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class a implements u.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f12998a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12999b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13000c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13001d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f13002e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f13003f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f13004g;

    /* renamed from: h  reason: collision with root package name */
    private char f13005h;

    /* renamed from: j  reason: collision with root package name */
    private char f13007j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f13009l;

    /* renamed from: n  reason: collision with root package name */
    private Context f13011n;

    /* renamed from: o  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f13012o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f13013p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f13014q;

    /* renamed from: i  reason: collision with root package name */
    private int f13006i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f13008k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f13010m = 0;

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f13015r = null;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuff.Mode f13016s = null;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13017t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f13018u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f13019v = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f13011n = context;
        this.f12998a = i11;
        this.f12999b = i10;
        this.f13000c = i12;
        this.f13001d = i13;
        this.f13002e = charSequence;
    }

    private void c() {
        Drawable drawable = this.f13009l;
        if (drawable != null) {
            if (this.f13017t || this.f13018u) {
                Drawable p10 = androidx.core.graphics.drawable.a.p(drawable);
                this.f13009l = p10;
                Drawable mutate = p10.mutate();
                this.f13009l = mutate;
                if (this.f13017t) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f13015r);
                }
                if (this.f13018u) {
                    androidx.core.graphics.drawable.a.o(this.f13009l, this.f13016s);
                }
            }
        }
    }

    @Override // u.b
    public u.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // u.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // u.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: d */
    public u.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: e */
    public u.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // u.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // u.b, android.view.MenuItem
    /* renamed from: f */
    public u.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // u.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // u.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f13008k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f13007j;
    }

    @Override // u.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f13013p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f12999b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f13009l;
    }

    @Override // u.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f13015r;
    }

    @Override // u.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f13016s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f13004g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f12998a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // u.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f13006i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f13005h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13001d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f13002e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13003f;
        return charSequence != null ? charSequence : this.f13002e;
    }

    @Override // u.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f13014q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // u.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f13019v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f13019v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f13019v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f13019v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f13007j = Character.toLowerCase(c10);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13007j = Character.toLowerCase(c10);
        this.f13008k = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f13019v = (z10 ? 1 : 0) | (this.f13019v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f13019v = (z10 ? 2 : 0) | (this.f13019v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public u.b setContentDescription(CharSequence charSequence) {
        this.f13013p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f13019v = (z10 ? 16 : 0) | (this.f13019v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f13010m = i10;
        this.f13009l = androidx.core.content.a.d(this.f13011n, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f13009l = drawable;
        this.f13010m = 0;
        c();
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13015r = colorStateList;
        this.f13017t = true;
        c();
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13016s = mode;
        this.f13018u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f13004g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f13005h = c10;
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f13005h = c10;
        this.f13006i = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13012o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f13005h = c10;
        this.f13007j = Character.toLowerCase(c11);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13005h = c10;
        this.f13006i = KeyEvent.normalizeMetaState(i10);
        this.f13007j = Character.toLowerCase(c11);
        this.f13008k = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // u.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f13002e = this.f13011n.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f13002e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13003f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public u.b setTooltipText(CharSequence charSequence) {
        this.f13014q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f13019v = (this.f13019v & 8) | (z10 ? 0 : 8);
        return this;
    }
}
