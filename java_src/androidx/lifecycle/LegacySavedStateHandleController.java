package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.e;
import androidx.savedstate.a;
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f2488a = new LegacySavedStateHandleController();

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0047a {
        @Override // androidx.savedstate.a.InterfaceC0047a
        public void a(f0.d owner) {
            kotlin.jvm.internal.l.e(owner, "owner");
            if (!(owner instanceof b0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            a0 p10 = ((b0) owner).p();
            androidx.savedstate.a j10 = owner.j();
            for (String str : p10.c()) {
                w b10 = p10.b(str);
                kotlin.jvm.internal.l.b(b10);
                LegacySavedStateHandleController.a(b10, j10, owner.a());
            }
            if (!p10.c().isEmpty()) {
                j10.i(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(w viewModel, androidx.savedstate.a registry, e lifecycle) {
        kotlin.jvm.internal.l.e(viewModel, "viewModel");
        kotlin.jvm.internal.l.e(registry, "registry");
        kotlin.jvm.internal.l.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.b()) {
            return;
        }
        savedStateHandleController.a(registry, lifecycle);
        f2488a.b(registry, lifecycle);
    }

    private final void b(final androidx.savedstate.a aVar, final e eVar) {
        e.b b10 = eVar.b();
        if (b10 == e.b.INITIALIZED || b10.g(e.b.STARTED)) {
            aVar.i(a.class);
        } else {
            eVar.a(new g() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.g
                public void q(i source, e.a event) {
                    kotlin.jvm.internal.l.e(source, "source");
                    kotlin.jvm.internal.l.e(event, "event");
                    if (event == e.a.ON_START) {
                        e.this.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
