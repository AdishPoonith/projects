package c4;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3404b;

    public v(Context context) {
        s.j(context);
        Resources resources = context.getResources();
        this.f3403a = resources;
        this.f3404b = resources.getResourcePackageName(b4.l.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f3403a.getIdentifier(str, "string", this.f3404b);
        if (identifier == 0) {
            return null;
        }
        return this.f3403a.getString(identifier);
    }
}
