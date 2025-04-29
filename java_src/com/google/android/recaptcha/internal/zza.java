package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import da.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import la.r0;
import s9.u;
/* loaded from: classes.dex */
final class zza extends m implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ r0 zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(TaskCompletionSource taskCompletionSource, r0 r0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = r0Var;
    }

    @Override // da.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable x10 = this.zzb.x();
            if (x10 == null) {
                this.zza.setResult(this.zzb.m());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = x10 instanceof Exception ? (Exception) x10 : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(x10);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return u.f17878a;
    }
}
