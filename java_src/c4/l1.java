package c4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(g gVar, Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, gVar.f3305j);
        d4.c.l(parcel, 2, gVar.f3306k);
        d4.c.l(parcel, 3, gVar.f3307l);
        d4.c.s(parcel, 4, gVar.f3308m, false);
        d4.c.k(parcel, 5, gVar.f3309n, false);
        d4.c.u(parcel, 6, gVar.f3310o, i10, false);
        d4.c.e(parcel, 7, gVar.f3311p, false);
        d4.c.r(parcel, 8, gVar.f3312q, i10, false);
        d4.c.u(parcel, 10, gVar.f3313r, i10, false);
        d4.c.u(parcel, 11, gVar.f3314s, i10, false);
        d4.c.c(parcel, 12, gVar.f3315t);
        d4.c.l(parcel, 13, gVar.f3316u);
        d4.c.c(parcel, 14, gVar.f3317v);
        d4.c.s(parcel, 15, gVar.zza(), false);
        d4.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        Scope[] scopeArr = g.f3303x;
        Bundle bundle = new Bundle();
        b4.d[] dVarArr = g.f3304y;
        b4.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    i11 = d4.b.s(parcel, q10);
                    break;
                case 3:
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 4:
                    str = d4.b.e(parcel, q10);
                    break;
                case 5:
                    iBinder = d4.b.r(parcel, q10);
                    break;
                case 6:
                    scopeArr = (Scope[]) d4.b.g(parcel, q10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = d4.b.a(parcel, q10);
                    break;
                case 8:
                    account = (Account) d4.b.d(parcel, q10, Account.CREATOR);
                    break;
                case 9:
                default:
                    d4.b.y(parcel, q10);
                    break;
                case 10:
                    dVarArr = (b4.d[]) d4.b.g(parcel, q10, b4.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (b4.d[]) d4.b.g(parcel, q10, b4.d.CREATOR);
                    break;
                case 12:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 13:
                    i13 = d4.b.s(parcel, q10);
                    break;
                case 14:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 15:
                    str2 = d4.b.e(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z11, i13, z12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
