package b4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: j  reason: collision with root package name */
    private Dialog f2898j;

    /* renamed from: k  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2899k;

    /* renamed from: l  reason: collision with root package name */
    private Dialog f2900l;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) c4.s.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f2898j = dialog2;
        if (onCancelListener != null) {
            cVar.f2899k = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2899k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2898j;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f2900l == null) {
                this.f2900l = new AlertDialog.Builder((Context) c4.s.j(getActivity())).create();
            }
            return this.f2900l;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
