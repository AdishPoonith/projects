package c4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c4.k;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public class g extends d4.a {
    public static final Parcelable.Creator<g> CREATOR = new l1();

    /* renamed from: x  reason: collision with root package name */
    static final Scope[] f3303x = new Scope[0];

    /* renamed from: y  reason: collision with root package name */
    static final b4.d[] f3304y = new b4.d[0];

    /* renamed from: j  reason: collision with root package name */
    final int f3305j;

    /* renamed from: k  reason: collision with root package name */
    final int f3306k;

    /* renamed from: l  reason: collision with root package name */
    final int f3307l;

    /* renamed from: m  reason: collision with root package name */
    String f3308m;

    /* renamed from: n  reason: collision with root package name */
    IBinder f3309n;

    /* renamed from: o  reason: collision with root package name */
    Scope[] f3310o;

    /* renamed from: p  reason: collision with root package name */
    Bundle f3311p;

    /* renamed from: q  reason: collision with root package name */
    Account f3312q;

    /* renamed from: r  reason: collision with root package name */
    b4.d[] f3313r;

    /* renamed from: s  reason: collision with root package name */
    b4.d[] f3314s;

    /* renamed from: t  reason: collision with root package name */
    final boolean f3315t;

    /* renamed from: u  reason: collision with root package name */
    final int f3316u;

    /* renamed from: v  reason: collision with root package name */
    boolean f3317v;

    /* renamed from: w  reason: collision with root package name */
    private final String f3318w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, b4.d[] dVarArr, b4.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f3303x : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f3304y : dVarArr;
        dVarArr2 = dVarArr2 == null ? f3304y : dVarArr2;
        this.f3305j = i10;
        this.f3306k = i11;
        this.f3307l = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f3308m = "com.google.android.gms";
        } else {
            this.f3308m = str;
        }
        if (i10 < 2) {
            this.f3312q = iBinder != null ? a.M(k.a.x(iBinder)) : null;
        } else {
            this.f3309n = iBinder;
            this.f3312q = account;
        }
        this.f3310o = scopeArr;
        this.f3311p = bundle;
        this.f3313r = dVarArr;
        this.f3314s = dVarArr2;
        this.f3315t = z10;
        this.f3316u = i13;
        this.f3317v = z11;
        this.f3318w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l1.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f3318w;
    }
}
