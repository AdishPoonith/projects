package com.google.android.recaptcha.internal;

import da.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class zzbe extends zzbd implements zzbi {
    private final p zza;
    private final String zzb;

    public zzbe(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection e10;
        if (l.a(method.getName(), this.zzb)) {
            zzmk zzf = zzmn.zzf();
            if (objArr != null) {
                e10 = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    zzml zzf2 = zzmm.zzf();
                    zzf2.zzv(obj2.toString());
                    e10.add((zzmm) zzf2.zzj());
                }
            } else {
                e10 = t9.p.e();
            }
            zzf.zzd(e10);
            p pVar = this.zza;
            byte[] zzd = ((zzmn) zzf.zzj()).zzd();
            pVar.invoke(objArr, zzeb.zzh().zzi(zzd, 0, zzd.length));
            return true;
        }
        return false;
    }
}
