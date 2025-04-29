package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.l0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f1234b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f1235c;

    /* renamed from: a  reason: collision with root package name */
    private l0 f1236a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements l0.e {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1237a = {f.e.abc_textfield_search_default_mtrl_alpha, f.e.abc_textfield_default_mtrl_alpha, f.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1238b = {f.e.abc_ic_commit_search_api_mtrl_alpha, f.e.abc_seekbar_tick_mark_material, f.e.abc_ic_menu_share_mtrl_alpha, f.e.abc_ic_menu_copy_mtrl_am_alpha, f.e.abc_ic_menu_cut_mtrl_alpha, f.e.abc_ic_menu_selectall_mtrl_alpha, f.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1239c = {f.e.abc_textfield_activated_mtrl_alpha, f.e.abc_textfield_search_activated_mtrl_alpha, f.e.abc_cab_background_top_mtrl_alpha, f.e.abc_text_cursor_material, f.e.abc_text_select_handle_left_mtrl_dark, f.e.abc_text_select_handle_middle_mtrl_dark, f.e.abc_text_select_handle_right_mtrl_dark, f.e.abc_text_select_handle_left_mtrl_light, f.e.abc_text_select_handle_middle_mtrl_light, f.e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1240d = {f.e.abc_popup_background_mtrl_mult, f.e.abc_cab_background_internal_bg, f.e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1241e = {f.e.abc_tab_indicator_material, f.e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1242f = {f.e.abc_btn_check_material, f.e.abc_btn_radio_material, f.e.abc_btn_check_material_anim, f.e.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int b10 = q0.b(context, f.a.colorControlHighlight);
            return new ColorStateList(new int[][]{q0.f1314b, q0.f1317e, q0.f1315c, q0.f1321i}, new int[]{q0.a(context, f.a.colorButtonNormal), androidx.core.graphics.a.c(b10, i10), androidx.core.graphics.a.c(b10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, q0.b(context, f.a.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, q0.b(context, f.a.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = f.a.colorSwitchThumbNormal;
            ColorStateList d10 = q0.d(context, i10);
            if (d10 == null || !d10.isStateful()) {
                iArr[0] = q0.f1314b;
                iArr2[0] = q0.a(context, i10);
                iArr[1] = q0.f1318f;
                iArr2[1] = q0.b(context, f.a.colorControlActivated);
                iArr[2] = q0.f1321i;
                iArr2[2] = q0.b(context, i10);
            } else {
                iArr[0] = q0.f1314b;
                iArr2[0] = d10.getColorForState(iArr[0], 0);
                iArr[1] = q0.f1318f;
                iArr2[1] = q0.b(context, f.a.colorControlActivated);
                iArr[2] = q0.f1321i;
                iArr2[2] = d10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (d0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1234b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.l0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f1237a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = f.a.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f1239c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = f.a.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.f1240d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = f.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = f.e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.d0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.q0.b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.l0.e
        public PorterDuff.Mode b(int i10) {
            if (i10 == f.e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.l0.e
        public Drawable c(l0 l0Var, Context context, int i10) {
            if (i10 == f.e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{l0Var.j(context, f.e.abc_cab_background_internal_bg), l0Var.j(context, f.e.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.l0.e
        public ColorStateList d(Context context, int i10) {
            if (i10 == f.e.abc_edit_text_material) {
                return h.a.c(context, f.c.abc_tint_edittext);
            }
            if (i10 == f.e.abc_switch_track_mtrl_alpha) {
                return h.a.c(context, f.c.abc_tint_switch_track);
            }
            if (i10 == f.e.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == f.e.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == f.e.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == f.e.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == f.e.abc_spinner_mtrl_am_alpha || i10 == f.e.abc_spinner_textfield_background_material) {
                return h.a.c(context, f.c.abc_tint_spinner);
            }
            if (f(this.f1238b, i10)) {
                return q0.d(context, f.a.colorControlNormal);
            }
            if (f(this.f1241e, i10)) {
                return h.a.c(context, f.c.abc_tint_default);
            }
            if (f(this.f1242f, i10)) {
                return h.a.c(context, f.c.abc_tint_btn_checkable);
            }
            if (i10 == f.e.abc_seekbar_thumb_material) {
                return h.a.c(context, f.c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.l0.e
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int b10;
            if (i10 == f.e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = f.a.colorControlNormal;
                l(findDrawableByLayerId2, q0.b(context, i11), j.f1234b);
                l(layerDrawable.findDrawableByLayerId(16908303), q0.b(context, i11), j.f1234b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                b10 = q0.b(context, f.a.colorControlActivated);
            } else if (i10 != f.e.abc_ratingbar_material && i10 != f.e.abc_ratingbar_indicator_material && i10 != f.e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), q0.a(context, f.a.colorControlNormal), j.f1234b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = f.a.colorControlActivated;
                l(findDrawableByLayerId3, q0.b(context, i12), j.f1234b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                b10 = q0.b(context, i12);
            }
            l(findDrawableByLayerId, b10, j.f1234b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1235c == null) {
                h();
            }
            jVar = f1235c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = l0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1235c == null) {
                j jVar = new j();
                f1235c = jVar;
                jVar.f1236a = l0.h();
                f1235c.f1236a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, t0 t0Var, int[] iArr) {
        l0.w(drawable, t0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1236a.j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1236a.k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1236a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1236a.s(context);
    }
}
