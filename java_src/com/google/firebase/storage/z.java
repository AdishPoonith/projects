package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.k;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private final l f7038j;

    /* renamed from: k  reason: collision with root package name */
    private final TaskCompletionSource<k> f7039k;

    /* renamed from: l  reason: collision with root package name */
    private final k f7040l;

    /* renamed from: m  reason: collision with root package name */
    private k f7041m = null;

    /* renamed from: n  reason: collision with root package name */
    private x6.c f7042n;

    public z(l lVar, TaskCompletionSource<k> taskCompletionSource, k kVar) {
        this.f7038j = lVar;
        this.f7039k = taskCompletionSource;
        this.f7040l = kVar;
        d v10 = lVar.v();
        this.f7042n = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.k());
    }

    @Override // java.lang.Runnable
    public void run() {
        y6.k kVar = new y6.k(this.f7038j.w(), this.f7038j.k(), this.f7040l.q());
        this.f7042n.d(kVar);
        if (kVar.w()) {
            try {
                this.f7041m = new k.b(kVar.o(), this.f7038j).a();
            } catch (JSONException e10) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + kVar.n(), e10);
                this.f7039k.setException(j.d(e10));
                return;
            }
        }
        TaskCompletionSource<k> taskCompletionSource = this.f7039k;
        if (taskCompletionSource != null) {
            kVar.a(taskCompletionSource, this.f7041m);
        }
    }
}
