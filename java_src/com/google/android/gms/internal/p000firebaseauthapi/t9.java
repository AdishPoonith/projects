package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t9  reason: invalid package */
/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f5376a;

    private t9(InputStream inputStream) {
        this.f5376a = inputStream;
    }

    public static t9 c(byte[] bArr) {
        return new t9(new ByteArrayInputStream(bArr));
    }

    public final qq a() {
        try {
            return qq.E(this.f5376a, e5.a());
        } finally {
            this.f5376a.close();
        }
    }

    public final js b() {
        try {
            return js.H(this.f5376a, e5.a());
        } finally {
            this.f5376a.close();
        }
    }
}
