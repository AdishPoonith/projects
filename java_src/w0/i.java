package w0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ka.q;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f19595a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Method> f19596b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f19597c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final String f19598d;

    /* renamed from: e  reason: collision with root package name */
    private static final SharedPreferences f19599e;

    /* renamed from: f  reason: collision with root package name */
    private static final SharedPreferences f19600f;

    static {
        f0 f0Var = f0.f14852a;
        f19598d = f0.l().getPackageName();
        f19599e = f0.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        f19600f = f0.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    private i() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            return f19595a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final void b() {
        SharedPreferences.Editor putLong;
        if (k1.a.d(i.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f19599e;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                putLong = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else if (currentTimeMillis - j10 <= 604800) {
                return;
            } else {
                putLong = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th) {
            k1.a.b(th, i.class);
        }
    }

    private final ArrayList<String> c(ArrayList<String> arrayList) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f19600f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !kotlin.jvm.internal.l.a(f19600f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final Class<?> d(Context context, String str) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f19597c;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            m mVar = m.f19616a;
            Class<?> b10 = m.b(context, str);
            if (b10 != null) {
                hashMap.put(str, b10);
            }
            return b10;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method e(Class<?> cls, String str) {
        Class[] clsArr;
        Method c10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f19596b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (!str.equals("getPurchases")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE = Integer.TYPE;
                        kotlin.jvm.internal.l.d(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE2 = Integer.TYPE;
                        kotlin.jvm.internal.l.d(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE3 = Integer.TYPE;
                        kotlin.jvm.internal.l.d(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE4 = Integer.TYPE;
                        kotlin.jvm.internal.l.d(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                m mVar = m.f19616a;
                c10 = m.c(cls, str, null);
            } else {
                m mVar2 = m.f19616a;
                c10 = m.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (c10 != null) {
                hashMap.put(str, c10);
            }
            return c10;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final ArrayList<String> f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, obj, str)) {
                String str2 = null;
                int i10 = 0;
                boolean z10 = false;
                do {
                    Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f19598d, str, str2, new Bundle()});
                    if (n10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i10 < 30) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final ArrayList<String> g(Context context, Object obj) {
        i iVar;
        Class<?> d10;
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (d10 = (iVar = f19595a).d(context, "com.android.vending.billing.IInAppBillingService")) == null || iVar.e(d10, "getPurchaseHistory") == null) ? arrayList : iVar.c(iVar.f(context, obj, "inapp"));
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[EDGE_INSN: B:31:0x0062->B:23:0x0062 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList<java.lang.String> h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = k1.a.d(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.o(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            r2 = 0
            r3 = r1
            r4 = 0
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L63
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r11[r2] = r6     // Catch: java.lang.Throwable -> L63
            r6 = 1
            java.lang.String r7 = w0.i.f19598d     // Catch: java.lang.Throwable -> L63
            r11[r6] = r7     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L63
            r11[r5] = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L62
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r5 = 30
            if (r4 >= r5) goto L62
            if (r3 != 0) goto L19
        L62:
            return r0
        L63:
            r13 = move-exception
            k1.a.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.i.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList<String> i(Context context, Object obj) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            i iVar = f19595a;
            return iVar.c(iVar.h(context, obj, "inapp"));
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final ArrayList<String> j(Context context, Object obj) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            i iVar = f19595a;
            return iVar.c(iVar.h(context, obj, "subs"));
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final Map<String, String> k(Context context, ArrayList<String> skuList, Object obj, boolean z10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(skuList, "skuList");
            Map<String, String> p10 = f19595a.p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = skuList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!p10.containsKey(next)) {
                    arrayList.add(next);
                }
            }
            p10.putAll(f19595a.l(context, arrayList, obj, z10));
            return p10;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    private final Map<String, String> l(Context context, ArrayList<String> arrayList, Object obj, boolean z10) {
        int size;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f19598d;
                objArr[2] = z10 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (n10 != null) {
                    Bundle bundle2 = (Bundle) n10;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                String str = arrayList.get(i10);
                                kotlin.jvm.internal.l.d(str, "skuList[i]");
                                String str2 = stringArrayList.get(i10);
                                kotlin.jvm.internal.l.d(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            Class<?> d10 = d(context, str);
            if (d10 == null || (e10 = e(d10, str2)) == null) {
                return null;
            }
            m mVar = m.f19616a;
            return m.e(d10, e10, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (k1.a.d(this) || obj == null) {
            return false;
        }
        try {
            Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f19598d, str});
            if (n10 != null) {
                return ((Integer) n10).intValue() == 0;
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final Map<String, String> p(ArrayList<String> arrayList) {
        List b02;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = it.next();
                String string = f19599e.getString(sku, null);
                if (string != null) {
                    b02 = q.b0(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) b02.get(0)) < 43200) {
                        kotlin.jvm.internal.l.d(sku, "sku");
                        linkedHashMap.put(sku, b02.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final void q(Map<String, String> map) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f19599e.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final boolean m(String skuDetail) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.l.e(skuDetail, "skuDetail");
            try {
                String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}
