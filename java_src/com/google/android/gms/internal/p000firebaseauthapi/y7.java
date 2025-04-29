package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y7  reason: invalid package */
/* loaded from: classes.dex */
final class y7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(m4 m4Var) {
        String str;
        StringBuilder sb = new StringBuilder(m4Var.k());
        for (int i10 = 0; i10 < m4Var.k(); i10++) {
            int b10 = m4Var.b(i10);
            if (b10 == 34) {
                str = "\\\"";
            } else if (b10 == 39) {
                str = "\\'";
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b10 >>> 6) & 3) + 48));
                            sb.append((char) (((b10 >>> 3) & 7) + 48));
                            b10 = (b10 & 7) + 48;
                        }
                        sb.append((char) b10);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
