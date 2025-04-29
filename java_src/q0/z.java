package q0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum z {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static z[] valuesCustom() {
        z[] valuesCustom = values();
        return (z[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
