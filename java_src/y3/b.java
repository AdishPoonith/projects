package y3;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
/* loaded from: classes.dex */
public class b implements m {

    /* renamed from: j  reason: collision with root package name */
    private final Status f20474j;

    /* renamed from: k  reason: collision with root package name */
    private final GoogleSignInAccount f20475k;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f20475k = googleSignInAccount;
        this.f20474j = status;
    }

    public GoogleSignInAccount a() {
        return this.f20475k;
    }

    @Override // com.google.android.gms.common.api.m
    public Status p() {
        return this.f20474j;
    }
}
