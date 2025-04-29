package a9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.gms.auth.api.signin.b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount b(Context context) {
        return com.google.android.gms.auth.api.signin.a.b(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(GoogleSignInAccount googleSignInAccount, Scope scope) {
        return com.google.android.gms.auth.api.signin.a.d(googleSignInAccount, scope);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        com.google.android.gms.auth.api.signin.a.e(activity, i10, googleSignInAccount, scopeArr);
    }
}
