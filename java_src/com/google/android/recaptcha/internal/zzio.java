package com.google.android.recaptcha.internal;

import java.util.Map;
/* loaded from: classes.dex */
final class zzio extends zziy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.recaptcha.internal.zziy
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzgd) zzg(i10).getKey()).zzg();
            }
            for (Map.Entry entry : zzc()) {
                ((zzgd) entry.getKey()).zzg();
            }
        }
        super.zza();
    }
}
