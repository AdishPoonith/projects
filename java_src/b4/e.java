package b4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.k;
import c4.f0;
import c4.i0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.errorprone.annotations.RestrictedInheritance;
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {o4.d.class, o4.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c  reason: collision with root package name */
    private String f2907c;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2905e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final e f2906f = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final int f2904d = f.f2908a;

    public static e m() {
        return f2906f;
    }

    @Override // b4.f
    public Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    @Override // b4.f
    public PendingIntent b(Context context, int i10, int i11) {
        return super.b(context, i10, i11);
    }

    @Override // b4.f
    public final String d(int i10) {
        return super.d(i10);
    }

    @Override // b4.f
    public int f(Context context) {
        return super.f(context);
    }

    @Override // b4.f
    public int g(Context context, int i10) {
        return super.g(context, i10);
    }

    @Override // b4.f
    public final boolean i(int i10) {
        return super.i(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, i0.b(activity, a(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.E() ? bVar.D() : b(context, bVar.B(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k10 = k(activity, i10, i11, onCancelListener);
        if (k10 == null) {
            return false;
        }
        s(activity, k10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, null, c(context, i10, 0, "n"));
    }

    final Dialog p(Context context, int i10, i0 i0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(f0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = f0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, i0Var);
        }
        String g10 = f0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(f0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final q0 r(Context context, p0 p0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q0 q0Var = new q0(p0Var);
        o4.h.j(context, q0Var, intentFilter);
        q0Var.a(context);
        if (h(context, "com.google.android.gms")) {
            return q0Var;
        }
        p0Var.a();
        q0Var.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                m.V1(dialog, onCancelListener).U1(((androidx.fragment.app.e) activity).F(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f10 = f0.f(context, i10);
            String e10 = f0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) c4.s.j(context.getSystemService("notification"));
            k.d p10 = new k.d(context).m(true).e(true).k(f10).p(new k.b().h(e10));
            if (h4.g.c(context)) {
                c4.s.l(h4.j.e());
                p10.o(context.getApplicationInfo().icon).n(2);
                if (h4.g.d(context)) {
                    p10.a(a4.a.common_full_open_on_phone, resources.getString(a4.b.common_open_on_phone), pendingIntent);
                } else {
                    p10.i(pendingIntent);
                }
            } else {
                p10.o(17301642).r(resources.getString(a4.b.common_google_play_services_notification_ticker)).s(System.currentTimeMillis()).i(pendingIntent).j(e10);
            }
            if (h4.j.h()) {
                c4.s.l(h4.j.h());
                synchronized (f2905e) {
                    str2 = this.f2907c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b10 = f0.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", b10, 4);
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                p10.f(str2);
            }
            Notification b11 = p10.b();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                j.f2914b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, b11);
        }
    }

    final void u(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, com.google.android.gms.common.api.internal.i iVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p10 = p(activity, i10, i0.c(iVar, a(activity, i10, "d"), 2), onCancelListener);
        if (p10 == null) {
            return false;
        }
        s(activity, p10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i10) {
        PendingIntent l10;
        if (j4.a.a(context) || (l10 = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.B(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l10, i10, true), o4.i.f14627a | 134217728));
        return true;
    }
}
