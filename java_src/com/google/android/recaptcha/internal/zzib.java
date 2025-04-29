package com.google.android.recaptcha.internal;

import f.j;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzib<T> implements zzil<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhy zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzhm zzn;
    private final zzjf zzo;
    private final zzga zzp;
    private final zzie zzq;
    private final zzht zzr;

    private zzib(int[] iArr, Object[] objArr, int i10, int i11, zzhy zzhyVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzie zzieVar, zzhm zzhmVar, zzjf zzjfVar, zzga zzgaVar, zzht zzhtVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhyVar instanceof zzgo;
        this.zzj = z10;
        boolean z12 = false;
        if (zzgaVar != null && zzgaVar.zzj(zzhyVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzieVar;
        this.zzn = zzhmVar;
        this.zzo = zzjfVar;
        this.zzp = zzgaVar;
        this.zzg = zzhyVar;
        this.zzr = zzhtVar;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzjp.zzf(obj, j10)).longValue();
    }

    private final zzgs zzB(int i10) {
        int i11 = i10 / 3;
        return (zzgs) this.zzd[i11 + i11 + 1];
    }

    private final zzil zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzil zzilVar = (zzil) this.zzd[i12];
        if (zzilVar != null) {
            return zzilVar;
        }
        zzil zzb2 = zzih.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzjf zzjfVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzjp.zzf(obj, zzz(i10) & 1048575);
        if (zzf == null || zzB(i10) == null) {
            return obj2;
        }
        zzhs zzhsVar = (zzhs) zzf;
        zzhr zzhrVar = (zzhr) zzE(i10);
        throw null;
    }

    private final Object zzE(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzF(Object obj, int i10) {
        zzil zzC = zzC(i10);
        int zzz = zzz(i10) & 1048575;
        if (zzT(obj, i10)) {
            Object object = zzb.getObject(obj, zzz);
            if (zzW(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzil zzC = zzC(i11);
        if (zzX(obj, i10, i11)) {
            Object object = zzb.getObject(obj, zzz(i11) & 1048575);
            if (zzW(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzI(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (zzT(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i10) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzil zzC = zzC(i10);
            if (!zzT(obj, i10)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzM(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzX(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i10) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzil zzC = zzC(i10);
            if (!zzX(obj, i11, i10)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzN(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i10, zzik zzikVar) {
        int i11;
        Object zzr;
        if (zzS(i10)) {
            i11 = i10 & 1048575;
            zzr = zzikVar.zzs();
        } else {
            i11 = i10 & 1048575;
            zzr = this.zzi ? zzikVar.zzr() : zzikVar.zzp();
        }
        zzjp.zzs(obj, i11, zzr);
    }

    private final void zzM(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = 1048575 & zzw;
        if (j10 == 1048575) {
            return;
        }
        zzjp.zzq(obj, j10, (1 << (zzw >>> 20)) | zzjp.zzc(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzjp.zzq(obj, zzw(i11) & 1048575, i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzz(i11) & 1048575, obj2);
        zzN(obj, i10, i11);
    }

    private final void zzQ(zzjx zzjxVar, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        zzhr zzhrVar = (zzhr) zzE(i11);
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i10) {
        return zzT(obj, i10) == zzT(obj2, i10);
    }

    private static boolean zzS(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = zzw & 1048575;
        if (j10 != 1048575) {
            return (zzjp.zzc(obj, j10) & (1 << (zzw >>> 20))) != 0;
        }
        int zzz = zzz(i10);
        long j11 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzjp.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjp.zzb(obj, j11)) != 0;
            case 2:
                return zzjp.zzd(obj, j11) != 0;
            case 3:
                return zzjp.zzd(obj, j11) != 0;
            case 4:
                return zzjp.zzc(obj, j11) != 0;
            case 5:
                return zzjp.zzd(obj, j11) != 0;
            case 6:
                return zzjp.zzc(obj, j11) != 0;
            case 7:
                return zzjp.zzw(obj, j11);
            case 8:
                Object zzf = zzjp.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzez) {
                    return !zzez.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzjp.zzf(obj, j11) != null;
            case 10:
                return !zzez.zzb.equals(zzjp.zzf(obj, j11));
            case 11:
                return zzjp.zzc(obj, j11) != 0;
            case 12:
                return zzjp.zzc(obj, j11) != 0;
            case 13:
                return zzjp.zzc(obj, j11) != 0;
            case 14:
                return zzjp.zzd(obj, j11) != 0;
            case 15:
                return zzjp.zzc(obj, j11) != 0;
            case 16:
                return zzjp.zzd(obj, j11) != 0;
            case 17:
                return zzjp.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzT(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzV(Object obj, int i10, zzil zzilVar) {
        return zzilVar.zzl(zzjp.zzf(obj, i10 & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zzF();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i10, int i11) {
        return zzjp.zzc(obj, (long) (zzw(i11) & 1048575)) == i10;
    }

    private static boolean zzY(Object obj, long j10) {
        return ((Boolean) zzjp.zzf(obj, j10)).booleanValue();
    }

    private static final void zzZ(int i10, Object obj, zzjx zzjxVar) {
        if (obj instanceof String) {
            zzjxVar.zzG(i10, (String) obj);
        } else {
            zzjxVar.zzd(i10, (zzez) obj);
        }
    }

    static zzjg zzd(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar == zzjg.zzc()) {
            zzjg zzf = zzjg.zzf();
            zzgoVar.zzc = zzf;
            return zzf;
        }
        return zzjgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzib zzm(java.lang.Class r31, com.google.android.recaptcha.internal.zzhv r32, com.google.android.recaptcha.internal.zzie r33, com.google.android.recaptcha.internal.zzhm r34, com.google.android.recaptcha.internal.zzjf r35, com.google.android.recaptcha.internal.zzga r36, com.google.android.recaptcha.internal.zzht r37) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzhv, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzhm, com.google.android.recaptcha.internal.zzjf, com.google.android.recaptcha.internal.zzga, com.google.android.recaptcha.internal.zzht):com.google.android.recaptcha.internal.zzib");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzjp.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzjp.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020c, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0219, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0233, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0240, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024d, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024f, code lost:
        r4 = com.google.android.recaptcha.internal.zzfk.zzy(r11 << 3) + com.google.android.recaptcha.internal.zzfk.zzy(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (zzX(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (zzX(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (zzX(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
        if (zzX(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
        if (zzX(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
        if (zzX(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
        r4 = r11 << 3;
        r3 = com.google.android.recaptcha.internal.zzfk.zzu(zzq(r17, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
        if (zzX(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (zzX(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
        r3 = com.google.android.recaptcha.internal.zzfk.zzz(zzA(r17, r3));
        r4 = com.google.android.recaptcha.internal.zzfk.zzy(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
        if (zzX(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
        r3 = com.google.android.recaptcha.internal.zzfk.zzy(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
        if (zzX(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
        r3 = com.google.android.recaptcha.internal.zzfk.zzy(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d4, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
        if (r3 > 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzp(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzp(java.lang.Object):int");
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzjp.zzf(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzem zzemVar) {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzht.zzb(object)) {
            zzhs zzb2 = zzhs.zza().zzb();
            zzht.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzhr zzhrVar = (zzhr) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzem zzemVar) {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzemVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzen.zzj(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzemVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzen.zzq(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzen.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzemVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzen.zzj(bArr, i10, zzemVar);
                    int i22 = zzemVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzju.zzf(bArr, zzj2, zzj2 + i22)) {
                        throw zzgy.zzd();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzgw.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzG = zzG(obj, i13, i17);
                    int zzo = zzen.zzo(zzG, zzC(i17), bArr, i10, i11, zzemVar);
                    zzP(obj, i13, i17, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzen.zza(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, zzemVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzen.zzj(bArr, i10, zzemVar);
                    int i23 = zzemVar.zza;
                    zzgs zzB = zzB(i17);
                    if (zzB == null || zzB.zza()) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        zzd(obj).zzj(i12, Long.valueOf(i23));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzen.zzj(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzff.zzF(zzemVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzff.zzG(zzemVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzG2 = zzG(obj, i13, i17);
                    int zzn = zzen.zzn(zzG2, zzC(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzemVar);
                    zzP(obj, i13, i17, zzG2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x024a, code lost:
        if (r29.zzb != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024e, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x024f, code lost:
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0252, code lost:
        if (r4 >= r19) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
        r6 = com.google.android.recaptcha.internal.zzen.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025a, code lost:
        if (r20 == r29.zza) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025d, code lost:
        r4 = com.google.android.recaptcha.internal.zzen.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0265, code lost:
        if (r29.zzb == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0268, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.recaptcha.internal.zzez.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.recaptcha.internal.zzez.zzm(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.recaptcha.internal.zzen.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.zza) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.recaptcha.internal.zzen.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.google.android.recaptcha.internal.zzgy.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.recaptcha.internal.zzgy.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01d9 -> B:110:0x01dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01ef -> B:105:0x01c6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x024e -> B:146:0x024f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0265 -> B:144:0x024c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0195 -> B:90:0x0199). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ab -> B:87:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.recaptcha.internal.zzem r29) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.recaptcha.internal.zzem):int");
    }

    private final int zzu(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, 0);
    }

    private final int zzv(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, i11);
    }

    private final int zzw(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzx(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
        if ((r4 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031e, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.recaptcha.internal.zzfk.zzx((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.recaptcha.internal.zzez) != false) goto L54;
     */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzb(java.lang.Object):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04dc, code lost:
        if (r0 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04de, code lost:
        r31.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04e4, code lost:
        r10 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04e9, code lost:
        if (r10 >= r9.zzm) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04eb, code lost:
        zzD(r34, r9.zzk[r10], null, r9.zzo, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0500, code lost:
        if (r7 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0502, code lost:
        if (r6 != r37) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0509, code lost:
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x050a, code lost:
        if (r6 > r37) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x050c, code lost:
        if (r8 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x050e, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0513, code lost:
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzem r39) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzem):int");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        return ((zzgo) this.zzg).zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzf(Object obj) {
        int i10;
        if (zzW(obj)) {
            if (obj instanceof zzgo) {
                zzgo zzgoVar = (zzgo) obj;
                zzgoVar.zzD(Integer.MAX_VALUE);
                zzgoVar.zza = 0;
                zzgoVar.zzB();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzz = zzz(i10);
                int i11 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j10 = i11;
                if (zzy != 9) {
                    if (zzy != 60 && zzy != 68) {
                        switch (zzy) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case j.f8330t3 /* 23 */:
                            case j.f8335u3 /* 24 */:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case j.f8360z3 /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzn.zzb(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object == null) {
                                    break;
                                } else {
                                    ((zzhs) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                }
                        }
                    } else {
                        if (!zzX(obj, this.zzc[i10], i10)) {
                        }
                        zzC(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzT(obj, i10) ? 0 : i10 + 3;
                zzC(i10).zzf(zzb.getObject(obj, j10));
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzz = zzz(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzT(obj2, i10)) {
                        zzjp.zzo(obj, j10, zzjp.zza(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i10)) {
                        zzjp.zzp(obj, j10, zzjp.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 3:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 4:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 5:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 6:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 7:
                    if (zzT(obj2, i10)) {
                        zzjp.zzm(obj, j10, zzjp.zzw(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 9:
                case 17:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 11:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 12:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 13:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 14:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 15:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 16:
                    if (!zzT(obj2, i10)) {
                        break;
                    }
                    zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                    zzM(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case j.f8330t3 /* 23 */:
                case j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case j.f8360z3 /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzin.zza;
                    zzjp.zzs(obj, j10, zzht.zzc(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzX(obj2, i11, i10)) {
                        break;
                    }
                    zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                    zzN(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    zzK(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzX(obj2, i11, i10)) {
                        break;
                    }
                    zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                    zzN(obj, i11, i10);
                    break;
            }
        }
        zzin.zzE(this.zzo, obj, obj2);
        if (this.zzh) {
            zzin.zzD(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x05df A[LOOP:3: B:193:0x05db->B:195:0x05df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05f3  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzik r19, com.google.android.recaptcha.internal.zzfz r20) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzik, com.google.android.recaptcha.internal.zzfz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ea, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ec, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0329, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034a, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.recaptcha.internal.zzem r35) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzem):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0990  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r18, com.google.android.recaptcha.internal.zzjx r19) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzjx):void");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzk(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzz = zzz(i10);
            long j10 = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzR(obj, obj2, i10) && Double.doubleToLongBits(zzjp.zza(obj, j10)) == Double.doubleToLongBits(zzjp.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzR(obj, obj2, i10) && Float.floatToIntBits(zzjp.zzb(obj, j10)) == Float.floatToIntBits(zzjp.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzR(obj, obj2, i10) && zzjp.zzw(obj, j10) == zzjp.zzw(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzR(obj, obj2, i10) && zzjp.zzc(obj, j10) == zzjp.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzR(obj, obj2, i10) && zzjp.zzd(obj, j10) == zzjp.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzR(obj, obj2, i10) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case j.f8330t3 /* 23 */:
                case j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case j.f8360z3 /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzw = zzw(i10) & 1048575;
                    if (zzjp.zzc(obj, zzw) == zzjp.zzc(obj2, zzw) && zzin.zzY(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                return this.zzp.zzb(obj).equals(this.zzp.zzb(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzl) {
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzz = zzz(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzz) != 0 && !zzU(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzX(obj, i16, i15) && !zzV(obj, zzz, zzC(i15))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzhs) zzjp.zzf(obj, zzz & 1048575)).isEmpty()) {
                            zzhr zzhrVar = (zzhr) zzE(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzjp.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzil zzC = zzC(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzC.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzU(obj, i15, i10, i11, i19) && !zzV(obj, zzz, zzC(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.zzh || this.zzp.zzb(obj).zzk();
    }
}
