package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.api.e implements k3 {

    /* renamed from: l  reason: collision with root package name */
    private static final a.g f4012l;

    /* renamed from: m  reason: collision with root package name */
    private static final a.AbstractC0085a f4013m;

    /* renamed from: n  reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4014n;

    /* renamed from: o  reason: collision with root package name */
    private static final f4.a f4015o;

    /* renamed from: k  reason: collision with root package name */
    private final Context f4016k;

    static {
        a.g gVar = new a.g();
        f4012l = gVar;
        o5 o5Var = new o5();
        f4013m = o5Var;
        f4014n = new com.google.android.gms.common.api.a("GoogleAuthService.API", o5Var, gVar);
        f4015o = t3.d.a("GoogleAuthServiceClient");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        super(context, f4014n, a.d.f3749c, e.a.f3761c);
        this.f4016k = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void z(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (com.google.android.gms.common.api.internal.v.c(status, obj, taskCompletionSource)) {
            return;
        }
        f4015o.h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.k3
    public final Task a(final Account account, final String str, final Bundle bundle) {
        c4.s.k(account, "Account name cannot be null!");
        c4.s.g(str, "Scope cannot be null!");
        return o(com.google.android.gms.common.api.internal.u.a().d(t3.e.f18206j).b(new com.google.android.gms.common.api.internal.q() { // from class: com.google.android.gms.internal.auth.m5
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                b bVar = b.this;
                ((l5) ((i5) obj).C()).I2(new p5(bVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.k3
    public final Task c(final g gVar) {
        return o(com.google.android.gms.common.api.internal.u.a().d(t3.e.f18206j).b(new com.google.android.gms.common.api.internal.q() { // from class: com.google.android.gms.internal.auth.n5
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                b bVar = b.this;
                ((l5) ((i5) obj).C()).H2(new q5(bVar, (TaskCompletionSource) obj2), gVar);
            }
        }).e(1513).a());
    }
}
