package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1727a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1728b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1729c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1730d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f1729c = null;
        this.f1730d = d.f1719p;
        if (fVar != null) {
            this.f1727a = fVar.f1727a;
            this.f1728b = fVar.f1728b;
            this.f1729c = fVar.f1729c;
            this.f1730d = fVar.f1730d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f1728b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f1727a;
        Drawable.ConstantState constantState = this.f1728b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
