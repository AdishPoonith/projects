package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.s;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.q;
import java.util.HashMap;
import q8.p;
/* loaded from: classes.dex */
public class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f10394a;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f10395b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f10396c;

    /* renamed from: d  reason: collision with root package name */
    private final p f10397d;

    /* renamed from: e  reason: collision with root package name */
    private c f10398e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private p.b f10399f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<p.b> f10400g;

    /* renamed from: h  reason: collision with root package name */
    private io.flutter.plugin.editing.c f10401h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10402i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f10403j;

    /* renamed from: k  reason: collision with root package name */
    private q f10404k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f10405l;

    /* renamed from: m  reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f10406m;

    /* renamed from: n  reason: collision with root package name */
    private p.e f10407n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10408o;

    /* loaded from: classes.dex */
    class a implements p.f {
        a() {
        }

        @Override // q8.p.f
        public void a() {
            f fVar = f.this;
            fVar.F(fVar.f10394a);
        }

        @Override // q8.p.f
        public void b() {
            f.this.m();
        }

        @Override // q8.p.f
        public void c(String str, Bundle bundle) {
            f.this.B(str, bundle);
        }

        @Override // q8.p.f
        public void d(int i10, boolean z10) {
            f.this.C(i10, z10);
        }

        @Override // q8.p.f
        public void e(double d10, double d11, double[] dArr) {
            f.this.A(d10, d11, dArr);
        }

        @Override // q8.p.f
        public void f(p.e eVar) {
            f fVar = f.this;
            fVar.E(fVar.f10394a, eVar);
        }

        @Override // q8.p.f
        public void g() {
            f.this.x();
        }

        @Override // q8.p.f
        public void h(int i10, p.b bVar) {
            f.this.D(i10, bVar);
        }

        @Override // q8.p.f
        public void i(boolean z10) {
            if (Build.VERSION.SDK_INT < 26 || f.this.f10396c == null) {
                return;
            }
            if (z10) {
                f.this.f10396c.commit();
            } else {
                f.this.f10396c.cancel();
            }
        }

        @Override // q8.p.f
        public void j() {
            if (f.this.f10398e.f10414a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
                return;
            }
            f fVar = f.this;
            fVar.s(fVar.f10394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f10411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double[] f10412c;

        b(boolean z10, double[] dArr, double[] dArr2) {
            this.f10410a = z10;
            this.f10411b = dArr;
            this.f10412c = dArr2;
        }

        @Override // io.flutter.plugin.editing.f.d
        public void a(double d10, double d11) {
            double d12 = 1.0d;
            if (!this.f10410a) {
                double[] dArr = this.f10411b;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = this.f10411b;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = this.f10412c;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        a f10414a;

        /* renamed from: b  reason: collision with root package name */
        int f10415b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i10) {
            this.f10414a = aVar;
            this.f10415b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        void a(double d10, double d11);
    }

    public f(View view, p pVar, q qVar) {
        this.f10394a = view;
        this.f10401h = new io.flutter.plugin.editing.c(null, view);
        this.f10395b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        this.f10396c = i10 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i10 >= 30) {
            int navigationBars = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.f10406m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f10397d = pVar;
        pVar.n(new a());
        pVar.k();
        this.f10404k = qVar;
        qVar.C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(double d10, double d11, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12] / dArr[15];
        dArr2[1] = d12;
        dArr2[0] = d12;
        double d13 = dArr[13] / dArr[15];
        dArr2[3] = d13;
        dArr2[2] = d13;
        b bVar = new b(z10, dArr, dArr2);
        bVar.a(d10, 0.0d);
        bVar.a(d10, d11);
        bVar.a(0.0d, d11);
        Float valueOf = Float.valueOf(this.f10394a.getContext().getResources().getDisplayMetrics().density);
        this.f10405l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i10, boolean z10) {
        if (!z10) {
            this.f10398e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f10403j = null;
            return;
        }
        this.f10394a.requestFocus();
        this.f10398e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
        this.f10395b.restartInput(this.f10394a);
        this.f10402i = false;
    }

    private void H(p.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f16471j == null) {
            this.f10400g = null;
            return;
        }
        p.b[] bVarArr = bVar.f16473l;
        SparseArray<p.b> sparseArray = new SparseArray<>();
        this.f10400g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f16471j.f16474a.hashCode(), bVar);
            return;
        }
        for (p.b bVar2 : bVarArr) {
            p.b.a aVar = bVar2.f16471j;
            if (aVar != null) {
                this.f10400g.put(aVar.f16474a.hashCode(), bVar2);
                this.f10396c.notifyValueChanged(this.f10394a, aVar.f16474a.hashCode(), AutofillValue.forText(aVar.f16476c.f16487a));
            }
        }
    }

    private boolean k() {
        p.c cVar;
        p.b bVar = this.f10399f;
        return bVar == null || (cVar = bVar.f16468g) == null || cVar.f16478a != p.g.NONE;
    }

    private static boolean n(p.e eVar, p.e eVar2) {
        int i10 = eVar.f16491e - eVar.f16490d;
        if (i10 != eVar2.f16491e - eVar2.f16490d) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (eVar.f16487a.charAt(eVar.f16490d + i11) != eVar2.f16487a.charAt(eVar2.f16490d + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f10395b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(p.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, p.d dVar) {
        p.g gVar = cVar.f16478a;
        if (gVar == p.g.DATETIME) {
            return 4;
        }
        if (gVar == p.g.NUMBER) {
            int i10 = cVar.f16479b ? 4098 : 2;
            return cVar.f16480c ? i10 | 8192 : i10;
        } else if (gVar == p.g.PHONE) {
            return 3;
        } else {
            if (gVar == p.g.NONE) {
                return 0;
            }
            int i11 = 1;
            if (gVar == p.g.MULTILINE) {
                i11 = 131073;
            } else if (gVar == p.g.EMAIL_ADDRESS) {
                i11 = 33;
            } else if (gVar == p.g.URL) {
                i11 = 17;
            } else if (gVar == p.g.VISIBLE_PASSWORD) {
                i11 = 145;
            } else if (gVar == p.g.NAME) {
                i11 = 97;
            } else if (gVar == p.g.POSTAL_ADDRESS) {
                i11 = 113;
            }
            if (z10) {
                i11 = i11 | 524288 | 128;
            } else {
                if (z11) {
                    i11 |= 32768;
                }
                if (!z12) {
                    i11 |= 524288;
                }
            }
            return dVar == p.d.CHARACTERS ? i11 | 4096 : dVar == p.d.WORDS ? i11 | 8192 : dVar == p.d.SENTENCES ? i11 | 16384 : i11;
        }
    }

    private boolean v() {
        return this.f10400g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f10396c == null || !v()) {
            return;
        }
        this.f10396c.notifyValueChanged(this.f10394a, this.f10399f.f16471j.f16474a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f10396c == null || !v()) {
            return;
        }
        String str = this.f10399f.f16471j.f16474a;
        int[] iArr = new int[2];
        this.f10394a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f10405l);
        rect.offset(iArr[0], iArr[1]);
        this.f10396c.notifyViewEntered(this.f10394a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        p.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f10396c == null || (bVar = this.f10399f) == null || bVar.f16471j == null || !v()) {
            return;
        }
        this.f10396c.notifyViewExited(this.f10394a, this.f10399f.f16471j.f16474a.hashCode());
    }

    public void B(String str, Bundle bundle) {
        this.f10395b.sendAppPrivateCommand(this.f10394a, str, bundle);
    }

    void D(int i10, p.b bVar) {
        y();
        this.f10399f = bVar;
        this.f10398e = k() ? new c(c.a.FRAMEWORK_CLIENT, i10) : new c(c.a.NO_TARGET, i10);
        this.f10401h.l(this);
        p.b.a aVar = bVar.f16471j;
        this.f10401h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f16476c : null, this.f10394a);
        H(bVar);
        this.f10402i = true;
        G();
        this.f10405l = null;
        this.f10401h.a(this);
    }

    void E(View view, p.e eVar) {
        p.e eVar2;
        if (!this.f10402i && (eVar2 = this.f10407n) != null && eVar2.b()) {
            boolean n10 = n(this.f10407n, eVar);
            this.f10402i = n10;
            if (n10) {
                d8.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f10407n = eVar;
        this.f10401h.n(eVar);
        if (this.f10402i) {
            this.f10395b.restartInput(view);
            this.f10402i = false;
        }
    }

    void F(View view) {
        if (!k()) {
            s(view);
            return;
        }
        view.requestFocus();
        this.f10395b.showSoftInput(view, 0);
    }

    public void G() {
        if (this.f10398e.f10414a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10408o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == r1.f16491e) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.f10401h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.f10401h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f10401h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f10401h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f10401h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f10401h
            java.util.ArrayList r0 = r0.e()
            q8.p$e r1 = r8.f10407n
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.c r1 = r8.f10401h
            java.lang.String r1 = r1.toString()
            q8.p$e r2 = r8.f10407n
            java.lang.String r2 = r2.f16487a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            q8.p$e r1 = r8.f10407n
            int r2 = r1.f16488b
            if (r9 != r2) goto L50
            int r2 = r1.f16489c
            if (r10 != r2) goto L50
            int r2 = r1.f16490d
            if (r11 != r2) goto L50
            int r1 = r1.f16491e
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f10401h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            d8.b.f(r2, r1)
            q8.p$b r1 = r8.f10399f
            boolean r1 = r1.f16466e
            if (r1 == 0) goto L86
            q8.p r1 = r8.f10397d
            io.flutter.plugin.editing.f$c r2 = r8.f10398e
            int r2 = r2.f10415b
            r1.q(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f10401h
            r0.c()
            goto L99
        L86:
            q8.p r0 = r8.f10397d
            io.flutter.plugin.editing.f$c r1 = r8.f10398e
            int r1 = r1.f10415b
            io.flutter.plugin.editing.c r2 = r8.f10401h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L99:
            q8.p$e r6 = new q8.p$e
            io.flutter.plugin.editing.c r0 = r8.f10401h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f10407n = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.c r9 = r8.f10401h
            r9.c()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        p.b bVar;
        p.b.a aVar;
        p.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f10399f) == null || this.f10400g == null || (aVar = bVar.f16471j) == null) {
            return;
        }
        HashMap<String, p.e> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            p.b bVar2 = this.f10400g.get(sparseArray.keyAt(i10));
            if (bVar2 != null && (aVar2 = bVar2.f16471j) != null) {
                String charSequence = sparseArray.valueAt(i10).getTextValue().toString();
                p.e eVar = new p.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f16474a.equals(aVar.f16474a)) {
                    this.f10401h.n(eVar);
                } else {
                    hashMap.put(aVar2.f16474a, eVar);
                }
            }
        }
        this.f10397d.r(this.f10398e.f10415b, hashMap);
    }

    public void l(int i10) {
        c cVar = this.f10398e;
        c.a aVar = cVar.f10414a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f10415b == i10) {
            this.f10398e = new c(c.a.NO_TARGET, 0);
            y();
            this.f10395b.hideSoftInputFromWindow(this.f10394a.getApplicationWindowToken(), 0);
            this.f10395b.restartInput(this.f10394a);
            this.f10402i = false;
        }
    }

    void m() {
        if (this.f10398e.f10414a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f10401h.l(this);
        y();
        this.f10399f = null;
        H(null);
        this.f10398e = new c(c.a.NO_TARGET, 0);
        G();
        this.f10405l = null;
    }

    public InputConnection o(View view, s sVar, EditorInfo editorInfo) {
        c cVar = this.f10398e;
        c.a aVar = cVar.f10414a;
        if (aVar == c.a.NO_TARGET) {
            this.f10403j = null;
            return null;
        } else if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                if (this.f10408o) {
                    return this.f10403j;
                }
                InputConnection onCreateInputConnection = this.f10404k.c(cVar.f10415b).onCreateInputConnection(editorInfo);
                this.f10403j = onCreateInputConnection;
                return onCreateInputConnection;
            }
            p.b bVar = this.f10399f;
            int t10 = t(bVar.f16468g, bVar.f16462a, bVar.f16463b, bVar.f16464c, bVar.f16465d, bVar.f16467f);
            editorInfo.inputType = t10;
            editorInfo.imeOptions = 33554432;
            if (Build.VERSION.SDK_INT >= 26 && !this.f10399f.f16465d) {
                editorInfo.imeOptions = 33554432 | 16777216;
            }
            Integer num = this.f10399f.f16469h;
            int intValue = num == null ? (t10 & 131072) != 0 ? 1 : 6 : num.intValue();
            p.b bVar2 = this.f10399f;
            String str = bVar2.f16470i;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            String[] strArr = bVar2.f16472k;
            if (strArr != null) {
                x.a.a(editorInfo, strArr);
            }
            io.flutter.plugin.editing.b bVar3 = new io.flutter.plugin.editing.b(view, this.f10398e.f10415b, this.f10397d, sVar, this.f10401h, editorInfo);
            editorInfo.initialSelStart = this.f10401h.i();
            editorInfo.initialSelEnd = this.f10401h.h();
            this.f10403j = bVar3;
            return bVar3;
        }
    }

    public void p() {
        this.f10404k.L();
        this.f10397d.n(null);
        y();
        this.f10401h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f10406m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f10395b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f10403j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f10398e.f10414a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10408o = true;
        }
    }

    public void z(ViewStructure viewStructure, int i10) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f10399f.f16471j.f16474a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i11 = 0; i11 < this.f10400g.size(); i11++) {
            int keyAt = this.f10400g.keyAt(i11);
            p.b.a aVar = this.f10400g.valueAt(i11).f16471j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i11);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f16475b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f16477d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f10405l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f16476c.f16487a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f10405l.height());
                    charSequence = this.f10401h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }
}
