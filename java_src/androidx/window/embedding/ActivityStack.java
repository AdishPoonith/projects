package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.l;
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activities, boolean z10) {
        l.e(activities, "activities");
        this.activities = activities;
        this.isEmpty = z10;
    }

    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean contains(Activity activity) {
        l.e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityStack) {
            ActivityStack activityStack = (ActivityStack) obj;
            return (l.a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
        }
        return false;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(l.k("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        l.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
