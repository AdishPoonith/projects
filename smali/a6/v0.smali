.class public final La6/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/content/SharedPreferences;

.field private final d:Lf4/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, La6/v0;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La6/v0;->a:Landroid/content/Context;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "com.google.firebase.auth.api.Store.%s"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    new-instance p1, Lf4/a;

    new-array p2, v1, [Ljava/lang/String;

    const-string v0, "StorageHelpers"

    invoke-direct {p1, v0, p2}, Lf4/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, La6/v0;->d:Lf4/a;

    return-void
.end method

.method private final f(Lorg/json/JSONObject;)La6/w1;
    .locals 26

    move-object/from16 v0, p1

    const-string v1, "userMultiFactorInfo"

    const-string v2, "userMetadata"

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "cachedTokenState"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "applicationName"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "anonymous"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "2"

    const-string v8, "version"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    move-object v7, v8

    :cond_0
    const-string v8, "userInfos"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v12, 0x0

    :goto_0
    const-string v13, "phoneNumber"

    const-string v14, "displayName"

    if-ge v12, v9, :cond_1

    :try_start_1
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    sget-object v16, La6/s1;->CREATOR:Landroid/os/Parcelable$Creator;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v15, "userId"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v15, "providerId"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v15, "email"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v13, "photoUrl"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const-string v13, "isEmailVerified"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v24

    const-string v13, "rawUserInfo"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    new-instance v11, La6/s1;

    move-object/from16 v17, v11

    invoke-direct/range {v17 .. v25}, La6/s1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DefaultAuthUserInfo"

    const-string v2, "Failed to unpack UserInfo from JSON"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/iv;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/iv;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    invoke-static {v5}, Lw5/f;->p(Ljava/lang/String;)Lw5/f;

    move-result-object v5

    new-instance v8, La6/w1;

    invoke-direct {v8, v5, v10}, La6/w1;-><init>(Lw5/f;Ljava/util/List;)V

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/j2;

    move-result-object v4

    invoke-virtual {v8, v4}, La6/w1;->d0(Lcom/google/android/gms/internal/firebase-auth-api/j2;)V

    :cond_2
    if-nez v6, :cond_3

    invoke-virtual {v8}, La6/w1;->h0()La6/w1;

    :cond_3
    invoke-virtual {v8, v7}, La6/w1;->g0(Ljava/lang/String;)La6/w1;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    sget-object v4, La6/y1;->CREATOR:Landroid/os/Parcelable$Creator;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_3 .. :try_end_3} :catch_2

    if-nez v2, :cond_4

    :catch_1
    move-object v2, v3

    goto :goto_1

    :cond_4
    :try_start_4
    const-string v4, "lastSignInTimestamp"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string v6, "creationTimestamp"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    new-instance v2, La6/y1;

    invoke-direct {v2, v4, v5, v6, v7}, La6/y1;-><init>(JJ)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_4 .. :try_end_4} :catch_2

    :goto_1
    if-eqz v2, :cond_5

    :try_start_5
    invoke-virtual {v8, v2}, La6/w1;->m0(La6/y1;)V

    :cond_5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v11, v2, :cond_c

    invoke-virtual {v0, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "factorIdKey"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "phone"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_5 .. :try_end_5} :catch_2

    const-string v6, "uid"

    const-string v7, "enrollmentTimestamp"

    if-eqz v5, :cond_7

    :try_start_6
    sget-object v2, Lcom/google/firebase/auth/t0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v18

    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    new-instance v2, Lcom/google/firebase/auth/t0;

    move-object v15, v2

    invoke-direct/range {v15 .. v20}, Lcom/google/firebase/auth/t0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-string v5, "totp"

    if-eq v2, v5, :cond_9

    if-eqz v2, :cond_8

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_3

    :cond_8
    move-object v2, v3

    goto :goto_4

    :cond_9
    :goto_3
    sget-object v2, Lcom/google/firebase/auth/t1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v18

    const-string v2, "totpInfo"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v20, Lcom/google/android/gms/internal/firebase-auth-api/g3;

    invoke-direct/range {v20 .. v20}, Lcom/google/android/gms/internal/firebase-auth-api/g3;-><init>()V

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    new-instance v2, Lcom/google/firebase/auth/t1;

    move-object v15, v2

    invoke-direct/range {v15 .. v20}, Lcom/google/firebase/auth/t1;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/google/android/gms/internal/firebase-auth-api/g3;)V

    :goto_4
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_2

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A totpInfo is required to build a TotpMultiFactorInfo instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-virtual {v8, v1}, La6/w1;->e0(Ljava/util/List;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Lcom/google/android/gms/internal/firebase-auth-api/iv; {:try_start_6 .. :try_end_6} :catch_2

    :cond_d
    return-object v8

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v0

    :goto_5
    move-object/from16 v1, p0

    iget-object v2, v1, La6/v0;->d:Lf4/a;

    invoke-virtual {v2, v0}, Lf4/a;->j(Ljava/lang/Throwable;)V

    return-object v3
.end method


# virtual methods
.method public final a()Lcom/google/firebase/auth/a0;
    .locals 4

    const-string v0, "type"

    iget-object v1, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    const-string v2, "com.google.firebase.auth.FIREBASE_USER"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v3

    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v2}, La6/v0;->f(Lorg/json/JSONObject;)La6/w1;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_1
    return-object v3
.end method

.method public final b(Lcom/google/firebase/auth/a0;)Lcom/google/android/gms/internal/firebase-auth-api/j2;
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/a0;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/j2;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final d(Lcom/google/firebase/auth/a0;)V
    .locals 10

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-class v1, La6/w1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    check-cast p1, La6/w1;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "cachedTokenState"

    invoke-virtual {p1}, La6/w1;->b0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "applicationName"

    invoke-virtual {p1}, La6/w1;->W()Lw5/f;

    move-result-object v3

    invoke-virtual {v3}, Lw5/f;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "type"

    const-string v3, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, La6/w1;->j0()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p1}, La6/w1;->j0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/16 v6, 0x1e

    if-le v5, v6, :cond_0

    iget-object v4, p0, La6/v0;->d:Lf4/a;

    const-string v5, "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-virtual {v4, v5, v7}, Lf4/a;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v4, 0x1e

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La6/s1;

    invoke-virtual {v6}, La6/s1;->B()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const-string v3, "userInfos"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v2, "anonymous"

    invoke-virtual {p1}, La6/w1;->H()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "version"

    const-string v3, "2"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, La6/w1;->D()Lcom/google/firebase/auth/b0;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v2, "userMetadata"

    invoke-virtual {p1}, La6/w1;->D()Lcom/google/firebase/auth/b0;

    move-result-object v3

    check-cast v3, La6/y1;

    invoke-virtual {v3}, La6/y1;->a()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    new-instance v2, La6/f;

    invoke-direct {v2, p1}, La6/f;-><init>(La6/w1;)V

    invoke-virtual {v2}, La6/f;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    const/4 v3, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/firebase/auth/j0;

    invoke-virtual {v4}, Lcom/google/firebase/auth/j0;->D()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    const-string p1, "userMultiFactorInfo"

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    iget-object v0, p0, La6/v0;->d:Lf4/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to turn object into JSON"

    invoke-virtual {v0, v2, p1, v1}, Lf4/a;->i(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/iv;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/iv;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.google.firebase.auth.FIREBASE_USER"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_7
    return-void
.end method

.method public final e(Lcom/google/firebase/auth/a0;Lcom/google/android/gms/internal/firebase-auth-api/j2;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La6/v0;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/a0;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->H()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
