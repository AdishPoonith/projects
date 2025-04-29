package g9;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import kotlin.jvm.internal.l;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public final class c implements k.c {

    /* renamed from: j  reason: collision with root package name */
    private Context f9050j;

    /* renamed from: k  reason: collision with root package name */
    private Toast f9051k;

    /* loaded from: classes.dex */
    public static final class a extends Toast.Callback {
        a() {
        }

        @Override // android.widget.Toast.Callback
        public void onToastHidden() {
            super.onToastHidden();
            c.this.f9051k = null;
        }
    }

    public c(Context context) {
        l.e(context, "context");
        this.f9050j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        l.e(this$0, "this$0");
        Toast toast = this$0.f9051k;
        if (toast != null) {
            toast.show();
        }
    }

    @Override // r8.k.c
    public void I(j call, k.d result) {
        Toast toast;
        l.e(call, "call");
        l.e(result, "result");
        String str = call.f16777a;
        View view = null;
        if (l.a(str, "showToast")) {
            String valueOf = String.valueOf(call.a("msg"));
            String valueOf2 = String.valueOf(call.a("length"));
            String valueOf3 = String.valueOf(call.a("gravity"));
            Number number = (Number) call.a("bgcolor");
            Number number2 = (Number) call.a("textcolor");
            Number number3 = (Number) call.a("fontSize");
            int i10 = l.a(valueOf3, "top") ? 48 : l.a(valueOf3, "center") ? 17 : 80;
            boolean a10 = l.a(valueOf2, "long");
            if (number == null || Build.VERSION.SDK_INT > 31) {
                Toast makeText = Toast.makeText(this.f9050j, valueOf, a10 ? 1 : 0);
                this.f9051k = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText != null) {
                        try {
                            view = makeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    l.b(view);
                    View findViewById = view.findViewById(16908299);
                    l.d(findViewById, "findViewById(...)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f9050j.getSystemService("layout_inflater");
                l.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(f.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(e.text);
                textView2.setText(valueOf);
                Drawable drawable = this.f9050j.getDrawable(d.corner);
                l.b(drawable);
                l.b(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f9050j);
                this.f9051k = toast2;
                toast2.setDuration(a10 ? 1 : 0);
                Toast toast3 = this.f9051k;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 <= 31) {
                if (i10 != 17) {
                    Toast toast4 = this.f9051k;
                    if (i10 == 48 ? toast4 != null : toast4 != null) {
                        toast4.setGravity(i10, 0, 100);
                    }
                } else {
                    Toast toast5 = this.f9051k;
                    if (toast5 != null) {
                        toast5.setGravity(i10, 0, 0);
                    }
                }
            }
            Context context = this.f9050j;
            if (context instanceof Activity) {
                l.c(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new Runnable() { // from class: g9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.c(c.this);
                    }
                });
            } else {
                Toast toast6 = this.f9051k;
                if (toast6 != null) {
                    toast6.show();
                }
            }
            if (i11 >= 30 && (toast = this.f9051k) != null) {
                toast.addCallback(new a());
            }
        } else if (!l.a(str, "cancel")) {
            result.c();
            return;
        } else {
            Toast toast7 = this.f9051k;
            if (toast7 != null) {
                if (toast7 != null) {
                    toast7.cancel();
                }
                this.f9051k = null;
            }
        }
        result.a(Boolean.TRUE);
    }
}
