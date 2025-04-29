package t3;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* loaded from: classes.dex */
public class c extends UserRecoverableAuthException {

    /* renamed from: k  reason: collision with root package name */
    private final int f18196k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, String str, Intent intent) {
        super(str, intent);
        this.f18196k = i10;
    }
}
