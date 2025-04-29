package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.v0;
import androidx.core.view.t;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    private boolean A;

    /* renamed from: j  reason: collision with root package name */
    private g f797j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f798k;

    /* renamed from: l  reason: collision with root package name */
    private RadioButton f799l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f800m;

    /* renamed from: n  reason: collision with root package name */
    private CheckBox f801n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f802o;

    /* renamed from: p  reason: collision with root package name */
    private ImageView f803p;

    /* renamed from: q  reason: collision with root package name */
    private ImageView f804q;

    /* renamed from: r  reason: collision with root package name */
    private LinearLayout f805r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f806s;

    /* renamed from: t  reason: collision with root package name */
    private int f807t;

    /* renamed from: u  reason: collision with root package name */
    private Context f808u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f809v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f810w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f811x;

    /* renamed from: y  reason: collision with root package name */
    private int f812y;

    /* renamed from: z  reason: collision with root package name */
    private LayoutInflater f813z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        v0 t10 = v0.t(getContext(), attributeSet, f.j.W1, i10, 0);
        this.f806s = t10.f(f.j.Y1);
        this.f807t = t10.m(f.j.X1, -1);
        this.f809v = t10.a(f.j.Z1, false);
        this.f808u = context;
        this.f810w = t10.f(f.j.f8234a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, f.a.dropDownListViewStyle, 0);
        this.f811x = obtainStyledAttributes.hasValue(0);
        t10.u();
        obtainStyledAttributes.recycle();
    }

    private void b(View view) {
        c(view, -1);
    }

    private void c(View view, int i10) {
        LinearLayout linearLayout = this.f805r;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(f.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f801n = checkBox;
        b(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(f.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f798k = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(f.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f799l = radioButton;
        b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f813z == null) {
            this.f813z = LayoutInflater.from(getContext());
        }
        return this.f813z;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f803p;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f804q;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f804q.getLayoutParams();
        rect.top += this.f804q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f797j = gVar;
        this.f812y = i10;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f797j;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f797j.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f802o.setText(this.f797j.h());
        }
        if (this.f802o.getVisibility() != i10) {
            this.f802o.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        t.F(this, this.f806s);
        TextView textView = (TextView) findViewById(f.f.title);
        this.f800m = textView;
        int i10 = this.f807t;
        if (i10 != -1) {
            textView.setTextAppearance(this.f808u, i10);
        }
        this.f802o = (TextView) findViewById(f.f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.f.submenuarrow);
        this.f803p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f810w);
        }
        this.f804q = (ImageView) findViewById(f.f.group_divider);
        this.f805r = (LinearLayout) findViewById(f.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f798k != null && this.f809v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f798k.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f799l == null && this.f801n == null) {
            return;
        }
        if (this.f797j.m()) {
            if (this.f799l == null) {
                g();
            }
            compoundButton = this.f799l;
            compoundButton2 = this.f801n;
        } else {
            if (this.f801n == null) {
                e();
            }
            compoundButton = this.f801n;
            compoundButton2 = this.f799l;
        }
        if (z10) {
            compoundButton.setChecked(this.f797j.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f801n;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f799l;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f797j.m()) {
            if (this.f799l == null) {
                g();
            }
            compoundButton = this.f799l;
        } else {
            if (this.f801n == null) {
                e();
            }
            compoundButton = this.f801n;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.A = z10;
        this.f809v = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f804q;
        if (imageView != null) {
            imageView.setVisibility((this.f811x || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f797j.z() || this.A;
        if (z10 || this.f809v) {
            ImageView imageView = this.f798k;
            if (imageView == null && drawable == null && !this.f809v) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f809v) {
                this.f798k.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f798k;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f798k.getVisibility() != 0) {
                this.f798k.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f800m.setText(charSequence);
            if (this.f800m.getVisibility() == 0) {
                return;
            }
            textView = this.f800m;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f800m.getVisibility() == 8) {
                return;
            }
            textView = this.f800m;
        }
        textView.setVisibility(i10);
    }
}
