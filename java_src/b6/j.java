package b6;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* loaded from: classes.dex */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f3026a = new j() { // from class: b6.i
        @Override // b6.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<c<?>> a(ComponentRegistrar componentRegistrar);
}
