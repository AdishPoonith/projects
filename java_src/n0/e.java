package n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import r8.k;
/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final String f13988a;

    /* renamed from: b  reason: collision with root package name */
    private final k.d f13989b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13990c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f13991d;

    /* renamed from: e  reason: collision with root package name */
    private String f13992e;

    public e(k.d flutterResult, boolean z10) {
        kotlin.jvm.internal.l.e(flutterResult, "flutterResult");
        this.f13988a = "SpeechToTextPlugin";
        this.f13989b = flutterResult;
        this.f13990c = z10;
    }

    private final String a(Locale locale) {
        String q10;
        String displayName = locale.getDisplayName();
        kotlin.jvm.internal.l.d(displayName, "getDisplayName(...)");
        q10 = ka.p.q(displayName, ':', ' ', false, 4, null);
        return locale.getLanguage() + '_' + locale.getCountry() + ':' + q10;
    }

    private final void b(List<String> list) {
        Locale locale = Locale.getDefault();
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.l.b(locale);
        arrayList.add(a(locale));
        if (list != null) {
            for (String str : list) {
                if (!kotlin.jvm.internal.l.a(locale.toLanguageTag(), str)) {
                    Locale forLanguageTag = Locale.forLanguageTag(str);
                    kotlin.jvm.internal.l.b(forLanguageTag);
                    arrayList.add(a(forLanguageTag));
                }
            }
        }
        this.f13989b.a(arrayList);
    }

    private final void c(String str) {
        if (this.f13990c) {
            Log.d(this.f13988a, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ArrayList<String> arrayList;
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(intent, "intent");
        c("Received extra language broadcast");
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            this.f13992e = resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            c("Extra supported languages");
            arrayList = resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES");
            this.f13991d = arrayList;
        } else {
            c("No extra supported languages");
            arrayList = new ArrayList<>();
        }
        b(arrayList);
    }
}
