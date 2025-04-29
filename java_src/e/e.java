package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import ha.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import s9.m;
import s9.q;
import t9.f0;
import t9.g0;
import t9.k;
import t9.x;
/* loaded from: classes.dex */
public final class e extends e.a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7966a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] input) {
            l.e(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            l.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // e.a
    /* renamed from: d */
    public Intent a(Context context, String[] input) {
        l.e(context, "context");
        l.e(input, "input");
        return f7966a.a(input);
    }

    @Override // e.a
    /* renamed from: e */
    public a.C0128a<Map<String, Boolean>> b(Context context, String[] input) {
        int a10;
        int a11;
        Map d10;
        l.e(context, "context");
        l.e(input, "input");
        boolean z10 = true;
        if (input.length == 0) {
            d10 = g0.d();
            return new a.C0128a<>(d10);
        }
        int length = input.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, input[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            a10 = f0.a(input.length);
            a11 = i.a(a10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(a11);
            for (String str : input) {
                m a12 = q.a(str, Boolean.TRUE);
                linkedHashMap.put(a12.c(), a12.d());
            }
            return new a.C0128a<>(linkedHashMap);
        }
        return null;
    }

    @Override // e.a
    /* renamed from: f */
    public Map<String, Boolean> c(int i10, Intent intent) {
        Map<String, Boolean> d10;
        List l10;
        List V;
        Map<String, Boolean> k10;
        Map<String, Boolean> d11;
        Map<String, Boolean> d12;
        if (i10 != -1) {
            d12 = g0.d();
            return d12;
        } else if (intent == null) {
            d11 = g0.d();
            return d11;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                d10 = g0.d();
                return d10;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            l10 = k.l(stringArrayExtra);
            V = x.V(l10, arrayList);
            k10 = g0.k(V);
            return k10;
        }
    }
}
