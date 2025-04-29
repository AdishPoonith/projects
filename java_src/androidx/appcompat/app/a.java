package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import f.j;
import k.b;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0011a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f653a;

        public C0011a(int i10, int i11) {
            super(i10, i11);
            this.f653a = 8388627;
        }

        public C0011a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f653a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8326t);
            this.f653a = obtainStyledAttributes.getInt(j.f8331u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0011a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f653a = 0;
        }

        public C0011a(C0011a c0011a) {
            super((ViewGroup.MarginLayoutParams) c0011a);
            this.f653a = 0;
            this.f653a = c0011a.f653a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(CharSequence charSequence);

    public abstract k.b u(b.a aVar);
}
