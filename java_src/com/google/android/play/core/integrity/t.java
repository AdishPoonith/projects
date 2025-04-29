package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.b0;
import com.google.android.play.integrity.internal.y;
import java.util.ArrayList;
/* loaded from: classes.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    final y f5898a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f5899b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5900c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, com.google.android.play.integrity.internal.n nVar) {
        this.f5900c = context.getPackageName();
        this.f5899b = nVar;
        if (b0.a(context)) {
            this.f5898a = new y(context, nVar, "IntegrityService", u.f5901a, q.f5889a, null, null);
            return;
        }
        nVar.b("Phonesky is not installed.", new Object[0]);
        this.f5898a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle a(t tVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", tVar.f5900c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList<com.google.android.play.integrity.internal.h> arrayList = new ArrayList();
        arrayList.add(com.google.android.play.integrity.internal.h.c(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (com.google.android.play.integrity.internal.h hVar : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", hVar.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f5898a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.f5899b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f5898a.p(new r(this, taskCompletionSource, decode, cloudProjectNumber, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
