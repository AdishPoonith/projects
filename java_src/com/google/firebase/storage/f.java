package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private l f6930j;

    /* renamed from: k  reason: collision with root package name */
    private TaskCompletionSource<Uri> f6931k;

    /* renamed from: l  reason: collision with root package name */
    private x6.c f6932l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l lVar, TaskCompletionSource<Uri> taskCompletionSource) {
        c4.s.j(lVar);
        c4.s.j(taskCompletionSource);
        this.f6930j = lVar;
        this.f6931k = taskCompletionSource;
        if (lVar.u().r().equals(lVar.r())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        d v10 = this.f6930j.v();
        this.f6932l = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.k());
    }

    private Uri a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f6930j.w().c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        y6.b bVar = new y6.b(this.f6930j.w(), this.f6930j.k());
        this.f6932l.d(bVar);
        Uri a10 = bVar.w() ? a(bVar.o()) : null;
        TaskCompletionSource<Uri> taskCompletionSource = this.f6931k;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, a10);
        }
    }
}
