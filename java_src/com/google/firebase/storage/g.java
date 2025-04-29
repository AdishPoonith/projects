package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.k;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private l f6933j;

    /* renamed from: k  reason: collision with root package name */
    private TaskCompletionSource<k> f6934k;

    /* renamed from: l  reason: collision with root package name */
    private k f6935l;

    /* renamed from: m  reason: collision with root package name */
    private x6.c f6936m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l lVar, TaskCompletionSource<k> taskCompletionSource) {
        c4.s.j(lVar);
        c4.s.j(taskCompletionSource);
        this.f6933j = lVar;
        this.f6934k = taskCompletionSource;
        if (lVar.u().r().equals(lVar.r())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        d v10 = this.f6933j.v();
        this.f6936m = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.j());
    }

    @Override // java.lang.Runnable
    public void run() {
        y6.b bVar = new y6.b(this.f6933j.w(), this.f6933j.k());
        this.f6936m.d(bVar);
        if (bVar.w()) {
            try {
                this.f6935l = new k.b(bVar.o(), this.f6933j).a();
            } catch (JSONException e10) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + bVar.n(), e10);
                this.f6934k.setException(j.d(e10));
                return;
            }
        }
        TaskCompletionSource<k> taskCompletionSource = this.f6934k;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, this.f6935l);
        }
    }
}
