package p0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum r0 {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static r0[] valuesCustom() {
        r0[] valuesCustom = values();
        return (r0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
