package z3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ Context f20872s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f20873t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.android.gms.common.api.f fVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(fVar);
        this.f20872s = context;
        this.f20873t = googleSignInOptions;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.m c(Status status) {
        return new y3.b(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void l(a.b bVar) {
        ((w) ((i) bVar).C()).I2(new j(this), this.f20873t);
    }
}
