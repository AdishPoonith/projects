package y0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import f1.q;
import f1.r;
import f1.v;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import q0.c0;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f20320a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final String f20321b = i.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final c0 f20322c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private BigDecimal f20323a;

        /* renamed from: b  reason: collision with root package name */
        private Currency f20324b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f20325c;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            kotlin.jvm.internal.l.e(purchaseAmount, "purchaseAmount");
            kotlin.jvm.internal.l.e(currency, "currency");
            kotlin.jvm.internal.l.e(param, "param");
            this.f20323a = purchaseAmount;
            this.f20324b = currency;
            this.f20325c = param;
        }

        public final Currency a() {
            return this.f20324b;
        }

        public final Bundle b() {
            return this.f20325c;
        }

        public final BigDecimal c() {
            return this.f20323a;
        }
    }

    static {
        f0 f0Var = f0.f14852a;
        f20322c = new c0(f0.l());
    }

    private i() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z10 = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (kotlin.jvm.internal.l.a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                kotlin.jvm.internal.l.d(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            kotlin.jvm.internal.l.d(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(f20321b, "Error parsing in-app subscription data.", e10);
            return null;
        }
    }

    public static final boolean c() {
        f0 f0Var = f0.f14852a;
        String m10 = f0.m();
        v vVar = v.f8582a;
        r f10 = v.f(m10);
        return f10 != null && f0.p() && f10.e();
    }

    public static final void d() {
        f0 f0Var = f0.f14852a;
        Context l10 = f0.l();
        String m10 = f0.m();
        if (f0.p()) {
            if (l10 instanceof Application) {
                q0.o.f15963b.a((Application) l10, m10);
            } else {
                Log.w(f20321b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j10) {
        f0 f0Var = f0.f14852a;
        Context l10 = f0.l();
        String m10 = f0.m();
        v vVar = v.f8582a;
        r n10 = v.n(m10, false);
        if (n10 == null || !n10.a() || j10 <= 0) {
            return;
        }
        c0 c0Var = new c0(l10);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c0Var.c("fb_aa_time_spent_on_view", j10, bundle);
    }

    public static final void f(String purchase, String skuDetails, boolean z10) {
        a a10;
        kotlin.jvm.internal.l.e(purchase, "purchase");
        kotlin.jvm.internal.l.e(skuDetails, "skuDetails");
        i iVar = f20320a;
        if (c() && (a10 = iVar.a(purchase, skuDetails)) != null) {
            boolean z11 = false;
            if (z10) {
                q qVar = q.f8511a;
                f0 f0Var = f0.f14852a;
                if (q.d("app_events_if_auto_log_subs", f0.m(), false)) {
                    z11 = true;
                }
            }
            if (z11) {
                f20322c.i(w0.i.f19595a.m(skuDetails) ? "StartTrial" : "Subscribe", a10.c(), a10.a(), a10.b());
            } else {
                f20322c.j(a10.c(), a10.a(), a10.b());
            }
        }
    }
}
