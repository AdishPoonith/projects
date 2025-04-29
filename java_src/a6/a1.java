package a6;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: c  reason: collision with root package name */
    private static final a1 f194c = new a1();

    /* renamed from: a  reason: collision with root package name */
    private final j0 f195a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f196b;

    private a1() {
        j0 b10 = j0.b();
        a0 a10 = a0.a();
        this.f195a = b10;
        this.f196b = a10;
    }

    public static a1 b() {
        return f194c;
    }

    public final Task a() {
        return this.f195a.a();
    }

    public final void c(Context context) {
        this.f195a.c(context);
    }

    public final void d(FirebaseAuth firebaseAuth) {
        this.f195a.d(firebaseAuth);
    }

    public final void e(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.C());
        edit.putString("statusMessage", status.D());
        edit.putLong("timestamp", h4.f.c().b());
        edit.commit();
    }

    public final void f(Context context, FirebaseAuth firebaseAuth) {
        c4.s.j(context);
        c4.s.j(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.l().q());
        edit.commit();
    }

    public final void g(Context context, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        c4.s.j(context);
        c4.s.j(firebaseAuth);
        c4.s.j(a0Var);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.l().q());
        edit.putString("firebaseUserUid", a0Var.a());
        edit.commit();
    }

    public final boolean h(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f196b.f(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var) {
        return this.f196b.f(activity, taskCompletionSource, firebaseAuth, a0Var);
    }
}
