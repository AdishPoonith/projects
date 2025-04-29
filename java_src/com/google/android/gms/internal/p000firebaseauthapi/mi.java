package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mi */
/* loaded from: classes.dex */
public final class mi {

    /* renamed from: a */
    private Context f5014a = null;

    /* renamed from: b */
    private String f5015b = null;

    /* renamed from: c */
    private String f5016c = null;

    /* renamed from: d */
    private String f5017d = null;

    /* renamed from: e */
    private s9 f5018e = null;

    /* renamed from: f */
    private ja f5019f = null;

    /* renamed from: g */
    private oa f5020g;

    private final s9 j() {
        String str;
        String str2;
        String str3;
        if (!oi.d()) {
            str3 = oi.f5134e;
            Log.w(str3, "Android Keystore requires at least Android M");
            return null;
        }
        qi qiVar = new qi();
        try {
            boolean b10 = qi.b(this.f5017d);
            try {
                return qiVar.zza(this.f5017d);
            } catch (GeneralSecurityException | ProviderException e10) {
                if (b10) {
                    str2 = oi.f5134e;
                    Log.w(str2, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f5017d), e10);
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            str = oi.f5134e;
            Log.w(str, "cannot use Android Keystore, it'll be disabled", e11);
            return null;
        }
    }

    private final oa k(byte[] bArr) {
        String str;
        try {
            this.f5018e = new qi().zza(this.f5017d);
            try {
                return oa.f(na.h(t9.c(bArr), this.f5018e));
            } catch (IOException | GeneralSecurityException e10) {
                try {
                    return l(bArr);
                } catch (IOException unused) {
                    throw e10;
                }
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            try {
                oa l10 = l(bArr);
                str = oi.f5134e;
                Log.w(str, "cannot use Android Keystore, it'll be disabled", e11);
                return l10;
            } catch (IOException unused2) {
                throw e11;
            }
        }
    }

    private static final oa l(byte[] bArr) {
        return oa.f(v9.b(t9.c(bArr)));
    }

    public final mi d(as asVar) {
        String H = asVar.H();
        byte[] z10 = asVar.G().z();
        ct F = asVar.F();
        int i10 = oi.f5135f;
        ct ctVar = ct.UNKNOWN_PREFIX;
        int ordinal = F.ordinal();
        int i11 = 4;
        if (ordinal == 1) {
            i11 = 1;
        } else if (ordinal == 2) {
            i11 = 2;
        } else if (ordinal == 3) {
            i11 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f5019f = ja.e(H, z10, i11);
        return this;
    }

    public final mi e(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f5017d = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final mi f(Context context, String str, String str2) {
        if (context != null) {
            this.f5014a = context;
            this.f5015b = "GenericIdpKeyset";
            this.f5016c = str2;
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized oi g() {
        Object obj;
        byte[] bArr;
        oa l10;
        oi oiVar;
        if (this.f5015b == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        obj = oi.f5133d;
        synchronized (obj) {
            Context context = this.f5014a;
            String str = this.f5015b;
            String str2 = this.f5016c;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    bArr = null;
                } else if (string.length() % 2 != 0) {
                    throw new IllegalArgumentException("Expected a string of even length");
                } else {
                    int length = string.length() / 2;
                    bArr = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = i10 + i10;
                        int digit = Character.digit(string.charAt(i11), 16);
                        int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                        if (digit == -1 || digit2 == -1) {
                            throw new IllegalArgumentException("input is not hexadecimal");
                        }
                        bArr[i10] = (byte) ((digit * 16) + digit2);
                    }
                }
                if (bArr == null) {
                    if (this.f5017d != null) {
                        this.f5018e = j();
                    }
                    if (this.f5019f == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    l10 = oa.e();
                    l10.c(this.f5019f);
                    l10.d(l10.b().d().D(0).C());
                    ri riVar = new ri(this.f5014a, this.f5015b, this.f5016c);
                    if (this.f5018e != null) {
                        l10.b().f(riVar, this.f5018e);
                    } else {
                        v9.a(l10.b(), riVar);
                    }
                } else {
                    if (this.f5017d != null && oi.d()) {
                        l10 = k(bArr);
                    }
                    l10 = l(bArr);
                }
                this.f5020g = l10;
                oiVar = new oi(this, null);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }
        return oiVar;
    }
}
