package androidx.window.layout;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import da.l;
/* loaded from: classes.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            kotlin.jvm.internal.l.e(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @ExperimentalWindowApi
        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
