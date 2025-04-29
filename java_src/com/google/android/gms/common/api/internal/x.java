package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f3952a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f3953b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(z zVar, BasePendingResult basePendingResult) {
        this.f3953b = zVar;
        this.f3952a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        Map map;
        map = this.f3953b.f3963a;
        map.remove(this.f3952a);
    }
}
