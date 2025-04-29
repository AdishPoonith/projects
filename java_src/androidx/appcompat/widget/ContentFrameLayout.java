package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private TypedValue f1012j;

    /* renamed from: k  reason: collision with root package name */
    private TypedValue f1013k;

    /* renamed from: l  reason: collision with root package name */
    private TypedValue f1014l;

    /* renamed from: m  reason: collision with root package name */
    private TypedValue f1015m;

    /* renamed from: n  reason: collision with root package name */
    private TypedValue f1016n;

    /* renamed from: o  reason: collision with root package name */
    private TypedValue f1017o;

    /* renamed from: p  reason: collision with root package name */
    private final Rect f1018p;

    /* renamed from: q  reason: collision with root package name */
    private a f1019q;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1018p = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f1018p.set(i10, i11, i12, i13);
        if (androidx.core.view.t.u(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1016n == null) {
            this.f1016n = new TypedValue();
        }
        return this.f1016n;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1017o == null) {
            this.f1017o = new TypedValue();
        }
        return this.f1017o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1014l == null) {
            this.f1014l = new TypedValue();
        }
        return this.f1014l;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1015m == null) {
            this.f1015m = new TypedValue();
        }
        return this.f1015m;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1012j == null) {
            this.f1012j = new TypedValue();
        }
        return this.f1012j;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1013k == null) {
            this.f1013k = new TypedValue();
        }
        return this.f1013k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1019q;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1019q;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1019q = aVar;
    }
}
