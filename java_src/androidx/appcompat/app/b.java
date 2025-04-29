package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class b extends g.b {

    /* renamed from: l  reason: collision with root package name */
    final AlertController f654l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f655a;

        /* renamed from: b  reason: collision with root package name */
        private final int f656b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public a(Context context, int i10) {
            this.f655a = new AlertController.f(new ContextThemeWrapper(context, b.g(context, i10)));
            this.f656b = i10;
        }

        public b a() {
            b bVar = new b(this.f655a.f605a, this.f656b);
            this.f655a.a(bVar.f654l);
            bVar.setCancelable(this.f655a.f622r);
            if (this.f655a.f622r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f655a.f623s);
            bVar.setOnDismissListener(this.f655a.f624t);
            DialogInterface.OnKeyListener onKeyListener = this.f655a.f625u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f655a.f605a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f655a;
            fVar.f627w = listAdapter;
            fVar.f628x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f655a.f611g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f655a.f608d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f655a.f625u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f655a;
            fVar.f627w = listAdapter;
            fVar.f628x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f655a.f610f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i10) {
        super(context, g(context, i10));
        this.f654l = new AlertController(getContext(), this, getWindow());
    }

    static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView f() {
        return this.f654l.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f654l.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f654l.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f654l.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // g.b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f654l.q(charSequence);
    }
}
