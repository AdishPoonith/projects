.class public final Lcom/google/android/gms/internal/firebase-auth-api/mi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

.field private f:Lcom/google/android/gms/internal/firebase-auth-api/ja;

.field private g:Lcom/google/android/gms/internal/firebase-auth-api/oa;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->f:Lcom/google/android/gms/internal/firebase-auth-api/ja;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Lcom/google/android/gms/internal/firebase-auth-api/s9;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Lcom/google/android/gms/internal/firebase-auth-api/oa;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->g:Lcom/google/android/gms/internal/firebase-auth-api/oa;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c:Ljava/lang/String;

    return-object p0
.end method

.method private final j()Lcom/google/android/gms/internal/firebase-auth-api/s9;
    .locals 5

    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->d()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android Keystore requires at least Android M"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/qi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/qi;-><init>()V

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/qi;->b(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/qi;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2

    :cond_1
    new-instance v0, Ljava/security/KeyStoreException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method

.method private final k([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qi;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/qi;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t9;->c([B)Lcom/google/android/gms/internal/firebase-auth-api/t9;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/na;->h(Lcom/google/android/gms/internal/firebase-auth-api/t9;Lcom/google/android/gms/internal/firebase-auth-api/s9;)Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->f(Lcom/google/android/gms/internal/firebase-auth-api/na;)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->l([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->l([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method private static final l([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t9;->c([B)Lcom/google/android/gms/internal/firebase-auth-api/t9;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v9;->b(Lcom/google/android/gms/internal/firebase-auth-api/t9;)Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->f(Lcom/google/android/gms/internal/firebase-auth-api/na;)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/mi;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->F()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object p1

    sget v2, Lcom/google/android/gms/internal/firebase-auth-api/oi;->f:I

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq p1, v5, :cond_3

    if-eq p1, v4, :cond_2

    if-eq p1, v3, :cond_1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown output prefix type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->e(Ljava/lang/String;[BI)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->f:Lcom/google/android/gms/internal/firebase-auth-api/ja;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/mi;
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/mi;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a:Landroid/content/Context;

    const-string p1, "GenericIdpKeyset"

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized g()Lcom/google/android/gms/internal/firebase-auth-api/oi;
    .locals 11

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->b()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c:Ljava/lang/String;

    if-eqz v2, :cond_b

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v3, 0x0

    :try_start_2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v6, v3

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    new-array v6, v5, [B

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_3

    add-int v8, v7, v7

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x10

    invoke-static {v9, v10}, Ljava/lang/Character;->digit(CI)I

    move-result v9

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8, v10}, Ljava/lang/Character;->digit(CI)I

    move-result v8

    const/4 v10, -0x1

    if-eq v9, v10, :cond_2

    if-eq v8, v10, :cond_2

    mul-int/lit8 v9, v9, 0x10

    add-int/2addr v9, v8

    int-to-byte v8, v9

    aput-byte v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "input is not hexadecimal"

    invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :goto_2
    if-nez v6, :cond_7

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->j()Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->f:Lcom/google/android/gms/internal/firebase-auth-api/ja;

    if-eqz v1, :cond_6

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->e()Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->f:Lcom/google/android/gms/internal/firebase-auth-api/ja;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->c(Lcom/google/android/gms/internal/firebase-auth-api/ja;)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->b()Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/na;->d()Lcom/google/android/gms/internal/firebase-auth-api/os;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/os;->D(I)Lcom/google/android/gms/internal/firebase-auth-api/ns;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/ns;->C()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->d(I)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/ri;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c:Ljava/lang/String;

    invoke-direct {v2, v4, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/ri;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    if-eqz v4, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->b()Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->e:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/na;->f(Lcom/google/android/gms/internal/firebase-auth-api/qa;Lcom/google/android/gms/internal/firebase-auth-api/s9;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->b()Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v4

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/v9;->a(Lcom/google/android/gms/internal/firebase-auth-api/na;Lcom/google/android/gms/internal/firebase-auth-api/qa;)V

    :goto_3
    iput-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->g:Lcom/google/android/gms/internal/firebase-auth-api/oa;

    goto :goto_5

    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "cannot read or generate keyset"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mi;->d:Ljava/lang/String;

    if-eqz v1, :cond_9

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oi;->d()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->k([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object v1

    goto :goto_3

    :cond_9
    :goto_4
    invoke-static {v6}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->l([B)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object v1

    goto :goto_3

    :goto_5
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/oi;

    invoke-direct {v1, p0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/oi;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/mi;Lcom/google/android/gms/internal/firebase-auth-api/ni;)V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_a
    :try_start_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Expected a string of even length"

    invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    :try_start_5
    new-instance v1, Ljava/io/CharConversionException;

    const-string v3, "can\'t read keyset; the pref value %s is not a valid hex string"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v4

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "keysetName cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v1

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
