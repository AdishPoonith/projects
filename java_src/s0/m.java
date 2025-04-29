package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");
    

    /* renamed from: k  reason: collision with root package name */
    public static final a f16975k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final String f16991j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m a(String rawValue) {
            m[] valuesCustom;
            kotlin.jvm.internal.l.e(rawValue, "rawValue");
            for (m mVar : m.valuesCustom()) {
                if (kotlin.jvm.internal.l.a(mVar.g(), rawValue)) {
                    return mVar;
                }
            }
            return null;
        }
    }

    m(String str) {
        this.f16991j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        m[] valuesCustom = values();
        return (m[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f16991j;
    }
}
