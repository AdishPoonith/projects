package com.google.android.gms.internal.auth;

import android.net.Uri;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final s.g f4236a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(s.g gVar) {
        this.f4236a = gVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            s.g gVar = (s.g) this.f4236a.get(uri.toString());
            if (gVar == null) {
                return null;
            }
            return (String) gVar.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
