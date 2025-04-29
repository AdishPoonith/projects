package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.v0;
import f.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f12445e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f12446f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f12447a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f12448b;

    /* renamed from: c  reason: collision with root package name */
    Context f12449c;

    /* renamed from: d  reason: collision with root package name */
    private Object f12450d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f12451c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f12452a;

        /* renamed from: b  reason: collision with root package name */
        private Method f12453b;

        public a(Object obj, String str) {
            this.f12452a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f12453b = cls.getMethod(str, f12451c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f12453b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f12453b.invoke(this.f12452a, menuItem)).booleanValue();
                }
                this.f12453b.invoke(this.f12452a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f12454a;

        /* renamed from: b  reason: collision with root package name */
        private int f12455b;

        /* renamed from: c  reason: collision with root package name */
        private int f12456c;

        /* renamed from: d  reason: collision with root package name */
        private int f12457d;

        /* renamed from: e  reason: collision with root package name */
        private int f12458e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12459f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f12460g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f12461h;

        /* renamed from: i  reason: collision with root package name */
        private int f12462i;

        /* renamed from: j  reason: collision with root package name */
        private int f12463j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f12464k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f12465l;

        /* renamed from: m  reason: collision with root package name */
        private int f12466m;

        /* renamed from: n  reason: collision with root package name */
        private char f12467n;

        /* renamed from: o  reason: collision with root package name */
        private int f12468o;

        /* renamed from: p  reason: collision with root package name */
        private char f12469p;

        /* renamed from: q  reason: collision with root package name */
        private int f12470q;

        /* renamed from: r  reason: collision with root package name */
        private int f12471r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f12472s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f12473t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f12474u;

        /* renamed from: v  reason: collision with root package name */
        private int f12475v;

        /* renamed from: w  reason: collision with root package name */
        private int f12476w;

        /* renamed from: x  reason: collision with root package name */
        private String f12477x;

        /* renamed from: y  reason: collision with root package name */
        private String f12478y;

        /* renamed from: z  reason: collision with root package name */
        private String f12479z;

        public b(Menu menu) {
            this.f12454a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f12449c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f12472s).setVisible(this.f12473t).setEnabled(this.f12474u).setCheckable(this.f12471r >= 1).setTitleCondensed(this.f12465l).setIcon(this.f12466m);
            int i10 = this.f12475v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f12479z != null) {
                if (g.this.f12449c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f12479z));
            }
            boolean z11 = menuItem instanceof androidx.appcompat.view.menu.g;
            if (z11) {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menuItem;
            }
            if (this.f12471r >= 2) {
                if (z11) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof l.c) {
                    ((l.c) menuItem).h(true);
                }
            }
            String str = this.f12477x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f12445e, g.this.f12447a));
                z10 = true;
            }
            int i11 = this.f12476w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                androidx.core.view.i.a(menuItem, bVar);
            }
            androidx.core.view.i.c(menuItem, this.B);
            androidx.core.view.i.g(menuItem, this.C);
            androidx.core.view.i.b(menuItem, this.f12467n, this.f12468o);
            androidx.core.view.i.f(menuItem, this.f12469p, this.f12470q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                androidx.core.view.i.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                androidx.core.view.i.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f12461h = true;
            i(this.f12454a.add(this.f12455b, this.f12462i, this.f12463j, this.f12464k));
        }

        public SubMenu b() {
            this.f12461h = true;
            SubMenu addSubMenu = this.f12454a.addSubMenu(this.f12455b, this.f12462i, this.f12463j, this.f12464k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f12461h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f12449c.obtainStyledAttributes(attributeSet, j.f8318r1);
            this.f12455b = obtainStyledAttributes.getResourceId(j.f8328t1, 0);
            this.f12456c = obtainStyledAttributes.getInt(j.f8338v1, 0);
            this.f12457d = obtainStyledAttributes.getInt(j.f8343w1, 0);
            this.f12458e = obtainStyledAttributes.getInt(j.f8348x1, 0);
            this.f12459f = obtainStyledAttributes.getBoolean(j.f8333u1, true);
            this.f12460g = obtainStyledAttributes.getBoolean(j.f8323s1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            v0 s10 = v0.s(g.this.f12449c, attributeSet, j.f8353y1);
            this.f12462i = s10.m(j.B1, 0);
            this.f12463j = (s10.j(j.E1, this.f12456c) & (-65536)) | (s10.j(j.F1, this.f12457d) & 65535);
            this.f12464k = s10.o(j.G1);
            this.f12465l = s10.o(j.H1);
            this.f12466m = s10.m(j.f8358z1, 0);
            this.f12467n = c(s10.n(j.I1));
            this.f12468o = s10.j(j.P1, 4096);
            this.f12469p = c(s10.n(j.J1));
            this.f12470q = s10.j(j.T1, 4096);
            int i10 = j.K1;
            this.f12471r = s10.q(i10) ? s10.a(i10, false) : this.f12458e;
            this.f12472s = s10.a(j.C1, false);
            this.f12473t = s10.a(j.D1, this.f12459f);
            this.f12474u = s10.a(j.A1, this.f12460g);
            this.f12475v = s10.j(j.U1, -1);
            this.f12479z = s10.n(j.L1);
            this.f12476w = s10.m(j.M1, 0);
            this.f12477x = s10.n(j.O1);
            String n10 = s10.n(j.N1);
            this.f12478y = n10;
            boolean z10 = n10 != null;
            if (z10 && this.f12476w == 0 && this.f12477x == null) {
                this.A = (androidx.core.view.b) e(n10, g.f12446f, g.this.f12448b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = s10.o(j.Q1);
            this.C = s10.o(j.V1);
            int i11 = j.S1;
            if (s10.q(i11)) {
                this.E = d0.d(s10.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.R1;
            if (s10.q(i12)) {
                this.D = s10.c(i12);
            } else {
                this.D = null;
            }
            s10.u();
            this.f12461h = false;
        }

        public void h() {
            this.f12455b = 0;
            this.f12456c = 0;
            this.f12457d = 0;
            this.f12458e = 0;
            this.f12459f = true;
            this.f12460g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f12445e = clsArr;
        f12446f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f12449c = context;
        Object[] objArr = {context};
        this.f12447a = objArr;
        this.f12448b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            k.g$b r0 = new k.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f12450d == null) {
            this.f12450d = a(this.f12449c);
        }
        return this.f12450d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof u.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f12449c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
