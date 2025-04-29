package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.v0;
import androidx.core.view.d0;
import androidx.core.view.e;
import androidx.core.view.p;
import androidx.core.view.t;
import androidx.core.view.z;
import androidx.lifecycle.e;
import java.util.List;
import java.util.Map;
import k.b;
import k.f;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: j0  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f660j0 = new s.a();

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f661k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final int[] f662l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final boolean f663m0;
    Runnable A;
    z B;
    private boolean C;
    private boolean D;
    private ViewGroup E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    private boolean O;
    private m[] P;
    private m Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    boolean V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private j f664a0;

    /* renamed from: b0  reason: collision with root package name */
    private j f665b0;

    /* renamed from: c0  reason: collision with root package name */
    boolean f666c0;

    /* renamed from: d0  reason: collision with root package name */
    int f667d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Runnable f668e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f669f0;

    /* renamed from: g0  reason: collision with root package name */
    private Rect f670g0;

    /* renamed from: h0  reason: collision with root package name */
    private Rect f671h0;

    /* renamed from: i0  reason: collision with root package name */
    private AppCompatViewInflater f672i0;

    /* renamed from: m  reason: collision with root package name */
    final Object f673m;

    /* renamed from: n  reason: collision with root package name */
    final Context f674n;

    /* renamed from: o  reason: collision with root package name */
    Window f675o;

    /* renamed from: p  reason: collision with root package name */
    private h f676p;

    /* renamed from: q  reason: collision with root package name */
    final g.a f677q;

    /* renamed from: r  reason: collision with root package name */
    androidx.appcompat.app.a f678r;

    /* renamed from: s  reason: collision with root package name */
    MenuInflater f679s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f680t;

    /* renamed from: u  reason: collision with root package name */
    private b0 f681u;

    /* renamed from: v  reason: collision with root package name */
    private f f682v;

    /* renamed from: w  reason: collision with root package name */
    private n f683w;

    /* renamed from: x  reason: collision with root package name */
    k.b f684x;

    /* renamed from: y  reason: collision with root package name */
    ActionBarContextView f685y;

    /* renamed from: z  reason: collision with root package name */
    PopupWindow f686z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.f667d0 & 1) != 0) {
                eVar.S(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f667d0 & 4096) != 0) {
                eVar2.S(108);
            }
            e eVar3 = e.this;
            eVar3.f666c0 = false;
            eVar3.f667d0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements p {
        b() {
        }

        @Override // androidx.core.view.p
        public d0 a(View view, d0 d0Var) {
            int k10 = d0Var.k();
            int I0 = e.this.I0(k10);
            if (k10 != I0) {
                d0Var = d0Var.l(d0Var.i(), I0, d0Var.j(), d0Var.h());
            }
            return t.x(view, d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* loaded from: classes.dex */
        class a extends androidx.core.view.b0 {
            a() {
            }

            @Override // androidx.core.view.a0
            public void b(View view) {
                e.this.f685y.setAlpha(1.0f);
                e.this.B.h(null);
                e.this.B = null;
            }

            @Override // androidx.core.view.b0, androidx.core.view.a0
            public void c(View view) {
                e.this.f685y.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f686z.showAtLocation(eVar.f685y, 55, 0, 0);
            e.this.T();
            if (!e.this.A0()) {
                e.this.f685y.setAlpha(1.0f);
                e.this.f685y.setVisibility(0);
                return;
            }
            e.this.f685y.setAlpha(0.0f);
            e eVar2 = e.this;
            eVar2.B = t.b(eVar2.f685y).b(1.0f);
            e.this.B.h(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0012e extends androidx.core.view.b0 {
        C0012e() {
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            e.this.f685y.setAlpha(1.0f);
            e.this.B.h(null);
            e.this.B = null;
        }

        @Override // androidx.core.view.b0, androidx.core.view.a0
        public void c(View view) {
            e.this.f685y.setVisibility(0);
            e.this.f685y.sendAccessibilityEvent(32);
            if (e.this.f685y.getParent() instanceof View) {
                t.C((View) e.this.f685y.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.K(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback c02 = e.this.c0();
            if (c02 != null) {
                c02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f694a;

        /* loaded from: classes.dex */
        class a extends androidx.core.view.b0 {
            a() {
            }

            @Override // androidx.core.view.a0
            public void b(View view) {
                e.this.f685y.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f686z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f685y.getParent() instanceof View) {
                    t.C((View) e.this.f685y.getParent());
                }
                e.this.f685y.removeAllViews();
                e.this.B.h(null);
                e.this.B = null;
            }
        }

        public g(b.a aVar) {
            this.f694a = aVar;
        }

        @Override // k.b.a
        public boolean a(k.b bVar, MenuItem menuItem) {
            return this.f694a.a(bVar, menuItem);
        }

        @Override // k.b.a
        public boolean b(k.b bVar, Menu menu) {
            return this.f694a.b(bVar, menu);
        }

        @Override // k.b.a
        public boolean c(k.b bVar, Menu menu) {
            return this.f694a.c(bVar, menu);
        }

        @Override // k.b.a
        public void d(k.b bVar) {
            this.f694a.d(bVar);
            e eVar = e.this;
            if (eVar.f686z != null) {
                eVar.f675o.getDecorView().removeCallbacks(e.this.A);
            }
            e eVar2 = e.this;
            if (eVar2.f685y != null) {
                eVar2.T();
                e eVar3 = e.this;
                eVar3.B = t.b(eVar3.f685y).b(0.0f);
                e.this.B.h(new a());
            }
            e eVar4 = e.this;
            g.a aVar = eVar4.f677q;
            if (aVar != null) {
                aVar.e(eVar4.f684x);
            }
            e.this.f684x = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends k.i {
        h(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f674n, callback);
            k.b C0 = e.this.C0(aVar);
            if (C0 != null) {
                return aVar.e(C0);
            }
            return null;
        }

        @Override // k.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // k.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.o0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.r0(i10);
            return true;
        }

        @Override // k.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            e.this.s0(i10);
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // k.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            m a02 = e.this.a0(0, true);
            if (a02 == null || (eVar = a02.f715j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // k.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return e.this.j0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // k.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (e.this.j0() && i10 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i extends j {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f698c;

        i(Context context) {
            super();
            this.f698c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.j
        public int c() {
            return this.f698c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.j
        public void d() {
            e.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class j {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f700a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        j() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f700a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f674n.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f700a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f700a == null) {
                this.f700a = new a();
            }
            e.this.f674n.registerReceiver(this.f700a, b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class k extends j {

        /* renamed from: c  reason: collision with root package name */
        private final androidx.appcompat.app.h f703c;

        k(androidx.appcompat.app.h hVar) {
            super();
            this.f703c = hVar;
        }

        @Override // androidx.appcompat.app.e.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.j
        public int c() {
            return this.f703c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.j
        public void d() {
            e.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends ContentFrameLayout {
        public l(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.this.M(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.d(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        int f706a;

        /* renamed from: b  reason: collision with root package name */
        int f707b;

        /* renamed from: c  reason: collision with root package name */
        int f708c;

        /* renamed from: d  reason: collision with root package name */
        int f709d;

        /* renamed from: e  reason: collision with root package name */
        int f710e;

        /* renamed from: f  reason: collision with root package name */
        int f711f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f712g;

        /* renamed from: h  reason: collision with root package name */
        View f713h;

        /* renamed from: i  reason: collision with root package name */
        View f714i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f715j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f716k;

        /* renamed from: l  reason: collision with root package name */
        Context f717l;

        /* renamed from: m  reason: collision with root package name */
        boolean f718m;

        /* renamed from: n  reason: collision with root package name */
        boolean f719n;

        /* renamed from: o  reason: collision with root package name */
        boolean f720o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f721p;

        /* renamed from: q  reason: collision with root package name */
        boolean f722q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f723r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f724s;

        m(int i10) {
            this.f706a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f715j == null) {
                return null;
            }
            if (this.f716k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f717l, f.g.abc_list_menu_item_layout);
                this.f716k = cVar;
                cVar.k(aVar);
                this.f715j.b(this.f716k);
            }
            return this.f716k.c(this.f712g);
        }

        public boolean b() {
            if (this.f713h == null) {
                return false;
            }
            return this.f714i != null || this.f716k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f715j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f716k);
            }
            this.f715j = eVar;
            if (eVar == null || (cVar = this.f716k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(f.a.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = f.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i11, true);
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f717l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f8357z0);
            this.f707b = obtainStyledAttributes.getResourceId(f.j.C0, 0);
            this.f711f = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class n implements j.a {
        n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = D;
            }
            m W = eVar2.W(eVar);
            if (W != null) {
                if (!z11) {
                    e.this.N(W, z10);
                    return;
                }
                e.this.J(W.f706a, W, D);
                e.this.N(W, true);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback c02;
            if (eVar == null) {
                e eVar2 = e.this;
                if (!eVar2.J || (c02 = eVar2.c0()) == null || e.this.V) {
                    return true;
                }
                c02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f661k0 = false;
        f662l0 = new int[]{16842836};
        f663m0 = i10 <= 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Activity activity, g.a aVar) {
        this(activity, null, aVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Dialog dialog, g.a aVar) {
        this(dialog.getContext(), dialog.getWindow(), aVar, dialog);
    }

    private e(Context context, Window window, g.a aVar, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        androidx.appcompat.app.c F0;
        this.B = null;
        this.C = true;
        this.W = -100;
        this.f668e0 = new a();
        this.f674n = context;
        this.f677q = aVar;
        this.f673m = obj;
        if (this.W == -100 && (obj instanceof Dialog) && (F0 = F0()) != null) {
            this.W = F0.O().i();
        }
        if (this.W == -100 && (num = (map = f660j0).get(obj.getClass())) != null) {
            this.W = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f675o.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || t.t((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void E0() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean F(boolean z10) {
        if (this.V) {
            return false;
        }
        int I = I();
        boolean G0 = G0(k0(I), z10);
        if (I == 0) {
            Z().e();
        } else {
            j jVar = this.f664a0;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (I == 3) {
            Y().e();
        } else {
            j jVar2 = this.f665b0;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return G0;
    }

    private androidx.appcompat.app.c F0() {
        for (Context context = this.f674n; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.E.findViewById(16908290);
        View decorView = this.f675o.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f674n.obtainStyledAttributes(f.j.f8357z0);
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.M0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.K0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean G0(int i10, boolean z10) {
        int i11 = this.f674n.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z11 = true;
        int i12 = i10 != 1 ? i10 != 2 ? i11 : 32 : 16;
        boolean i02 = i0();
        boolean z12 = false;
        if ((f663m0 || i12 != i11) && !i02 && !this.S && (this.f673m instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i12;
            try {
                ((ContextThemeWrapper) this.f673m).applyOverrideConfiguration(configuration);
                z12 = true;
            } catch (IllegalStateException e10) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e10);
            }
        }
        int i13 = this.f674n.getResources().getConfiguration().uiMode & 48;
        if (!z12 && i13 != i12 && z10 && !i02 && this.S) {
            Object obj = this.f673m;
            if (obj instanceof Activity) {
                androidx.core.app.b.m((Activity) obj);
                z12 = true;
            }
        }
        if (z12 || i13 == i12) {
            z11 = z12;
        } else {
            H0(i12, i02);
        }
        if (z11) {
            Object obj2 = this.f673m;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).R(i10);
            }
        }
        return z11;
    }

    private void H(Window window) {
        if (this.f675o != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f676p = hVar;
        window.setCallback(hVar);
        v0 s10 = v0.s(this.f674n, null, f662l0);
        Drawable g10 = s10.g(0);
        if (g10 != null) {
            window.setBackgroundDrawable(g10);
        }
        s10.u();
        this.f675o = window;
    }

    private void H0(int i10, boolean z10) {
        Resources resources = this.f674n.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            androidx.appcompat.app.f.a(resources);
        }
        int i12 = this.X;
        if (i12 != 0) {
            this.f674n.setTheme(i12);
            if (i11 >= 23) {
                this.f674n.getTheme().applyStyle(this.X, true);
            }
        }
        if (z10) {
            Object obj = this.f673m;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.i) {
                    if (!((androidx.lifecycle.i) activity).a().b().g(e.b.STARTED)) {
                        return;
                    }
                } else if (!this.U) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    private int I() {
        int i10 = this.W;
        return i10 != -100 ? i10 : androidx.appcompat.app.d.h();
    }

    private void L() {
        j jVar = this.f664a0;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.f665b0;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    private ViewGroup O() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f674n.obtainStyledAttributes(f.j.f8357z0);
        int i10 = f.j.E0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(f.j.N0, false)) {
            y(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            y(108);
        }
        if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
            y(109);
        }
        if (obtainStyledAttributes.getBoolean(f.j.G0, false)) {
            y(10);
        }
        this.M = obtainStyledAttributes.getBoolean(f.j.A0, false);
        obtainStyledAttributes.recycle();
        V();
        this.f675o.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f674n);
        if (this.N) {
            viewGroup = (ViewGroup) from.inflate(this.L ? f.g.abc_screen_simple_overlay_action_mode : f.g.abc_screen_simple, (ViewGroup) null);
            t.K(viewGroup, new b());
        } else if (this.M) {
            viewGroup = (ViewGroup) from.inflate(f.g.abc_dialog_title_material, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            this.f674n.getTheme().resolveAttribute(f.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(this.f674n, typedValue.resourceId) : this.f674n).inflate(f.g.abc_screen_toolbar, (ViewGroup) null);
            b0 b0Var = (b0) viewGroup.findViewById(f.f.decor_content_parent);
            this.f681u = b0Var;
            b0Var.setWindowCallback(c0());
            if (this.K) {
                this.f681u.k(109);
            }
            if (this.H) {
                this.f681u.k(2);
            }
            if (this.I) {
                this.f681u.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        if (this.f681u == null) {
            this.F = (TextView) viewGroup.findViewById(f.f.title);
        }
        b1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f675o.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f675o.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void U() {
        if (this.D) {
            return;
        }
        this.E = O();
        CharSequence b02 = b0();
        if (!TextUtils.isEmpty(b02)) {
            b0 b0Var = this.f681u;
            if (b0Var != null) {
                b0Var.setWindowTitle(b02);
            } else if (v0() != null) {
                v0().t(b02);
            } else {
                TextView textView = this.F;
                if (textView != null) {
                    textView.setText(b02);
                }
            }
        }
        G();
        t0(this.E);
        this.D = true;
        m a02 = a0(0, false);
        if (this.V) {
            return;
        }
        if (a02 == null || a02.f715j == null) {
            h0(108);
        }
    }

    private void V() {
        if (this.f675o == null) {
            Object obj = this.f673m;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.f675o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private j Y() {
        if (this.f665b0 == null) {
            this.f665b0 = new i(this.f674n);
        }
        return this.f665b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d0() {
        /*
            r3 = this;
            r3.U()
            boolean r0 = r3.J
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f678r
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f673m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            java.lang.Object r1 = r3.f673m
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.K
            r0.<init>(r1, r2)
        L1d:
            r3.f678r = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            java.lang.Object r1 = r3.f673m
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f678r
            if (r0 == 0) goto L37
            boolean r1 = r3.f669f0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.d0():void");
    }

    private boolean e0(m mVar) {
        View view = mVar.f714i;
        if (view != null) {
            mVar.f713h = view;
            return true;
        } else if (mVar.f715j == null) {
            return false;
        } else {
            if (this.f683w == null) {
                this.f683w = new n();
            }
            View view2 = (View) mVar.a(this.f683w);
            mVar.f713h = view2;
            return view2 != null;
        }
    }

    private boolean f0(m mVar) {
        mVar.d(X());
        mVar.f712g = new l(mVar.f717l);
        mVar.f708c = 81;
        return true;
    }

    private boolean g0(m mVar) {
        Context context = this.f674n;
        int i10 = mVar.f706a;
        if ((i10 == 0 || i10 == 108) && this.f681u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(f.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                k.d dVar = new k.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        mVar.c(eVar);
        return true;
    }

    private void h0(int i10) {
        this.f667d0 = (1 << i10) | this.f667d0;
        if (this.f666c0) {
            return;
        }
        t.A(this.f675o.getDecorView(), this.f668e0);
        this.f666c0 = true;
    }

    private boolean i0() {
        if (!this.Z && (this.f673m instanceof Activity)) {
            PackageManager packageManager = this.f674n.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f674n, this.f673m.getClass()), 0);
                this.Y = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.Y = false;
            }
        }
        this.Z = true;
        return this.Y;
    }

    private boolean n0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            m a02 = a0(i10, true);
            if (a02.f720o) {
                return false;
            }
            return x0(a02, keyEvent);
        }
        return false;
    }

    private boolean q0(int i10, KeyEvent keyEvent) {
        boolean z10;
        b0 b0Var;
        if (this.f684x != null) {
            return false;
        }
        boolean z11 = true;
        m a02 = a0(i10, true);
        if (i10 != 0 || (b0Var = this.f681u) == null || !b0Var.g() || ViewConfiguration.get(this.f674n).hasPermanentMenuKey()) {
            boolean z12 = a02.f720o;
            if (z12 || a02.f719n) {
                N(a02, true);
                z11 = z12;
            } else {
                if (a02.f718m) {
                    if (a02.f723r) {
                        a02.f718m = false;
                        z10 = x0(a02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        u0(a02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f681u.b()) {
            z11 = this.f681u.e();
        } else {
            if (!this.V && x0(a02, keyEvent)) {
                z11 = this.f681u.f();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f674n.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    private void u0(m mVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (mVar.f720o || this.V) {
            return;
        }
        if (mVar.f706a == 0) {
            if ((this.f674n.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback c02 = c0();
        if (c02 != null && !c02.onMenuOpened(mVar.f706a, mVar.f715j)) {
            N(mVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f674n.getSystemService("window");
        if (windowManager != null && x0(mVar, keyEvent)) {
            ViewGroup viewGroup = mVar.f712g;
            if (viewGroup == null || mVar.f722q) {
                if (viewGroup == null) {
                    if (!f0(mVar) || mVar.f712g == null) {
                        return;
                    }
                } else if (mVar.f722q && viewGroup.getChildCount() > 0) {
                    mVar.f712g.removeAllViews();
                }
                if (!e0(mVar) || !mVar.b()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = mVar.f713h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                mVar.f712g.setBackgroundResource(mVar.f707b);
                ViewParent parent = mVar.f713h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(mVar.f713h);
                }
                mVar.f712g.addView(mVar.f713h, layoutParams2);
                if (!mVar.f713h.hasFocus()) {
                    mVar.f713h.requestFocus();
                }
            } else {
                View view = mVar.f714i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    mVar.f719n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, mVar.f709d, mVar.f710e, 1002, 8519680, -3);
                    layoutParams3.gravity = mVar.f708c;
                    layoutParams3.windowAnimations = mVar.f711f;
                    windowManager.addView(mVar.f712g, layoutParams3);
                    mVar.f720o = true;
                }
            }
            i10 = -2;
            mVar.f719n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, mVar.f709d, mVar.f710e, 1002, 8519680, -3);
            layoutParams32.gravity = mVar.f708c;
            layoutParams32.windowAnimations = mVar.f711f;
            windowManager.addView(mVar.f712g, layoutParams32);
            mVar.f720o = true;
        }
    }

    private boolean w0(m mVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f718m || x0(mVar, keyEvent)) && (eVar = mVar.f715j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f681u == null) {
            N(mVar, true);
        }
        return z10;
    }

    private boolean x0(m mVar, KeyEvent keyEvent) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        if (this.V) {
            return false;
        }
        if (mVar.f718m) {
            return true;
        }
        m mVar2 = this.Q;
        if (mVar2 != null && mVar2 != mVar) {
            N(mVar2, false);
        }
        Window.Callback c02 = c0();
        if (c02 != null) {
            mVar.f714i = c02.onCreatePanelView(mVar.f706a);
        }
        int i10 = mVar.f706a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (b0Var3 = this.f681u) != null) {
            b0Var3.c();
        }
        if (mVar.f714i == null) {
            if (z10) {
                v0();
            }
            androidx.appcompat.view.menu.e eVar = mVar.f715j;
            if (eVar == null || mVar.f723r) {
                if (eVar == null && (!g0(mVar) || mVar.f715j == null)) {
                    return false;
                }
                if (z10 && this.f681u != null) {
                    if (this.f682v == null) {
                        this.f682v = new f();
                    }
                    this.f681u.a(mVar.f715j, this.f682v);
                }
                mVar.f715j.d0();
                if (!c02.onCreatePanelMenu(mVar.f706a, mVar.f715j)) {
                    mVar.c(null);
                    if (z10 && (b0Var = this.f681u) != null) {
                        b0Var.a(null, this.f682v);
                    }
                    return false;
                }
                mVar.f723r = false;
            }
            mVar.f715j.d0();
            Bundle bundle = mVar.f724s;
            if (bundle != null) {
                mVar.f715j.P(bundle);
                mVar.f724s = null;
            }
            if (!c02.onPreparePanel(0, mVar.f714i, mVar.f715j)) {
                if (z10 && (b0Var2 = this.f681u) != null) {
                    b0Var2.a(null, this.f682v);
                }
                mVar.f715j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            mVar.f721p = z11;
            mVar.f715j.setQwertyMode(z11);
            mVar.f715j.c0();
        }
        mVar.f718m = true;
        mVar.f719n = false;
        this.Q = mVar;
        return true;
    }

    private void y0(androidx.appcompat.view.menu.e eVar, boolean z10) {
        b0 b0Var = this.f681u;
        if (b0Var == null || !b0Var.g() || (ViewConfiguration.get(this.f674n).hasPermanentMenuKey() && !this.f681u.d())) {
            m a02 = a0(0, true);
            a02.f722q = true;
            N(a02, false);
            u0(a02, null);
            return;
        }
        Window.Callback c02 = c0();
        if (this.f681u.b() && z10) {
            this.f681u.e();
            if (this.V) {
                return;
            }
            c02.onPanelClosed(108, a0(0, true).f715j);
        } else if (c02 == null || this.V) {
        } else {
            if (this.f666c0 && (this.f667d0 & 1) != 0) {
                this.f675o.getDecorView().removeCallbacks(this.f668e0);
                this.f668e0.run();
            }
            m a03 = a0(0, true);
            androidx.appcompat.view.menu.e eVar2 = a03.f715j;
            if (eVar2 == null || a03.f723r || !c02.onPreparePanel(0, a03.f714i, eVar2)) {
                return;
            }
            c02.onMenuOpened(108, a03.f715j);
            this.f681u.f();
        }
    }

    private int z0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    @Override // androidx.appcompat.app.d
    public void A(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f676p.a().onContentChanged();
    }

    final boolean A0() {
        ViewGroup viewGroup;
        return this.D && (viewGroup = this.E) != null && t.u(viewGroup);
    }

    @Override // androidx.appcompat.app.d
    public void B(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f676p.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void C(int i10) {
        this.X = i10;
    }

    public k.b C0(b.a aVar) {
        g.a aVar2;
        if (aVar != null) {
            k.b bVar = this.f684x;
            if (bVar != null) {
                bVar.c();
            }
            g gVar = new g(aVar);
            androidx.appcompat.app.a k10 = k();
            if (k10 != null) {
                k.b u10 = k10.u(gVar);
                this.f684x = u10;
                if (u10 != null && (aVar2 = this.f677q) != null) {
                    aVar2.o(u10);
                }
            }
            if (this.f684x == null) {
                this.f684x = D0(gVar);
            }
            return this.f684x;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.d
    public final void D(CharSequence charSequence) {
        this.f680t = charSequence;
        b0 b0Var = this.f681u;
        if (b0Var != null) {
            b0Var.setWindowTitle(charSequence);
        } else if (v0() != null) {
            v0().t(charSequence);
        } else {
            TextView textView = this.F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    k.b D0(k.b.a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.D0(k.b$a):k.b");
    }

    public boolean E() {
        return F(true);
    }

    int I0(int i10) {
        boolean z10;
        boolean z11;
        ActionBarContextView actionBarContextView = this.f685y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f685y.getLayoutParams();
            if (this.f685y.isShown()) {
                if (this.f670g0 == null) {
                    this.f670g0 = new Rect();
                    this.f671h0 = new Rect();
                }
                Rect rect = this.f670g0;
                Rect rect2 = this.f671h0;
                rect.set(0, i10, 0, 0);
                b1.a(this.E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i10 : 0)) {
                    marginLayoutParams.topMargin = i10;
                    View view = this.G;
                    if (view == null) {
                        View view2 = new View(this.f674n);
                        this.G = view2;
                        view2.setBackgroundColor(this.f674n.getResources().getColor(f.c.abc_input_method_navigation_guard));
                        this.E.addView(this.G, -1, new ViewGroup.LayoutParams(-1, i10));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i10) {
                            layoutParams.height = i10;
                            this.G.setLayoutParams(layoutParams);
                        }
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                r3 = this.G != null;
                if (!this.L && r3) {
                    i10 = 0;
                }
                boolean z12 = r3;
                r3 = z11;
                z10 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r3 = false;
            }
            if (r3) {
                this.f685y.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.G;
        if (view3 != null) {
            view3.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    void J(int i10, m mVar, Menu menu) {
        if (menu == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.P;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                menu = mVar.f715j;
            }
        }
        if ((mVar == null || mVar.f720o) && !this.V) {
            this.f676p.a().onPanelClosed(i10, menu);
        }
    }

    void K(androidx.appcompat.view.menu.e eVar) {
        if (this.O) {
            return;
        }
        this.O = true;
        this.f681u.l();
        Window.Callback c02 = c0();
        if (c02 != null && !this.V) {
            c02.onPanelClosed(108, eVar);
        }
        this.O = false;
    }

    void M(int i10) {
        N(a0(i10, true), true);
    }

    void N(m mVar, boolean z10) {
        ViewGroup viewGroup;
        b0 b0Var;
        if (z10 && mVar.f706a == 0 && (b0Var = this.f681u) != null && b0Var.b()) {
            K(mVar.f715j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f674n.getSystemService("window");
        if (windowManager != null && mVar.f720o && (viewGroup = mVar.f712g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                J(mVar.f706a, mVar, null);
            }
        }
        mVar.f718m = false;
        mVar.f719n = false;
        mVar.f720o = false;
        mVar.f713h = null;
        mVar.f722q = true;
        if (this.Q == mVar) {
            this.Q = null;
        }
    }

    public View P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        AppCompatViewInflater appCompatViewInflater;
        boolean z11 = false;
        if (this.f672i0 == null) {
            String string = this.f674n.obtainStyledAttributes(f.j.f8357z0).getString(f.j.D0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f672i0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f672i0 = appCompatViewInflater;
        }
        boolean z12 = f661k0;
        if (z12) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z11 = B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        return this.f672i0.q(view, str, context, attributeSet, z10, z12, true, a1.b());
    }

    void Q() {
        androidx.appcompat.view.menu.e eVar;
        b0 b0Var = this.f681u;
        if (b0Var != null) {
            b0Var.l();
        }
        if (this.f686z != null) {
            this.f675o.getDecorView().removeCallbacks(this.A);
            if (this.f686z.isShowing()) {
                try {
                    this.f686z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f686z = null;
        }
        T();
        m a02 = a0(0, false);
        if (a02 == null || (eVar = a02.f715j) == null) {
            return;
        }
        eVar.close();
    }

    boolean R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f673m;
        if (((obj instanceof e.a) || (obj instanceof g.b)) && (decorView = this.f675o.getDecorView()) != null && androidx.core.view.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f676p.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m0(keyCode, keyEvent) : p0(keyCode, keyEvent);
    }

    void S(int i10) {
        m a02;
        m a03 = a0(i10, true);
        if (a03.f715j != null) {
            Bundle bundle = new Bundle();
            a03.f715j.Q(bundle);
            if (bundle.size() > 0) {
                a03.f724s = bundle;
            }
            a03.f715j.d0();
            a03.f715j.clear();
        }
        a03.f723r = true;
        a03.f722q = true;
        if ((i10 != 108 && i10 != 0) || this.f681u == null || (a02 = a0(0, false)) == null) {
            return;
        }
        a02.f718m = false;
        x0(a02, null);
    }

    void T() {
        z zVar = this.B;
        if (zVar != null) {
            zVar.c();
        }
    }

    m W(Menu menu) {
        m[] mVarArr = this.P;
        int length = mVarArr != null ? mVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            m mVar = mVarArr[i10];
            if (mVar != null && mVar.f715j == menu) {
                return mVar;
            }
        }
        return null;
    }

    final Context X() {
        androidx.appcompat.app.a k10 = k();
        Context k11 = k10 != null ? k10.k() : null;
        return k11 == null ? this.f674n : k11;
    }

    final j Z() {
        if (this.f664a0 == null) {
            this.f664a0 = new k(androidx.appcompat.app.h.a(this.f674n));
        }
        return this.f664a0;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        m W;
        Window.Callback c02 = c0();
        if (c02 == null || this.V || (W = W(eVar.D())) == null) {
            return false;
        }
        return c02.onMenuItemSelected(W.f706a, menuItem);
    }

    protected m a0(int i10, boolean z10) {
        m[] mVarArr = this.P;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.P = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar == null) {
            m mVar2 = new m(i10);
            mVarArr[i10] = mVar2;
            return mVar2;
        }
        return mVar;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        y0(eVar, true);
    }

    final CharSequence b0() {
        Object obj = this.f673m;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f680t;
    }

    @Override // androidx.appcompat.app.d
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.f676p.a().onContentChanged();
    }

    final Window.Callback c0() {
        return this.f675o.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public void d(Context context) {
        F(false);
        this.S = true;
    }

    @Override // androidx.appcompat.app.d
    public <T extends View> T g(int i10) {
        U();
        return (T) this.f675o.findViewById(i10);
    }

    @Override // androidx.appcompat.app.d
    public int i() {
        return this.W;
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater j() {
        if (this.f679s == null) {
            d0();
            androidx.appcompat.app.a aVar = this.f678r;
            this.f679s = new k.g(aVar != null ? aVar.k() : this.f674n);
        }
        return this.f679s;
    }

    public boolean j0() {
        return this.C;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a k() {
        d0();
        return this.f678r;
    }

    int k0(int i10) {
        j Z;
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        Z = Y();
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f674n.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    Z = Z();
                }
                return Z.c();
            }
            return i10;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.d
    public void l() {
        LayoutInflater from = LayoutInflater.from(this.f674n);
        if (from.getFactory() == null) {
            androidx.core.view.f.a(from, this);
        } else if (from.getFactory2() instanceof e) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    boolean l0() {
        k.b bVar = this.f684x;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a k10 = k();
        return k10 != null && k10.h();
    }

    @Override // androidx.appcompat.app.d
    public void m() {
        androidx.appcompat.app.a k10 = k();
        if (k10 == null || !k10.l()) {
            h0(0);
        }
    }

    boolean m0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.R = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            n0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean o0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a k10 = k();
        if (k10 == null || !k10.o(i10, keyEvent)) {
            m mVar = this.Q;
            if (mVar != null && w0(mVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                m mVar2 = this.Q;
                if (mVar2 != null) {
                    mVar2.f719n = true;
                }
                return true;
            }
            if (this.Q == null) {
                m a02 = a0(0, true);
                x0(a02, keyEvent);
                boolean w02 = w0(a02, keyEvent.getKeyCode(), keyEvent, 1);
                a02.f718m = false;
                if (w02) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public void p(Configuration configuration) {
        androidx.appcompat.app.a k10;
        if (this.J && this.D && (k10 = k()) != null) {
            k10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f674n);
        F(false);
    }

    boolean p0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.R;
            this.R = false;
            m a02 = a0(0, false);
            if (a02 != null && a02.f720o) {
                if (!z10) {
                    N(a02, true);
                }
                return true;
            } else if (l0()) {
                return true;
            }
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void q(Bundle bundle) {
        this.S = true;
        F(false);
        V();
        Object obj = this.f673m;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a v02 = v0();
                if (v02 == null) {
                    this.f669f0 = true;
                } else {
                    v02.r(true);
                }
            }
        }
        this.T = true;
    }

    @Override // androidx.appcompat.app.d
    public void r() {
        androidx.appcompat.app.d.o(this);
        if (this.f666c0) {
            this.f675o.getDecorView().removeCallbacks(this.f668e0);
        }
        this.U = false;
        this.V = true;
        androidx.appcompat.app.a aVar = this.f678r;
        if (aVar != null) {
            aVar.n();
        }
        L();
    }

    void r0(int i10) {
        androidx.appcompat.app.a k10;
        if (i10 != 108 || (k10 = k()) == null) {
            return;
        }
        k10.i(true);
    }

    @Override // androidx.appcompat.app.d
    public void s(Bundle bundle) {
        U();
    }

    void s0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a k10 = k();
            if (k10 != null) {
                k10.i(false);
            }
        } else if (i10 == 0) {
            m a02 = a0(i10, true);
            if (a02.f720o) {
                N(a02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void t() {
        androidx.appcompat.app.a k10 = k();
        if (k10 != null) {
            k10.s(true);
        }
    }

    void t0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.d
    public void u(Bundle bundle) {
        if (this.W != -100) {
            f660j0.put(this.f673m.getClass(), Integer.valueOf(this.W));
        }
    }

    @Override // androidx.appcompat.app.d
    public void v() {
        this.U = true;
        E();
        androidx.appcompat.app.d.n(this);
    }

    final androidx.appcompat.app.a v0() {
        return this.f678r;
    }

    @Override // androidx.appcompat.app.d
    public void w() {
        this.U = false;
        androidx.appcompat.app.d.o(this);
        androidx.appcompat.app.a k10 = k();
        if (k10 != null) {
            k10.s(false);
        }
        if (this.f673m instanceof Dialog) {
            L();
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean y(int i10) {
        int z02 = z0(i10);
        if (this.N && z02 == 108) {
            return false;
        }
        if (this.J && z02 == 1) {
            this.J = false;
        }
        if (z02 == 1) {
            E0();
            this.N = true;
            return true;
        } else if (z02 == 2) {
            E0();
            this.H = true;
            return true;
        } else if (z02 == 5) {
            E0();
            this.I = true;
            return true;
        } else if (z02 == 10) {
            E0();
            this.L = true;
            return true;
        } else if (z02 == 108) {
            E0();
            this.J = true;
            return true;
        } else if (z02 != 109) {
            return this.f675o.requestFeature(z02);
        } else {
            E0();
            this.K = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.d
    public void z(int i10) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f674n).inflate(i10, viewGroup);
        this.f676p.a().onContentChanged();
    }
}
