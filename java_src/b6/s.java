package b6;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: j  reason: collision with root package name */
    private final List<c<?>> f3055j;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f3055j = list;
    }
}
