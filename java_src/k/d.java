package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f12427a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f12428b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f12429c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f12430d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f12431e;

    public d() {
        super(null);
    }

    public d(Context context, int i10) {
        super(context);
        this.f12427a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f12428b = theme;
    }

    private Resources a() {
        if (this.f12431e == null) {
            Configuration configuration = this.f12430d;
            this.f12431e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f12431e;
    }

    private void c() {
        boolean z10 = this.f12428b == null;
        if (z10) {
            this.f12428b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f12428b.setTo(theme);
            }
        }
        d(this.f12428b, this.f12427a, z10);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f12427a;
    }

    protected void d(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f12429c == null) {
                this.f12429c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f12429c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f12428b;
        if (theme != null) {
            return theme;
        }
        if (this.f12427a == 0) {
            this.f12427a = f.i.Theme_AppCompat_Light;
        }
        c();
        return this.f12428b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f12427a != i10) {
            this.f12427a = i10;
            c();
        }
    }
}
