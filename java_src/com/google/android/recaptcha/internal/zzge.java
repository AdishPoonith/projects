package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzge {
    private static final zzge zzb = new zzge(true);
    final zziy zza = new zzio(16);
    private boolean zzc;
    private boolean zzd;

    private zzge() {
    }

    private zzge(boolean z10) {
        zzg();
        zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(zzgd zzgdVar, Object obj) {
        long longValue;
        int intValue;
        int zza;
        int intValue2;
        zzjv zzd = zzgdVar.zzd();
        int zza2 = zzgdVar.zza();
        zzgdVar.zzg();
        int i10 = zzfk.zzb;
        int zzy = zzfk.zzy(zza2 << 3);
        if (zzd == zzjv.zzj) {
            zzhy zzhyVar = (zzhy) obj;
            byte[] bArr = zzgw.zzd;
            if (zzhyVar instanceof zzej) {
                zzej zzejVar = (zzej) zzhyVar;
                throw null;
            }
            zzy += zzy;
        }
        zzjw zzjwVar = zzjw.INT;
        int i11 = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i11 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                longValue = ((Long) obj).longValue();
                i11 = zzfk.zzz(longValue);
                break;
            case 4:
                intValue = ((Integer) obj).intValue();
                i11 = zzfk.zzu(intValue);
                break;
            case 5:
            case 15:
                ((Long) obj).longValue();
                i11 = 8;
                break;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i11 = 1;
                break;
            case 8:
                if (!(obj instanceof zzez)) {
                    i11 = zzfk.zzx((String) obj);
                    break;
                }
                zza = ((zzez) obj).zzd();
                i11 = zzfk.zzy(zza) + zza;
                break;
            case 9:
                i11 = ((zzhy) obj).zzn();
                break;
            case 10:
                if (!(obj instanceof zzhd)) {
                    i11 = zzfk.zzv((zzhy) obj);
                    break;
                } else {
                    zza = ((zzhd) obj).zza();
                    i11 = zzfk.zzy(zza) + zza;
                    break;
                }
            case 11:
                if (!(obj instanceof zzez)) {
                    zza = ((byte[]) obj).length;
                    i11 = zzfk.zzy(zza) + zza;
                    break;
                }
                zza = ((zzez) obj).zzd();
                i11 = zzfk.zzy(zza) + zza;
            case 12:
                intValue2 = ((Integer) obj).intValue();
                i11 = zzfk.zzy(intValue2);
                break;
            case 13:
                if (obj instanceof zzgq) {
                    intValue = ((zzgq) obj).zza();
                    i11 = zzfk.zzu(intValue);
                    break;
                }
                intValue = ((Integer) obj).intValue();
                i11 = zzfk.zzu(intValue);
            case 16:
                int intValue3 = ((Integer) obj).intValue();
                intValue2 = (intValue3 >> 31) ^ (intValue3 + intValue3);
                i11 = zzfk.zzy(intValue2);
                break;
            case 17:
                long longValue2 = ((Long) obj).longValue();
                longValue = (longValue2 >> 63) ^ (longValue2 + longValue2);
                i11 = zzfk.zzz(longValue);
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzy + i11;
    }

    public static zzge zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzid) {
            return ((zzid) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzm(Map.Entry entry) {
        AbstractMap abstractMap;
        Object zzl;
        Object zze;
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzhd) {
            zzhd zzhdVar = (zzhd) value;
            throw null;
        }
        zzgdVar.zzg();
        if (zzgdVar.zze() != zzjw.MESSAGE || (zze = zze(zzgdVar)) == null) {
            abstractMap = this.zza;
            zzl = zzl(value);
        } else {
            if (zze instanceof zzid) {
                zzl = zzgdVar.zzc((zzid) zze, (zzid) value);
            } else {
                zzhx zzW = ((zzhy) zze).zzW();
                zzgdVar.zzb(zzW, (zzhy) value);
                zzl = zzW.zzj();
            }
            abstractMap = this.zza;
        }
        abstractMap.put(zzgdVar, zzl);
    }

    private static boolean zzn(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        if (zzgdVar.zze() == zzjw.MESSAGE) {
            zzgdVar.zzg();
            Object value = entry.getValue();
            if (value instanceof zzhz) {
                return ((zzhz) value).zzo();
            }
            if (value instanceof zzhd) {
                return true;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static final int zzo(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (zzgdVar.zze() == zzjw.MESSAGE) {
            zzgdVar.zzg();
            zzgdVar.zzf();
            boolean z10 = value instanceof zzhd;
            int zza = ((zzgd) entry.getKey()).zza();
            if (!z10) {
                int zzy = zzfk.zzy(zza);
                int zzy2 = zzfk.zzy(24) + zzfk.zzv((zzhy) value);
                int zzy3 = zzfk.zzy(16);
                int zzy4 = zzfk.zzy(8);
                return zzy4 + zzy4 + zzy3 + zzy + zzy2;
            }
            int zzy5 = zzfk.zzy(zza);
            int zza2 = ((zzhd) value).zza();
            int zzy6 = zzfk.zzy(zza2) + zza2;
            int zzy7 = zzfk.zzy(24);
            int zzy8 = zzfk.zzy(16);
            int zzy9 = zzfk.zzy(8);
            return zzy9 + zzy9 + zzy8 + zzy5 + zzy7 + zzy6;
        }
        return zza(zzgdVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzge) {
            return this.zza.equals(((zzge) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        for (Map.Entry entry : this.zza.zzc()) {
            i10 += zzo(entry);
        }
        return i10;
    }

    /* renamed from: zzc */
    public final zzge clone() {
        zzge zzgeVar = new zzge();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgeVar.zzi((zzgd) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgeVar.zzi((zzgd) entry.getKey(), entry.getValue());
        }
        zzgeVar.zzd = this.zzd;
        return zzgeVar;
    }

    public final Object zze(zzgd zzgdVar) {
        Object obj = this.zza.get(zzgdVar);
        if (obj instanceof zzhd) {
            zzhd zzhdVar = (zzhd) obj;
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzhc(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            if (zzg.getValue() instanceof zzgo) {
                ((zzgo) zzg.getValue()).zzA();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzge zzgeVar) {
        for (int i10 = 0; i10 < zzgeVar.zza.zzb(); i10++) {
            zzm(zzgeVar.zza.zzg(i10));
        }
        for (Map.Entry entry : zzgeVar.zza.zzc()) {
            zzm(entry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzgq) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzhd) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.recaptcha.internal.zzgd r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zzjv r0 = r6.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzgw.zzd
            java.util.Objects.requireNonNull(r7)
            com.google.android.recaptcha.internal.zzjv r1 = com.google.android.recaptcha.internal.zzjv.zza
            com.google.android.recaptcha.internal.zzjw r1 = com.google.android.recaptcha.internal.zzjw.INT
            com.google.android.recaptcha.internal.zzjw r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhy
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgq
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzez
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zziy r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.recaptcha.internal.zzjv r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzjw r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzge.zzi(com.google.android.recaptcha.internal.zzgd, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzc()) {
            if (!zzn(entry)) {
                return false;
            }
        }
        return true;
    }
}
