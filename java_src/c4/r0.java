package c4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class r0 extends d4.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: j  reason: collision with root package name */
    final int f3383j;

    /* renamed from: k  reason: collision with root package name */
    private final Account f3384k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3385l;

    /* renamed from: m  reason: collision with root package name */
    private final GoogleSignInAccount f3386m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f3383j = i10;
        this.f3384k = account;
        this.f3385l = i11;
        this.f3386m = googleSignInAccount;
    }

    public r0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3383j);
        d4.c.r(parcel, 2, this.f3384k, i10, false);
        d4.c.l(parcel, 3, this.f3385l);
        d4.c.r(parcel, 4, this.f3386m, i10, false);
        d4.c.b(parcel, a10);
    }
}
