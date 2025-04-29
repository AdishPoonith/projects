package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1204a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1205b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1206c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1207d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1208e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1209f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CompoundButton compoundButton) {
        this.f1204a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.c.a(this.f1204a);
        if (a10 != null) {
            if (this.f1207d || this.f1208e) {
                Drawable mutate = androidx.core.graphics.drawable.a.p(a10).mutate();
                if (this.f1207d) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f1205b);
                }
                if (this.f1208e) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1206c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1204a.getDrawableState());
                }
                this.f1204a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1205b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1206c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #1 {all -> 0x0074, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:11:0x002d, B:13:0x0035, B:15:0x003b, B:16:0x0048, B:18:0x0050, B:19:0x0059, B:21:0x0061), top: B:30:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:11:0x002d, B:13:0x0035, B:15:0x003b, B:16:0x0048, B:18:0x0050, B:19:0x0059, B:21:0x0061), top: B:30:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:11:0x002d, B:13:0x0035, B:15:0x003b, B:16:0x0048, B:18:0x0050, B:19:0x0059, B:21:0x0061), top: B:30:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f1204a
            android.content.Context r0 = r0.getContext()
            int[] r1 = f.j.R0
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = f.j.T0     // Catch: java.lang.Throwable -> L74
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L2a
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L2a
            android.widget.CompoundButton r0 = r3.f1204a     // Catch: android.content.res.Resources.NotFoundException -> L2a java.lang.Throwable -> L74
            android.content.Context r1 = r0.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L2a java.lang.Throwable -> L74
            android.graphics.drawable.Drawable r5 = h.a.d(r1, r5)     // Catch: android.content.res.Resources.NotFoundException -> L2a java.lang.Throwable -> L74
            r0.setButtonDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2a java.lang.Throwable -> L74
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 != 0) goto L48
            int r5 = f.j.S0     // Catch: java.lang.Throwable -> L74
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L48
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L48
            android.widget.CompoundButton r0 = r3.f1204a     // Catch: java.lang.Throwable -> L74
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Throwable -> L74
            android.graphics.drawable.Drawable r5 = h.a.d(r1, r5)     // Catch: java.lang.Throwable -> L74
            r0.setButtonDrawable(r5)     // Catch: java.lang.Throwable -> L74
        L48:
            int r5 = f.j.U0     // Catch: java.lang.Throwable -> L74
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L59
            android.widget.CompoundButton r0 = r3.f1204a     // Catch: java.lang.Throwable -> L74
            android.content.res.ColorStateList r5 = r4.getColorStateList(r5)     // Catch: java.lang.Throwable -> L74
            androidx.core.widget.c.b(r0, r5)     // Catch: java.lang.Throwable -> L74
        L59:
            int r5 = f.j.V0     // Catch: java.lang.Throwable -> L74
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L70
            android.widget.CompoundButton r0 = r3.f1204a     // Catch: java.lang.Throwable -> L74
            r1 = -1
            int r5 = r4.getInt(r5, r1)     // Catch: java.lang.Throwable -> L74
            r1 = 0
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.d0.d(r5, r1)     // Catch: java.lang.Throwable -> L74
            androidx.core.widget.c.c(r0, r5)     // Catch: java.lang.Throwable -> L74
        L70:
            r4.recycle()
            return
        L74:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1209f) {
            this.f1209f = false;
            return;
        }
        this.f1209f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1205b = colorStateList;
        this.f1207d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1206c = mode;
        this.f1208e = true;
        a();
    }
}
