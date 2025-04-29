package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Locale;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x  reason: invalid package */
/* loaded from: classes.dex */
public final class x {
    public static String a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        b(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            b(sb, locale2);
        }
        return sb.toString();
    }

    private static void b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
