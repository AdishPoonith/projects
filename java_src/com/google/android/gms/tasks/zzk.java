package com.google.android.gms.tasks;

import c4.s;
/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            zzl zzlVar = this.zzb;
            onFailureListener = zzlVar.zzc;
            if (onFailureListener != null) {
                onFailureListener2 = zzlVar.zzc;
                onFailureListener2.onFailure((Exception) s.j(this.zza.getException()));
            }
        }
    }
}
