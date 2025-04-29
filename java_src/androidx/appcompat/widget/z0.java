package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* loaded from: classes.dex */
class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1443a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1444b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1445c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1446d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1447e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1448f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1449g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1446d = layoutParams;
        this.f1447e = new Rect();
        this.f1448f = new int[2];
        this.f1449g = new int[2];
        this.f1443a = context;
        View inflate = LayoutInflater.from(context).inflate(f.g.abc_tooltip, (ViewGroup) null);
        this.f1444b = inflate;
        this.f1445c = (TextView) inflate.findViewById(f.f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = f.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1443a.getResources().getDimensionPixelOffset(f.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1443a.getResources().getDimensionPixelOffset(f.d.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1443a.getResources().getDimensionPixelOffset(z10 ? f.d.tooltip_y_offset_touch : f.d.tooltip_y_offset_non_touch);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1447e);
        Rect rect = this.f1447e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1443a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1447e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1449g);
        view.getLocationOnScreen(this.f1448f);
        int[] iArr = this.f1448f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1449g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1444b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1444b.getMeasuredHeight();
        int[] iArr3 = this.f1448f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i15 <= this.f1447e.height() : i14 < 0) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1443a.getSystemService("window")).removeView(this.f1444b);
        }
    }

    boolean d() {
        return this.f1444b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1445c.setText(charSequence);
        a(view, i10, i11, z10, this.f1446d);
        ((WindowManager) this.f1443a.getSystemService("window")).addView(this.f1444b, this.f1446d);
    }
}
