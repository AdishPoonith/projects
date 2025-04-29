package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private final s.a f3750j;

    public c(s.a aVar) {
        this.f3750j = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (com.google.android.gms.common.api.internal.b bVar : this.f3750j.keySet()) {
            b4.b bVar2 = (b4.b) c4.s.j((b4.b) this.f3750j.get(bVar));
            z10 &= !bVar2.F();
            String b10 = bVar.b();
            String valueOf = String.valueOf(bVar2);
            arrayList.add(b10 + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
