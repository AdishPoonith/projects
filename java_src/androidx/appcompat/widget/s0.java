package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class s0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1327c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<s0>> f1328d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1329a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1330b;

    private s0(Context context) {
        super(context);
        if (!a1.b()) {
            this.f1329a = new u0(this, context.getResources());
            this.f1330b = null;
            return;
        }
        a1 a1Var = new a1(this, context.getResources());
        this.f1329a = a1Var;
        Resources.Theme newTheme = a1Var.newTheme();
        this.f1330b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof s0) || (context.getResources() instanceof u0) || (context.getResources() instanceof a1) || !a1.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1327c) {
                ArrayList<WeakReference<s0>> arrayList = f1328d;
                if (arrayList == null) {
                    f1328d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<s0> weakReference = f1328d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1328d.remove(size);
                        }
                    }
                    for (int size2 = f1328d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<s0> weakReference2 = f1328d.get(size2);
                        s0 s0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (s0Var != null && s0Var.getBaseContext() == context) {
                            return s0Var;
                        }
                    }
                }
                s0 s0Var2 = new s0(context);
                f1328d.add(new WeakReference<>(s0Var2));
                return s0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1329a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1329a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1330b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1330b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
