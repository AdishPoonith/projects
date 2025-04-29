package c4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class t1 extends p4.a implements k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // c4.k
    public final Account zzb() {
        Parcel p10 = p(2, x());
        Account account = (Account) p4.c.a(p10, Account.CREATOR);
        p10.recycle();
        return account;
    }
}
