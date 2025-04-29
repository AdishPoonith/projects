package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private int f1920a;

    /* renamed from: b  reason: collision with root package name */
    private int f1921b;

    public o(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1920a | this.f1921b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f1921b = i10;
        } else {
            this.f1920a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f1921b = 0;
        } else {
            this.f1920a = 0;
        }
    }
}
