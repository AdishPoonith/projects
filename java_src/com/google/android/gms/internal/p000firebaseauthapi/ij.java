package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ij  reason: invalid package */
/* loaded from: classes.dex */
final /* synthetic */ class ij {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f4756a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ int[] f4757b;

    static {
        int[] iArr = new int[ur.values().length];
        f4757b = iArr;
        try {
            iArr[ur.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4757b[ur.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ct.values().length];
        f4756a = iArr2;
        try {
            iArr2[ct.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4756a[ct.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4756a[ct.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4756a[ct.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
