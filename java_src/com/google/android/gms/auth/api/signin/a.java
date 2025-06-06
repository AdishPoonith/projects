package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import c4.s;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import z3.q;
import z3.r;
/* loaded from: classes.dex */
public final class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) s.j(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.c(context).a();
    }

    public static Task<GoogleSignInAccount> c(Intent intent) {
        y3.b d10 = q.d(intent);
        GoogleSignInAccount a10 = d10.a();
        return (!d10.p().G() || a10 == null) ? Tasks.forException(c4.b.a(d10.p())) : Tasks.forResult(a10);
    }

    public static boolean d(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.D().containsAll(hashSet);
    }

    public static void e(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        s.k(activity, "Please provide a non-null Activity");
        s.k(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(f(activity, googleSignInAccount, scopeArr), i10);
    }

    private static Intent f(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.f(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.s())) {
            aVar.h((String) s.j(googleSignInAccount.s()));
        }
        return new b(activity, aVar.a()).z();
    }
}
