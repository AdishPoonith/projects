package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u9  reason: invalid package */
/* loaded from: classes.dex */
public final class u9 implements qa {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f5439a;

    private u9(OutputStream outputStream) {
        this.f5439a = outputStream;
    }

    public static qa c(OutputStream outputStream) {
        return new u9(outputStream);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qa
    public final void a(js jsVar) {
        try {
            jsVar.e(this.f5439a);
        } finally {
            this.f5439a.close();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qa
    public final void b(qq qqVar) {
        throw null;
    }
}
