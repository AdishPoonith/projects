package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import q8.n;
import r8.k;
/* loaded from: classes.dex */
public class d implements n.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f10382a;

    /* renamed from: b  reason: collision with root package name */
    private final TextServicesManager f10383b;

    /* renamed from: c  reason: collision with root package name */
    private SpellCheckerSession f10384c;

    /* renamed from: d  reason: collision with root package name */
    k.d f10385d;

    public d(TextServicesManager textServicesManager, n nVar) {
        this.f10383b = textServicesManager;
        this.f10382a = nVar;
        nVar.b(this);
    }

    @Override // q8.n.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f10385d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f10385d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f10382a.b(null);
        SpellCheckerSession spellCheckerSession = this.f10384c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b10 = s8.a.b(str);
        if (this.f10384c == null) {
            this.f10384c = this.f10383b.newSpellCheckerSession(null, b10, this, true);
        }
        this.f10384c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f10385d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    HashMap hashMap = new HashMap();
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                    int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                    hashMap.put("startIndex", Integer.valueOf(offsetAt));
                    hashMap.put("endIndex", Integer.valueOf(lengthAt));
                    ArrayList arrayList2 = new ArrayList();
                    boolean z10 = false;
                    for (int i11 = 0; i11 < suggestionsCount; i11++) {
                        String suggestionAt = suggestionsInfoAt.getSuggestionAt(i11);
                        if (!suggestionAt.equals("")) {
                            arrayList2.add(suggestionAt);
                            z10 = true;
                        }
                    }
                    if (z10) {
                        hashMap.put("suggestions", arrayList2);
                        arrayList.add(hashMap);
                    }
                }
            }
            dVar = this.f10385d;
        }
        dVar.a(arrayList);
        this.f10385d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
