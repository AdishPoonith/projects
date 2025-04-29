.class public final Lcom/google/android/gms/internal/firebase-auth-api/na;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/js;

.field private final b:Ljava/util/List;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/an;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/js;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->b:Ljava/util/List;

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/an;->b:Lcom/google/android/gms/internal/firebase-auth-api/an;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->c:Lcom/google/android/gms/internal/firebase-auth-api/an;

    return-void
.end method

.method static final a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/na;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->l(Lcom/google/android/gms/internal/firebase-auth-api/js;)V

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->k(Lcom/google/android/gms/internal/firebase-auth-api/js;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/na;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/na;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/js;Ljava/util/List;)V

    return-object v1
.end method

.method public static final h(Lcom/google/android/gms/internal/firebase-auth-api/t9;Lcom/google/android/gms/internal/firebase-auth-api/s9;)Lcom/google/android/gms/internal/firebase-auth-api/na;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t9;->a()Lcom/google/android/gms/internal/firebase-auth-api/qq;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qq;->F()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qq;->F()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object p0

    invoke-interface {p1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->a([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->I([BLcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/js;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->l(Lcom/google/android/gms/internal/firebase-auth-api/js;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object p0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "empty keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static i(Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/mk;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->G()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->G()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/ur;Lcom/google/android/gms/internal/firebase-auth-api/ct;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/mk;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/wk;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wk;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static j(Lcom/google/android/gms/internal/firebase-auth-api/is;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object p0

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/gb;->g:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->e(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "No key manager found for key type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, " not supported by key manager of type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static k(Lcom/google/android/gms/internal/firebase-auth-api/js;)Ljava/util/List;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->C()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v6

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/na;->i(Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/mk;

    move-result-object v3

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->a()Lcom/google/android/gms/internal/firebase-auth-api/hb;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->a(Lcom/google/android/gms/internal/firebase-auth-api/mk;Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/aa;

    move-result-object v4

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/ma;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/is;->L()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_1

    const/4 v5, 0x3

    if-ne v2, v5, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ia;->d:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/security/GeneralSecurityException;

    const-string v3, "Unknown key status"

    invoke-direct {v2, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ia;->c:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ia;->b:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    :goto_1
    move-object v5, v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->D()I

    move-result v2

    if-ne v6, v2, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/ma;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/aa;Lcom/google/android/gms/internal/firebase-auth-api/ia;IZLcom/google/android/gms/internal/firebase-auth-api/la;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static l(Lcom/google/android/gms/internal/firebase-auth-api/js;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->C()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final m(Lcom/google/android/gms/internal/firebase-auth-api/aa;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/gb;->g:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a()Lcom/google/android/gms/internal/firebase-auth-api/qj;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->c(Lcom/google/android/gms/internal/firebase-auth-api/aa;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/na;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/js;->E()Lcom/google/android/gms/internal/firebase-auth-api/fs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v3

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ba;

    move-result-object v5

    instance-of v6, v5, Lcom/google/android/gms/internal/firebase-auth-api/db;

    if-eqz v6, :cond_0

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/db;

    invoke-interface {v5, v3}, Lcom/google/android/gms/internal/firebase-auth-api/db;->a(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v5

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ba;

    move-result-object v4

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/ba;->e(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->w()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->r(Lcom/google/android/gms/internal/firebase-auth-api/vr;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/fs;->s(Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/fs;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "manager for key type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is not a PrivateKeyManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "The keyset contains a non-private key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->D()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/fs;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/fs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cleartext keyset is not available"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final c()Lcom/google/android/gms/internal/firebase-auth-api/js;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/firebase-auth-api/os;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ib;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/os;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 11

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->d(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ib;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->D()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x3

    if-eqz v8, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->L()I

    move-result v10

    if-ne v10, v9, :cond_0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->K()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->G()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    if-eq v9, v10, :cond_5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->L()I

    move-result v9

    const/4 v10, 0x2

    if-eq v9, v10, :cond_4

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v9

    if-ne v9, v2, :cond_2

    if-nez v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v8

    sget-object v9, Lcom/google/android/gms/internal/firebase-auth-api/ur;->n:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eq v8, v9, :cond_3

    const/4 v8, 0x0

    goto :goto_2

    :cond_3
    const/4 v8, 0x1

    :goto_2
    and-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "key %d has unknown status"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "key %d has unknown prefix"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "key %d has no key data"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-eqz v5, :cond_10

    if-nez v6, :cond_9

    if-eqz v7, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_3
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/wa;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/wa;-><init>(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/va;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->c:Lcom/google/android/gms/internal/firebase-auth-api/an;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->c(Lcom/google/android/gms/internal/firebase-auth-api/an;)Lcom/google/android/gms/internal/firebase-auth-api/wa;

    :goto_4
    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/js;->C()I

    move-result v4

    if-ge v3, v4, :cond_f

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/js;->F(I)Lcom/google/android/gms/internal/firebase-auth-api/is;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/is;->L()I

    move-result v5

    if-ne v5, v9, :cond_e

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->j(Lcom/google/android/gms/internal/firebase-auth-api/is;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->b:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->b:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/firebase-auth-api/ma;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/ma;->a()Lcom/google/android/gms/internal/firebase-auth-api/aa;

    move-result-object v6

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/firebase-auth-api/na;->m(Lcom/google/android/gms/internal/firebase-auth-api/aa;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_5

    :cond_a
    move-object v6, v2

    :goto_5
    if-nez v6, :cond_c

    if-eqz v5, :cond_b

    goto :goto_6

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to get primitive "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " for key of type "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_6
    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v7

    iget-object v8, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/js;->D()I

    move-result v8

    if-ne v7, v8, :cond_d

    invoke-virtual {v1, v6, v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->b(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/wa;

    goto :goto_7

    :cond_d
    invoke-virtual {v1, v6, v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/wa;

    :cond_e
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->d()Lcom/google/android/gms/internal/firebase-auth-api/bb;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a()Lcom/google/android/gms/internal/firebase-auth-api/qj;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->d(Lcom/google/android/gms/internal/firebase-auth-api/bb;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_10
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No wrapper found for "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/qa;Lcom/google/android/gms/internal/firebase-auth-api/s9;)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/v3;->a()[B

    move-result-object v3

    invoke-interface {p2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->b([B[B)[B

    move-result-object v3

    :try_start_0
    invoke-interface {p2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->a([B[B)[B

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->I([BLcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/js;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_0

    array-length p2, v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/qq;->C()Lcom/google/android/gms/internal/firebase-auth-api/pq;

    move-result-object v1

    invoke-static {v3, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/pq;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/pq;

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/ib;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/os;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/pq;->s(Lcom/google/android/gms/internal/firebase-auth-api/os;)Lcom/google/android/gms/internal/firebase-auth-api/pq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/qq;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/qa;->b(Lcom/google/android/gms/internal/firebase-auth-api/qq;)V

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "cannot encrypt keyset"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid keyset, corrupted key material"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/google/android/gms/internal/firebase-auth-api/qa;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;->k:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->D()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "keyset contains key material of type %s for type url %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qa;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/na;->a:Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ib;->a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/os;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
