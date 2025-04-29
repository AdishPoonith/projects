package com.google.android.gms.internal.auth;

import android.util.Base64;
/* loaded from: classes.dex */
public final class h5 implements f5 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f4065a;

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f4066b;

    /* renamed from: c  reason: collision with root package name */
    public static final n0 f4067c;

    /* renamed from: d  reason: collision with root package name */
    public static final n0 f4068d;

    /* renamed from: e  reason: collision with root package name */
    public static final n0 f4069e;

    /* renamed from: f  reason: collision with root package name */
    public static final n0 f4070f;

    /* renamed from: g  reason: collision with root package name */
    public static final n0 f4071g;

    /* renamed from: h  reason: collision with root package name */
    public static final n0 f4072h;

    /* renamed from: i  reason: collision with root package name */
    public static final n0 f4073i;

    /* renamed from: j  reason: collision with root package name */
    public static final n0 f4074j;

    /* renamed from: k  reason: collision with root package name */
    public static final n0 f4075k;

    /* renamed from: l  reason: collision with root package name */
    public static final n0 f4076l;

    /* renamed from: m  reason: collision with root package name */
    public static final n0 f4077m;

    /* renamed from: n  reason: collision with root package name */
    public static final n0 f4078n;

    static {
        j0 a10 = new j0(b0.a("com.google.android.gms.auth_account")).b().a();
        f4065a = a10.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f4066b = a10.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f4067c = a10.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f4068d = a10.d("getTokenRefactor__android_id_shift", 0L);
        f4069e = a10.e("getTokenRefactor__authenticator_logic_improved", false);
        try {
            f4070f = a10.f("getTokenRefactor__blocked_packages", d5.j(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), g5.f4061a);
            f4071g = a10.e("getTokenRefactor__chimera_get_token_evolved", true);
            f4072h = a10.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f4073i = a10.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f4074j = a10.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f4075k = a10.e("getTokenRefactor__gaul_token_api_evolved", false);
            f4076l = a10.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f4077m = a10.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f4078n = a10.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.f5
    public final d5 zza() {
        return (d5) f4070f.b();
    }

    @Override // com.google.android.gms.internal.auth.f5
    public final boolean zzc() {
        return ((Boolean) f4075k.b()).booleanValue();
    }
}
