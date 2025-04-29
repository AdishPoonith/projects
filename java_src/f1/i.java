package f1;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import f1.m;
import f1.q0;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.d {
    public static final a A0 = new a(null);

    /* renamed from: z0  reason: collision with root package name */
    private Dialog f8447z0;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(i this$0, Bundle bundle, p0.s sVar) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.a2(bundle, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(i this$0, Bundle bundle, p0.s sVar) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.b2(bundle);
    }

    private final void a2(Bundle bundle, p0.s sVar) {
        androidx.fragment.app.e n10 = n();
        if (n10 == null) {
            return;
        }
        e0 e0Var = e0.f8417a;
        Intent intent = n10.getIntent();
        kotlin.jvm.internal.l.d(intent, "fragmentActivity.intent");
        n10.setResult(sVar == null ? -1 : 0, e0.m(intent, bundle, sVar));
        n10.finish();
    }

    private final void b2(Bundle bundle) {
        androidx.fragment.app.e n10 = n();
        if (n10 == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        n10.setResult(-1, intent);
        n10.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        Dialog dialog = this.f8447z0;
        if (dialog instanceof q0) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((q0) dialog).x();
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog O1(Bundle bundle) {
        Dialog dialog = this.f8447z0;
        if (dialog != null) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        a2(null, null);
        S1(false);
        Dialog O1 = super.O1(bundle);
        kotlin.jvm.internal.l.d(O1, "super.onCreateDialog(savedInstanceState)");
        return O1;
    }

    public final void X1() {
        androidx.fragment.app.e n10;
        q0 a10;
        String str;
        if (this.f8447z0 == null && (n10 = n()) != null) {
            Intent intent = n10.getIntent();
            e0 e0Var = e0.f8417a;
            kotlin.jvm.internal.l.d(intent, "intent");
            Bundle u10 = e0.u(intent);
            if (!(u10 == null ? false : u10.getBoolean("is_fallback", false))) {
                String string = u10 == null ? null : u10.getString("action");
                Bundle bundle = u10 != null ? u10.getBundle("params") : null;
                l0 l0Var = l0.f8470a;
                if (l0.X(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                    l0.e0("FacebookDialogFragment", str);
                    n10.finish();
                    return;
                }
                Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.String");
                a10 = new q0.a(n10, string, bundle).h(new q0.e() { // from class: f1.g
                    @Override // f1.q0.e
                    public final void a(Bundle bundle2, p0.s sVar) {
                        i.Y1(i.this, bundle2, sVar);
                    }
                }).a();
                this.f8447z0 = a10;
            }
            String string2 = u10 != null ? u10.getString("url") : null;
            l0 l0Var2 = l0.f8470a;
            if (l0.X(string2)) {
                str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                l0.e0("FacebookDialogFragment", str);
                n10.finish();
                return;
            }
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            p0.f0 f0Var = p0.f0.f14852a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{p0.f0.m()}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            m.a aVar = m.A;
            Objects.requireNonNull(string2, "null cannot be cast to non-null type kotlin.String");
            a10 = aVar.a(n10, string2, format);
            a10.B(new q0.e() { // from class: f1.h
                @Override // f1.q0.e
                public final void a(Bundle bundle2, p0.s sVar) {
                    i.Z1(i.this, bundle2, sVar);
                }
            });
            this.f8447z0 = a10;
        }
    }

    public final void c2(Dialog dialog) {
        this.f8447z0 = dialog;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void n0(Bundle bundle) {
        super.n0(bundle);
        X1();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f8447z0 instanceof q0) && e0()) {
            Dialog dialog = this.f8447z0;
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((q0) dialog).x();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void u0() {
        Dialog M1 = M1();
        if (M1 != null && K()) {
            M1.setDismissMessage(null);
        }
        super.u0();
    }
}
