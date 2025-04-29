package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f1915a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f1916b;

    /* renamed from: c  reason: collision with root package name */
    private final View f1917c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1918d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f1919e;

    public l(View view) {
        this.f1917c = view;
    }

    private boolean f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent g10;
        int i15;
        int i16;
        int[] iArr3;
        if (!j() || (g10 = g(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1917c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] h10 = h();
            h10[0] = 0;
            h10[1] = 0;
            iArr3 = h10;
        } else {
            iArr3 = iArr2;
        }
        x.d(g10, this.f1917c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f1917c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f1916b;
        }
        return this.f1915a;
    }

    private int[] h() {
        if (this.f1919e == null) {
            this.f1919e = new int[2];
        }
        return this.f1919e;
    }

    private void l(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f1915a = viewParent;
        } else if (i10 != 1) {
        } else {
            this.f1916b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent g10;
        if (!j() || (g10 = g(0)) == null) {
            return false;
        }
        return x.a(g10, this.f1917c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent g10;
        if (!j() || (g10 = g(0)) == null) {
            return false;
        }
        return x.b(g10, this.f1917c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent g10;
        int i13;
        int i14;
        if (!j() || (g10 = g(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1917c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x.c(g10, this.f1917c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f1917c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean e(int i10, int i11, int i12, int i13, int[] iArr) {
        return f(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean i(int i10) {
        return g(i10) != null;
    }

    public boolean j() {
        return this.f1918d;
    }

    public void k(boolean z10) {
        if (this.f1918d) {
            t.P(this.f1917c);
        }
        this.f1918d = z10;
    }

    public boolean m(int i10, int i11) {
        if (i(i11)) {
            return true;
        }
        if (j()) {
            View view = this.f1917c;
            for (ViewParent parent = this.f1917c.getParent(); parent != null; parent = parent.getParent()) {
                if (x.f(parent, view, this.f1917c, i10, i11)) {
                    l(i11, parent);
                    x.e(parent, view, this.f1917c, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void n(int i10) {
        ViewParent g10 = g(i10);
        if (g10 != null) {
            x.g(g10, this.f1917c, i10);
            l(i10, null);
        }
    }
}
