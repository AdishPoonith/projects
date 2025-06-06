package com.google.android.recaptcha.internal;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.i;
import la.k0;
import la.l0;
import s9.q;
import s9.r;
import s9.u;
import t9.g0;
import t9.x;
import v9.d;
/* loaded from: classes.dex */
public final class zzba implements zzas, zzbi {
    public static final zzat zza = new zzat(null);
    private final zzbc zzb;
    private final k0 zzc;
    private final zzbn zzd;
    private final Map zze;
    private final Map zzf;

    public zzba(zzbc zzbcVar, k0 k0Var, Context context) {
        Map f10;
        this.zzb = zzbcVar;
        this.zzc = k0Var;
        zzbn zzbnVar = new zzbn();
        this.zzd = zzbnVar;
        this.zze = zzbnVar.zzb().zzc();
        f10 = g0.f(q.a(39, zzbt.zza), q.a(34, zzcg.zza), q.a(35, zzco.zza), q.a(25, zzbz.zza), q.a(37, zzcn.zza), q.a(21, zzbo.zza), q.a(22, zzcm.zza), q.a(23, zzch.zza), q.a(24, zzbw.zza), q.a(1, zzcj.zza), q.a(2, zzbs.zza), q.a(38, zzcl.zza), q.a(3, zzca.zza), q.a(4, zzcb.zza), q.a(17, zzbv.zza), q.a(32, zzbp.zza), q.a(5, zzcd.zza), q.a(31, zzbq.zza), q.a(36, zzbr.zza), q.a(16, zzbu.zza), q.a(26, zzck.zza), q.a(6, zzcc.zza), q.a(27, zzci.zza), q.a(8, zzce.zza), q.a(9, zzcf.zza));
        this.zzf = f10;
        zzcr zzcrVar = zzcr.zza;
        zzcr.zzb(new int[0]);
        zzbnVar.zze(3, context);
    }

