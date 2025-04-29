package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import c4.o;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u  reason: invalid package */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f5409a;

    public u(String str) {
        int i10 = -1;
        try {
            List d10 = c0.c("[.-]").d(str);
            if (d10.size() == 1) {
                i10 = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (d10.size() >= 3) {
                    int parseInt = (Integer.parseInt((String) d10.get(0)) * 1000000) + (Integer.parseInt((String) d10.get(1)) * 1000);
                    int parseInt2 = Integer.parseInt((String) d10.get(2));
                    i10 = parseInt + parseInt2;
                    str = parseInt2;
                }
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            }
        }
        this.f5409a = i10;
    }

    public static u a() {
        String b10 = o.a().b("firebase-auth");
        return new u((TextUtils.isEmpty(b10) || b10.equals("UNKNOWN")) ? "-1" : "-1");
    }

    public final String b() {
        return String.format("X%s", Integer.toString(this.f5409a));
    }
}
