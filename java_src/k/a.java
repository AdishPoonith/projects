package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import f.j;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f12424a;

    private a(Context context) {
        this.f12424a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f12424a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f12424a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f12424a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 <= 960 || i11 <= 720) {
            if (i10 <= 720 || i11 <= 960) {
                if (i10 < 500) {
                    if (i10 <= 640 || i11 <= 480) {
                        if (i10 <= 480 || i11 <= 640) {
                            return i10 >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f12424a.getResources().getDimensionPixelSize(f.d.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f12424a.obtainStyledAttributes(null, j.f8231a, f.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f8276j, 0);
        Resources resources = this.f12424a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(f.d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f12424a.getResources().getBoolean(f.b.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        return true;
    }
}