    public static final /* synthetic */ void zzh(zzba zzbaVar, int i10, List list) {
        if (list.isEmpty()) {
            throw new zzt(4, 3, null);
        }
        if (!zzx(list)) {
            throw new zzt(4, 5, null);
        }
        zzmk zzf = zzmn.zzf();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzml zzf2 = zzmm.zzf();
            Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) it.next());
            if (zza2 == null) {
                throw new zzt(4, 4, null);
            }
            if (zza2 instanceof Integer) {
                zzf2.zzt(((Number) zza2).intValue());
            } else if (zza2 instanceof Short) {
                zzf2.zzs(((Number) zza2).shortValue());
            } else if (zza2 instanceof Byte) {
                zzf2.zze(zzez.zzm(new byte[]{((Number) zza2).byteValue()}, 0, 1));
            } else if (zza2 instanceof Long) {
                zzf2.zzu(((Number) zza2).longValue());
            } else if (zza2 instanceof Double) {
                zzf2.zzq(((Number) zza2).doubleValue());
            } else if (zza2 instanceof Float) {
                zzf2.zzr(((Number) zza2).floatValue());
            } else if (zza2 instanceof Boolean) {
                zzf2.zzd(((Boolean) zza2).booleanValue());
            } else if (zza2 instanceof Character) {
                zzf2.zzp(zza2.toString());
            } else {
                zzf2.zzv(zza2 instanceof String ? (String) zza2 : zza2.toString());
            }
            zzf.zze((zzmm) zzf2.zzj());
        }
        zzbm zzb = zzbaVar.zzd.zzb();
        byte[] zzd = ((zzmn) zzf.zzj()).zzd();
        zzb.zzf(i10, zzeb.zzh().zzi(zzd, 0, zzd.length));
    }

    public static final /* synthetic */ void zzi(zzba zzbaVar, List list) {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object zza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (zza3 == null) {
            throw new zzt(4, 4, null);
        }
        if (!(zza3 instanceof Integer) && !(zza3 instanceof Short) && !(zza3 instanceof Byte) && !(zza3 instanceof Long) && !(zza3 instanceof Double) && !(zza3 instanceof Float) && !(zza3 instanceof Boolean) && !(zza3 instanceof Character) && !(zza3 instanceof String)) {
            throw new zzt(4, 7, null);
        }
        zzbaVar.zzv(str, zza3.toString());
    }

    public static final /* synthetic */ void zzj(zzba zzbaVar, List list) {
        if (!zzx(list)) {
            throw new zzt(4, 5, null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbaVar.zzd.zzb().zzb(((zzmu) it.next()).zzi());
        }
    }

    public static final /* synthetic */ void zzk(zzba zzbaVar, int i10, List list) {
        int i11;
        if (list.size() != 4 && list.size() != 5) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object zza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzt(4, 5, null);
        }
        Object zza4 = zzbaVar.zzd.zzb().zza((zzmu) list.get(2));
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str2 = (String) zza4;
        if (str2 == null) {
            throw new zzt(4, 5, null);
        }
        String zza5 = zzbh.zza(zzbaVar, str2, zzbaVar.zzd.zza());
        Object zza6 = zzbaVar.zzd.zzb().zza((zzmu) list.get(3));
        if (list.size() == 5) {
            Object zza7 = zzbaVar.zzd.zzb().zza((zzmu) list.get(4));
            if (true != (zza7 instanceof Integer)) {
                zza7 = null;
            }
            Integer num = (Integer) zza7;
            if (num == null) {
                throw new zzt(4, 5, null);
            }
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        try {
            byte zza8 = zzbaVar.zzd.zza();
            if (zza3 instanceof String) {
                zza3 = zzbh.zza(zzbaVar, (String) zza3, zza8);
            }
            Class zza9 = zzbk.zza(zza3);
            zzbaVar.zzd.zzb().zzf(i10, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zzbe(new zzau(zzbaVar, str, i11), zza5, zza6)));
        } catch (Exception e10) {
            throw new zzt(6, 20, e10);
        }
    }

    public static final /* synthetic */ void zzl(zzba zzbaVar, int i10, List list) {
        if (list.size() != 4 && list.size() != 5) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzt(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num2 = (Integer) zza3;
        if (num2 == null) {
            throw new zzt(4, 5, null);
        }
        int intValue2 = num2.intValue();
        Object zza4 = zzbaVar.zzd.zzb().zza((zzmu) list.get(2));
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str = (String) zza4;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        String zza5 = zzbh.zza(zzbaVar, str, zzbaVar.zzd.zza());
        Object zza6 = zzbaVar.zzd.zzb().zza((zzmu) list.get(3));
        if (true != (zza6 instanceof String)) {
            zza6 = null;
        }
        String str2 = (String) zza6;
        if (str2 == null) {
            throw new zzt(4, 5, null);
        }
        String zza7 = zzbh.zza(zzbaVar, str2, zzbaVar.zzd.zza());
        Object zza8 = list.size() == 5 ? zzbaVar.zzd.zzb().zza((zzmu) list.get(4)) : null;
        zzbf zzbfVar = new zzbf(intValue2);
        try {
            Class zza9 = zzbk.zza(zza5);
            zzbaVar.zzd.zzb().zzf(intValue, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zzbg(zzbfVar, zza7, zza8)));
            zzbaVar.zzd.zzb().zzf(i10, zzbfVar);
        } catch (Exception e10) {
            throw new zzt(6, 20, e10);
        }
    }

    public static final /* synthetic */ void zzm(zzba zzbaVar, int i10, List list) {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            zzbaVar.zzd.zzb().zzf(i10, field.get(zzbaVar.zzd.zzb().zza((zzmu) list.get(1))));
        } catch (Exception e10) {
            throw new zzt(6, 16, e10);
        }
    }

    public static final /* synthetic */ void zzn(zzba zzbaVar, int i10, List list) {
        if (list.size() != 1) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            zzbaVar.zzd.zzb().zzf(i10, field.get(null));
        } catch (Exception e10) {
            throw new zzt(6, 16, e10);
        }
    }

    public static final /* synthetic */ void zzo(zzba zzbaVar, int i10, List list) {
        if (list.isEmpty()) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Constructor)) {
            zza2 = null;
        }
        Constructor constructor = (Constructor) zza2;
        if (constructor == null) {
            throw new zzt(4, 5, null);
        }
        Object[] zzg = zzbaVar.zzd.zzb().zzg(list.subList(1, list.size()));
        try {
            zzbaVar.zzd.zzb().zzf(i10, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e10) {
            throw new zzt(6, 14, e10);
        }
    }

    public static final /* synthetic */ void zzp(zzba zzbaVar, List list) {
        if (list.size() != 3) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            field.set(zzbaVar.zzd.zzb().zza((zzmu) list.get(1)), zzbaVar.zzd.zzb().zza((zzmu) list.get(2)));
        } catch (Exception e10) {
            throw new zzt(6, 11, e10);
        }
    }

    public static final /* synthetic */ void zzq(zzba zzbaVar, List list) {
        if (list.size() != 2) {
            throw new zzt(4, 3, null);
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzt(4, 5, null);
        }
        try {
            field.set(null, zzbaVar.zzd.zzb().zza((zzmu) list.get(1)));
        } catch (Exception e10) {
            throw new zzt(6, 11, e10);
        }
    }

    public static final /* synthetic */ void zzr(zzba zzbaVar, zzn zznVar, int i10, List list) {
        if (list.size() != 2 && list.size() != 0) {
            throw new zzt(4, 3, null);
        }
        if (list.size() == 0) {
            zzbaVar.zzd.zzb().zzf(i10, new zzn());
            return;
        }
        Object zza2 = zzbaVar.zzd.zzb().zza((zzmu) list.get(0));
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        Object zza3 = zzbaVar.zzd.zzb().zza((zzmu) list.get(1));
        if (true != (zza3 instanceof zzn)) {
            zza3 = null;
        }
        zzn zznVar2 = (zzn) zza3;
        if (zznVar2 == null) {
            throw new zzt(4, 5, null);
        }
        byte[] zzd = zzar.zza(zznVar, zznVar2).zzd();
        zzbaVar.zzv(str, zzeb.zzh().zzi(zzd, 0, zzd.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzt(List list, zzn zznVar, zzn zznVar2, d dVar) {
        Object c10;
        Object c11 = l0.c(new zzax(this, list, zznVar, zznVar2, null), dVar);
        c10 = w9.d.c();
        return c11 == c10 ? c11 : u.f17878a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzu(Exception exc, String str, zzn zznVar, zzn zznVar2, int i10, d dVar) {
        Object c10;
        Object c11 = l0.c(new zzay(exc, i10, zznVar, zznVar2, str, this, null), dVar);
        c10 = w9.d.c();
        return c11 == c10 ? c11 : u.f17878a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, String... strArr) {
        this.zzb.zzb(str, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzw(zzmv zzmvVar, zzbl zzblVar) {
        zzdk zzb = zzdk.zzb();
        int zzb2 = zzblVar.zzb();
        zzby zzbyVar = (zzby) this.zzf.get(Integer.valueOf(zzmvVar.zzf()));
        if (zzbyVar == null) {
            return false;
        }
        Object[] zzg = this.zzd.zzb().zzg(zzmvVar.zzj());
        zzbyVar.zza(zzmvVar.zzg(), zzblVar, Arrays.copyOf(zzg, zzg.length));
        if (zzb2 == zzblVar.zzb()) {
            zzblVar.zzg(zzblVar.zzb() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        zzj zzjVar = zzj.zza;
        zzj.zza(zzms.zza(zzmvVar.zzk()), zza2);
        zzmvVar.zzk();
        x.z(zzmvVar.zzj(), null, null, null, 0, null, new zzav(this), 31, null);
        return true;
    }

    private static final boolean zzx(List list) {
        int j10;
        j10 = t9.q.j(list, 10);
        ArrayList arrayList = new ArrayList(j10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzmu) it.next()).zzM()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzmh zzy(String str, List list) {
        int[] O;
        if (str.length() != 0) {
            try {
                O = x.O(list);
                zzcq zzcqVar = new zzcq((short) zzcr.zza(O), (short) 255);
                StringBuilder sb = new StringBuilder(str.length());
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb.append((char) r.b(r.b(str.charAt(i10)) ^ r.b(zzcqVar.zza())));
                }
                return zzmh.zzg(zzeb.zzh().zzj(sb.toString()));
            } catch (Exception e10) {
                throw new zzt(3, 18, e10);
            }
        }
        throw new zzt(3, 17, null);
    }

    @Override // com.google.android.recaptcha.internal.zzas
    public final void zza(String str) {
        i.d(this.zzc, null, null, new zzaz(this, str, new zzn(), null), 3, null);
    }

    public final zzbn zzb() {
        return this.zzd;
    }
}
