package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    private final s.a f3915a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f3916b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f3917c;

    /* renamed from: d  reason: collision with root package name */
    private int f3918d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3919e;

    public final Set a() {
        return this.f3915a.keySet();
    }

    public final void b(b bVar, b4.b bVar2, String str) {
        this.f3915a.put(bVar, bVar2);
        this.f3916b.put(bVar, str);
        this.f3918d--;
        if (!bVar2.F()) {
            this.f3919e = true;
        }
        if (this.f3918d == 0) {
            if (!this.f3919e) {
                this.f3917c.setResult(this.f3916b);
                return;
            }
            this.f3917c.setException(new com.google.android.gms.common.api.c(this.f3915a));
        }
    }
}
