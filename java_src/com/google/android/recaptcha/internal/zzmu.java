package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzmu extends zzgo implements zzhz {
    private static final zzmu zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzmu zzmuVar = new zzmu();
        zzb = zzmuVar;
        zzgo.zzC(zzmu.class, zzmuVar);
    }

    private zzmu() {
    }

    public final long zzG() {
        if (this.zzd == 8) {
            return ((Long) this.zze).longValue();
        }
        return 0L;
    }

    public final zzez zzH() {
        return this.zzd == 3 ? (zzez) this.zze : zzez.zzb;
    }

    public final String zzJ() {
        return this.zzd == 4 ? (String) this.zze : "";
    }

    public final String zzK() {
        return this.zzd == 12 ? (String) this.zze : "";
    }

    public final boolean zzL() {
        if (this.zzd == 2) {
            return ((Boolean) this.zze).booleanValue();
        }
        return false;
    }

    public final boolean zzM() {
        return this.zzd == 1;
    }

    public final int zzN() {
        switch (this.zzd) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf() {
        if (this.zzd == 11) {
            return ((Double) this.zze).doubleValue();
        }
        return 0.0d;
    }

    public final float zzg() {
        if (this.zzd == 10) {
            return ((Float) this.zze).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzmt(null);
                }
                return new zzmu();
            }
            return zzgo.zzz(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int zzi() {
        if (this.zzd == 1) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzj() {
        if (this.zzd == 5) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzk() {
        if (this.zzd == 6) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }
}
