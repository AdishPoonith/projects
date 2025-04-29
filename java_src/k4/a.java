package k4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c4.f0;
import java.util.LinkedList;
import k4.c;
/* loaded from: classes.dex */
public abstract class a<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    private c f12574a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f12575b;

    /* renamed from: c  reason: collision with root package name */
    private LinkedList f12576c;

    /* renamed from: d  reason: collision with root package name */
    private final e f12577d = new f(this);

    public static void i(FrameLayout frameLayout) {
        b4.e m10 = b4.e.m();
        Context context = frameLayout.getContext();
        int f10 = m10.f(context);
        String d10 = f0.d(context, f10);
        String c10 = f0.c(context, f10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d10);
        linearLayout.addView(textView);
        Intent a10 = m10.a(context, f10, null);
        if (a10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, a10));
        }
    }

    private final void n(int i10) {
        while (!this.f12576c.isEmpty() && ((k) this.f12576c.getLast()).b() >= i10) {
            this.f12576c.removeLast();
        }
    }

    private final void o(Bundle bundle, k kVar) {
        c cVar = this.f12574a;
        if (cVar != null) {
            kVar.a(cVar);
            return;
        }
        if (this.f12576c == null) {
            this.f12576c = new LinkedList();
        }
        this.f12576c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f12575b;
            if (bundle2 == null) {
                this.f12575b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f12577d);
    }

    protected abstract void a(e<T> eVar);

    public T b() {
        return (T) this.f12574a;
    }

    public void c(Bundle bundle) {
        o(bundle, new g(this, bundle));
    }

    public void d() {
        c cVar = this.f12574a;
        if (cVar != null) {
            cVar.H();
        } else {
            n(1);
        }
    }

    public void e() {
        o(null, new j(this));
    }

    public void f(Bundle bundle) {
        c cVar = this.f12574a;
        if (cVar != null) {
            cVar.a(bundle);
            return;
        }
        Bundle bundle2 = this.f12575b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void g() {
        o(null, new i(this));
    }

    public void h() {
        c cVar = this.f12574a;
        if (cVar != null) {
            cVar.r();
        } else {
            n(4);
        }
    }
}
