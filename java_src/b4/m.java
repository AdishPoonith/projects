package b4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class m extends androidx.fragment.app.d {
    private DialogInterface.OnCancelListener A0;
    private Dialog B0;

    /* renamed from: z0  reason: collision with root package name */
    private Dialog f2920z0;

    public static m V1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) c4.s.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.f2920z0 = dialog2;
        if (onCancelListener != null) {
            mVar.A0 = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog O1(Bundle bundle) {
        Dialog dialog = this.f2920z0;
        if (dialog == null) {
            S1(false);
            if (this.B0 == null) {
                this.B0 = new AlertDialog.Builder((Context) c4.s.j(u())).create();
            }
            return this.B0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.d
    public void U1(androidx.fragment.app.n nVar, String str) {
        super.U1(nVar, str);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
