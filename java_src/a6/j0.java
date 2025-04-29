package a6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.p000firebaseauthapi.a9;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    private static final a9 f239d = a9.s("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: e  reason: collision with root package name */
    private static final j0 f240e = new j0();

    /* renamed from: a  reason: collision with root package name */
    private Task f241a;

    /* renamed from: b  reason: collision with root package name */
    private Task f242b;

    /* renamed from: c  reason: collision with root package name */
    private long f243c = 0;

    private j0() {
    }

    public static j0 b() {
        return f240e;
    }

    private static final void e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        a9 a9Var = f239d;
        int size = a9Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.remove((String) a9Var.get(i10));
        }
        edit.commit();
    }

    public final Task a() {
        if (h4.f.c().b() - this.f243c < 3600000) {
            return this.f242b;
        }
        return null;
    }

    public final void c(Context context) {
        c4.s.j(context);
        e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f241a = null;
        this.f243c = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.d(com.google.firebase.auth.FirebaseAuth):void");
    }
}
