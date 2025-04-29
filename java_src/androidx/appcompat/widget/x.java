package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1394a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1395b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1396c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1397d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1398e;

    /* renamed from: f  reason: collision with root package name */
    private t0 f1399f;

    /* renamed from: g  reason: collision with root package name */
    private t0 f1400g;

    /* renamed from: h  reason: collision with root package name */
    private t0 f1401h;

    /* renamed from: i  reason: collision with root package name */
    private final z f1402i;

    /* renamed from: j  reason: collision with root package name */
    private int f1403j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1404k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1405l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1406m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<x> f1407a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1408b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1409c;

        /* renamed from: androidx.appcompat.widget.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class RunnableC0016a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            private final WeakReference<x> f1410j;

            /* renamed from: k  reason: collision with root package name */
            private final Typeface f1411k;

            RunnableC0016a(WeakReference<x> weakReference, Typeface typeface) {
                this.f1410j = weakReference;
                this.f1411k = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                x xVar = this.f1410j.get();
                if (xVar == null) {
                    return;
                }
                xVar.B(this.f1411k);
            }
        }

        a(x xVar, int i10, int i11) {
            this.f1407a = new WeakReference<>(xVar);
            this.f1408b = i10;
            this.f1409c = i11;
        }

        @Override // androidx.core.content.res.h.e
        public void h(int i10) {
        }

        @Override // androidx.core.content.res.h.e
        public void i(Typeface typeface) {
            int i10;
            x xVar = this.f1407a.get();
            if (xVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1408b) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1409c & 2) != 0);
            }
            xVar.q(new RunnableC0016a(this.f1407a, typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(TextView textView) {
        this.f1394a = textView;
        this.f1402i = new z(textView);
    }

    private void A(int i10, float f10) {
        this.f1402i.v(i10, f10);
    }

    private void C(Context context, v0 v0Var) {
        String n10;
        Typeface create;
        Typeface typeface;
        this.f1403j = v0Var.j(f.j.M2, this.f1403j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int j10 = v0Var.j(f.j.R2, -1);
            this.f1404k = j10;
            if (j10 != -1) {
                this.f1403j = (this.f1403j & 2) | 0;
            }
        }
        int i11 = f.j.Q2;
        if (!v0Var.q(i11) && !v0Var.q(f.j.S2)) {
            int i12 = f.j.L2;
            if (v0Var.q(i12)) {
                this.f1406m = false;
                int j11 = v0Var.j(i12, 1);
                if (j11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1405l = typeface;
                return;
            }
            return;
        }
        this.f1405l = null;
        int i13 = f.j.S2;
        if (v0Var.q(i13)) {
            i11 = i13;
        }
        int i14 = this.f1404k;
        int i15 = this.f1403j;
        if (!context.isRestricted()) {
            try {
                Typeface i16 = v0Var.i(i11, this.f1403j, new a(this, i14, i15));
                if (i16 != null) {
                    if (i10 >= 28 && this.f1404k != -1) {
                        i16 = Typeface.create(Typeface.create(i16, 0), this.f1404k, (this.f1403j & 2) != 0);
                    }
                    this.f1405l = i16;
                }
                this.f1406m = this.f1405l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1405l != null || (n10 = v0Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1404k == -1) {
            create = Typeface.create(n10, this.f1403j);
        } else {
            create = Typeface.create(Typeface.create(n10, 0), this.f1404k, (this.f1403j & 2) != 0);
        }
        this.f1405l = create;
    }

    private void a(Drawable drawable, t0 t0Var) {
        if (drawable == null || t0Var == null) {
            return;
        }
        j.i(drawable, t0Var, this.f1394a.getDrawableState());
    }

    private static t0 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 != null) {
            t0 t0Var = new t0();
            t0Var.f1335d = true;
            t0Var.f1332a = f10;
            return t0Var;
        }
        return null;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1394a.getCompoundDrawablesRelative();
            TextView textView = this.f1394a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] compoundDrawablesRelative2 = this.f1394a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f1394a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.f1394a.getCompoundDrawables();
            TextView textView3 = this.f1394a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        t0 t0Var = this.f1401h;
        this.f1395b = t0Var;
        this.f1396c = t0Var;
        this.f1397d = t0Var;
        this.f1398e = t0Var;
        this.f1399f = t0Var;
        this.f1400g = t0Var;
    }

    public void B(Typeface typeface) {
        if (this.f1406m) {
            this.f1394a.setTypeface(typeface);
            this.f1405l = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1395b != null || this.f1396c != null || this.f1397d != null || this.f1398e != null) {
            Drawable[] compoundDrawables = this.f1394a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1395b);
            a(compoundDrawables[1], this.f1396c);
            a(compoundDrawables[2], this.f1397d);
            a(compoundDrawables[3], this.f1398e);
        }
        if (this.f1399f == null && this.f1400g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1394a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1399f);
        a(compoundDrawablesRelative[2], this.f1400g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f1402i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1402i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1402i.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1402i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f1402i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1402i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        t0 t0Var = this.f1401h;
        if (t0Var != null) {
            return t0Var.f1332a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        t0 t0Var = this.f1401h;
        if (t0Var != null) {
            return t0Var.f1333b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1402i.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.m(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z10, int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f2003b) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Context context, int i10) {
        String n10;
        ColorStateList c10;
        v0 r10 = v0.r(context, i10, f.j.J2);
        int i11 = f.j.U2;
        if (r10.q(i11)) {
            r(r10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = f.j.N2;
            if (r10.q(i13) && (c10 = r10.c(i13)) != null) {
                this.f1394a.setTextColor(c10);
            }
        }
        int i14 = f.j.K2;
        if (r10.q(i14) && r10.e(i14, -1) == 0) {
            this.f1394a.setTextSize(0, 0.0f);
        }
        C(context, r10);
        if (i12 >= 26) {
            int i15 = f.j.T2;
            if (r10.q(i15) && (n10 = r10.n(i15)) != null) {
                this.f1394a.setFontVariationSettings(n10);
            }
        }
        r10.u();
        Typeface typeface = this.f1405l;
        if (typeface != null) {
            this.f1394a.setTypeface(typeface, this.f1403j);
        }
    }

    public void q(Runnable runnable) {
        this.f1394a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f1394a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10, int i11, int i12, int i13) {
        this.f1402i.r(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int[] iArr, int i10) {
        this.f1402i.s(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        this.f1402i.t(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.f1401h == null) {
            this.f1401h = new t0();
        }
        t0 t0Var = this.f1401h;
        t0Var.f1332a = colorStateList;
        t0Var.f1335d = colorStateList != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.f1401h == null) {
            this.f1401h = new t0();
        }
        t0 t0Var = this.f1401h;
        t0Var.f1333b = mode;
        t0Var.f1334c = mode != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i10, float f10) {
        if (androidx.core.widget.b.f2003b || l()) {
            return;
        }
        A(i10, f10);
    }
}
