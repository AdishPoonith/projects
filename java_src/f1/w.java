package f1;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum w {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f8598j;

    w(String str) {
        this.f8598j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static w[] valuesCustom() {
        w[] valuesCustom = values();
        return (w[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f8598j;
    }
}
