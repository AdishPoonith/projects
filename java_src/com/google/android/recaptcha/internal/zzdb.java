package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import t9.p;
import t9.q;
/* loaded from: classes.dex */
public final class zzdb {
    public static final zzdb zza = new zzdb();
    private static final List zzb;

    static {
        List g10;
        g10 = p.g("www.recaptcha.net", "www.gstatic.com/recaptcha");
        zzb = zzc(g10);
    }

    private zzdb() {
    }

    public static final boolean zza(Uri uri) {
        return !TextUtils.isEmpty(uri.toString()) && l.a("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString());
    }

    private static final boolean zzb(String str) {
        boolean t10;
        List<String> list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            t10 = ka.p.t(str, str2, false, 2, null);
            if (t10) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        int j10;
        j10 = q.j(list, 10);
        ArrayList arrayList = new ArrayList(j10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
