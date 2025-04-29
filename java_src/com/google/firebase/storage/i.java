package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private final l f6940j;

    /* renamed from: k  reason: collision with root package name */
    private final TaskCompletionSource<h> f6941k;

    /* renamed from: l  reason: collision with root package name */
    private final x6.c f6942l;

    /* renamed from: m  reason: collision with root package name */
    private final String f6943m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f6944n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(l lVar, Integer num, String str, TaskCompletionSource<h> taskCompletionSource) {
        c4.s.j(lVar);
        c4.s.j(taskCompletionSource);
        this.f6940j = lVar;
        this.f6944n = num;
        this.f6943m = str;
        this.f6941k = taskCompletionSource;
        d v10 = lVar.v();
        this.f6942l = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.j());
    }

    @Override // java.lang.Runnable
    public void run() {
        h a10;
        y6.d dVar = new y6.d(this.f6940j.w(), this.f6940j.k(), this.f6944n, this.f6943m);
        this.f6942l.d(dVar);
        if (dVar.w()) {
            try {
                a10 = h.a(this.f6940j.v(), dVar.o());
            } catch (JSONException e10) {
                Log.e("ListTask", "Unable to parse response body. " + dVar.n(), e10);
                this.f6941k.setException(j.d(e10));
                return;
            }
        } else {
            a10 = null;
        }
        TaskCompletionSource<h> taskCompletionSource = this.f6941k;
        if (taskCompletionSource != null) {
            dVar.a(taskCompletionSource, a10);
        }
    }
}
