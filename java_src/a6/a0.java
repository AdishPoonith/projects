package a6;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a2;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private static a0 f191c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f192a = false;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f193b;

    private a0() {
    }

    public static a0 a() {
        if (f191c == null) {
            f191c = new a0();
        }
        return f191c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Context context) {
        a0 a0Var = f191c;
        a0Var.f192a = false;
        if (a0Var.f193b != null) {
            e0.a.b(context).e(f191c.f193b);
        }
        f191c.f193b = null;
    }

    private final void h(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f193b = broadcastReceiver;
        e0.a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    private static final com.google.firebase.auth.h i(Intent intent) {
        c4.s.j(intent);
        i3 i3Var = (i3) d4.e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", i3.CREATOR);
        i3Var.E(true);
        return a2.F(i3Var);
    }

    public final boolean f(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        if (this.f192a) {
            return false;
        }
        h(activity, new y(this, activity, taskCompletionSource, firebaseAuth, a0Var));
        this.f192a = true;
        return true;
    }

    public final boolean g(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f192a) {
            return false;
        }
        h(activity, new z(this, activity, taskCompletionSource));
        this.f192a = true;
        return true;
    }
}
