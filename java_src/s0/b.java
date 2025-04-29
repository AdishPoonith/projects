package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    

    /* renamed from: k  reason: collision with root package name */
    public static final a f16863k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final String f16879j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a(String rawValue) {
            b[] valuesCustom;
            kotlin.jvm.internal.l.e(rawValue, "rawValue");
            for (b bVar : b.valuesCustom()) {
                if (kotlin.jvm.internal.l.a(bVar.g(), rawValue)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    b(String str) {
        this.f16879j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] valuesCustom = values();
        return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f16879j;
    }
}
